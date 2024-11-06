package org.alex.dependencyinjection;

/**
 * @author alex
 */
public class WAVDecoder implements AudioDecoder {
	@Override
	public void decode(String audioFile) {
		System.out.println("Decoding WAV audio...");
	}
}
