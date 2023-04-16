package nd9.f0;
import oc9.b0;
import nd9.l;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.base.d;
import nd9.a;
import nd9.e0;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qg9.a;
import oc9.a0;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiEntrance;

public class f0 extends l implements b0	// class@00313b
{

    public void f0(CameraPageType p0,b p1){
       super(p0, p1);
       this.d.n(a.class, new e0(this));
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, f0.class, "4")) {
          return;
       }
       if (!a.a(this.d)) {
          this.t2();
       }
       return;
    }
    public void E0(){
       a0.n(this);
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, f0.class, "2")) {
          return;
       }
       this.h2();
       return;
    }
    public boolean Kc(){
       return a0.c(this);
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, f0.class, "3")) {
          return;
       }
       this.t2();
       return;
    }
    public boolean R0(){
       return a0.b(this);
    }
    public void T1(boolean p0){
       a0.l(this, p0);
    }
    public void X7(int p0,float p1){
       a0.k(this, p0, p1);
    }
    public void d5(int p0){
       a0.o(this, p0);
    }
    public void e2(){
       this.L = true;
    }
    public long ie(){
       return a0.a(this);
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, f0.class, "1")) {
          return;
       }
       super.onResume();
       this.t2();
       return;
    }
    public void q1(){
       a0.g(this);
    }
    public boolean q2(){
       return a0.d(this);
    }
    public void qb(){
       a0.e(this);
    }
    public void s0(){
       a0.m(this);
    }
    public final void t2(){
       if (PatchProxy.applyVoid(null, this, f0.class, "5")) {
          return;
       }
       if (this.o2()) {
          if (this.L == null) {
             n.Y(this.s, 0, 0);
             n.Y(this.t, 4, 0);
          }else {
             l tE = this.E;
             if (tE != null) {
                this.l2(tE);
             }
          }
       }
       return;
    }
}
