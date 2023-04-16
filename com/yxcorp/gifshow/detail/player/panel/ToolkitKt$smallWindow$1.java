package com.yxcorp.gifshow.detail.player.panel.ToolkitKt$smallWindow$1;
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

public final class ToolkitKt$smallWindow$1 extends Lambda implements l	// class@001618
{
    public final l $init;

    public void ToolkitKt$smallWindow$1(l p0){
       this.$init = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ToolkitKt$smallWindow$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       String str = a1.p(R.string.arg_RES_7f103cd7);
       a.o(str, "CommonUtil.string\(R.stri¡­layer_panel_small_window\)");
       p0.p(str);
       p0.k(a1.f(R.drawable.arg_RES_7f081adc));
       p0.q(ActionType.SMALL_WINDOW);
       this.$init.invoke(p0);
       return;
    }
}
