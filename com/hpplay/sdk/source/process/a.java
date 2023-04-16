package com.hpplay.sdk.source.process.a;
import java.lang.Thread;
import java.util.concurrent.LinkedBlockingQueue;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import com.hpplay.sdk.source.a.a;
import java.lang.StringBuilder;
import com.hpplay.sdk.source.process.b;

public class a extends Thread	// class@00068f
{
    public LinkedBlockingQueue d;
    public boolean e;
    public boolean f;
    public boolean g;

    public void a(boolean p0,boolean p1){
       super();
       this.d = new LinkedBlockingQueue(2);
       this.e = p0;
       this.f = p1;
       this.g = true;
    }
    public void a(){
       try{
          this.d.add(Integer.valueOf(0));
       }catch(java.lang.Exception e0){
          a.b("BrowserThread", e0);
       }
       return;
    }
    public void b(){
       try{
          this.d.add(Integer.valueOf(1));
       }catch(java.lang.Exception e0){
          a.b("BrowserThread", e0);
       }
       return;
    }
    public void c(){
       this.g = false;
       this.interrupt();
    }
    public void run(){
       super.run();
       while (this.g != null) {
          try{
             int i = this.d.take().intValue();
             a.f("BrowserThread", "browser flag => "+i+" b size "+this.d.size());
             if (!i) {
                b.b().c();
                Thread.sleep(100);
                b.b().a(this.e, this.f);
             }else {
                b.b().c();
             }
          }catch(java.lang.InterruptedException e1){
             a.b("BrowserThread", e1);
          }
       }
       return;
    }
}
