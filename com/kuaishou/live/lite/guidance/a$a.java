package com.kuaishou.live.lite.guidance.a$a;
import com.kuaishou.live.lite.guidance.c$a;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLiteCommonGuideConfig;
import uf1.a;
import z1.k;
import java.lang.Object;
import com.kuaishou.live.lite.guidance.a$a$a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.HashSet;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;

public class a$a implements c$a	// class@00099f
{
    public final LiveConfigStartupResponse$LiveLiteCommonGuideConfig a;
    public final a b;
    public final k c;
    public final x d;

    public void a$a(LiveConfigStartupResponse$LiveLiteCommonGuideConfig p0,a p1,k p2){
       super();
       this.d = new a$a$a(this);
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       String str = this.c();
       String str1 = "LiveLiteGuidancePresenter";
       if (TextUtils.x(str)) {
          b.P(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str1), "updateSubBizTypeShownInLite: liveStreamId is null or empty!");
          return;
       }else {
          a$a tb = this.b;
          if (tb == null) {
             b.P(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str1), "updateSubBizTypeShownInLite: mLiveLiteBidirectionalDataTransferService is null!");
             return;
          }else {
             HashSet hashSet = tb.wb(str, "GUIDANCE_MESSAGE");
             if (hashSet == null) {
                hashSet = new HashSet();
             }
             if (!hashSet instanceof Set) {
                b.S(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str1), "updateSubBizTypeShownInLite: shownSubBizTypeSet is not Set!", "shownSubBizTypeSet", hashSet);
                return;
             }else {
                hashSet.add(p0);
                this.b.Ge(str, "GUIDANCE_MESSAGE", hashSet);
                return;
             }
          }
       }
    }
    public boolean b(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.d.get().contains(p0)) {
          return false;
       }
       obj = this.c();
       String str = "LiveLiteGuidancePresenter";
       if (TextUtils.x(obj)) {
          b.P(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str), "checkSubBizTypeShownInLiveRoom: liveStreamId is null or empty!");
          return false;
       }else {
          a$a tb = this.b;
          if (tb == null) {
             b.P(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str), "checkSubBizTypeShownInLiveRoom: mLiveLiteBidirectionalDataTransferService is null!");
             return false;
          }else {
             Object obj1 = tb.wb(obj, "GUIDANCE_MESSAGE");
             if (obj1 instanceof Set) {
                return obj1.contains(p0);
             }
             b.S(LiveLiteLogTag.LITE_GUIDANCE.appendTag(str), "checkSubBizTypeShownInLiveRoom: shownSubBizTypeSet is not Set!", "shownSubBizTypeSet", obj1);
             return false;
          }
       }
    }
    public final String c(){
       ClientContent$LiveStreamPackage obj = PatchProxy.apply(null, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.get();
       if (obj == null) {
          return null;
       }
       return obj.liveStreamId;
    }
}
