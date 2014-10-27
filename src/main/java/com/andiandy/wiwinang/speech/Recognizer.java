package com.andiandy.wiwinang.speech;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;

import java.io.IOException;

public class Recognizer implements Runnable{

	Configuration configuration = new Configuration();
	private boolean run = true;

	public Recognizer(){
		// Set path to acoustic model.
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/acoustic/wsj");
		// Set path to dictionary.
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/acoustic/wsj/dict/cmudict.0.6d");
		// Set language model.
		configuration.setLanguageModelPath("resource:/edu/cmu/sphinx/models/language/en-us.lm.dmp");
	}

	@Override
	public void run() {
		try {
			LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer( configuration );
			recognizer.startRecognition( true );
			while( run ){
				System.out.println( recognizer.getResult().getResult().toString() );
			}
		} catch( IOException e ) {
			e.printStackTrace();
		}


	}

	public void stop(){
		run = false;
	}
}
