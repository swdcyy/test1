package com.kwai.video.westeros.stentorplugin.StentorPlugin$4;
import java.lang.Runnable;
import com.kwai.video.westeros.stentorplugin.StentorPlugin;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.stentor.AsrProduct.Asr;

public class StentorPlugin$4 implements Runnable	// class@0010bd
{
    public final StentorPlugin this$0;
    public final int val$bufferLen;
    public final byte[] val$bytes;
    public final int val$channelNum;
    public final int val$sampleRate;

    public void StentorPlugin$4(StentorPlugin p0,byte[] p1,int p2,int p3,int p4){
       this.this$0 = p0;
       this.val$bytes = p1;
       this.val$bufferLen = p2;
       this.val$sampleRate = p3;
       this.val$channelNum = p4;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StentorPlugin$4.class, "1")) {
          return;
       }
       StentorPlugin$4 tthis$0 = this.this$0;
       if (tthis$0.enableAsr != null) {
          StentorPlugin asr = tthis$0.asr;
          if (asr != null) {
             asr.A(this.val$bytes, this.val$bufferLen, this.val$sampleRate, this.val$channelNum, tthis$0.mBytesPerChannel, 0);
          }
       }
       return;
    }
}
