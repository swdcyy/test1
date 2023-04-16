package com.yxcorp.gifshow.detail.fragments.milano.presenter.h$a;
import qvb.q;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.h;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Runnable;
import ekd.k1;

public class h$a implements q	// class@00152a
{
    public final h b;

    public void h$a(h p0){
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
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       k1.m(this.b.s);
       k1.r(this.b.s, 0);
       return;
    }
}
