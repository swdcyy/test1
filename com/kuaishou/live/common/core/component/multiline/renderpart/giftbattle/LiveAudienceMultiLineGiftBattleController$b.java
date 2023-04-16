package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController$b;
import hr1.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController;
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

public final class LiveAudienceMultiLineGiftBattleController$b implements a	// class@001560
{
    public final LiveAudienceMultiLineGiftBattleController a;

    public void LiveAudienceMultiLineGiftBattleController$b(LiveAudienceMultiLineGiftBattleController p0){
       this.a = p0;
       super();
    }
    public void E2(ViewGroup p0,ViewController p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceMultiLineGiftBattleController$b.class, "2")) {
          return;
       }
       a.p(p0, "viewGroup");
       a.p(p1, "viewController");
       this.a.y2(p0, p1);
       return;
    }
    public ViewGroup a(){
       View obj = PatchProxy.apply(null, this, LiveAudienceMultiLineGiftBattleController$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.P2();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.ViewGroup");
       return obj;
    }
    public Context getContext(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineGiftBattleController$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.D2();
    }
    public LifecycleOwner j(){
       return this.a;
    }
    public void o1(ViewController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLineGiftBattleController$b.class, "3")) {
          return;
       }
       a.p(p0, "viewController");
       this.a.O2(p0);
       return;
    }
}
