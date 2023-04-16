package bi2.e;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import java.lang.String;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import bi2.g;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.redpacket.richcard.http.BarTitleTextMap;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfo;
import com.kuaishou.live.core.show.redpacket.richcard.http.EffectInfo;
import com.kuaishou.live.core.show.redpacket.richcard.http.PendantConfig;
import com.kuaishou.live.core.show.redpacket.richcard.http.SpecialScenePopupParams;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.BottomBarInfo;
import java.util.List;
import com.kuaishou.live.core.show.redpacket.richcard.http.UsingCardInfo;
import com.kuaishou.live.core.show.redpacket.richcard.http.ItemInfo;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.common.core.component.redpacket.model.LiveActivityRedPacketGrabResponse$LiveActivityRedPacketGrabItem;
import com.kuaishou.live.core.show.redpacket.richcard.http.UseRichCardResponseData;
import java.lang.Long;

public final class e extends Model	// class@0003f7
{

    public void e(){
       super("LiveRichCardModel", null, false, false, 14, null);
    }
    public final void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       a.p(p0, "source");
       this.h(p0+"[exitRichCard]");
       return;
    }
    public final boolean f(){
       g obj = PatchProxy.apply(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a();
       boolean b = (obj != null && obj.d() == 7)? true: false;
       return b;
    }
    public final boolean g(){
       g obj = PatchProxy.apply(null, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a();
       boolean b = (obj != null && obj.d() == 10)? true: false;
       return b;
    }
    public final void h(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "7")) {
          return;
       }
       a.p(p0, "source");
       b.c0(LiveRichCardStateManager.h.f(), "[richCardModel][resetData]", "source", p0);
       g og = new g(null, null, null, null, null, 5, null);
       this.d(p0+"[LiveRichCard]", v8);
       return;
    }
    public final void i(List p0){
       UsingCardInfo usingCardInf;
       object oobject;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       if (p0 != null && !p0.isEmpty()) {
          g og = this.a();
          if (og != null) {
             RichCardInfo richCardInfo = og.b();
             if (richCardInfo != null) {
                usingCardInf = richCardInfo.getUsingCardInfo();
             label_002a :
                if (usingCardInf == null) {
                   b.Z(LiveRichCardStateManager.h.f(), "[updateRedPacketGrabItem], usingCardInfo == null");
                   return;
                }else {
                   usingCardInf.setCardUsedCount((usingCardInf.getCardUsedCount() + 1));
                   usingCardInf.setCardCanUseRemainCount((usingCardInf.getCardCanUseRemainCount() - 1));
                   ItemInfo[] itemInfoList = usingCardInf.getItemInfoList();
                   if (itemInfoList != null) {
                      Iterator iterator = p0.iterator();
                      while (iterator.hasNext()) {
                         LiveActivityRedPacketGrabResponse$LiveActivityRedPacketGrabItem liveActivity = iterator.next();
                         int len = itemInfoList.length;
                         int i = 0;
                         while (true) {
                            if (i < len) {
                               oobject = itemInfoList[i];
                               long l = (oobject.getItemId() == liveActivity.mId)? 1: 0;
                               if (l) {
                               label_0078 :
                                  if (oobject != null) {
                                     long l1 = oobject.getItemCount() + (long)liveActivity.mCount;
                                     oobject.setItemCount(l1);
                                  }else {
                                     continue ;
                                  }
                               }else {
                                  i = i + 1;
                               }
                            }else {
                               oobject = null;
                               goto label_0078 ;
                            }
                         }
                      }
                   }
                   this.d("[LiveRichCard]grab update", this.a());
                }
             }
          }
          usingCardInf = null;
          goto label_002a ;
       }
       return;
    }
    public final void j(UseRichCardResponseData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       a.p(p0, "response");
       b.c0(LiveRichCardStateManager.h.f(), "[richCardModel][updateUseRichCardResponse]", "UseRichCardResponseData", p0);
       g og = this.a();
       EffectInfo uEffectInfo = null;
       RichCardInfo richCardInfo = (og != null)? og.b(): uEffectInfo;
       Long serverTime = (richCardInfo != null)? richCardInfo.getServerTime(): uEffectInfo;
       Long freeCardShow = (richCardInfo != null)? richCardInfo.getFreeCardShowEndTime(): uEffectInfo;
       RichCardInfo richCardInfo1 = new RichCardInfo(serverTime, freeCardShow, p0.getBarTitleTextMap(), p0.getUsingCardInfo());
       BarTitleTextMap barTitleText = p0.getBarTitleTextMap();
       g og1 = this.a();
       if (og1 != null) {
          uEffectInfo = og1.c();
       }
       og1 = new g(barTitleText, richCardInfo1, uEffectInfo, p0.getPendantInfo(), p0.getSpecialScenePopUpParams(), 10, p0.getBottomBarInfo());
       this.d("[LiveRichCard]updateUseRichCardResponse", freeCardShow);
       return;
    }
}
