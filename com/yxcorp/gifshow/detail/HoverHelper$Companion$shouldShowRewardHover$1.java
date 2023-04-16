package com.yxcorp.gifshow.detail.HoverHelper$Companion$shouldShowRewardHover$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import xf6.d;
import xf6.l;
import java.lang.CharSequence;
import e17.i;

public final class HoverHelper$Companion$shouldShowRewardHover$1 extends Lambda implements l	// class@001338
{
    public final boolean $showFailToast;

    public void HoverHelper$Companion$shouldShowRewardHover$1(boolean p0){
       this.$showFailToast = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HoverHelper$Companion$shouldShowRewardHover$1.class, "1")) {
          return;
       }
       a.p(p0, "message");
       if (this.$showFailToast != null && l.c("KEY_REWARD_HOVER_SHOW_FAIL_TOAST", false)) {
          i.e(R.style.arg_RES_7f11066a, p0, false);
       }
       return;
    }
}
