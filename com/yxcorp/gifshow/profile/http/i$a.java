package com.yxcorp.gifshow.profile.http.i$a;
import qvb.q;
import com.yxcorp.gifshow.profile.http.i;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public class i$a implements q	// class@001355
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
       if (PatchProxy.isSupport(i$a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, i$a.class, "1")) {
          return;
       }
       this.b.h2();
       return;
    }
    public void v2(boolean p0,boolean p1){
       p.b(this, p0, p1);
    }
}
