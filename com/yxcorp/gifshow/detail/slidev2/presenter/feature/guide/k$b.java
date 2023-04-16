package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.k$b;
import qvb.q;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.k;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public class k$b implements q	// class@001996
{
    public final k b;

    public void k$b(k p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(k$b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, k$b.class, "1")) {
          return;
       }
       if (this.b.R8()) {
          this.b.k9();
       }
       return;
    }
}
