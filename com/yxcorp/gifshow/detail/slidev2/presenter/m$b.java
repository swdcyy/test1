package com.yxcorp.gifshow.detail.slidev2.presenter.m$b;
import qvb.q;
import com.yxcorp.gifshow.detail.slidev2.presenter.m;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.p;

public class m$b implements q	// class@0019c5
{
    public final m b;

    public void m$b(m p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(m$b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, m$b.class, "3")) {
          return;
       }
       if (!p0) {
          return;
       }
       this.b.S8(false);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       m$b uob = m$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (p0 && !p1) {
          this.b.S8(true);
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       m$b uob = m$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "2")) {
          return;
       }
       if (p0 && !p1) {
          this.b.S8(false);
       }
       return;
    }
}
