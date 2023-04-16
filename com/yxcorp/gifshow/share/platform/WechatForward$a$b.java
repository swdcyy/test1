package com.yxcorp.gifshow.share.platform.WechatForward$a$b;
import erd.g;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Req;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import fz6.c;

public final class WechatForward$a$b implements g	// class@001c1a
{
    public final WXOpenBusinessView$Req b;

    public void WechatForward$a$b(WXOpenBusinessView$Req p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WechatForward$a$b.class, "1")) {
       }else {
          c.c(this.b.transaction);
       }
       return;
    }
}
