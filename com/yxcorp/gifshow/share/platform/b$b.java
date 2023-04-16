package com.yxcorp.gifshow.share.platform.b$b;
import io.reactivex.g;
import com.yxcorp.gifshow.share.platform.WechatForward;
import com.yxcorp.gifshow.share.KwaiOperator;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.platform.b$b$a;
import com.yxcorp.gifshow.share.platform.WechatForward$a;
import fz6.a;
import java.lang.Throwable;
import brd.g;

public final class b$b implements g	// class@001c25
{
    public final WechatForward b;
    public final KwaiOperator c;
    public final WXMediaMessage d;
    public final String e;

    public void b$b(WechatForward p0,KwaiOperator p1,WXMediaMessage p2,String p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       b$b tb = this.b;
       WechatForward$a.f(tb, this.d, WechatForward$a.d(tb), this.e, new b$b$a(this, p0), this.c);
       return;
    }
}
