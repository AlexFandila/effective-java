package org.alex.dependencyinjection;

/**
 * @author alex
 */
public class MP3Decoder implements AudioDecoder {
	@Override
	public void decode(String audioFile) {
		System.out.println("Decoding mp3 audio...");
	}
}
