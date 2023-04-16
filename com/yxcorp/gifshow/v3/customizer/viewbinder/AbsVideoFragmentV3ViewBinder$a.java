package com.yxcorp.gifshow.v3.customizer.viewbinder.AbsVideoFragmentV3ViewBinder$a;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$e;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsVideoFragmentV3ViewBinder;
import com.kwai.video.editorsdk2.PreviewPlayer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import android.view.View;
import faa.a;
import q87.c;
import tkd.b;
import tkd.d;
import h69.h;
import android.content.Context;
import kotlin.jvm.internal.a;
import z6b.a;
import android.widget.TextView;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public final class AbsVideoFragmentV3ViewBinder$a extends VideoSDKPlayerView$e	// class@000d5e
{
    public final AbsVideoFragmentV3ViewBinder a;

    public void AbsVideoFragmentV3ViewBinder$a(AbsVideoFragmentV3ViewBinder p0){
       this.a = p0;
       super();
    }
    public void onEnd(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsVideoFragmentV3ViewBinder$a.class, "1")) {
          return;
       }
       int i = 0x7f0a2a96;
       if (this.a.I().findViewById(i) != null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AbsVideoFragmentV3ViewB", "onEnd: startFlash", objArray);
       Context context = this.a.I().getContext();
       a.o(context, "nextStepButton.context");
       a uoa = d.a(-1595266550).Z50(context);
       if (uoa != null) {
          TextView view = uoa.getView();
          a.o(view, "it.view");
          view.setId(i);
          TextView view1 = uoa.getView();
          a.o(view1, "it.view");
          view1.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
          this.a.I().addView(uoa.getView(), 0);
          this.a.G = uoa;
          uoa.b();
       }
       return;
    }
}
