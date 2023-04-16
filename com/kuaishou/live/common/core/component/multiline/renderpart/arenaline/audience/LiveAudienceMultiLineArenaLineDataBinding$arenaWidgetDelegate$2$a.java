package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.LiveAudienceMultiLineArenaLineDataBinding$arenaWidgetDelegate$2$a;
import er1.c;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.LiveAudienceMultiLineArenaLineDataBinding$arenaWidgetDelegate$2;
import java.lang.Object;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.LiveAudienceMultiLineArenaLineDataBinding;
import sq1.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import yb6.d;

public final class LiveAudienceMultiLineArenaLineDataBinding$arenaWidgetDelegate$2$a implements c	// class@001505
{
    public final boolean a;
    public final LiveAudienceMultiLineArenaLineDataBinding$arenaWidgetDelegate$2 b;

    public void LiveAudienceMultiLineArenaLineDataBinding$arenaWidgetDelegate$2$a(LiveAudienceMultiLineArenaLineDataBinding$arenaWidgetDelegate$2 p0){
       this.b = p0;
       super();
       this.a = a.t().u("SOURCE_LIVE").d("enableAudienceMultiInteractiveDowngrade", true);
    }
    public void A(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineArenaLineDataBinding$arenaWidgetDelegate$2$a.class, "2")) {
          return;
       }
       a.p(p0, "e");
       this.b.this$0.o.A(p0);
       return;
    }
    public boolean S(){
       return this.a;
    }
    public void a(){
    }
    public boolean e(){
       return false;
    }
    public long getServerTimestamp(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineArenaLineDataBinding$arenaWidgetDelegate$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return d.a();
    }
}
