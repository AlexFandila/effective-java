package org.alex.dependencyinjection.musicplayer;

/**
 * @author alex
 */
public class MP3Format implements AudioFormat {
	private final int bitRate; // e.g. 320 kbps
	private final int sampleRate; // e.g. 44100 Hz
	private final int channels; // e.g. 2 for stereo

	public MP3Format(int bitRate, int sampleRate, int channels) {
		this.bitRate = bitRate;
		this.sampleRate = sampleRate;
		this.channels = channels;
	}

	@Override
	public int getChannels() {
		return channels;
	}

	@Override
	public String getFormatName() {
		return "MP3";
	}

	@Override
	public void decode(String filename) {
		System.out.println("Decoding mp3...");
	}

	@Override
	public int getBitRate() {
		return bitRate;
	}

	@Override
	public int getSampleRate() {
		return sampleRate;
	}

	@Override
	public boolean canPlay(String fileName) {
		return fileName.toLowerCase().endsWith(".mp3");
	}

	@Override
	public void process(byte[] audioData) {
		System.out.println("Processing mp3...");
	}
}
