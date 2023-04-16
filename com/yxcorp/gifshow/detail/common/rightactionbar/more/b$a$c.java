package com.yxcorp.gifshow.detail.common.rightactionbar.more.b$a$c;
import erd.g;
import com.yxcorp.gifshow.detail.common.rightactionbar.more.b$a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.common.rightactionbar.more.b;
import whc.k0;

public final class b$a$c implements g	// class@0014ae
{
    public final b$a b;

    public void b$a$c(b$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b$a$c.class, "1")) {
       }else {
          p0 = this.b.b.s;
          if (p0 != null) {
             p0.y(R.string.arg_RES_7f105153);
          }
          PatchProxy.onMethodExit(b$a$c.class, "1");
       }
       return;
    }
}
