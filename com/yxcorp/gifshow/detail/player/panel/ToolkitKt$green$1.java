package com.yxcorp.gifshow.detail.player.panel.ToolkitKt$green$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.detail.player.panel.elements.TextElement;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.a1;

public final class ToolkitKt$green$1 extends Lambda implements l	// class@00160e
{
    public final l $init;

    public void ToolkitKt$green$1(l p0){
       this.$init = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TextElement p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ToolkitKt$green$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       String str = a1.p(R.string.arg_RES_7f103ca9);
       a.o(str, "CommonUtil.string\(R.stri¡­anel_accessibility_green\)");
       p0.l(str);
       p0.j(a1.d(R.dimen.arg_RES_7f0702b8));
       p0.i(a1.d(R.dimen.arg_RES_7f0702a4));
       this.$init.invoke(p0);
       return;
    }
}
