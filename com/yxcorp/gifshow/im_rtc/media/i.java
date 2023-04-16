package com.yxcorp.gifshow.im_rtc.media.i;
import cxa.m;
import java.lang.Object;
import android.app.Application;
import o56.a;
import java.lang.String;
import android.os.Vibrator;
import android.os.Handler;
import android.os.Looper;
import cxa.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import cxa.a;
import cxa.k;
import java.lang.Runnable;
import ekd.k1;
import cxa.j;
import cxa.l;
import android.os.Build$VERSION;
import android.os.VibrationEffect;
import android.media.AudioAttributes;
import com.kwai.robust.PatchProxyResult;
import android.media.AudioAttributes$Builder;

public class i implements m	// class@00193b
{
    public final Vibrator a;
    public boolean b;
    public boolean c;
    public final Handler d;
    public final Runnable e;

    public void i(){
       super();
       this.a = a.b().getSystemService("vibrator");
       this.d = new Handler(Looper.getMainLooper());
       this.e = new i(this);
    }
    public void a(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "4")) {
          return;
       }
       this.h();
       if (this.c != null && (p0 != 5 && (p0 != 7 && p0 != 9))) {
          this.c = false;
          if (!a.b()) {
             k1.r(new k(this), 500);
          }
       }
    label_0039 :
       return;
    }
    public void b(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "3")) {
          return;
       }
       this.h();
       this.c = true;
       if (!a.b()) {
          k1.r(new j(this), 500);
       }
       return;
    }
    public void c(int p0){
       l.f(this, p0);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       this.h();
       this.c = false;
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, i.class, "6")) {
          return;
       }
       this.h();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       if (a.b()) {
          return;
       }
       long[] olongArray = new long[2]{1000,1200};
       int[] ointArray = new int[2]{255,0};
       if (Build$VERSION.SDK_INT >= 26) {
          this.a.vibrate(VibrationEffect.createWaveform(olongArray, ointArray, 0), this.g());
       }else {
          this.a.vibrate(olongArray, 0, this.g());
       }
       this.b = true;
       this.c = true;
       this.d.removeCallbacks(this.e);
       this.d.postDelayed(this.e, 0xea60);
       return;
    }
    public void f(int p0){
       this.c = true;
    }
    public final AudioAttributes g(){
       Object obj = PatchProxy.apply(null, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AudioAttributes$Builder().setContentType(4).setUsage(5).build();
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, i.class, "7")) {
          return;
       }
       if (this.b != null) {
          this.a.cancel();
          this.b = false;
          this.d.removeCallbacks(this.e);
       }
       return;
    }
}
