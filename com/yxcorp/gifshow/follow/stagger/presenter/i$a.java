package com.yxcorp.gifshow.follow.stagger.presenter.i$a;
import qvb.q;
import com.yxcorp.gifshow.follow.stagger.presenter.i;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import qvb.a;
import mb5.r;

public class i$a implements q	// class@001213
{
    public final i b;

    public void i$a(i p0){
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
       if (PatchProxy.isSupport(i$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, i$a.class, "1")) {
          return;
       }
       i$a tb = this.b;
       tb.s.f(tb.q.getItems());
       return;
    }
}
