package com.yxcorp.gifshow.detail.player.panel.ToolkitKt$mirror$1;
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
import lnc.a1;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.yxcorp.gifshow.detail.player.panel.elements.ActionType;

public final class ToolkitKt$mirror$1 extends Lambda implements l	// class@001610
{
    public final l $init;
    public final c $this_mirror;

    public void ToolkitKt$mirror$1(c p0,l p1){
       this.$this_mirror = p0;
       this.$init = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ToolkitKt$mirror$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       String str = a1.p(R.string.arg_RES_7f103cbf);
       a.o(str, "CommonUtil.string\(R.stri¡­nel_element_mirror_title\)");
       p0.p(str);
       p0.k(ContextCompat.getDrawable(this.$this_mirror.g(), R.drawable.arg_RES_7f081ada));
       str = a1.p(R.string.arg_RES_7f103cbd);
       a.o(str, "CommonUtil.string\(R.stri¡­_mirror_not_support_tips\)");
       p0.j(str);
       p0.q(ActionType.MIRROR);
       this.$init.invoke(p0);
       return;
    }
}
