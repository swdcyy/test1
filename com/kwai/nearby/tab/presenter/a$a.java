package com.kwai.nearby.tab.presenter.a$a;
import qvb.q;
import com.kwai.nearby.tab.presenter.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.p;

public class a$a implements q	// class@001036
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, a$a.class, "3")) {
          return;
       }
       this.b.P8();
       this.b.V8();
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, a$a.class, "1")) {
          return;
       }
       this.b.S8();
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, a$a.class, "2")) {
          return;
       }
       this.b.P8();
       this.b.V8();
       return;
    }
}
