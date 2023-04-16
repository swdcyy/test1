package com.yxcorp.gifshow.detail.player.panel.ToolkitKt$accessibility$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import k3a.c;
import java.lang.Object;
import k3a.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import lnc.a1;
import com.yxcorp.gifshow.detail.player.panel.elements.ActionType;

public final class ToolkitKt$accessibility$1 extends Lambda implements l	// class@001607
{
    public final l $init;
    public final c $this_accessibility;

    public void ToolkitKt$accessibility$1(c p0,l p1){
       this.$this_accessibility = p0;
       this.$init = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ToolkitKt$accessibility$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.k(ContextCompat.getDrawable(this.$this_accessibility.g(), R.drawable.arg_RES_7f081ad5));
       String str = a1.p(R.string.arg_RES_7f103cb4);
       a.o(str, "CommonUtil.string\(R.stri¡­ibility_not_support_tips\)");
       p0.j(str);
       p0.q(ActionType.ACCESSIBILITY);
       this.$init.invoke(p0);
       return;
    }
}
