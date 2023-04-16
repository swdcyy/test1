package com.yxcorp.gifshow.featured.offline.c$a$a;
import com.yxcorp.image.fresco.wrapper.a$g;
import java.lang.String;
import com.yxcorp.gifshow.featured.offline.c$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public final class c$a$a implements a$g	// class@000fe7
{
    public final String a;
    public final c$b b;

    public void c$a$a(String p0,c$b p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onResult(boolean p0){
       if (PatchProxy.isSupport2(c$a$a.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, c$a$a.class, "1")) {
          return;
       }
       if (p0) {
          this.b.onResult(this.a);
       }
       PatchProxy.onMethodExit(c$a$a.class, "1");
       return;
    }
}
