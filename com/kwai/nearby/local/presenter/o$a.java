package com.kwai.nearby.local.presenter.o$a;
import qvb.q;
import com.kwai.nearby.local.presenter.o;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import io.reactivex.subjects.PublishSubject;
import qvb.a;

public class o$a implements q	// class@000fba
{
    public final o b;

    public void o$a(o p0){
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
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       o$a tb = this.b;
       if (tb.A == null && !p1) {
          tb.A = true;
          tb.B.onNext(Boolean.TRUE);
          tb = this.b;
          tb.r.f(tb.D);
       }
       return;
    }
}
