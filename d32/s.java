package d32.s;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import com.google.gson.JsonArray;
import java.util.Iterator;
import com.google.gson.JsonElement;
import p91.m;
import com.kuaishou.live.core.basic.model.LiveAnnounceInfo;
import com.kuaishou.live.common.core.component.comments.model.LiveAnnounceMessage;
import com.kuaishou.live.core.show.announcement.model.LiveSubscribeBriefInfo;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.common.core.component.follow.cache.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.basic.model.LiveSubscribeBookStatus;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import d32.r;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.live.common.core.component.comments.util.LiveCommentLogger;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.Boolean;
import wkd.b;
import com.kuaishou.live.common.core.component.authority.c;
import com.kwai.feature.api.live.merchant.authority.LiveAnchorFunction;

public class s	// class@00243a
{

    public void s(){
       super();
    }
    public static String a(List p0){
       JsonArray obj = PatchProxy.applyOneRefs(p0, null, s.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(p0)) {
          return "[]";
       }
       obj = new JsonArray();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj.a0(iterator.next());
       }
       return obj.toString();
    }
    public static void b(m p0,LiveAnnounceInfo p1){
       s os = s.class;
       i3 obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, os, "3")) {
          return;
       }
       LiveAnnounceMessage liveAnnounce = PatchProxy.applyTwoRefs(p1, p0, obj, os, "4");
       if (liveAnnounce != PatchProxyResult.class) {
       }else {
          liveAnnounce = new LiveAnnounceMessage();
          liveAnnounce.mLabelList = p1.mLiveAnnounceLabels;
          LiveAnnounceInfo mLiveSubscri = p1.mLiveSubscribeInfo;
          if (mLiveSubscri == null) {
             mLiveSubscri = new LiveSubscribeBriefInfo();
          }
          liveAnnounce.mSubscribeInfo = mLiveSubscri;
          liveAnnounce.mLiveAnnounceAction = p1.mLiveAnnounceAction;
          liveAnnounce.mAnnounceText = p1.mAnnounceContent;
          liveAnnounce.mAnnounceId = p1.mAnnounceId;
          liveAnnounce.mBizType = p1.mBizType;
          liveAnnounce.mBusinessParams = p1.mBusinessParams;
          if (!p0.e() && p0.I() != null) {
             if (c.b().c(p0.I().getId()) && (!TextUtils.x(mLiveSubscri.mLiveSubscribeId) && mLiveSubscri.mBookStatus != LiveSubscribeBookStatus.BOOKED)) {
                liveAnnounce.mActionType = "ORDER";
             }else {
                liveAnnounce.mActionType = "CHAT";
             }
          }
       }
       ClientContent$LiveStreamPackage liveStreamPa = p0.a();
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = p0.g();
       if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, liveVoicePar, liveAnnounce, null, r.class, "8")) {
          obj = i3.f();
          obj.d("biz_type", r.b(liveAnnounce));
          obj.c("notice_id", Long.valueOf(liveAnnounce.mAnnounceId));
          obj.d("business_params", liveAnnounce.mBusinessParams);
          LiveCommentLogger.d(r.a(liveStreamPa, liveVoicePar, liveAnnounce), obj.toString());
       }
       p0.x(liveAnnounce);
       return;
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, s.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-416381922).z(LiveAnchorFunction.LIVE_ANNOUNCE);
    }
}
