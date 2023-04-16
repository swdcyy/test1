package com.kuaishou.live.lite.debuginfo.c;
import com.kuaishou.live.viewcontroller.ViewController;
import ds5.a;
import ga1.e;
import or5.d;
import ga1.d;
import crd.a;
import com.kuaishou.live.lite.debuginfo.c$a;
import com.kuaishou.live.lite.debuginfo.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import i2b.a;
import com.kwai.debugtools.plugin.wrapper.HostKwaiPlayerDebugInfoView;
import k51.d;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import java.lang.Enum;
import android.widget.FrameLayout;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import ds5.c;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.lite.debuginfo.a;
import com.kuaishou.live.lite.debuginfo.b;
import erd.g;
import crd.b;
import oh3.j;
import com.kwai.robust.PatchProxyResult;

public class c extends ViewController	// class@0008d4
{
    public final a j;
    public final e k;
    public final d l;
    public final d m;
    public HostKwaiPlayerDebugInfoView n;
    public IKwaiMediaPlayer o;
    public long p;
    public long q;
    public long r;
    public boolean s;
    public b t;
    public final a u;
    public final c v;
    public final LivePlayerStateChangeListener w;

    public void c(a p0,e p1,d p2,d p3){
       super();
       this.s = false;
       this.u = new a();
       this.v = new c$a(this);
       this.w = new c$b(this);
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p3;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       HostKwaiPlayerDebugInfoView hostKwaiPlay = a.a(this.D2(), R.layout.arg_RES_7f0d098b);
       this.n = hostKwaiPlay;
       hostKwaiPlay.setTag(d.a, LayoutViewType.PlayerDebugInfo.name());
       this.R2(this.n);
       this.V2().addStateChangeListener(this.w);
       this.j.gd(this.v);
       this.t = t.interval(1, 1, TimeUnit.SECONDS).observeOn(d.a).subscribe(new a(this), b.b);
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.W2();
       this.j.fo(this.v);
       this.V2().removeStateChangeListener(this.w);
       j.a(this.t);
       this.u.d();
       return;
    }
    public final LivePlayerController V2(){
       Object obj = PatchProxy.apply(null, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.Vc();
    }
    public final void W2(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       this.n.c();
       this.s = false;
       return;
    }
}
