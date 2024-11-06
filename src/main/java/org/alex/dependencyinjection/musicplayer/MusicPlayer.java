package org.alex.dependencyinjection.musicplayer;

/**
 * @author alex
 */

import java.util.Objects;

public class MusicPlayer {
	private final AudioFormat audioFormat;

	public MusicPlayer(AudioFormat audioFormat) {
		this.audioFormat = Objects.requireNonNull(audioFormat);
	}

	public void play(String fileName) {
		if (!audioFormat.canPlay(fileName)) {
			throw new UnsupportedOperationException(
					"Cannot play " + fileName + " with " + audioFormat.getFormatName());
		}

		System.out.println("Playing file with following properties: ");
		System.out.println("Format: " + audioFormat.getFormatName());
		System.out.println("Bit Rate: " + audioFormat.getBitRate());
		System.out.println("Sample Rate: " + audioFormat.getSampleRate());
		System.out.println("Channels: " + audioFormat.getChannels());

		audioFormat.decode(fileName);
		// Simulating audio processing
		audioFormat.process(new byte[1024]);
	}
}
