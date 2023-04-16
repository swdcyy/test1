package com.yxcorp.gifshow.profile.presenter.profile.l$a;
import qvb.q;
import com.yxcorp.gifshow.profile.presenter.profile.l;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import io.reactivex.subjects.PublishSubject;

public class l$a implements q	// class@001560
{
    public final l b;

    public void l$a(l p0){
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
       if (PatchProxy.isSupport(l$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, l$a.class, "1")) {
          return;
       }
       this.b.w.onNext(Boolean.TRUE);
       return;
    }
}
