package org.cvtc.soundBoard;


// Just a class to test the audio player.
public class SoundTest {
	
	public static void randomSound(int sound) {
		String[] soundFiles = {"hi-1.wav", "hi-2.wav", "hi-3.wav", "hi-4.wav", "hi-5.wav", "churchOrgan.wav",
							   "werewolf.wav", "zombies.wav", "Shock.wav", "laugh.wav", 
							   "Alpaca_Mating_Call.wav", "Cat_Meowing.wav", "rooster.wav", "hawk_screeching.wav", "duck.wav",
							   "Fart1.wav", "Fart2.wav", "Fart3.wav", "Fart4.wav", "Fart5.wav",
							   "Blastwave_1.wav", "Blastwave_2.wav", "Blastwave_3.wav", "Blastwave_4.wav", "Blastwave_5.wav", "Rick_Roll.wav"};
		
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.playSound(soundFiles[sound]);
	}

}
