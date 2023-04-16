package com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaViewController$onCreate$viewModel$2;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaViewController$onCreate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import mn1.d;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaViewController$onCreate$$inlined$viewModels$2;
import msd.a;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaDataBinding;
import android.view.View;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import qrd.p;
import mn1.a;
import androidx.lifecycle.Observer;
import mn1.b;
import android.text.TextPaint;
import android.widget.TextView;

public final class LiveHotSpotDetailNormalMediaAreaViewController extends ViewController	// class@0013de
{
    public final LiveData j;
    public final k k;

    public void LiveHotSpotDetailNormalMediaAreaViewController(LiveData p0,k p1){
       a.p(p0, "dataProvider");
       a.p(p1, "detailMainVCDelegate");
       super();
       this.j = p0;
       this.k = p1;
    }
    public void F2(){
       LiveHotSpotDetailNormalMediaAreaDataBinding a;
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailNormalMediaAreaViewController.class, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0c20);
       LiveHotSpotDetailNormalMediaAreaDataBinding liveHotSpotD = new LiveHotSpotDetailNormalMediaAreaDataBinding(this.P2(), this, this.B2(), this.k);
       d value = new ViewModelLazy(m0.d(d.class), new LiveHotSpotDetailNormalMediaAreaViewController$onCreate$$inlined$viewModels$2(new LiveHotSpotDetailNormalMediaAreaViewController$onCreate$$inlined$viewModels$1(this)), new LiveHotSpotDetailNormalMediaAreaViewController$onCreate$viewModel$2(this)).getValue();
       if (!PatchProxy.applyVoidOneRefs(value, liveHotSpotD, LiveHotSpotDetailNormalMediaAreaDataBinding.class, "2")) {
          a.p(value, "viewModel");
          value.b.observe(liveHotSpotD.g, new a(liveHotSpotD));
          value.c.observe(liveHotSpotD.g, new b(liveHotSpotD));
          a = liveHotSpotD.a;
          a.o(a, "titleView");
          TextPaint paint = a.getPaint();
          a.o(paint, "titleView.paint");
          paint.setFakeBoldText(true);
          liveHotSpotD.d = value;
       }
       return;
    }
}
