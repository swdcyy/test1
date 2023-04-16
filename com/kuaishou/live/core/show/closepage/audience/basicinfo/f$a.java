package com.kuaishou.live.core.show.closepage.audience.basicinfo.f$a;
import e12.a;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.f;
import java.lang.Object;
import java.lang.Throwable;
import qvb.q;
import qvb.p;
import c51.b;
import c51.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;

public class f$a implements a	// class@000a38
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void S(boolean p0){
       a.e(this, p0);
    }
    public void U(boolean p0){
       a.d(this, p0);
    }
    public void X(boolean p0,Throwable p1){
       a.c(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public void c0(){
       a.a(this);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, f$a.class, "2")) {
          return;
       }
       this.b.P8();
       return;
    }
    public void w(boolean p0,List p1){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, f$a.class, "1")) {
          return;
       }
       this.b.P8();
       return;
    }
}
