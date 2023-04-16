package com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager;
import gw2.a;
import vw2.a;
import jv1.b;
import oq5.b;
import ft5.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import pw2.g;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController$$special$$inlined$viewModels$2;
import msd.a;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController$a;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController$b;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController$bindViews$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import androidx.lifecycle.LifecycleOwner;
import xh3.l;
import pw2.b;
import androidx.lifecycle.Observer;
import pw2.c;
import pw2.d;
import android.view.View$OnClickListener;
import brd.t;
import t45.d;
import brd.z;
import brd.x;
import com.kuaishou.live.core.voiceparty.theater.util.AutoDisposeKt;
import pw2.e;
import erd.g;
import crd.b;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectPanel;
import java.util.Objects;
import android.view.ViewGroup;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController$setupQualitySelectLogic$qualitySelectPanel$1;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController$setupQualitySelectLogic$qualitySelectPanel$2;
import msd.l;
import pw2.f;
import ft5.d;
import oq5.c;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class TheaterHalfScreenPlayControlsViewController extends ViewController	// class@0019a2
{
    public final p j;
    public final c k;
    public final TheaterHalfScreenPlayControlsViewController$b l;
    public final boolean m;
    public final AudienceTheaterManager n;
    public final a o;
    public final a p;
    public final b q;
    public final b r;
    public final b s;

    public void TheaterHalfScreenPlayControlsViewController(boolean p0,AudienceTheaterManager p1,a p2,a p3,b p4,b p5,b p6){
       a.p(p1, "theaterManager");
       a.p(p2, "clearScreenManager");
       a.p(p3, "qualitySwitchDelegate");
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.p = p3;
       this.q = p4;
       this.r = p5;
       this.s = p6;
       this.j = new ViewModelLazy(m0.d(g.class), new TheaterHalfScreenPlayControlsViewController$$special$$inlined$viewModels$2(new TheaterHalfScreenPlayControlsViewController$$special$$inlined$viewModels$1(this)), new TheaterHalfScreenPlayControlsViewController$viewModel$2(this));
       this.k = new TheaterHalfScreenPlayControlsViewController$a(this);
       this.l = new TheaterHalfScreenPlayControlsViewController$b(this);
    }
    public void F2(){
       TheaterHalfScreenPlayControlsViewController theaterHalfS = TheaterHalfScreenPlayControlsViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, theaterHalfS, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d16e3);
       this.o.a();
       if (!PatchProxy.applyVoid(objArray, this, theaterHalfS, "4")) {
          View view2 = this.A2(R.id.progress_container);
          View view3 = this.A2(0x7f0a450f);
          l.e(view2, this, LiveDataOperators.b(this.V2().u0(), this.V2().w0(), TheaterHalfScreenPlayControlsViewController$bindViews$1.INSTANCE), false, 4, null);
          LiveDataOperators.c(this.V2().u0(), this.V2().w0()).observe(this, new b(this, view2));
          this.V2().v0().observe(this, new c(this.A2(R.id.voice_party_theater_audience_seek_bar), view3));
          this.A2(R.id.voice_party_theater_audience_switch_full_screen_button).setOnClickListener(new d(this));
          this.o.b().observeOn(d.a).compose(AutoDisposeKt.a(this)).subscribe(new e(this, this.A2(R.id.voice_party_theater_audience_controllers_container), view3));
       }
       if (!PatchProxy.applyVoid(objArray, this, theaterHalfS, "6")) {
          TextView textView = this.A2(R.id.voice_party_theater_audience_switch_quality_button);
          View view = this.P2();
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
          View view1 = view;
          QualitySelectPanel qualitySelec = new QualitySelectPanel(this, view1, this.p, new TheaterHalfScreenPlayControlsViewController$setupQualitySelectLogic$qualitySelectPanel$1(textView), new TheaterHalfScreenPlayControlsViewController$setupQualitySelectLogic$qualitySelectPanel$2(this));
          textView.setOnClickListener(new f(v7));
       }
       theaterHalfS = this.s;
       if (theaterHalfS != null) {
          theaterHalfS.Le(this.l);
       }
       theaterHalfS = this.q;
       if (theaterHalfS != null) {
          theaterHalfS.W0(this.k, false);
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, TheaterHalfScreenPlayControlsViewController.class, "3")) {
          return;
       }
       this.P2().cancelPendingInputEvents();
       TheaterHalfScreenPlayControlsViewController ts = this.s;
       if (ts != null) {
          ts.Yj(this.l);
       }
       ts = this.q;
       if (ts != null) {
          ts.Q0(this.k);
       }
       return;
    }
    public final g V2(){
       Object obj = PatchProxy.apply(null, this, TheaterHalfScreenPlayControlsViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
