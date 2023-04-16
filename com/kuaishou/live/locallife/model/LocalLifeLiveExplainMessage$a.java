package com.kuaishou.live.locallife.model.LocalLifeLiveExplainMessage$a;
import java.lang.Object;
import nsd.u;
import com.kuaishou.livestream.message.nano.SCLiveLocalLifeExplainCardSignal;
import com.kuaishou.live.locallife.model.LocalLifeLiveExplainMessage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import gf3.a;
import com.kuaishou.live.locallife.model.LiveLocalLifeExplainCardPromotionStageInfo;
import com.kuaishou.livestream.message.nano.SCLiveLocalLifeExplainCardPromotionStageInfo;
import com.kuaishou.livestream.message.nano.ItemBizTag;
import fg6.a;
import com.kuaishou.live.locallife.model.ExplainBundleInfo;
import com.google.gson.Gson;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class LocalLifeLiveExplainMessage$a	// class@000c31
{

    public void LocalLifeLiveExplainMessage$a(){
       super();
    }
    public void LocalLifeLiveExplainMessage$a(u p0){
       super();
    }
    public final LocalLifeLiveExplainMessage a(SCLiveLocalLifeExplainCardSignal p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       LiveLocalLifeExplainCardPromotionStageInfo[] obj = PatchProxy.applyOneRefs(p0, this, LocalLifeLiveExplainMessage$a.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = null;
       if (p0 == null) {
          return obj;
       }
       LocalLifeLiveExplainMessage localLifeLiv = new LocalLifeLiveExplainMessage();
       localLifeLiv.setMSignalType(p0.signalType);
       SCLiveLocalLifeExplainCardSignal title = p0.title;
       a.o(title, "pb.title");
       localLifeLiv.setMTitle(title);
       title = p0.topLeftTips;
       a.o(title, "pb.topLeftTips");
       localLifeLiv.setMTopLeftTips(title);
       localLifeLiv.setMIconUrls(e0.i(p0.icon));
       title = p0.buttonText;
       a.o(title, "pb.buttonText");
       localLifeLiv.setMButtonText(title);
       title = p0.topLeftTips;
       a.o(title, "pb.topLeftTips");
       localLifeLiv.setMTopLeftTips(title);
       localLifeLiv.setMTopLeftIconUrls(e0.i(p0.topLeftIcon));
       localLifeLiv.setMShowClose(p0.showClose);
       title = p0.bizType;
       a.o(title, "pb.bizType");
       localLifeLiv.setMBizType(title);
       title = p0.ext;
       a.o(title, "pb.ext");
       localLifeLiv.setMExtParams(title);
       title = p0.subTitle;
       a.o(title, "pb.subTitle");
       localLifeLiv.setMSubTitle(title);
       title = p0.productId;
       a.o(title, "pb.productId");
       localLifeLiv.setMProductId(title);
       title = p0.symbol;
       a.o(title, "pb.symbol");
       localLifeLiv.setMSymbol(title);
       title = p0.bizId;
       a.o(title, "pb.bizId");
       localLifeLiv.setMBizId(title);
       title = p0.priceText;
       a.o(title, "pb.priceText");
       localLifeLiv.setMPriceText(title);
       title = p0.stateText;
       a.o(title, "pb.stateText");
       localLifeLiv.setMStateText(title);
       localLifeLiv.setMCloseAudienceExplainForever(p0.closeAudienceExplainForever);
       title = p0.source;
       a.o(title, "pb.source");
       localLifeLiv.setMSource(title);
       title = p0.anchorUrl;
       a.o(title, "pb.anchorUrl");
       localLifeLiv.setMAnchorUrl(title);
       title = p0.audienceUrl;
       a.o(title, "pb.audienceUrl");
       localLifeLiv.setMAudienceUrl(title);
       title = p0.topLeftTipsSecond;
       a.o(title, "pb.topLeftTipsSecond");
       localLifeLiv.setMTopLeftTipsSecond(title);
       localLifeLiv.setMTopLeftIconUrlsSecond(e0.i(p0.topLeftIconSecond));
       localLifeLiv.setMTopLeftStyle(p0.topLeftStyle);
       title = p0.promotionStages;
       Object obj1 = PatchProxy.applyOneRefs(title, obj, a.class, str);
       if (obj1 != patchProxyRe) {
       }else if(title != null){
          int i = 0;
          int i1 = 1;
          int i2 = (!title.length)? 1: 0;
          if (!(i2 ^ i1)) {
             title = obj;
          }
          if (title != null) {
             i2 = title.length;
             obj = new LiveLocalLifeExplainCardPromotionStageInfo[i2];
             for (i1 = 0; i1 < i2; i1 = i1 + 1) {
                obj[i1] = new LiveLocalLifeExplainCardPromotionStageInfo();
             }
             i2 = title.length;
             for (; i < i2; i = i + 1) {
                object oobject = title[i];
                SCLiveLocalLifeExplainCardPromotionStageInfo text = oobject.text;
                a.o(text, "info.text");
                SCLiveLocalLifeExplainCardPromotionStageInfo rightText = oobject.rightText;
                a.o(rightText, "info.rightText");
                LiveLocalLifeExplainCardPromotionStageInfo liveLocalLif = new LiveLocalLifeExplainCardPromotionStageInfo(oobject.topLeftTextType, oobject.promotionStageTime, text, rightText, oobject.promotionStatus);
                obj[i] = v13;
             }
          }
       }
       obj1 = obj;
       localLifeLiv.setMPromotionStages(obj1);
       localLifeLiv.setMPromotionStageIdx(p0.promotionStageIdx);
       localLifeLiv.setMQueryApiType(p0.queryApiType);
       localLifeLiv.setMPromotionId(p0.promotionId);
       localLifeLiv.setMPromotionTemplateId(p0.promotionTemplateId);
       localLifeLiv.setMTraceTag(p0.traceTag);
       SCLiveLocalLifeExplainCardSignal tagList = p0.tagList;
       try{
          localLifeLiv.setMTagList(tagList);
          ExplainBundleInfo uExplainBund = a.a.h(p0.bundleInfo, ExplainBundleInfo.class);
          if (uExplainBund != null && !TextUtils.x(uExplainBund.getMBundleId())) {
             localLifeLiv.setMBundleInfo(uExplainBund);
          }
       label_0173 :
          return localLifeLiv;
       }catch(java.lang.Exception e0){
       }
    }
}
