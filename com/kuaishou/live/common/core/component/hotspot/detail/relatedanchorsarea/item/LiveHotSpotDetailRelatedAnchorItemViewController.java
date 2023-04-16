package com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import un1.k;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewController$viewModel$2;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewController$$special$$inlined$viewModels$2;
import com.kwai.robust.PatchProxy;
import pn1.l;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.animation.ValueAnimator;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.wave.WaveView;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.wave.WaveView$Wave;
import pn1.j;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import ub.a;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import pn1.a;
import androidx.lifecycle.Observer;
import pn1.b;
import pn1.c;
import pn1.d;
import pn1.e;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import pn1.f;
import android.widget.TextView;
import pn1.g;
import pn1.h;
import pn1.i;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailRelatedAnchorData$AuthorInfo;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$g$d;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$g;
import qrd.p;

public final class LiveHotSpotDetailRelatedAnchorItemViewController extends ViewController	// class@0013fc
{
    public l j;
    public final p k;
    public final LiveData l;
    public final k m;
    public final a n;

    public void LiveHotSpotDetailRelatedAnchorItemViewController(LiveData p0,k p1,a p2){
       a.p(p0, "dataProvider");
       a.p(p1, "detailMainVCDelegate");
       a.p(p2, "positionProvider");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.k = new ViewModelLazy(m0.d(LiveHotSpotDetailRelatedAnchorItemViewModel.class), new LiveHotSpotDetailRelatedAnchorItemViewController$$special$$inlined$viewModels$2(new LiveHotSpotDetailRelatedAnchorItemViewController$$special$$inlined$viewModels$1(this)), new LiveHotSpotDetailRelatedAnchorItemViewController$viewModel$2(this));
    }
    public void F2(){
       l a;
       Object[] objArray = null;
       String str = "4";
       if (PatchProxy.applyVoid(objArray, this, LiveHotSpotDetailRelatedAnchorItemViewController.class, str)) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0c21);
       l ol = new l(this.P2(), this);
       this.j = ol;
       LiveHotSpotDetailRelatedAnchorItemViewModel liveHotSpotD = this.V2();
       Objects.requireNonNull(ol);
       l ol1 = l.class;
       if (!PatchProxy.applyVoidOneRefs(liveHotSpotD, ol, ol1, "1")) {
          a.p(liveHotSpotD, "viewModel");
          ValueAnimator valueAnimato = PatchProxy.apply(objArray, ol, ol1, str);
          if (valueAnimato != PatchProxyResult.class) {
          }else {
             valueAnimato = new ValueAnimator();
             valueAnimato.setRepeatCount(-1);
             a = ol.a;
             boolean b = false;
             Objects.requireNonNull(a);
             if (!PatchProxy.isSupport(WaveView.class) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, a, WaveView.class, "2")) {
                a.k.b = b;
             }
             valueAnimato.setFloatValues(new float[3]{0x3f666666,0x3f800000,0x3f666666});
             valueAnimato.setDuration(1160);
             valueAnimato.addUpdateListener(new j(ol, valueAnimato));
          }
          ol.h = valueAnimato;
          KwaiCDNImageView.q0(ol.d, R.string.arg_RES_7f1025b2, 0, null, 6, null);
          LiveDataOperators.f(liveHotSpotD.c, liveHotSpotD.a).observe(ol.j, new a(ol));
          liveHotSpotD.f.observe(ol.j, new b(ol));
          liveHotSpotD.b.observe(ol.j, new c(ol));
          LiveDataOperators.c(liveHotSpotD.w0(), liveHotSpotD.x0()).observe(ol.j, new d(ol));
          ol.b.setOnClickListener(new e(liveHotSpotD));
          ol.c.setOnClickListener(new f(liveHotSpotD));
          ol.d.setOnClickListener(new g(liveHotSpotD));
          ol.f.setOnClickListener(new h(liveHotSpotD));
          ol.g.setOnClickListener(new i(liveHotSpotD));
       }
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveHotSpotDetailRelatedAnchorItemViewController.class, "6")) {
          return;
       }
       LiveHotSpotDetailRelatedAnchorItemViewController tj = this.j;
       if (tj == null) {
          a.S("dataBinding");
       }
       Objects.requireNonNull(tj);
       if (!PatchProxy.applyVoid(objArray, tj, l.class, "6")) {
          tj.a();
       }
       return;
    }
    public void M2(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailRelatedAnchorItemViewController.class, "5")) {
          return;
       }
       LiveHotSpotDetailRelatedAnchorData$AuthorInfo value = this.l.getValue();
       if (value != null && value.hasReporterLogger == null) {
          this.l.getValue();
          this.V2().v0(LiveHotSpotDetailRelatedAnchorItemViewModel$g$d.a);
       }
       return;
    }
    public final LiveHotSpotDetailRelatedAnchorItemViewModel V2(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailRelatedAnchorItemViewController.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
}
