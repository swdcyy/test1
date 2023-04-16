package com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainViewController$onCreate$viewModel$2;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainViewController$onCreate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import jn1.e;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainViewController$onCreate$$inlined$viewModels$2;
import msd.a;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainDataBinding;
import android.view.View;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import qrd.p;
import jn1.a;
import androidx.lifecycle.Observer;
import android.text.TextPaint;
import android.widget.TextView;
import jn1.b;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import jn1.c;
import jn1.d;
import jn1.e$f$b;
import jn1.e$f;

public final class LiveHotSpotDetailExplainViewController extends ViewController	// class@0013a9
{
    public final LiveData j;
    public final k k;

    public void LiveHotSpotDetailExplainViewController(LiveData p0,k p1){
       a.p(p0, "dataProvider");
       a.p(p1, "detailMainVCDelegate");
       super();
       this.j = p0;
       this.k = p1;
    }
    public void F2(){
       LiveHotSpotDetailExplainDataBinding a;
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailExplainViewController.class, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0c19);
       LiveHotSpotDetailExplainDataBinding liveHotSpotD = new LiveHotSpotDetailExplainDataBinding(this.P2(), this, this.B2(), this.k);
       e value = new ViewModelLazy(m0.d(e.class), new LiveHotSpotDetailExplainViewController$onCreate$$inlined$viewModels$2(new LiveHotSpotDetailExplainViewController$onCreate$$inlined$viewModels$1(this)), new LiveHotSpotDetailExplainViewController$onCreate$viewModel$2(this)).getValue();
       if (!PatchProxy.applyVoidOneRefs(value, liveHotSpotD, LiveHotSpotDetailExplainDataBinding.class, "2")) {
          a.p(value, "viewModel");
          liveHotSpotD.d = value;
          value.b.observe(liveHotSpotD.h, new a(liveHotSpotD));
          a = liveHotSpotD.a;
          a.o(a, "titleView");
          TextPaint paint = a.getPaint();
          a.o(paint, "titleView.paint");
          paint.setFakeBoldText(true);
          value.getText().observe(liveHotSpotD.h, new b(liveHotSpotD));
          LiveDataOperators.c(value.getText(), value.e).observe(liveHotSpotD.h, new c(liveHotSpotD));
          value.d.observe(liveHotSpotD.h, new d(liveHotSpotD));
          value.u0(e$f$b.a);
       }
       return;
    }
}
