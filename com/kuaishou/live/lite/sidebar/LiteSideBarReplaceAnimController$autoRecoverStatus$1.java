package com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController$autoRecoverStatus$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController;
import android.view.View;
import com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController$a;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public final class LiteSideBarReplaceAnimController$autoRecoverStatus$1 extends Lambda implements a	// class@000b2a
{
    public final LiteSideBarReplaceAnimController$a $status;
    public final View $view;
    public final LiteSideBarReplaceAnimController this$0;

    public void LiteSideBarReplaceAnimController$autoRecoverStatus$1(LiteSideBarReplaceAnimController p0,View p1,LiteSideBarReplaceAnimController$a p2){
       this.this$0 = p0;
       this.$view = p1;
       this.$status = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiteSideBarReplaceAnimController$autoRecoverStatus$1.class, "1")) {
          return;
       }
       LiteSideBarReplaceAnimController$autoRecoverStatus$1 tthis$0 = this.this$0;
       LiteSideBarReplaceAnimController$autoRecoverStatus$1 t$view = this.$view;
       LiteSideBarReplaceAnimController$autoRecoverStatus$1 t$status = this.$status;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidTwoRefs(t$view, t$status, tthis$0, LiteSideBarReplaceAnimController.class, "15")) {
          t$view.setAlpha(t$status.a);
          t$view.setScaleX(t$status.b);
          t$view.setScaleY(t$status.c);
       }
       return;
    }
}
