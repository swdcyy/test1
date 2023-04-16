package com.kuaishou.live.lite.background.a;
import com.kuaishou.live.viewcontroller.ViewController;
import android.graphics.Color;
import lnc.a1;
import ga1.e;
import or5.d;
import vb3.m;
import na3.b;
import vb3.h;
import com.kuaishou.android.live.model.LiveAudienceCustomSkinConfig;
import a93.b;
import com.kuaishou.live.lite.background.a$a;
import a93.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.content.Context;
import android.view.View;
import ha1.b;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import android.view.ViewStub;
import z81.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import u53.b;
import com.yxcorp.gifshow.model.CDNUrl;
import vb3.l;
import brd.t;
import a93.d;
import erd.g;
import crd.b;
import e93.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import db3.a;
import java.util.Objects;

public class a extends ViewController	// class@001e7b
{
    public final LivePlayerRenderListener A;
    public final IMediaPlayer$OnVideoSizeChangedListener B;
    public final String j;
    public View k;
    public View l;
    public View m;
    public ViewStub n;
    public final e o;
    public final d p;
    public final m q;
    public final b r;
    public final h s;
    public final LiveAudienceCustomSkinConfig t;
    public a u;
    public boolean v;
    public boolean w;
    public boolean x;
    public b y;
    public final l z;
    public static final int C;
    public static final int D;

    static {
       a.C = Color.argb(255, 29, 27, 56);
       a.D = a1.a(0x7f06018d);
    }
    public void a(e p0,d p1,m p2,b p3,h p4,LiveAudienceCustomSkinConfig p5){
       super();
       this.j = "LiveLiteBackgroundViewController";
       this.v = false;
       this.w = false;
       this.x = false;
       this.z = new b(this);
       this.A = new a$a(this);
       this.B = new c(this);
       this.o = p0;
       this.p = p1;
       this.q = p2;
       this.r = p3;
       this.s = p4;
       this.t = p5;
    }
    public void F2(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          return;
       }
       LiveLiteLogTag lITE_BACKGRO = LiveLiteLogTag.LITE_BACKGROUND;
       b.Z(lITE_BACKGRO, "LiveLiteBackgroundViewController onCreate");
       this.R2(b.e(this.D2(), R.layout.lite_background_layout));
       this.o.Vc().addRenderListener(this.A);
       this.o.Vc().addOnVideoSizeChangedListener(this.B);
       if (!PatchProxy.applyVoid(objArray, this, uoa, "8")) {
          this.l = this.A2(0x7f0a17e9);
          this.k = this.A2(0x7f0a17ed);
          this.m = this.A2(0x7f0a17f5);
          this.n = this.A2(0x7f0a20d7);
       }
       uoa = this.t;
       if (uoa != null) {
          a uoa1 = new a(this.n, uoa.mBottomBackgroundImg, uoa.mUpAtmosphereImg, uoa.mDownAtmosphereImg, b.i(this.p.j0()));
          this.u = objArray;
       }
       if (this.V2()) {
          this.q.b(this.z);
       }
       if (this.o.Vc().isPlaying()) {
          b.Z(lITE_BACKGRO, "LiveLiteBackgroundViewController already playing");
          this.A.onVideoRenderingStart();
       }
       this.y = this.s.a().subscribe(new d(this));
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       b.Z(LiveLiteLogTag.LITE_BACKGROUND, "LiveLiteBackgroundViewController onDestroy");
       f.g(this);
       this.o.Vc().removeRenderListener(this.A);
       this.o.Vc().removeOnVideoSizeChangedListener(this.B);
       this.q.a(this.z);
       this.y.dispose();
       return;
    }
    public boolean V2(){
       Object obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(a.n);
       return (a.m ^ 0x01);
    }
    public void W2(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "11")) {
          return;
       }
       if (this.w != null && this.x != null) {
          this.r.a(p0);
       }
       return;
    }
}
