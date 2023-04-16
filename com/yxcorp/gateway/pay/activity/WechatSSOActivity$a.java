package com.yxcorp.gateway.pay.activity.WechatSSOActivity$a;
import fv8.c;
import com.yxcorp.gateway.pay.activity.WechatSSOActivity;
import java.lang.Object;
import java.lang.String;
import pv8.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.tencent.mm.opensdk.modelmsg.SendAuth$Resp;
import com.yxcorp.gateway.pay.response.BindResult;
import android.app.Activity;
import java.lang.StringBuilder;
import lv8.g;

public class WechatSSOActivity$a implements c	// class@00120e
{
    public final WechatSSOActivity a;

    public void WechatSSOActivity$a(WechatSSOActivity p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1,String p2,c p3){
       BindResult uBindResult;
       if (PatchProxy.isSupport(WechatSSOActivity$a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, WechatSSOActivity$a.class, "1")) {
          return;
       }
       WechatSSOActivity$a ta = this.a;
       ta.mSendingWXReq = false;
       c e = p3.e;
       if (e instanceof SendAuth$Resp) {
          c c = p3.c;
          if (c == null) {
             ta.bindWechat(ta.mTicket, e.code, ta.mGroupKey);
          }else if(c == -2 || c == -4){
             uBindResult = BindResult.cancel(ta.getString(R.string.arg_RES_7f103baa));
          }else {
             uBindResult = BindResult.fail(p3.d);
          }
          ta.onFinish(uBindResult);
          g.d("wechat bind finish, errorCode="+p3.c+", errorMsg="+p3.d);
       }else {
          g.d("wechat bind failed, response invalid");
          this.a.onFinish(BindResult.fail(p3.d));
       }
       return;
    }
}
