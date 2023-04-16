package com.yxcorp.gifshow.util.audiorecord.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.audiorecord.a$b;
import java.lang.Object;
import com.yxcorp.gifshow.util.audiorecord.a$d;
import java.io.File;
import com.yxcorp.gifshow.util.audiorecord.b;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.util.audiorecord.a$a;
import com.yxcorp.gifshow.util.audiorecord.b$b;
import android.media.MediaPlayer;
import nnc.b;
import android.media.MediaPlayer$OnPreparedListener;
import nnc.a;
import android.media.MediaPlayer$OnCompletionListener;
import java.lang.String;
import java.io.IOException;

public class a implements Runnable	// class@001f4f
{
    public MediaPlayer b;
    public boolean c;
    public a$d d;
    public a$c e;
    public a$b f;
    public b g;

    public void a(a$b p0){
       super();
       this.c = false;
       this.f = p0;
    }
    public final void a(){
       a td = this.d;
       if (td != null) {
          td.a(this.c);
       }
       return;
    }
    public final void b(){
       if (this.c == null) {
          return;
       }
       File uFile = this.f.a();
       if (uFile == null || !uFile.exists()) {
          this.c = false;
          this.c();
          this.a();
          return;
       }else if(this.g == null){
          b uob = new b(new Handler(Looper.getMainLooper()), new a$a(this));
          this.g = uob;
          uob.a();
       }
       if (this.b == null) {
          MediaPlayer mediaPlayer = new MediaPlayer();
          this.b = mediaPlayer;
          mediaPlayer.setOnPreparedListener(new b(this));
          this.b.setOnCompletionListener(new a(this));
       }
       a tg = this.g;
       b g = tg.g;
       _monitor_enter(g);
       if (tg.i != null) {
          _monitor_exit(g);
       }else {
          tg.i = true;
          _monitor_exit(g);
       }
       try{
          this.b.reset();
          this.b.setDataSource(uFile.getAbsolutePath());
          this.b.prepare();
       }catch(java.io.IOException e0){
          e0.printStackTrace();
          this.stop();
       }
       return;
    }
    public void c(){
       a tb = this.b;
       if (tb != null) {
          tb.release();
       }
       this.b = null;
       a tg = this.g;
       if (tg != null) {
          tg.stop();
       }
       this.g = null;
       return;
    }
    public void run(){
       if (this.c != null) {
          this.b();
       }
       return;
    }
    public void stop(){
       if (this.c == null) {
          return;
       }
       this.c = false;
       a tb = this.b;
       if (tb != null && tb.isPlaying()) {
          this.b.stop();
          this.b.release();
       }
       this.b = null;
       this.f.reset();
       this.c();
       this.a();
       return;
    }
}
