package com.yxcorp.gifshow.im_rtc.media.f;
import cxa.m;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import cxa.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import cxa.l;
import dc5.c;
import cxa.a;
import com.yxcorp.gifshow.im_rtc.media.e;
import java.lang.Runnable;
import t45.c;
import cxa.f;

public class f implements m	// class@001938
{
    public final Handler a;
    public final Runnable b;
    public MediaPlayer c;
    public boolean d;

    public void f(){
       super();
       this.a = new Handler(Looper.getMainLooper());
       this.b = new e(this);
       this.d = false;
    }
    public void a(int p0){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, f.class, "5")) {
          return;
       }
       this.h();
       return;
    }
    public void b(int p0){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, f.class, "4")) {
          return;
       }
       this.h();
       return;
    }
    public void c(int p0){
       l.f(this, p0);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.h();
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       this.d = true;
       this.h();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.g();
       return;
    }
    public void f(int p0){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, f.class, "1")) {
          return;
       }
       this.g();
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       if (this.d != null) {
          c.c("IMRTCRing", "playCallRingAsync, destroyed");
          return;
       }else if(!a.a()){
          c.g("IMRTCRing", "playCallRingAsync, is not ringer normal mode");
          return;
       }else {
          c.a(new e(this));
          return;
       }
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, f.class, "8")) {
          return;
       }
       c.a(new f(this));
       return;
    }
}
