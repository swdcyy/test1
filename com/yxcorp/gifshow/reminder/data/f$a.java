package com.yxcorp.gifshow.reminder.data.f$a;
import qvb.q;
import com.yxcorp.gifshow.reminder.data.f;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import qvb.n0;
import rcc.o$a;

public class f$a implements q	// class@001a6e
{
    public final f b;

    public void f$a(f p0){
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
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       uoa.X1(this.b.d1(), uoa.p);
       return;
    }
    public void v2(boolean p0,boolean p1){
       p.b(this, p0, p1);
    }
}
