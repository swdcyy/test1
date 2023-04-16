package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.LiveAudienceMultiLineArenaLineController$containerVcDelegate$2$a;
import hr1.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.LiveAudienceMultiLineArenaLineController$containerVcDelegate$2;
import java.lang.Object;
import android.view.ViewGroup;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import java.util.Objects;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;

public final class LiveAudienceMultiLineArenaLineController$containerVcDelegate$2$a implements a	// class@001502
{
    public final LiveAudienceMultiLineArenaLineController$containerVcDelegate$2 a;

    public void LiveAudienceMultiLineArenaLineController$containerVcDelegate$2$a(LiveAudienceMultiLineArenaLineController$containerVcDelegate$2 p0){
       this.a = p0;
       super();
    }
    public void E2(ViewGroup p0,ViewController p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceMultiLineArenaLineController$containerVcDelegate$2$a.class, "2")) {
          return;
       }
       a.p(p0, "viewGroup");
       a.p(p1, "viewController");
       this.a.this$0.y2(p0, p1);
       return;
    }
    public ViewGroup a(){
       View obj = PatchProxy.apply(null, this, LiveAudienceMultiLineArenaLineController$containerVcDelegate$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.this$0.P2();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.ViewGroup");
       return obj;
    }
    public Context getContext(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineArenaLineController$containerVcDelegate$2$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.this$0.D2();
    }
    public LifecycleOwner j(){
       return this.a.this$0;
    }
    public void o1(ViewController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineArenaLineController$containerVcDelegate$2$a.class, "3")) {
          return;
       }
       a.p(p0, "viewController");
       this.a.this$0.O2(p0);
       return;
    }
}
