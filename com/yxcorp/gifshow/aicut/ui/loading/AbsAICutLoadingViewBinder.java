package com.yxcorp.gifshow.aicut.ui.loading.AbsAICutLoadingViewBinder;
import com.kuaishou.viewbinder.BaseViewBinder;
import com.yxcorp.gifshow.aicut.ui.loading.AbsAICutLoadingViewBinder$a;
import nsd.u;
import c35.c;
import android.widget.TextSwitcher;
import android.view.View;
import com.kwai.library.widget.emptyview.KwaiPlayerFailedStateView;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;

public abstract class AbsAICutLoadingViewBinder extends BaseViewBinder	// class@001973
{
    public TextView e;
    public View f;
    public TextSwitcher g;
    public KwaiImageView h;
    public AICutLoadingImageChangeView i;
    public LottieAnimationView j;
    public View k;
    public View l;
    public View m;
    public KwaiPlayerFailedStateView n;
    public static final AbsAICutLoadingViewBinder$a o;

    static {
       AbsAICutLoadingViewBinder.o = new AbsAICutLoadingViewBinder$a(null);
    }
    public void AbsAICutLoadingViewBinder(c p0){
       super(p0);
    }
    public final TextSwitcher A(){
       return this.g;
    }
    public final View B(){
       return this.m;
    }
    public final KwaiPlayerFailedStateView C(){
       return this.n;
    }
    public final LottieAnimationView D(){
       return this.j;
    }
    public final TextView E(){
       return this.e;
    }
    public final View G(){
       return this.f;
    }
    public abstract int H();
    public View u(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AbsAICutLoadingViewBinder.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "inflater");
       View view = a.f(p0, this.H(), null);
       a.o(view, "KwaiLayoutInflater.infla¡­flater, layoutId\(\), null\)");
       return view;
    }
    public final View y(){
       return this.k;
    }
    public final KwaiImageView z(){
       return this.h;
    }
}
