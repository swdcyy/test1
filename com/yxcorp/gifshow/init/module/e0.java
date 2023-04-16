package com.yxcorp.gifshow.init.module.e0;
import erd.g;
import com.yxcorp.gifshow.init.module.LocationKeepAliveInitModule;
import java.lang.String;
import java.lang.Object;
import o6b.a;
import java.util.Objects;
import com.kwai.android.common.bean.Channel;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import qe6.b;
import java.lang.Boolean;
import lnc.i3;
import java.lang.Number;
import k2b.u1;
import com.yxcorp.utility.Log;
import java.lang.StringBuilder;
import com.kwai.framework.location.locationupload.l;
import r96.v;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;

public final class e0 implements g	// class@0019bb
{
    public final LocationKeepAliveInitModule b;
    public final String c;

    public void e0(LocationKeepAliveInitModule p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       e0 tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.a().type;
       if ((this.c).contains(String.valueOf(p0)) && (!PatchProxy.isSupport2(LocationKeepAliveInitModule.class, "2") || !PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), tb, LocationKeepAliveInitModule.class, "2"))) {
          boolean b = b.a();
          String str = "3";
          if (!PatchProxy.isSupport2(LocationKeepAliveInitModule.class, str) || !PatchProxy.applyVoidTwoRefsWithListener(Integer.valueOf(p0), Boolean.valueOf(b), null, LocationKeepAliveInitModule.class, str)) {
             i3 oi3 = i3.f();
             oi3.c("channel", Integer.valueOf(p0));
             oi3.a("isAgreePrivacy", Boolean.valueOf(b));
             u1.R("FRIGATE_KEEP_ALIVE_MAC_START", oi3.e(), 21);
             PatchProxy.onMethodExit(LocationKeepAliveInitModule.class, str);
          }
          String str1 = "LKAInitModule";
          if (!b) {
             Log.g(str1, "isAgreePrivacy is false");
             PatchProxy.onMethodExit(LocationKeepAliveInitModule.class, "2");
          }else {
             Log.g(str1, "type="+p0);
             if (tb.q == null) {
                tb.q = new l();
             }
             p0 = tb.q;
             Objects.requireNonNull(p0);
             l ol = l.class;
             if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, p0, ol, "1")) {
                c.k(new v(p0, true));
             }
             PatchProxy.onMethodExit(LocationKeepAliveInitModule.class, "2");
          }
       }
       return;
    }
}
