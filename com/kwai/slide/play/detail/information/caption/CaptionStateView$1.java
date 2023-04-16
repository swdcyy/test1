package com.kwai.slide.play.detail.information.caption.CaptionStateView$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import ag6.a;

public final class CaptionStateView$1 extends Lambda implements p	// class@0017c5
{
    public final int $layoutId;

    public void CaptionStateView$1(int p0){
       this.$layoutId = p0;
       super(2);
    }
    public final View invoke(Context p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, CaptionStateView$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       a.p(p1, "parent");
       View view = a.c(LayoutInflater.from(p0), this.$layoutId, p1, false);
       a.o(view, "LayoutInflater.from\(cont¡­\(layoutId, parent, false\)");
       return view;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
