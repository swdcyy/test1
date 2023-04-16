package fg1.a;
import java.lang.Object;
import xf1.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.gift.GiftMessage;
import xp5.i;
import mi1.b;
import com.kuaishou.live.core.show.gift.DrawingGift;
import java.util.List;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import com.yxcorp.gifshow.models.GiftActionType;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ci1.c;
import java.lang.Long;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$BatchMoreInfoPackage;
import q2b.h$b;
import k2b.u1;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import o56.c;
import o56.a;
import xf6.g;
import pz2.c;
import java.util.Map;
import java.util.HashMap;
import ki1.a;
import ii1.a;
import java.util.Objects;
import kz2.a;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;

public class a	// class@002333
{

    public void a(){
       super();
    }
    public static int a(e p0,boolean p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), null, a.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0.b != null || (p0.a() && p1)) {
          b.Z(LiveLogTag.LIVE_EFFECT, "[isEffectInfoInvalid] filter stream merging effect in voiceParty");
          return 604;
       }else if(!p2 && p0.a()){
          b.Z(LiveLogTag.LIVE_EFFECT, "[isEffectInfoInvalid] filter stream merging effect, because is Audience");
          return 605;
       }else if(p3 && p0.a()){
          b.Z(LiveLogTag.LIVE_EFFECT, "[isEffectInfoInvalid] filter stream merging effect in audio live");
          return 606;
       }else {
          return 1;
       }
    }
    public static int b(GiftMessage p0,i p1,boolean p2,boolean p3,boolean p4){
       String obj1;
       GiftMessage mDrawingGift;
       object oobject = p0;
       object oobject1 = p1;
       boolean b = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       ClientContent$GiftPackage obj = null;
       int i = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{oobject,oobject1,Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          obj1 = PatchProxy.apply(objArray, obj, uoa, "6");
          if (obj1 != patchProxyRe) {
             return obj1.intValue();
          }
       }
       if (!b.b(p0)) {
          return 602;
       }else {
          ClientContentWrapper$ContentWrapper obj2 = PatchProxy.applyTwoRefs(p0, oobject1, obj, uoa, "7");
          if (obj2 != patchProxyRe) {
             i = obj2.booleanValue();
          }else if(oobject.mIsDrawingGift != null){
             mDrawingGift = oobject.mDrawingGift;
             if (mDrawingGift != null) {
                DrawingGift mPoints = mDrawingGift.mPoints;
                if (mPoints != null && !mPoints.size()) {
                   mDrawingGift = 1;
                label_006b :
                   if (!mDrawingGift) {
                      Gift gift = a.a(oobject.mGiftId);
                      if (gift == null || gift.mActionType != GiftActionType.DEFAULT_ANIMATION) {
                         ClientContent$LiveStreamPackage liveStreamPa = p1.a();
                         mDrawingGift = oobject.mMagicFaceId;
                         obj1 = "GiftSourceNotExit";
                         if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(liveStreamPa, Long.valueOf(mDrawingGift), obj1, null, c.class, "2")) {
                            obj = new ClientContent$GiftPackage();
                            obj.identity = String.valueOf(mDrawingGift);
                            ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                            uContentPack.giftPackage = obj;
                            uContentPack.liveStreamPackage = liveStreamPa;
                            ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
                            moreInfoPack.status = obj1;
                            obj2 = new ClientContentWrapper$ContentWrapper();
                            ClientContentWrapper$BatchMoreInfoPackage uBatchMoreIn = new ClientContentWrapper$BatchMoreInfoPackage();
                            obj2.batchMoreInfoPackage = uBatchMoreIn;
                            ClientContentWrapper$MoreInfoPackage[] moreInfoPack1 = new ClientContentWrapper$MoreInfoPackage[i];
                            moreInfoPack1[0] = moreInfoPack;
                            uBatchMoreIn.moreInfoPackage = moreInfoPack1;
                            h$b uob = h$b.e(8, "MAGIC_GIFT_EFFECT");
                            uob.i(obj2);
                            uob.h(uContentPack);
                            u1.r0(uob);
                         }
                         b.Z(LiveLogTag.MAGIC_GIFT, "DisplayMagicGiftsFailed because GiftSourceNotExit");
                         i = false;
                      }
                   }
                }
             }
          }
          mDrawingGift = null;
          goto label_006b ;
          if (!i) {
             return 603;
          }else if(oobject instanceof LiveGiftToAudienceMessage && !b){
             return 607;
          }else {
             return a.a(new e(p0), b, p3, p4);
          }
       }
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableLiveMultiMagicEffect", true);
    }
    public static int d(){
       Object obj = PatchProxy.apply(null, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 1;
       if (a.a().c()) {
          int i1 = g.p0();
          if (i1 && i1 == i) {
             i = 0;
          }
       }
       return i;
    }
    public static Map e(c p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, null, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("from", String.valueOf(a.f(p0)));
       return obj;
    }
    public static int f(c p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "9");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       int i = 0;
       if (p0 instanceof a) {
          i = p0.K();
       }else if(p0 instanceof a){
          Objects.requireNonNull(p0);
          obj = PatchProxy.apply(null, p0, a.class, "2");
          if (obj != patchProxyRe) {
             i = obj.intValue();
          }else if(p0.K()){
             i = 1;
          }else {
             i = 2;
          }
       }else if(p0 instanceof a){
          i = p0.p;
       }
       return i;
    }
    public static long g(){
       Object obj = PatchProxy.apply(null, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().u("SOURCE_LIVE").b("liveEffectLocalRenderFrameRate", 0);
    }
    public static Map h(boolean p0){
       HashMap obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, uoa, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new HashMap();
       obj.put("anchor", String.valueOf(p0));
       return obj;
    }
    public static boolean i(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof a && p0.l.effectBiz == 11)? true: false;
       return b;
    }
}
