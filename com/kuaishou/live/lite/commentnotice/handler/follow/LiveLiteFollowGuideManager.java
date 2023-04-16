package com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideManager;
import com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideManager$a;
import nsd.u;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import or5.d;
import pg1.e;
import ip3.a;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import qa3.b;
import z1.k;
import ja3.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideConsumerImpl;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import xp5.g;
import xp5.i;
import com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideManager$disableCommentNoticeStatus$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideManager$b;
import com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideManager$handlerMap$2;
import qa3.a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;
import brd.t;
import java.util.Map;

public final class LiveLiteFollowGuideManager	// class@000867
{
    public final LiveLiteFollowGuideConsumerImpl a;
    public final p b;
    public final a c;
    public final p d;
    public final LifecycleOwner e;
    public final LiveLiteGuidanceMessageQueueManager f;
    public final d g;
    public final e h;
    public final a i;
    public final a j;
    public final LiveActionTrigger k;
    public final b l;
    public final a m;
    public static final LiveLiteFollowGuideManager$a n;

    static {
       LiveLiteFollowGuideManager.n = new LiveLiteFollowGuideManager$a(null);
    }
    public void LiveLiteFollowGuideManager(Context p0,LifecycleOwner p1,LiveLiteGuidanceMessageQueueManager p2,d p3,e p4,a p5,a p6,LiveActionTrigger p7,b p8,k p9,a p10,a p11){
       int i = this;
       LiveLiteFollowGuideConsumerImpl obj = p1;
       Object obj1 = p2;
       Object obj2 = p3;
       Object obj3 = p4;
       Object obj4 = p5;
       String obj5 = p6;
       Object obj6 = p7;
       Object obj7 = p8;
       Object obj8 = p11;
       a.p(p0, "context");
       a.p(obj, "lifecycleOwner");
       a.p(obj1, "guideQueueService");
       a.p(obj2, "infoManager");
       a.p(obj3, "followManager");
       a.p(obj4, "liteSideBarService");
       a.p(obj5, "bottomBarService");
       a.p(obj6, "actionTrigger");
       a.p(obj7, "delayInfoManager");
       a.p(p9, "liveLogPackageProvider");
       a.p(p10, "commentEditorServiceHolder");
       a.p(obj8, "followGuideViewDelegate");
       super();
       i.e = obj;
       i.f = obj1;
       i.g = obj2;
       i.h = obj3;
       i.i = obj4;
       i.j = obj5;
       i.k = obj6;
       i.l = obj7;
       i.m = obj8;
       obj5 = p3.d();
       a.m(obj5);
       a.o(obj5, "infoManager.anchorUserId!!");
       obj = p9.get();
       a.o(obj, "liveLogPackageProvider.get\(\)");
       obj6 = obj;
       obj = new LiveLiteFollowGuideConsumerImpl(p0, p3.j0(), obj5, obj3, obj6, obj1, p10, obj8);
       i.a = v14;
       i.b = s.c(new LiveLiteFollowGuideManager$disableCommentNoticeStatus$2(this));
       LiveLiteFollowGuideManager$b uob = new LiveLiteFollowGuideManager$b(this);
       i.c = uob;
       i.d = s.c(new LiveLiteFollowGuideManager$handlerMap$2(this));
       obj7.c(uob);
    }
    public final boolean a(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteFollowGuideManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = CollectionsKt___CollectionsKt.J5(p0);
       p0.remove(LiveLiteBottomBarService$BottomBarType.COMMENT);
       boolean b = (p0.size() <= 2)? true: false;
       return b;
    }
    public final t b(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFollowGuideManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final Map c(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFollowGuideManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
}
