package com.tts.JokeApp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImplementation implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JokeServiceImplementation(ChuckNorrisQuotes chuckNorrisQuotes) {
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}
	
	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}
