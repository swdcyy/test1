package com.yxcorp.gifshow.media.buffer.a$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.media.buffer.a;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.media.util.h;
import java.util.concurrent.BlockingQueue;
import java.io.IOException;

public class a$a implements Runnable	// class@001cf2
{
    public final int b;
    public final Bitmap c;
    public final a d;

    public void a$a(a p0,int p1,Bitmap p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       a j;
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       try{
          h.d(this.c, this.d.d(this.b), 85);
          this.d.i.offer(this.c);
          this.d.j.remove(this);
          if (this.d.j.size() <= 0) {
             j = this.d.j;
             _monitor_enter(j);
             this.d.j.notify();
             _monitor_exit(j);
          }
       }catch(java.io.IOException e0){
          e0.printStackTrace();
          this.d.j.remove(this);
          if (this.d.j.size() <= 0) {
             j = this.d.j;
             _monitor_enter(j);
             this.d.j.notify();
             _monitor_exit(j);
          }
       }
       return;
    }
}
