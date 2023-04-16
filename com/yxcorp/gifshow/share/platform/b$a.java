package com.yxcorp.gifshow.share.platform.b$a;
import io.reactivex.g;
import com.yxcorp.gifshow.share.platform.WechatForward;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.platform.b$a$a;
import fz6.a;
import com.yxcorp.gifshow.share.platform.WechatForward$a;
import java.lang.Throwable;
import brd.g;

public final class b$a implements g	// class@001c23
{
    public final WechatForward b;
    public final KwaiOperator c;
    public final String d;
    public final String e;
    public final String f;

    public void b$a(WechatForward p0,KwaiOperator p1,String p2,String p3,String p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       WechatForward$a.e(this.b, this.d, this.e, this.f, new b$a$a(this, p0), this.c);
       return;
    }
}
