package org.alex.dependencyinjection.musicplayer;

/**
 * @author alex
 */
public interface AudioFormat {
	// Basic audio file operations
	boolean canPlay(String fileName);

	void decode(String filename);

	void process(byte[] audioData);

	// Audio format properties
	int getBitRate();

	int getSampleRate();

	int getChannels();

	String getFormatName();
}
