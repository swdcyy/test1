package com.yxcorp.gifshow.util.audiorecord.f;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder;
import java.lang.Object;
import java.util.Objects;
import java.io.File;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$b;
import nnc.u;
import android.os.Handler;
import r6b.b;
import java.util.Iterator;
import com.yxcorp.gifshow.media.builder.MP4Builder;
import nnc.v;
import nnc.w;
import java.lang.Throwable;
import q87.c;

public final class f implements Runnable	// class@001f56
{
    public final FragmentAudioRecorder b;

    public void f(FragmentAudioRecorder p0){
       this.b = p0;
    }
    public final void run(){
       f tb;
       try{
          tb = this.b;
          Objects.requireNonNull(tb);
          File uFile = new File(tb.b, tb.a);
          if (tb.c.size() == 1) {
             FragmentAudioRecorder$b uob = tb.c.get(0);
             uob.a.renameTo(uFile);
             uob = uob.b;
             if (tb.f != null) {
                tb.d.post(new u(tb, uFile, uob));
             }
          }else if(!uFile.getParentFile().exists()){
             uFile.getParentFile().mkdirs();
          }
          if (!uFile.exists()) {
             uFile.createNewFile();
          }else {
             uFile.delete();
          }
          b uob1 = new b(uFile, null);
          Iterator iterator = tb.c.iterator();
          long l = false;
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             uob1.f(obj.a, 0, obj.b);
             l = l + obj.b;
          }
          uob1.a();
          if (tb.f != null) {
             tb.d.post(new v(tb, uFile, l));
          }
       }catch(java.io.IOException e1){
          w.D().z("compose", "io exception", e1);
       }
          tb.c();
          return;
    }
}
