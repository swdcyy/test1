package com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager;
import gw2.a;
import vw2.a;
import jv1.b;
import oq5.b;
import x61.c;
import gq5.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import pw2.g;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController$$special$$inlined$viewModels$2;
import msd.a;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController$b;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController$a;
import com.kwai.robust.PatchProxy;
import op2.e;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import android.view.View;
import android.widget.ProgressBar;
import androidx.lifecycle.LiveData;
import brd.t;
import t45.d;
import brd.z;
import io.reactivex.BackpressureStrategy;
import yu2.c;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController$bindViews$1;
import msd.q;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import androidx.lifecycle.LifecycleOwner;
import xh3.l;
import pw2.a;
import androidx.lifecycle.Observer;
import op2.f;
import vw2.c;
import com.kuaishou.live.core.voiceparty.theater.player.quality.QualitySelectDialog;
import android.app.Activity;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController$setupBottomBarItem$qualitySelectLauncher$1;
import msd.l;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController$setupBottomBarItem$1;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController$setupBottomBarItem$2;
import u63.a;
import cx2.b;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController$setupBottomBarItem$$inlined$let$lambda$1;
import com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterFullScreenPlayControlsViewController$setupBottomBarItem$3;
import op2.j;
import oq5.c;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import d61.y;

public final class TheaterFullScreenPlayControlsViewController extends ViewController	// class@001997
{
    public final p j;
    public final TheaterFullScreenPlayControlsViewController$b k;
    public final c l;
    public final AudienceTheaterManager m;
    public final a n;
    public final a o;
    public final b p;
    public final b q;
    public final c r;
    public final f s;

    public void TheaterFullScreenPlayControlsViewController(AudienceTheaterManager p0,a p1,a p2,b p3,b p4,c p5,f p6){
       a.p(p0, "theaterManager");
       a.p(p1, "clearScreenManager");
       a.p(p2, "qualitySwitchDelegate");
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.p = p3;
       this.q = p4;
       this.r = p5;
       this.s = p6;
       this.j = new ViewModelLazy(m0.d(g.class), new TheaterFullScreenPlayControlsViewController$$special$$inlined$viewModels$2(new TheaterFullScreenPlayControlsViewController$$special$$inlined$viewModels$1(this)), new TheaterFullScreenPlayControlsViewController$viewModel$2(this));
       this.k = new TheaterFullScreenPlayControlsViewController$b(this);
       this.l = new TheaterFullScreenPlayControlsViewController$a(this);
    }
    public void F2(){
       TheaterFullScreenPlayControlsViewController theaterFullS = TheaterFullScreenPlayControlsViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, theaterFullS, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d16e1);
       if (this.m.e().b() == TheaterDisplayMode.FULL_SCREEN_LANDSCAPE) {
          this.n.a();
       }
       TheaterFullScreenPlayControlsViewController theaterFullS1 = 1;
       if (!PatchProxy.applyVoid(objArray, this, theaterFullS, "4")) {
          ProgressBar progressBar = this.A2(R.id.voice_party_theater_audience_seek_bar);
          t ot = this.n.b().observeOn(d.a);
          a.o(ot, "clearScreenManager.clear¡­veOn\(KwaiSchedulers.MAIN\)");
          l.e(progressBar, this, LiveDataOperators.a(this.V2().u0(), this.V2().w0(), c.a(ot, objArray, theaterFullS1, objArray), TheaterFullScreenPlayControlsViewController$bindViews$1.INSTANCE), false, 4, null);
          this.V2().v0().observe(this, super(progressBar));
       }
       if (!PatchProxy.applyVoid(objArray, this, theaterFullS, "5")) {
          f uof = this.m.e().a();
          if (uof != null && uof.h() == theaterFullS1) {
             c uoc = new c(this.r);
             uoc.c = new TheaterFullScreenPlayControlsViewController$setupBottomBarItem$1(this, new QualitySelectDialog(this, this.B2(), this.o, new TheaterFullScreenPlayControlsViewController$setupBottomBarItem$qualitySelectLauncher$1(uoc)));
             a.a(this, new TheaterFullScreenPlayControlsViewController$setupBottomBarItem$2(uoc));
          }else {
             theaterFullS = this.r;
             if (theaterFullS != null) {
                objArray = new b(theaterFullS, new TheaterFullScreenPlayControlsViewController$setupBottomBarItem$$inlined$let$lambda$1(this));
             }
             a.a(this, new TheaterFullScreenPlayControlsViewController$setupBottomBarItem$3(objArray));
          }
       }
       this.m.a(this.k);
       theaterFullS = this.p;
       if (theaterFullS != null) {
          theaterFullS.W0(this.l, false);
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, TheaterFullScreenPlayControlsViewController.class, "3")) {
          return;
       }
       this.m.o(this.k);
       TheaterFullScreenPlayControlsViewController tp = this.p;
       if (tp != null) {
          tp.Q0(this.l);
       }
       return;
    }
    public final g V2(){
       Object obj = PatchProxy.apply(null, this, TheaterFullScreenPlayControlsViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public final void W2(){
       if (PatchProxy.applyVoid(null, this, TheaterFullScreenPlayControlsViewController.class, "6")) {
          return;
       }
       if (y.d(this.B2())) {
          TheaterFullScreenPlayControlsViewController tq = this.q;
          if (tq != null) {
             tq.d();
          }
       }else {
          this.m.s(TheaterDisplayMode.HALF_SCREEN);
       }
       return;
    }
}
