package com.yxcorp.gifshow.share.platform.WechatForward$a$a;
import erd.r;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class WechatForward$a$a implements r	// class@001c19
{
    public static final WechatForward$a$a b;

    static {
       WechatForward$a$a.b = new WechatForward$a$a();
    }
    public void WechatForward$a$a(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, WechatForward$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = (p0 == ActivityEvent.DESTROY)? true: false;
       }
       return b;
    }
}
