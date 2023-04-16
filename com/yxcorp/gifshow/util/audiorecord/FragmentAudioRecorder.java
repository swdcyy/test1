package com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder;
import java.lang.Object;
import java.util.ArrayList;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import r6b.d;
import com.yxcorp.gifshow.util.audiorecord.a;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$a;
import com.yxcorp.gifshow.util.audiorecord.a$b;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$Status;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$d;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$e;
import com.yxcorp.gifshow.util.audiorecord.b;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$c;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$b;
import java.io.File;
import java.io.IOException;

public class FragmentAudioRecorder	// class@001f45
{
    public String a;
    public String b;
    public List c;
    public Handler d;
    public Executor e;
    public FragmentAudioRecorder$c f;
    public a g;
    public d h;
    public FragmentAudioRecorder$d i;
    public FragmentAudioRecorder$b j;
    public long k;
    public long l;
    public long m;
    public FragmentAudioRecorder$Status n;

    public void FragmentAudioRecorder(){
       super();
       this.c = new ArrayList();
       this.d = new Handler(Looper.getMainLooper());
       this.e = Executors.newFixedThreadPool(2);
       this.k = -1;
       this.l = 0x200000;
       this.h = new d();
       this.g = new a(new FragmentAudioRecorder$a(this));
       this.n = FragmentAudioRecorder$Status.INIT;
    }
    public a a(){
       return this.g;
    }
    public void b(){
       if (this.n != FragmentAudioRecorder$Status.START) {
          return;
       }
       this.n = FragmentAudioRecorder$Status.PAUSE;
       try{
          this.h.stopRecording();
          this.i.c.b.stop();
          FragmentAudioRecorder tf = this.f;
          if (tf != null) {
             tf.f(this.n);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final void c(){
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().a.delete();
       }
       try{
          this.h.close();
          this.g.c();
       }catch(java.io.IOException e0){
          e0.printStackTrace();
       }
       return;
    }
    public void d(){
       if (this.j != null) {
          this.j = null;
          FragmentAudioRecorder tf = this.f;
          if (tf != null) {
             tf.b((this.c.size() - 1));
          }
       }
       return;
    }
}
