package com.yxcorp.gifshow.profile.presenter.profile.hover.e$a;
import qvb.q;
import com.yxcorp.gifshow.profile.presenter.profile.hover.e;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public class e$a implements q	// class@00155b
{
    public final e b;

    public void e$a(e p0){
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
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, e$a.class, "1")) {
          return;
       }
       this.b.a9();
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, e$a.class, "2")) {
          return;
       }
       e$a tb = this.b;
       tb.G = true;
       tb.a9();
       return;
    }
}
