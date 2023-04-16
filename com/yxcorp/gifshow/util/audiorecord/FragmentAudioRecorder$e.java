package com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$e;
import com.yxcorp.gifshow.util.audiorecord.b$b;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder;
import java.lang.Object;
import com.yxcorp.gifshow.util.audiorecord.b;
import android.os.Handler;
import java.lang.Math;
import java.util.List;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$c;
import java.util.Objects;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$d;
import com.yxcorp.gifshow.media.builder.a;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$b;
import java.io.File;
import java.lang.StringBuilder;
import java.lang.String;
import nnc.t;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$Status;
import nnc.s;

public class FragmentAudioRecorder$e implements b$b	// class@001f44
{
    public long a;
    public b b;
    public final FragmentAudioRecorder c;

    public void FragmentAudioRecorder$e(FragmentAudioRecorder p0){
       this.c = p0;
       super();
       long l = 0;
       this.a = l;
       b uob = new b(p0.d, this);
       this.b = uob;
       FragmentAudioRecorder k = p0.k;
       l = (k - l >= 0)? Math.max(l, (k - p0.m)): -1;
       uob.f = l;
       return;
    }
    public void a(long p0){
       this.a = p0;
       FragmentAudioRecorder$e tc = this.c;
       FragmentAudioRecorder f = tc.f;
       if (f != null) {
          FragmentAudioRecorder$e ta = this.a;
          f.d(tc.c.size(), ta, (this.c.m + ta));
       }
       return;
    }
    public void b(){
       this.a = this.b.e;
       FragmentAudioRecorder$e tc = this.c;
       try{
          Objects.requireNonNull(tc);
          tc.i.a.a();
          tc.c.add(new FragmentAudioRecorder$b(new File(tc.b, tc.a+"_"+(tc.c.size() + 1)), tc.i.c.a));
          tc.m = tc.m + tc.i.c.a;
          if (tc.f != null) {
             tc.d.post(new t(tc));
          }
       }catch(java.lang.Exception e0){
       }
       e0.n = FragmentAudioRecorder$Status.PAUSE;
       if (e0.f != null) {
          e0.d.post(new s(e0));
       }
       return;
    }
    public void onStop(){
       this.c.b();
    }
}
