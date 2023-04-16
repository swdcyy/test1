package fxa.d;
import java.lang.Object;
import fxa.d$e;
import fxa.d$d;
import fxa.d$f;
import fxa.d$c;
import android.os.Handler;
import android.os.Looper;
import fxa.d$b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fxa.a;
import dxa.b;
import java.lang.StringBuilder;
import dc5.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import zwa.w;
import java.lang.Integer;
import fxa.d$g;
import fxa.c;
import java.lang.Runnable;
import java.util.Objects;

public final class d	// class@002a53
{
    public final d$e a;
    public final d$d b;
    public final d$f c;
    public final d$c d;
    public final Handler e;
    public d$b f;
    public b g;
    public String h;
    public d$g i;

    public void d(){
       super();
       d$e uoe = new d$e(this);
       this.a = uoe;
       this.b = new d$d(this);
       this.c = new d$f(this);
       this.d = new d$c(this);
       this.e = new Handler(Looper.getMainLooper());
       this.f = uoe;
       uoe.a();
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.b();
    }
    public final void b(a p0){
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "5")) {
          return;
       }
       a c = p0.c;
       a b = (c == null)? p0.b: c.f();
       String str = "IMRTCMachine";
       c.g(str, "process event="+p0.a+", roomId="+b+", rtcCallDetail="+c);
       if (TextUtils.isEmpty(b)) {
          c.c(str, "illegal param, roomId is null");
          return;
       }else if(this.g == null && c == null){
          c.c(str, "illegal rtc roomInfo, no room Detail");
          return;
       }else if(c != null && !w.b(c)){
          c.c(str, "illegal rtc type");
          return;
       }else {
          d tg = this.g;
          if (tg != null && !TextUtils.equals(tg.f(), b)) {
             c.c(str, "cur roomId is "+this.g.f()+", not handled");
             return;
          }else {
             tg = this.f;
             boolean b1 = tg.d(p0.a, b);
             if (c != null) {
                this.g = c;
             }
             if (b1 && p0.d == null) {
                c = p0.a;
                if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(c), this, uod, "7")) {
                   d ti = this.i;
                   if (ti != null && this.g != null) {
                      ti.b(c, this.a(), this.g);
                   }
                }
                if (tg != this.f) {
                   p0 = p0.a;
                   String str1 = tg.b();
                   String str2 = this.f.b();
                   if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), str1, str2, this, d.class, "8")) {
                      uod = this.i;
                      if (uod != null) {
                         tg = this.g;
                         if (tg != null) {
                            uod.a(p0, str1, str2, tg);
                         }
                      }
                   }
                }
             }
          label_00fd :
             if (("IDLE").equals(this.a())) {
                d tg1 = this.g;
                if (tg1 != null) {
                   this.h = tg1.f();
                   this.g = null;
                }
             }
             return;
          }
       }
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       d ta = this.a;
       this.f = ta;
       ta.a();
       this.g = null;
       this.i = null;
       this.h = null;
       return;
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       if (Looper.myLooper() == this.e.getLooper()) {
          this.b(p0);
       }else {
          this.e.post(new c(this, p0));
       }
       return;
    }
    public void e(d$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "6")) {
          return;
       }
       d tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(null, tf, d$b.class, "2")) {
          tf.c("exit");
       }
       this.f = p0;
       p0.a();
       return;
    }
}
