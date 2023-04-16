package com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.i$b;
import java.lang.Thread;
import com.yxcorp.gifshow.v3.editor.music_v2.widget.audio.i;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.media.util.c;
import android.media.AudioRecord;
import ekd.k1;
import com.yxcorp.gifshow.media.builder.b;
import faa.a;
import java.lang.Throwable;
import w46.b;

public class i$b extends Thread	// class@00113d
{
    public boolean b;
    public final i c;

    public void i$b(i p0){
       this.c = p0;
       super("sound-recorder");
    }
    public void run(){
       int i4;
       int i5;
       byte[] uobyteArray2;
       Handler a;
       if (PatchProxy.applyVoid(null, this, i$b.class, "1")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       int i = -1;
       int i1 = 0;
       try{
          byte[] uobyteArray = new byte[i1];
          int i2 = c.a(i1);
          int i3 = c.p(i1);
          while (this.b == null) {
             try{
                i g = this.c.g;
                if (g == null) {
                   long l = 100;
                   Thread.sleep(l);
                }else if(!uobyteArray.length){
                   i = g.getSampleRate();
                   byte[] uobyteArray1 = new byte[882];
                   i4 = c.a(g.getChannelConfiguration());
                   i5 = c.p(g.getAudioFormat());
                   uobyteArray2 = uobyteArray1;
                }else {
                   uobyteArray2 = uobyteArray;
                   i4 = i2;
                   i5 = i3;
                }
                try{
                   int i6 = g.read(uobyteArray2, i1, uobyteArray2.length);
                   if (i6 <= 0 || (i6 != -3 && (i6 != -2 && this.c.a != null))) {
                      i h = this.c.h;
                      if (h == null) {
                         long l1 = 50;
                         a = k1.a;
                         Thread.sleep(l1);
                      }else {
                         h.b(uobyteArray2, uobyteArray2.length, i5, i4, i);
                      }
                   }
                label_007a :
                   uobyteArray = uobyteArray2;
                   i2 = i4;
                   i3 = i5;
                }catch(java.lang.InterruptedException e0){
                }catch(java.lang.Exception e0){
                   a.D().e("EditAudioRecorder", "fail to open sound recorder", e0);
                }
             }catch(java.lang.InterruptedException e0){
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
