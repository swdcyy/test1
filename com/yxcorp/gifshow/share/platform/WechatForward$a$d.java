package com.yxcorp.gifshow.share.platform.WechatForward$a$d;
import erd.g;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import fz6.c;

public final class WechatForward$a$d implements g	// class@001c1c
{
    public final SendMessageToWX$Req b;

    public void WechatForward$a$d(SendMessageToWX$Req p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WechatForward$a$d.class, "1")) {
       }else {
          c.c(this.b.transaction);
       }
       return;
    }
}
