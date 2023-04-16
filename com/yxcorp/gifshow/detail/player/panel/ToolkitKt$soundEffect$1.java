package com.yxcorp.gifshow.detail.player.panel.ToolkitKt$soundEffect$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import k3a.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.detail.player.panel.elements.ActionType;

public final class ToolkitKt$soundEffect$1 extends Lambda implements l	// class@001619
{
    public final l $init;

    public void ToolkitKt$soundEffect$1(l p0){
       this.$init = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ToolkitKt$soundEffect$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       String str = a1.p(R.string.arg_RES_7f103cda);
       a.o(str, "CommonUtil.string\(R.stri¡­layer_panel_sound_effect\)");
       p0.p(str);
       p0.k(a1.f(R.drawable.arg_RES_7f081add));
       str = a1.p(R.string.arg_RES_7f103cc0);
       a.o(str, "CommonUtil.string\(R.stri¡­_effect_not_support_tips\)");
       p0.j(str);
       p0.q(ActionType.SOUND_EFFECT);
       this.$init.invoke(p0);
       return;
    }
}
