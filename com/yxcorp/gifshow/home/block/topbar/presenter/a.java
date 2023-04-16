package com.yxcorp.gifshow.home.block.topbar.presenter.a;
import z1.a;
import java.lang.Integer;
import java.lang.Object;
import vn5.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a implements a	// class@001689
{
    public final Integer a;

    public void a(Integer p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a ta = this.a;
          boolean b = (ta != null && !ta.intValue())? true: false;
          p0.U0(b);
       }
       return;
    }
}
