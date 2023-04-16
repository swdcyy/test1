package com.kuaishou.live.lite.background.b;
import com.kuaishou.live.viewcontroller.ViewController;
import sj3.l;
import ga1.e;
import a93.h;
import com.kuaishou.live.lite.background.b$a;
import com.kuaishou.live.lite.background.b$b;
import a93.f;
import com.kuaishou.live.lite.background.b$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kwai.video.waynelive.listeners.LivePlayerBufferListener;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import sj3.b;
import android.content.Context;
import android.view.View;
import ha1.b;
import k51.d;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import java.lang.Enum;
import com.kuaishou.live.common.core.component.loading.LoopBackgroundView;
import a93.i;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import a93.g;
import erd.g;
import crd.b;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import oh3.j;
import java.lang.Runnable;
import e93.f;

public class b extends ViewController	// class@001e7f
{
    public final String j;
    public final l k;
    public final e l;
    public LoopBackgroundView m;
    public b n;
    public final Runnable o;
    public final LivePlayerRenderListener p;
    public final LivePlayerBufferListener q;
    public final LivePlayerStateChangeListener r;
    public final b s;

    public void b(l p0,e p1){
       super();
       this.j = "LiveLiteLoadingController";
       this.o = new h(this);
       this.p = new b$a(this);
       this.q = new b$b(this);
       this.r = new f(this);
       this.s = new b$c(this);
       this.k = p0;
       this.l = p1;
    }
    public void F2(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
          return;
       }
       this.l.Vc().addRenderListener(this.p);
       this.l.Vc().addBufferListener(this.q);
       this.l.Vc().addStateChangeListener(this.r);
       this.k.b(this.s);
       View view = b.e(this.D2(), R.layout.lite_mask_view_layout);
       view.setTag(d.a, LayoutViewType.PlayerViewMask.name());
       this.R2(view);
       this.m = this.A2(0x7f0a17f0);
       if (!PatchProxy.applyVoid(objArray, this, uob, "3")) {
          this.n = t.fromCallable(new i(this)).subscribeOn(d.c).observeOn(d.a).subscribe(new g(this));
       }
       if (this.l.Vc().isPlaying()) {
          b.Z(LiveLiteLogTag.LITE_BACKGROUND, "LiveLiteLoadingController already playing");
          this.p.onVideoRenderingStart();
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.l.Vc().removeRenderListener(this.p);
       this.l.Vc().removeBufferListener(this.q);
       this.l.Vc().removeStateChangeListener(this.r);
       this.k.c(this.s);
       this.m.setVisibility(8);
       this.V2();
       j.a(this.n);
       return;
    }
    public void V2(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       f.f(this.o);
       return;
    }
}
