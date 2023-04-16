package com.kwai.video.stannis.AudioProcess$AudioEffectParam;
import com.kwai.video.stannis.AudioProcess;
import java.lang.Object;

public class AudioProcess$AudioEffectParam	// class@000baa
{
    public float compressor_gain;
    public float compressor_threshold;
    public float drylevel;
    public float earlylevel;
    public float[] equalizer_gain;
    public float predelay;
    public float reverb_damping;
    public float reverb_space;
    public float reverb_time;
    public float taillevel;
    public final AudioProcess this$0;

    public void AudioProcess$AudioEffectParam(AudioProcess p0,float p1,float p2,float p3,float p4,float p5,float p6,float p7,float p8,float p9,float[] p10){
       this.this$0 = p0;
       super();
       float[] uofloatArray = new float[10];
       this.equalizer_gain = uofloatArray;
       this.reverb_space = p1;
       this.predelay = p2;
       this.reverb_time = p3;
       this.reverb_damping = p4;
       this.drylevel = p5;
       this.earlylevel = p6;
       this.taillevel = p7;
       this.compressor_threshold = p8;
       this.compressor_gain = p9;
       for (int i = 0; i < 10; i++) {
          p2[i] = p10[i];
       }
       return;
    }
}
