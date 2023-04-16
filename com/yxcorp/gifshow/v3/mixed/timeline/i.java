package com.yxcorp.gifshow.v3.mixed.timeline.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.mixed.MixImporterFragment;
import java.text.DecimalFormat;
import java.lang.String;
import com.yxcorp.gifshow.v3.mixed.timeline.i$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.mixed.model.b;
import com.kuaishou.edit.TimeLineGenerator;
import gwc.j;
import p16.c;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTimeline;
import xl8.d;
import y8c.a;
import brd.t;
import lnc.b9;
import gwc.b;
import com.yxcorp.gifshow.v3.mixed.timeline.b;
import erd.g;
import crd.b;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.v3.mixed.timeline.MixVideoView;
import java.util.Objects;
import com.yxcorp.gifshow.v3.mixed.model.MixVideoTrack;
import gwc.a;
import gwc.u;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import gwc.f;
import android.view.View;
import java.lang.Runnable;
import hwc.b;
import gwc.g;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import gwc.d;
import com.yxcorp.gifshow.v3.mixed.timeline.d;
import gwc.m;
import com.yxcorp.gifshow.v3.mixed.timeline.e;
import gwc.n;
import com.yxcorp.gifshow.v3.mixed.timeline.f;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import gwc.l;
import com.yxcorp.gifshow.v3.mixed.timeline.g;
import com.yxcorp.gifshow.v3.mixed.timeline.h;
import gwc.i;
import com.yxcorp.gifshow.widget.CustomHorizontalScroller$b;
import com.yxcorp.gifshow.widget.CustomHorizontalScroller;
import android.app.Activity;
import android.content.Intent;
import ekd.j0;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$b;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import gwc.h;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.feature.post.api.feature.mix.model.IMixImportTimeLineTextFormatter;
import gwc.k;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.content.Context;
import java.lang.Integer;
import android.view.ViewGroup;
import i2b.a;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTranslationIndicators;
import android.widget.RelativeLayout;
import android.widget.ImageView;
import com.yxcorp.gifshow.v3.mixed.timeline.c;
import android.view.View$OnLayoutChangeListener;
import java.lang.Double;
import java.lang.Math;
import java.lang.Number;
import n16.a;
import hwc.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTimePositionLookups;
import android.widget.HorizontalScrollView;
import ekd.m1;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTimelineScroller;
import com.yxcorp.gifshow.v3.mixed.timeline.MixContentView;
import com.yxcorp.gifshow.v3.mixed.timeline.MixDragHandle;

public class i extends PresenterV2	// class@00156d
{
    public MixContentView A;
    public List B;
    public double C;
    public double D;
    public double E;
    public final MixImporterFragment F;
    public b G;
    public TimeLineGenerator H;
    public MixTimePositionLookups I;
    public boolean J;
    public IMixImportTimeLineTextFormatter K;
    public final DecimalFormat L;
    public CustomHorizontalScroller$b M;
    public MixTimeline p;
    public MixTimelineScroller q;
    public VideoSDKPlayerView r;
    public View s;
    public TextView t;
    public TextView u;
    public View v;
    public TextView w;
    public TextView x;
    public MixTranslationIndicators y;
    public MixDragHandle z;

    public void i(MixImporterFragment p0){
       super();
       this.C = 57.50f;
       this.D = 57.00f;
       this.E = 0;
       this.L = new DecimalFormat("0.0");
       this.M = new i$a(this);
       this.F = p0;
    }
    public void E8(){
       boolean b;
       i tx;
       double d;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "3")) {
          return;
       }
       b uob = this.F.dh();
       this.G = uob;
       this.I = uob.n;
       TimeLineGenerator timeLineGene = uob.t0();
       this.H = timeLineGene;
       timeLineGene.o();
       this.H.l(new j(this));
       if (!PatchProxy.applyVoid(objArray, this, oi, "6")) {
          oi = this.p;
          oi.b = this.G;
          tx = this.F;
          if (!PatchProxy.applyVoidOneRefs(tx, oi, MixTimeline.class, "2")) {
             b9.d(oi.b.e, tx).subscribe(new b(oi), b.b);
             Iterator iterator = oi.i.iterator();
             while (iterator.hasNext()) {
                MixVideoView mixVideoView = iterator.next();
                Objects.requireNonNull(mixVideoView);
                if (PatchProxy.applyVoid(objArray, mixVideoView, MixVideoView.class, "2")) {
                   continue ;
                }
                MixTimeline b1 = mixVideoView.e.b;
                mixVideoView.c = b1;
                mixVideoView.f = b1.a.get(mixVideoView.i);
                mixVideoView.g = new a(mixVideoView, mixVideoView.c.t0());
                mixVideoView.setOnClickListener(new u(mixVideoView));
             }
             oi.requestLayout();
          }
          b.a(this.p, new f(this));
       }
       this.G.h.observe(this.F, new g(this));
       this.X7(b9.d(this.G.d, this.F).subscribe(new d(this), d.b));
       this.X7(b9.d(this.I, this.F).subscribe(new m(this), e.b));
       this.X7(b9.d(this.G.e, this.F).subscribe(new n(this), f.b));
       this.X7(this.F.m().compose(c.c(this.F.m(), FragmentEvent.DESTROY)).subscribe(new l(this), g.b));
       this.G.o.observe(this.F, new h(this));
       this.G.l.observe(this.F, new i(this));
       this.q.setOnScrollListener(this.M);
       this.G.C0();
       b = false;
       long l = (this.getActivity() != null && j0.a(this.getActivity().getIntent(), "use_long_video_limit", b))? 1: 0;
       tx = this.x;
       d = (l)? (double)((float)LongVideoLocalProject.e(b) / 1000.00f): this.D;
       tx.setText(a1.r(R.string.arg_RES_7f100d95, this.P8(d)));
       this.r.setCustomThumbnailStatsProvider(this.H);
       this.G.j.observe(this.F, new h(this));
       return;
    }
    public void F8(){
       int i;
       MixVideoView mixVideoView;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "2")) {
          return;
       }
       boolean b = false;
       boolean b1 = (this.getActivity() != null && j0.a(this.getActivity().getIntent(), "use_long_video_limit", b))? true: false;
       this.J = b1;
       i tp = this.p;
       tp.c = this.q;
       tp.d = this.z;
       tp.g = this.s;
       tp.h = this.v;
       tp.f = this.y;
       if (this.getActivity() != null) {
          String str = "MIX_IMPORT_CLIP_DURATION";
          double d = 57.50f;
          double doubleExtra = this.getActivity().getIntent().getDoubleExtra(str, d);
          this.C = doubleExtra;
          double d1 = 0;
          if (!doubleExtra - d1) {
             this.C = d;
          }
          d = 57.00f;
          doubleExtra = this.getActivity().getIntent().getDoubleExtra(str, d);
          this.D = doubleExtra;
          if (!doubleExtra - d1) {
             this.D = d;
          }
          this.E = this.getActivity().getIntent().getDoubleExtra("MIX_IMPORT_TOO_LONG_TIP_SHOW_DURATION", d1);
          IMixImportTimeLineTextFormatter serializable = SerializableHook.getSerializableExtra(this.getActivity().getIntent(), "MIX_IMPORT_FORMATTER");
          this.K = serializable;
          if (serializable == null) {
             this.K = new k(this);
          }
       }
       this.p.setMaxTotalDuration(this.R8());
       tp = this.p;
       Intent intent = this.getActivity().getIntent();
       Objects.requireNonNull(tp);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MixTimeline mixTimeline = PatchProxy.applyTwoRefs(intent, this, tp, MixTimeline.class, "1");
       if (mixTimeline != patchProxyRe) {
       }else {
          tp.o = this;
          Serializable serializable1 = j0.e(intent, "intent_editor_mix_media_list");
          if (serializable1 == null) {
             PostUtils.D("MixTimeline", "create\(\)", new IllegalArgumentException("INTENT_EDITOR_FROM_PAGE is empty from="+j0.b(intent, "intent_editor_mix_from_page", b)));
             mixTimeline = tp.i;
          }else {
             for (int i1 = 0; i1 < serializable1.size(); i1 = i1 + 1) {
                Context context = tp.getContext();
                if (PatchProxy.isSupport(MixVideoView.class)) {
                   mixVideoView = PatchProxy.applyThreeRefs(context, tp, Integer.valueOf(i1), null, MixVideoView.class, "1");
                   if (mixVideoView != patchProxyRe) {
                   label_0136 :
                      mixVideoView.setMaxTotalDuration(tp.n);
                      tp.addView(mixVideoView);
                      tp.i.add(mixVideoView);
                   }
                }
                mixVideoView = a.c(context, R.layout.arg_RES_7f0d0fd9, objArray);
                mixVideoView.e = tp;
                mixVideoView.d = tp.c;
                mixVideoView.i = i1;
                goto label_0136 ;
             }
             mixTimeline = tp.i;
          }
       }
       this.B = mixTimeline;
       tp = this.y;
       i = mixTimeline.size();
       Objects.requireNonNull(tp);
       if (!PatchProxy.isSupport(MixTranslationIndicators.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tp, MixTranslationIndicators.class, "4")) {
          tp.removeAllViews();
          tp.d = i - 1;
          for (; b < tp.d; b = b + 1) {
             tp.addView(new ImageView(tp.getContext()));
          }
       }
       this.p.addOnLayoutChangeListener(new c(this));
       return;
    }
    public void H8(){
       PatchProxy.applyVoid(null, this, i.class, "5");
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       this.H.i();
       return;
    }
    public final String P8(double p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, oi, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return String.valueOf(Math.round(p0));
    }
    public final double R8(){
       Object obj = PatchProxy.apply(null, this, i.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double d = (this.J != null)? (double)((float)LongVideoLocalProject.e(true) / 1000.00f): this.C;
       return d;
    }
    public void S8(){
       double d;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "20")) {
          return;
       }
       i tu = this.u;
       StringBuilder str = "";
       i tL = this.L;
       i tG = this.G;
       Objects.requireNonNull(tG);
       MixVideoTrack obj = PatchProxy.apply(objArray, tG, b.class, "38");
       if (obj != PatchProxyResult.class) {
          d = obj.doubleValue();
       }else if(tG.y0()){
          d = 0;
       }else {
          obj = tG.s0();
          Objects.requireNonNull(obj);
          d = obj.getDurationWithSpeed();
       }
       tu.setText(str+tL.format(d)+a.d);
       this.p.c();
       this.W8();
       return;
    }
    public final void V8(double p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, oi, "18")) {
          return;
       }
       boolean b = false;
       double d = (this.J != null)? (double)((float)LongVideoLocalProject.e(b) / 1000.00f): this.D;
       Object[] objArray = new Object[]{" "+this.K.formatTime(Math.min(d, p0))};
       this.t.setText(String.format(a1.p(R.string.arg_RES_7f103656), objArray));
       p0 = p0 - this.R8();
       if (p0 - null > 0) {
          this.t.setActivated(1);
          this.w.setVisibility(b);
          this.w.setText(a1.r(R.string.arg_RES_7f103b4b, this.K.formatTime(p0)));
       }else {
          this.t.setActivated(b);
          this.w.setVisibility(8);
       }
       this.S8();
       this.y.b(this.B);
       return;
    }
    public final void W8(){
       int i;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "22")) {
          return;
       }
       if (this.G.u0() - (this.R8() + this.E) < 0) {
          this.x.setVisibility(8);
          return;
       }else {
          i = 0;
          this.x.setVisibility(i);
          i tx = this.x;
          Iterator obj = PatchProxy.apply(objArray, this, oi, "23");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             obj = this.p.i.iterator();
             while (obj.hasNext()) {
                MixVideoView mixVideoView = obj.next();
                int tooLongDurat = mixVideoView.getTooLongDurationLeft();
                if (tooLongDurat > 0) {
                   i = ((mixVideoView.getLeft() + tooLongDurat) + a.h) - this.p.k;
                   break ;
                }
             }
          }
          tx.setTranslationX((float)((i + a1.e(2.30f)) + this.p.k));
          return;
       }
    }
    public final void X8(double p0,boolean p1){
       int i;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Double.valueOf(p0), Boolean.valueOf(p1), this, oi, "9")) {
          return;
       }
       i = (int)((this.I.timeToX(p0) - this.p.j) + (double)a.l);
       int i1 = ((i - this.q.getScrollX()) > a.m)? 1: 0;
       if (p1) {
          this.q.smoothScrollTo(i, 0);
       }else if(i1 && p0){
          this.q.smoothScrollTo(i, 0);
       }else {
          this.q.scrollTo(i, 0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a30f6);
       this.u = m1.f(p0, 0x7f0a0a26);
       this.s = m1.f(p0, 0x7f0a2bc3);
       this.x = m1.f(p0, 0x7f0a0c59);
       this.y = m1.f(p0, 0x7f0a4054);
       this.q = m1.f(p0, 0x7f0a3754);
       this.p = m1.f(p0, 0x7f0a3ef5);
       this.w = m1.f(p0, 0x7f0a0775);
       this.t = m1.f(p0, 0x7f0a402a);
       this.A = m1.f(p0, 0x7f0a3ef7);
       this.v = m1.f(p0, 0x7f0a0a25);
       this.z = m1.f(p0, 0x7f0a0c3c);
       return;
    }
}
