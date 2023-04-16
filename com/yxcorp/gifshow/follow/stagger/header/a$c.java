package com.yxcorp.gifshow.follow.stagger.header.a$c;
import qvb.q;
import com.yxcorp.gifshow.follow.stagger.header.a;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public final class a$c implements q	// class@0011ae
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(a$c.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, a$c.class, "1")) {
          return;
       }
       if (p0 && !this.b.Z8()) {
          this.b.a9();
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
       if (PatchProxy.isSupport(a$c.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, a$c.class, "2")) {
          return;
       }
       if (p0) {
          this.b.c9();
       }
       return;
    }
}
