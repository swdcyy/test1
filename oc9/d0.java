package oc9.d0;
import oc9.b0;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import oc9.a0;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.j0;

public abstract class d0 extends d implements b0	// class@0032e5
{
    public int n;

    public void d0(CameraPageType p0,b p1){
       super(p0, p1);
    }
    public void A0(){
       a0.j(this);
    }
    public void E0(){
       a0.n(this);
    }
    public void I7(){
       a0.i(this);
    }
    public boolean Kc(){
       return a0.c(this);
    }
    public void P1(){
       a0.h(this);
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
       this.n = p0;
    }
    public void e2(){
       a0.f(this);
    }
    public boolean f2(){
       boolean b = (this.n != 5)? true: false;
       return b;
    }
    public long ie(){
       return a0.a(this);
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
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "1")) {
          return;
       }
       super.w1(p0);
       if (p0 != null) {
          this.n = j0.b(p0, "record_mode", 0);
       }
       return;
    }
}
