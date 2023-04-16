package com.yxcorp.gifshow.detail.presenter.o$a;
import tw6.e;
import com.yxcorp.gifshow.detail.presenter.o;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import w85.a;

public class o$a implements e	// class@0016f4
{
    public final o a;

    public void o$a(o p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, o$a.class, "2")) {
          return;
       }
       if (!this.a.L.g()) {
          return;
       }
       this.a.a9();
       return;
    }
    public void b(int p0){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (!this.a.L.g()) {
          return;
       }
       o$a ta = this.a;
       if (ta.T == null) {
          ta.d9();
       }
       return;
    }
}
