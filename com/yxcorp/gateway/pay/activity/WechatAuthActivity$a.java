package com.yxcorp.gateway.pay.activity.WechatAuthActivity$a;
import fv8.c;
import com.yxcorp.gateway.pay.activity.WechatAuthActivity;
import java.lang.Object;
import java.lang.String;
import pv8.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.tencent.mm.opensdk.modelmsg.SendAuth$Resp;
import java.lang.StringBuilder;
import com.yxcorp.gateway.pay.params.result.AuthThirdResult;
import lv8.g;

public class WechatAuthActivity$a implements c	// class@00120c
{
    public final WechatAuthActivity a;

    public void WechatAuthActivity$a(WechatAuthActivity p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1,String p2,c p3){
       AuthThirdResult uAuthThirdRe;
       if (PatchProxy.isSupport(WechatAuthActivity$a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, WechatAuthActivity$a.class, "1")) {
          return;
       }
       WechatAuthActivity$a ta = this.a;
       ta.mSendingWXReq = false;
       c e = p3.e;
       if (e instanceof SendAuth$Resp) {
          c c = p3.c;
          if (c == null) {
             uAuthThirdRe = AuthThirdResult.success(p3.c+"", e.code);
          }else if(c == -2 || c == -4){
             uAuthThirdRe = AuthThirdResult.cancel(p3.c+"", p3.d);
          }else {
             e = p3.c+"";
             c = p3.d;
          label_0083 :
             uAuthThirdRe = AuthThirdResult.fail(e, c);
          }
       }else {
          g.d("wechat auth failed, response invalid");
          ta = this.a;
          e = null;
          p2 = "wechat response invalid";
          goto label_0083 ;
       }
       ta.onFinish(uAuthThirdRe);
       return;
    }
}
