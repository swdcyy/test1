package com.yxcorp.gifshow.aicut.ui.loading.DefaultAICutLoadingViewBinder;
import com.yxcorp.gifshow.aicut.ui.loading.AbsAICutLoadingViewBinder;
import c35.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import android.widget.TextSwitcher;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.aicut.ui.loading.AICutLoadingImageChangeView;
import com.airbnb.lottie.LottieAnimationView;
import com.kwai.library.widget.emptyview.KwaiPlayerFailedStateView;

public final class DefaultAICutLoadingViewBinder extends AbsAICutLoadingViewBinder	// class@001974
{

    public void DefaultAICutLoadingViewBinder(c p0){
       super(p0);
    }
    public int H(){
       return 0x7f0d00a3;
    }
    public void s(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultAICutLoadingViewBinder.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       this.e = p0.findViewById(0x7f0a32f2);
       this.f = p0.findViewById(0x7f0a32ed);
       this.g = p0.findViewById(0x7f0a01b8);
       this.h = p0.findViewById(0x7f0a03a1);
       this.i = p0.findViewById(0x7f0a0254);
       this.j = p0.findViewById(0x7f0a29af);
       this.k = p0.findViewById(0x7f0a1716);
       this.l = p0.findViewById(0x7f0a2db0);
       this.m = p0.findViewById(0x7f0a0c78);
       this.n = p0.findViewById(0x7f0a0d35);
       return;
    }
}
