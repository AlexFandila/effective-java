package org.alex.dependencyinjection;

/**
 * @author alex
 */
public class MusicPlayer {
	private final MP3Decoder mp3Decoder;
	private final WAVDecoder wavDecoder;

	public void playAudio(String file) {
		if (file.contains(".wav")) {
			wavDecoder.decode(file);
		} else {
			mp3Decoder.decode(file);
		}
	}
}
