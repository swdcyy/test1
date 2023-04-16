package com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailLivePlayerCardViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import brd.t;
import io.reactivex.subjects.PublishSubject;
import brd.y;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailLivePlayerCardViewController$viewModel$2;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailLivePlayerCardViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import hn1.c0;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailLivePlayerCardViewController$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.robust.PatchProxy;
import hn1.h;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import xh3.l;
import hn1.i;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import hn1.j;
import android.widget.TextView;
import xh3.g;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import hn1.k;
import hn1.l;
import hn1.m;
import android.view.View$OnClickListener;
import in1.c;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class LiveHotSpotDetailLivePlayerCardViewController extends ViewController	// class@001390
{
    public final p j;
    public c k;
    public final LiveData l;
    public final t m;
    public final PublishSubject n;
    public final y o;

    public void LiveHotSpotDetailLivePlayerCardViewController(LiveData p0,t p1,PublishSubject p2,y p3){
       a.p(p0, "liveViewData");
       a.p(p1, "playInfoObservable");
       a.p(p2, "videoEventSubject");
       a.p(p3, "cardEventSubject");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.o = p3;
       this.j = new ViewModelLazy(m0.d(c0.class), new LiveHotSpotDetailLivePlayerCardViewController$$special$$inlined$viewModels$2(new LiveHotSpotDetailLivePlayerCardViewController$$special$$inlined$viewModels$1(this)), new LiveHotSpotDetailLivePlayerCardViewController$viewModel$2(this));
    }
    public void F2(){
       LiveHotSpotDetailLivePlayerCardViewController liveHotSpotD = LiveHotSpotDetailLivePlayerCardViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveHotSpotD, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0c2a);
       if (!PatchProxy.applyVoid(objArray, this, liveHotSpotD, "4")) {
          this.l.observe(this, new h(this));
          KwaiImageView kwaiImageVie = this.A2(R.id.player_cover);
          l.d(kwaiImageVie, this, this.V2().b, true);
          this.V2().c.observe(this, new i(kwaiImageVie));
          this.V2().d.observe(this, new j(this.A2(R.id.live_cover_icon)));
          g.a(this.A2(R.id.live_hotspot_people_num), this, this.V2().e);
          this.V2().u0().observeForever(new k(this, this.A2(R.id.live_surface)));
          this.V2().f.observe(this, new l(this));
          this.P2().setOnClickListener(new m(this));
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailLivePlayerCardViewController.class, "3")) {
          return;
       }
       LiveHotSpotDetailLivePlayerCardViewController tk = this.k;
       if (tk != null) {
          tk.a();
       }
       this.k = null;
       return;
    }
    public final c0 V2(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailLivePlayerCardViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
