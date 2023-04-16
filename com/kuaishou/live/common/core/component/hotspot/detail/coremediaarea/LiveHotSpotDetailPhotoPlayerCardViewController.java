package com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailPhotoPlayerCardViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import brd.t;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailPhotoPlayerCardViewController$viewModel$2;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailPhotoPlayerCardViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import hn1.e0;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailPhotoPlayerCardViewController$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import com.kwai.robust.PatchProxy;
import hn1.p;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import android.view.View;
import android.widget.TextView;
import xh3.g;
import k06.a;
import lnc.a1;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import xh3.l;
import android.widget.ImageView;
import xh3.m;
import hn1.q;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import hn1.r;
import hn1.s;
import hn1.t;
import hn1.u;
import android.view.View$OnClickListener;
import hn1.v;
import in1.f;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class LiveHotSpotDetailPhotoPlayerCardViewController extends ViewController	// class@001397
{
    public final p j;
    public KwaiPlayerKitView k;
    public f l;
    public final LiveData m;
    public final t n;
    public final PublishSubject o;
    public final PublishSubject p;

    public void LiveHotSpotDetailPhotoPlayerCardViewController(LiveData p0,t p1,PublishSubject p2,PublishSubject p3){
       a.p(p0, "photoViewData");
       a.p(p1, "playInfoObservable");
       a.p(p2, "videoEventSubject");
       a.p(p3, "cardEventSubject");
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.p = p3;
       this.j = new ViewModelLazy(m0.d(e0.class), new LiveHotSpotDetailPhotoPlayerCardViewController$$special$$inlined$viewModels$2(new LiveHotSpotDetailPhotoPlayerCardViewController$$special$$inlined$viewModels$1(this)), new LiveHotSpotDetailPhotoPlayerCardViewController$viewModel$2(this));
    }
    public static final KwaiPlayerKitView V2(LiveHotSpotDetailPhotoPlayerCardViewController p0){
       p0 = p0.k;
       if (p0 == null) {
          a.S("playerKitView");
       }
       return p0;
    }
    public void F2(){
       e0 g;
       LiveHotSpotDetailPhotoPlayerCardViewController liveHotSpotD = LiveHotSpotDetailPhotoPlayerCardViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveHotSpotD, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0c2b);
       if (!PatchProxy.applyVoid(objArray, this, liveHotSpotD, "4")) {
          this.m.observe(this, new p(this));
          g.a(this.A2(R.id.live_hotspot_people_num), this, this.W2().c);
          g.a(this.A2(R.id.live_hotspot_photo_time), this, this.W2().h);
          TextView textView = this.A2(R.id.left_top_label);
          a uoa = new a();
          uoa.f((float)a1.d(R.dimen.arg_RES_7f07031b));
          textView.setBackground(uoa.h(this.D2(), R.color.arg_RES_7f0619a0).a());
          g.a(textView, this, this.W2().e);
          l.d(textView, this, this.W2().f, true);
          ImageView imageView = this.A2(R.id.live_hotspot_video_play);
          g = this.W2().g;
          if (!PatchProxy.applyVoidThreeRefs(imageView, this, g, null, l.class, "9")) {
             a.p(imageView, "$this$bindSelected");
             a.p(this, "lifecycleOwner");
             a.p(g, "liveData");
             g.observe(this, new m(imageView));
          }
          KwaiPlayerKitView kwaiPlayerKi = this.A2(R.id.player_kit_view);
          this.k = kwaiPlayerKi;
          if (kwaiPlayerKi == null) {
             a.S("playerKitView");
          }
          kwaiPlayerKi.c();
          this.W2().d.observe(this, new q(this));
          this.W2().u0().observeForever(new r(this));
          this.W2().j.observe(this, new s(this));
          this.W2().k.observe(this, new t(this));
          imageView.setOnClickListener(new u(this));
          this.P2().setOnClickListener(new v(this));
       }
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveHotSpotDetailPhotoPlayerCardViewController.class, "3")) {
          return;
       }
       LiveHotSpotDetailPhotoPlayerCardViewController tl = this.l;
       if (tl != null) {
          tl.a();
       }
       this.l = objArray;
       tl = this.k;
       if (tl == null) {
          a.S("playerKitView");
       }
       tl.release();
       return;
    }
    public final e0 W2(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailPhotoPlayerCardViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
