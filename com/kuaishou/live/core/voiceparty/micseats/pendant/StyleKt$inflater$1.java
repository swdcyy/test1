package com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt$inflater$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.view.ContextThemeWrapper;
import android.content.Context;
import i2b.a;

public final class StyleKt$inflater$1 extends Lambda implements l	// class@001748
{
    public final int $layoutRes;
    public final int $styleRes;

    public void StyleKt$inflater$1(int p0,int p1){
       this.$styleRes = p0;
       this.$layoutRes = p1;
       super(1);
    }
    public final View invoke(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StyleKt$inflater$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       View view = a.d(new ContextThemeWrapper(p0.getContext(), this.$styleRes), this.$layoutRes, p0, false);
       a.o(view, "KwaiLayoutInflater.infla¡­    it,\n      false\n    \)");
       return view;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
