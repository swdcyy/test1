package com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardServiceImpl;
import f93.c;
import java.lang.String;
import xp5.i;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import ip3.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import f93.d;
import f93.e;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import f93.a;
import java.util.Objects;
import com.kuaishou.live.lite.benefitcard.LiveLiteBenefitCardType;
import java.util.Map;

public final class LiveLiteBenefitCardServiceImpl implements c	// class@001ea3
{
    public final d a;
    public b b;
    public final String c;
    public final i d;
    public final LiveLiteGuidanceMessageQueueManager e;
    public final a f;

    public void LiveLiteBenefitCardServiceImpl(String p0,i p1,LiveLiteGuidanceMessageQueueManager p2,a p3){
       a.p(p0, "liveStreamId");
       a.p(p1, "liveLogPackageProvider");
       a.p(p2, "liveLiteGuidanceMessageQueueManager");
       a.p(p3, "liteBottomBubbleService");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.a = new d();
    }
    public void a(e p0,String p1,String p2,long p3,long p4,long p5,l p6,String p7){
       LiveLiteBenefitCardServiceImpl liveLiteBene = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p6;
       LiveLiteBenefitCardServiceImpl liveLiteBene1 = LiveLiteBenefitCardServiceImpl.class;
       if (PatchProxy.isSupport(liveLiteBene1)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,Long.valueOf(p3),Long.valueOf(p4),Long.valueOf(p5),oobject3,p7};
          if (PatchProxy.applyVoid(objArray, this, liveLiteBene1, "2")) {
             return;
          }
       }
       a.p(oobject, "areaData");
       a.p(oobject1, "messageId");
       a.p(oobject2, "commonGuideSubBizType");
       a.p(oobject3, "subBizFrequencyConsumer");
       LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1 otryShowBene = new LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1(this, p7, p2, p1, p4, p5, p6, p0, p3);
       liveLiteBene.e.d(v14);
       return;
    }
    public void b(a p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBenefitCardServiceImpl.class, str)) {
          return;
       }
       String str1 = "creator";
       a.p(p0, str1);
       LiveLiteBenefitCardServiceImpl ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, d.class, str)) {
          a.p(p0, str1);
          ta.a.put(p0.getType(), p0);
       }
       return;
    }
}
