package com.yxcorp.gifshow.im_rtc.media.h;
import cxa.m;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import dc5.c;
import cxa.a;
import com.yxcorp.gifshow.im_rtc.media.g;
import java.lang.Runnable;
import t45.c;
import cxa.l;
import cxa.h;

public class h implements m	// class@00193a
{
    public SoundPool a;
    public boolean b;
    public boolean c;

    public void h(){
       super();
       this.b = false;
       this.c = false;
    }
    public void a(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "1")) {
          return;
       }
       if (this.b != null && (p0 != 5 && (p0 != 7 && p0 != 9))) {
          if (!PatchProxy.applyVoid(null, this, oh, "3")) {
             if (this.c != null) {
                c.c("IMRTCSound", "playSoundAsync, destroyed");
             }else if(!a.a()){
                c.g("IMRTCSound", "playSound, is silent mode");
             }else {
                c.a(new g(this));
             }
          }
          this.b = false;
       }
    label_0050 :
       return;
    }
    public void b(int p0){
       this.b = true;
    }
    public void c(int p0){
       l.f(this, p0);
    }
    public void d(){
       this.b = false;
    }
    public void destroy(){
       h oh = h.class;
       if (PatchProxy.applyVoid(null, this, oh, "2")) {
          return;
       }
       this.c = true;
       if (!PatchProxy.applyVoid(null, this, oh, "4")) {
          c.a(new h(this));
       }
       return;
    }
    public void e(){
       this.b = true;
    }
    public void f(int p0){
       this.b = true;
    }
}
