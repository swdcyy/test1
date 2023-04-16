package com.yxcorp.dynamicfeature.video.redpack.RedPackPluginImpl$c;
import erd.o;
import com.yxcorp.dynamicfeature.video.redpack.RedPackPluginImpl;
import java.lang.String;
import com.kwai.sharelib.model.QrCodeResponse;
import com.kwai.framework.model.user.User;
import mxc.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.yxcorp.dynamicfeature.video.redpack.a;
import io.reactivex.g;
import brd.t;

public final class RedPackPluginImpl$c implements o	// class@0011d6
{
    public final RedPackPluginImpl b;
    public final String c;
    public final QrCodeResponse d;
    public final boolean e;
    public final User f;
    public final a g;

    public void RedPackPluginImpl$c(RedPackPluginImpl p0,String p1,QrCodeResponse p2,boolean p3,User p4,a p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, RedPackPluginImpl$c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "themePath");
          ot = t.create(new a(this, p0));
          a.o(ot, "Observable.create<String¡­n\(\)\n          }\n        }");
       }
       return ot;
    }
}
