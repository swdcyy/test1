package com.yxcorp.gifshow.detail.player.panel.ToolkitKt$saveTraffic$1;
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

public final class ToolkitKt$saveTraffic$1 extends Lambda implements l	// class@001617
{
    public final l $init;
    public final c $this_saveTraffic;

    public void ToolkitKt$saveTraffic$1(c p0,l p1){
       this.$this_saveTraffic = p0;
       this.$init = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ToolkitKt$saveTraffic$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       String str = a1.p(R.string.arg_RES_7f103cba);
       a.o(str, "CommonUtil.string\(R.stri¡­r_panel_element_datasave\)");
       p0.p(str);
       p0.k(ContextCompat.getDrawable(this.$this_saveTraffic.g(), R.drawable.arg_RES_7f081adb));
       p0.q(ActionType.SAVE_TRAFFIC);
       this.$init.invoke(p0);
       return;
    }
}
