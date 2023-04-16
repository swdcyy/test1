package fia.n$a;
import d6a.a;
import fia.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tw6.e;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.view.View;
import bf5.d;

public final class n$a extends a	// class@002922
{
    public final n b;

    public void n$a(n p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, n$a.class, "3")) {
          return;
       }
       n$a tb = this.b;
       tb.x = false;
       n w = tb.w;
       if (w != null) {
          w.d0(tb.z);
       }
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, n$a.class, "1")) {
          return;
       }
       n w = this.b.w;
       n on = null;
       float f = (w != null && (!w.b1() - on && this.b.x == null))? 0x3f800000: 0;
       n q = this.b.q;
       if (q != null) {
          q.setAlpha(f);
       }
       q = this.b.r;
       if (q != null) {
          q.setAlpha(f);
       }
       q = this.b.s;
       if (q != null) {
          q.setAlpha(f);
       }
       n$a tb = this.b;
       q = tb.w;
       if (q != null) {
          q.c0(tb.z);
       }
       w = this.b.w;
       if (w == null || w.b1() - on) {
          tb = this.b;
          on = tb.v;
          if (on != null) {
             tb.u = on.g();
             on.f();
          }
       }
       return;
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, n$a.class, "2")) {
          return;
       }
       n w = this.b.w;
       float f = (w != null && (!w.b1() && this.b.x == null))? 0x3f800000: 0;
       n q = this.b.q;
       if (q != null) {
          q.setAlpha(f);
       }
       q = this.b.r;
       if (q != null) {
          q.setAlpha(f);
       }
       q = this.b.s;
       if (q != null) {
          q.setAlpha(f);
       }
       w = this.b.w;
       if (w == null || w.b1()) {
          w = this.b.v;
          if (w != null) {
             w.f();
          }
       }
       return;
    }
}
