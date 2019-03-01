import java.io.*;
import sun.audio.*;

public class startBGMusic
{


public void playMusic() throws Exception
{
	 String gongFile = "/C:/Users/Menon/Desktop/HospitalManagementSystem-20171023T060621Z-001/HospitalManagementSystem/HospitalManagementSystem/29302001.wav";
    InputStream in = new FileInputStream(gongFile);

    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);

    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
	
}

/*  public static void main(String[] args) 
  throws Exception
  {
    // open the sound file as a Java input stream
    String gongFile = "/C:/Users/Akhil/Downloads/HospitalManagementSystem/HospitalManagementSystem/29302001.wav";
    InputStream in = new FileInputStream(gongFile);

    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);

    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
  }*/
}