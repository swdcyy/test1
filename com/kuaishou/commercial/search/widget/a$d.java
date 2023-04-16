package com.kuaishou.commercial.search.widget.a$d;
import erd.o;
import com.kuaishou.commercial.search.widget.a;
import java.lang.Object;
import mxb.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import xy.c;

public final class a$d implements o	// class@001579
{
    public final a b;
    public final int c;

    public void a$d(a p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefsWithListener(p0, this, a$d.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "wrapper");
          a v = this.b.v;
          a.o(v, "mAdSuspendedBallManager");
          String str = (1 == v.b())? "brand_float_week": "brand_float_strong";
          p0.l("template_show_type", str);
          uBoolean = Boolean.FALSE;
          PatchProxy.onMethodExit(a$d.class, "1");
       }
       return uBoolean;
    }
}
