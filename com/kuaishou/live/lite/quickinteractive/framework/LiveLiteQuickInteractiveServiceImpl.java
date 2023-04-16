package com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveServiceImpl;
import vc3.i;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveServiceImpl$a;
import nsd.u;
import java.lang.String;
import xp5.i;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import ip3.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import vc3.l;
import vc3.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaItemType;
import java.util.Map;
import java.util.List;
import msd.l;
import java.lang.Long;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveServiceImpl$tryShowQuickInteractive$message$1;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;

public final class LiveLiteQuickInteractiveServiceImpl implements i	// class@000ad0
{
    public final l a;
    public b b;
    public final String c;
    public final i d;
    public final LiveLiteGuidanceMessageQueueManager e;
    public final a f;
    public static final LiveLiteQuickInteractiveServiceImpl$a g;

    static {
       LiveLiteQuickInteractiveServiceImpl.g = new LiveLiteQuickInteractiveServiceImpl$a(null);
    }
    public void LiveLiteQuickInteractiveServiceImpl(String p0,i p1,LiveLiteGuidanceMessageQueueManager p2,a p3){
       a.p(p0, "liveStreamId");
       a.p(p1, "liveLogPackageProvider");
       a.p(p2, "guidanceMessageQueueService");
       a.p(p3, "liteBottomBubbleService");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.a = new l();
    }
    public void a(j p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteQuickInteractiveServiceImpl.class, str)) {
          return;
       }
       String str1 = "creator";
       a.p(p0, str1);
       LiveLiteQuickInteractiveServiceImpl ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, l.class, str)) {
          a.p(p0, str1);
          ta.a.put(p0.getType(), p0);
       }
       return;
    }
    public void b(List p0,String p1,String p2,long p3,long p4,long p5,l p6,String p7){
       LiveLiteQuickInteractiveServiceImpl liveLiteQuic = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p6;
       LiveLiteQuickInteractiveServiceImpl liveLiteQuic1 = LiveLiteQuickInteractiveServiceImpl.class;
       if (PatchProxy.isSupport(liveLiteQuic1)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,Long.valueOf(p3),Long.valueOf(p4),Long.valueOf(p5),oobject3,p7};
          if (PatchProxy.applyVoid(objArray, this, liveLiteQuic1, "2")) {
             return;
          }
       }
       a.p(p0, "itemList");
       a.p(p1, "messageId");
       a.p(p2, "commonGuideSubBizType");
       a.p(oobject3, "subBizFrequencyConsumer");
       LiveLiteQuickInteractiveServiceImpl$tryShowQuickInteractive$message$1 otryShowQuic = new LiveLiteQuickInteractiveServiceImpl$tryShowQuickInteractive$message$1(this, p2, p1, p7, p6, p0, p3);
       liveLiteQuic.e.d(v10);
       return;
    }
}
