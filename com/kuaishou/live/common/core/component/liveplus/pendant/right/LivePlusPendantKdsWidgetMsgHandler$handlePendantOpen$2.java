package com.kuaishou.live.common.core.component.liveplus.pendant.right.LivePlusPendantKdsWidgetMsgHandler$handlePendantOpen$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LivePlusPendantKdsWidgetMsgHandler$handlePendantOpen$2 extends Lambda implements l	// class@00149a
{
    public static final LivePlusPendantKdsWidgetMsgHandler$handlePendantOpen$2 INSTANCE;

    static {
       LivePlusPendantKdsWidgetMsgHandler$handlePendantOpen$2.INSTANCE = new LivePlusPendantKdsWidgetMsgHandler$handlePendantOpen$2();
    }
    public void LivePlusPendantKdsWidgetMsgHandler$handlePendantOpen$2(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlusPendantKdsWidgetMsgHandler$handlePendantOpen$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       b.I(LiveCommonLogTag.LIVE_PLUS, "loadTkBundle failed", p0);
       return;
    }
}
