package com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import java.lang.String;
import mk1.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import oy1.a;

public class LiveSendGiftTraceInfo extends LiveSendGiftBaseTraceInfo	// class@0017b4
{

    public void LiveSendGiftTraceInfo(long p0){
       super(p0);
    }
    public void LiveSendGiftTraceInfo(String p0,long p1){
       super(p0, p1);
    }
    public LiveSendGiftTraceInfo D(b p0){
       UserInfo obj = PatchProxy.applyOneRefs(p0, this, LiveSendGiftTraceInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          b.P(b.a, "[LiveSendGiftTraceInfo][fill]GiftBoxParams is null");
          return this;
       }else {
          this.C(QCurrentUser.me().getId());
          obj = p0.e();
          if (obj == null) {
             this.A("");
          }else {
             this.A(obj.mId);
          }
          this.giftBoxPanelType = a.b(p0.d());
          this.q(p0.i());
          return this;
       }
    }
    public String a(){
       return "LiveGift";
    }
    public Object clone(){
       Object obj = PatchProxy.apply(null, this, LiveSendGiftTraceInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.clone();
    }
    public String d(){
       return "SEND_GIFT_TRACE";
    }
}
