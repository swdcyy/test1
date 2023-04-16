package com.kuaishou.live.house.model.HouseLiveExplainMessage$a;
import java.lang.Object;
import nsd.u;
import com.kuaishou.livestream.message.nano.SCLiveLocalLifeExplainCardSignal;
import com.kuaishou.live.house.model.HouseLiveExplainMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import og0.b;
import fg6.a;
import com.kuaishou.live.house.model.ExplainBundleInfo;
import com.google.gson.Gson;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class HouseLiveExplainMessage$a	// class@001d0c
{

    public void HouseLiveExplainMessage$a(){
       super();
    }
    public void HouseLiveExplainMessage$a(u p0){
       super();
    }
    public final HouseLiveExplainMessage a(SCLiveLocalLifeExplainCardSignal p0){
       HouseLiveExplainMessage obj = PatchProxy.applyOneRefs(p0, this, HouseLiveExplainMessage$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = new HouseLiveExplainMessage();
       obj.setMSignalType(p0.signalType);
       SCLiveLocalLifeExplainCardSignal title = p0.title;
       a.o(title, "pb.title");
       obj.setMTitle(title);
       title = p0.topLeftTips;
       a.o(title, "pb.topLeftTips");
       obj.setMTopLeftTips(title);
       obj.setMIconUrls(b.e(p0.icon));
       title = p0.buttonText;
       a.o(title, "pb.buttonText");
       obj.setMButtonText(title);
       title = p0.topLeftTips;
       a.o(title, "pb.topLeftTips");
       obj.setMTopLeftTips(title);
       obj.setMTopLeftIconUrls(b.e(p0.topLeftIcon));
       obj.setMShowClose(p0.showClose);
       title = p0.bizType;
       a.o(title, "pb.bizType");
       obj.setMBizType(title);
       title = p0.ext;
       a.o(title, "pb.ext");
       obj.setMExtParams(title);
       title = p0.subTitle;
       a.o(title, "pb.subTitle");
       obj.setMSubTitle(title);
       title = p0.productId;
       a.o(title, "pb.productId");
       obj.setMProductId(title);
       title = p0.symbol;
       a.o(title, "pb.symbol");
       obj.setMSymbol(title);
       title = p0.bizId;
       a.o(title, "pb.bizId");
       obj.setMBizId(title);
       title = p0.priceText;
       a.o(title, "pb.priceText");
       obj.setMPriceText(title);
       title = p0.stateText;
       a.o(title, "pb.stateText");
       obj.setMStateText(title);
       obj.setMCloseAudienceExplainForever(p0.closeAudienceExplainForever);
       title = p0.source;
       a.o(title, "pb.source");
       obj.setMSource(title);
       title = p0.anchorUrl;
       a.o(title, "pb.anchorUrl");
       obj.setMAnchorUrl(title);
       title = p0.audienceUrl;
       a.o(title, "pb.audienceUrl");
       obj.setMAudienceUrl(title);
       title = p0.topLeftTipsSecond;
       a.o(title, "pb.topLeftTipsSecond");
       obj.setMTopLeftTipsSecond(title);
       title = p0.authorRole;
       a.o(title, "pb.authorRole");
       obj.setMAuthorRole(title);
       CDNUrl[] uCDNUrlArray = b.e(p0.topLeftIconSecond);
       try{
          obj.setMTopLeftIconUrlsSecond(uCDNUrlArray);
          ExplainBundleInfo uExplainBund = a.a.h(p0.bundleInfo, ExplainBundleInfo.class);
          if (uExplainBund != null && !TextUtils.x(uExplainBund.getMBundleId())) {
             obj.setMBundleInfo(uExplainBund);
          }
       label_0103 :
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
}
