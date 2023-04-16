package com.kwai.video.stannis.AudioProcess$AudioVoiceDetectInterface$AudioVoiceDetectResult;
import com.kwai.video.stannis.AudioProcess$AudioVoiceDetectInterface;
import java.lang.Object;

public class AudioProcess$AudioVoiceDetectInterface$AudioVoiceDetectResult	// class@000baf
{
    public float backgroud_prob;
    public float music_prob;
    public int result_available;
    public float speech_prob;
    public final AudioProcess$AudioVoiceDetectInterface this$1;

    public void AudioProcess$AudioVoiceDetectInterface$AudioVoiceDetectResult(AudioProcess$AudioVoiceDetectInterface p0){
       this.this$1 = p0;
       super();
       this.result_available = 0;
       this.backgroud_prob = 0;
       this.speech_prob = 0;
       this.music_prob = 0;
    }
}
