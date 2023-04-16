package com.kuaishou.live.lite.highfrequency.biz.fansgroup.LiveLiteHighFrequencyGuideFansGroupItemVC;
import nb3.b;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide;
import msd.a;
import mb3.c;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder$a;
import e93.a;
import pg1.e;
import ip3.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import d61.j;
import com.kuaishou.live.lite.highfrequency.biz.fansgroup.LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$1;
import com.kuaishou.live.lite.highfrequency.biz.fansgroup.LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$2;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import xp5.g;
import ob3.a;
import ob3.b;
import erd.g;

public final class LiveLiteHighFrequencyGuideFansGroupItemVC extends b	// class@0009b5
{
    public final a q;
    public final e r;
    public final a s;
    public final a t;

    public void LiveLiteHighFrequencyGuideFansGroupItemVC(HighFrequencyActionGuide p0,a p1,c p2,HighFluencyDescriptionBinder$a p3,a p4,e p5,a p6,a p7){
       a.p(p0, "actionGuide");
       a.p(p1, "actionStyleProvider");
       a.p(p2, "delegate");
       a.p(p3, "giftIconProvider");
       a.p(p4, "audienceInfoManager");
       a.p(p5, "followManager");
       a.p(p6, "fansGroupJoinService");
       a.p(p7, "liteFansGroupService");
       super(p0, p1, p3, p2);
       this.q = p4;
       this.r = p5;
       this.s = p6;
       this.t = p7;
    }
    public int V2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteHighFrequencyGuideFansGroupItemVC.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070319);
    }
    public String X2(){
       String obj = PatchProxy.apply(null, this, LiveLiteHighFrequencyGuideFansGroupItemVC.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j.a("https://static.yximgs.com/kos/nlav10954/lite_high_frequency_guide/high_frequency_action_join_fans_group.png");
       a.o(obj, "LiveCDNUrlUtils.composeC¡­oin_fans_group.png\"\n    \)");
       return obj;
    }
    public void Z2(HighFrequencyActionGuide p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveLiteHighFrequencyGuideFansGroupItemVC.class, "2")) {
          return;
       }
       a.p(obj1, "actionGuide");
       LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$1 ohandleButto = new LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$1(obj);
       LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$2 iNSTANCE = LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$2.INSTANCE;
       if (!PatchProxy.applyVoidThreeRefs(p0, ohandleButto, iNSTANCE, this, LiveLiteHighFrequencyGuideFansGroupItemVC.class, "3")) {
          if (obj.r.getFollowStatus()) {
             ohandleButto.invoke();
          }else {
             obj.r.l7(obj.q.j0(), obj.q.d(), 258, false, new a(ohandleButto), new b(iNSTANCE));
          }
       }
       return;
    }
}
