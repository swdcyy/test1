package com.yxcorp.gifshow.detail.player.panel.ToolkitKt$cancel$1;
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

public final class ToolkitKt$cancel$1 extends Lambda implements l	// class@00160b
{
    public final l $init;

    public void ToolkitKt$cancel$1(l p0){
       this.$init = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TextElement p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ToolkitKt$cancel$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       String str = a1.p(R.string.cancel);
       a.o(str, "CommonUtil.string\(R.string.cancel\)");
       p0.l(str);
       p0.j(a1.d(R.dimen.arg_RES_7f07029e));
       p0.i(a1.d(R.dimen.arg_RES_7f0702ac));
       p0.g = true;
       this.$init.invoke(p0);
       return;
    }
}