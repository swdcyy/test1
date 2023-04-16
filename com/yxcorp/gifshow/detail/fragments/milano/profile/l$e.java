package com.yxcorp.gifshow.detail.fragments.milano.profile.l$e;
import qvb.q;
import com.yxcorp.gifshow.detail.fragments.milano.profile.l;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import c95.c;

public class l$e implements q	// class@001558
{
    public final l b;

    public void l$e(l p0){
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
       if (PatchProxy.isSupport(l$e.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, l$e.class, "1")) {
          return;
       }
       l$e tb = this.b;
       if (tb.z.n != null) {
          tb.S8();
       }
       return;
    }
}
