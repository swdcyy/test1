package com.kwai.video.stannis.AudioProcess$AudioPitchParam;
import com.kwai.video.stannis.AudioProcess;
import java.lang.Object;

public class AudioProcess$AudioPitchParam	// class@000bad
{
    public float average_pitch;
    public float current_pitch;
    public int pitch_decision;
    public final AudioProcess this$0;

    public void AudioProcess$AudioPitchParam(AudioProcess p0,int p1,float p2,float p3){
       this.this$0 = p0;
       super();
       this.pitch_decision = p1;
       this.current_pitch = p2;
       this.average_pitch = p3;
    }
}
