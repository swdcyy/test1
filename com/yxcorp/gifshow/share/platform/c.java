package com.yxcorp.gifshow.share.platform.c;
import erd.g;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import java.lang.Boolean;
import java.lang.Integer;

public final class c implements g	// class@001c27
{
    public final WechatForward$Companion b;

    public void c(WechatForward$Companion p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          WechatForward$Companion.a = Boolean.valueOf(this.b.f().isWXAppInstalled());
          WechatForward$Companion.b = Integer.valueOf(this.b.f().getWXAppSupportAPI());
       }
       return;
    }
}
