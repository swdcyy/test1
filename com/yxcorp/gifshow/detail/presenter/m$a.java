package com.yxcorp.gifshow.detail.presenter.m$a;
import d6a.a;
import com.yxcorp.gifshow.detail.presenter.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public class m$a extends a	// class@0016f1
{
    public final m b;

    public void m$a(m p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, m$a.class, "2")) {
          return;
       }
       this.b.X8(Boolean.FALSE);
       this.b.z = false;
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, m$a.class, "1")) {
          return;
       }
       m$a tb = this.b;
       if (tb.z != null) {
          tb.X8(Boolean.TRUE);
       }
       return;
    }
}
