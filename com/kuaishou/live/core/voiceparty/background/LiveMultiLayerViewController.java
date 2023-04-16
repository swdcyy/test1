package com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController$a;
import nsd.u;
import android.content.Context;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import ftd.z1;
import ftd.w;
import ftd.c2;
import kotlin.coroutines.CoroutineContext;
import ftd.k0;
import ftd.l0;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import ho2.m$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ho2.m$d;
import go2.l;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.drawable.Drawable;
import go2.l$a;
import go2.h;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.core.voiceparty.background.c;
import ok.o;
import com.kuaishou.live.core.voiceparty.background.a;
import ok.h;
import com.google.common.collect.ImmutableList;
import java.util.List;
import ho2.m$e;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Throwable;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import java.util.concurrent.CancellationException;
import ftd.z1$a;
import ho2.m$b;
import java.io.File;
import asd.c;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.net.Uri;
import ho2.l;
import java.nio.charset.Charset;
import com.yxcorp.gifshow.util.u0;
import qrd.l1;
import com.kuaishou.live.core.voiceparty.background.multiimage.MultiImageDownloadUtils;
import com.kuaishou.live.common.core.basic.tools.g$d$a;
import java.util.Collection;
import java.util.Objects;
import java.util.Arrays;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.kuaishou.live.common.core.basic.tools.g$d;
import csd.b;
import java.io.IOException;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController$inflateDynamicViewFromFile$1;
import qrd.j0;
import java.lang.IllegalStateException;
import ho2.i;
import com.kwai.robust.PatchProxyResult;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kuaishou.live.core.voiceparty.background.multiimage.MultiImageComposition$fromFile$2;
import msd.p;
import kotlinx.coroutines.a;
import ho2.i$a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerView$a;
import java.io.FileNotFoundException;
import go2.a;
import java.lang.Runnable;
import t45.c;
import android.view.ViewPropertyAnimator;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController$b;
import android.animation.Animator$AnimatorListener;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.view.ViewGroup;
import android.os.Build;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController$updateBackgroundInternal$$inlined$let$lambda$1;
import ho2.m;
import kotlinx.coroutines.CoroutineStart;

public final class LiveMultiLayerViewController	// class@001346
{
    public View a;
    public KwaiImageView b;
    public View c;
    public i$a d;
    public boolean e;
    public boolean f;
    public k0 g;
    public boolean h;
    public m i;
    public Drawable j;
    public LiveMultiLayerView$a k;
    public final Context l;
    public final LiveMultiLayerView m;
    public static final LiveMultiLayerViewController$a n;

    static {
       LiveMultiLayerViewController.n = new LiveMultiLayerViewController$a(null);
    }
    public void LiveMultiLayerViewController(Context p0,LiveMultiLayerView p1){
       a.p(p0, "context");
       a.p(p1, "bgContainerView");
       super();
       this.l = p0;
       this.m = p1;
       this.a = new View(p0);
       this.e = true;
       this.g = l0.a(c2.d(null, true, null));
       p1.addView(this.a, new FrameLayout$LayoutParams(-1, -1));
    }
    public final void a(m$c p0){
       LiveMultiLayerViewController liveMultiLay = LiveMultiLayerViewController.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveMultiLay, "12")) {
          return;
       }
       if (p0 instanceof m$d) {
          this.f();
          if (!PatchProxy.applyVoid(null, this, liveMultiLay, "13")) {
             liveMultiLay = this.b;
             if (liveMultiLay != null) {
                l.a.a(liveMultiLay, 720.00f, null);
             }
          }
          liveMultiLay = this.b;
          a.m(liveMultiLay);
          m$d b = p0.b;
          if (!PatchProxy.applyVoidTwoRefs(liveMultiLay, b, null, h.class, "1")) {
             h.b(liveMultiLay, m.s(b).p(c.b).F(a.b).B());
          }
       }else if(p0 instanceof m$e){
          this.f();
          liveMultiLay = this.b;
          a.m(liveMultiLay);
          h.a(liveMultiLay, p0.b);
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveMultiLayerViewController.class, "3")) {
          return;
       }
       z1 oz1 = this.g.getCoroutineContext().get(z1.p0);
       if (oz1 != null) {
          z1$a.b(oz1, null, 1, null);
       }
       this.g = l0.a(c2.d(null, 1, null));
       return;
    }
    public final Object c(m$b p0,File p1,c p2){
       String str = CollectionsKt___CollectionsKt.p2(p0.b());
       if (str == null) {
          throw new IOException("empty resourceUrl");
       }
       Uri uri = Uri.parse(str);
       if (uri != null && l.b(uri) == true) {
          str = uri.getPath();
          if (str != null) {
             u0.l(new File(str), p1.getAbsolutePath(), null);
             return l1.a;
          }
       }
       g$d$a uod$a = new g$d$a();
       String[] stringArray = new String[0];
       Object[] objArray = p0.b().toArray(stringArray);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       uod$a.i(Arrays.copyOf(objArray, objArray.length));
       uod$a.g(p1.getAbsolutePath());
       uod$a.c(DownloadTask$DownloadTaskType.IMMEDIATE);
       uod$a.a("live_voice_party_background");
       uod$a.f(true);
       uod$a.d(true);
       uod$a.e(p0.a());
       g$d uod = uod$a.b();
       a.o(uod, "LiveDownloadUtils.TaskIn¡­urceMd5\)\n        .build\(\)");
       uod = MultiImageDownloadUtils.a.a(uod, p2);
       if (uod == b.h()) {
          return uod;
       }else {
          return l1.a;
       }
    }
    public final Object d(File p0,m$b p1,c p2){
       LiveMultiLayerViewController$inflateDynamicViewFromFile$1 oinflateDyna;
       LiveMultiLayerViewController k;
       if (p2 instanceof LiveMultiLayerViewController$inflateDynamicViewFromFile$1) {
          oinflateDyna = p2;
          LiveMultiLayerViewController$inflateDynamicViewFromFile$1 label = oinflateDyna.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             oinflateDyna.label = label - i;
          label_0018 :
             LiveMultiLayerViewController$inflateDynamicViewFromFile$1 result = oinflateDyna.result;
             Object obj = b.h();
             label = oinflateDyna.label;
             if (label != null) {
                if (label == 1) {
                   oinflateDyna = oinflateDyna.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                i a = i.a;
                k = this.l;
                oinflateDyna.L$0 = this;
                oinflateDyna.L$1 = p0;
                oinflateDyna.L$2 = p1;
                oinflateDyna.label = 1;
                Objects.requireNonNull(a);
                Object obj1 = PatchProxy.applyFourRefs(p1, k, p0, oinflateDyna, a, i.class, "1");
                result = (obj1 != PatchProxyResult.class)? obj1: a.i(z0.f(), new MultiImageComposition$fromFile$2(p1, k, p0, null), oinflateDyna);
                if (result == obj) {
                   return obj;
                }else {
                   LiveMultiLayerViewController liveMultiLay = this;
                }
             }
             b.Z(LiveLogTag.LIVE_VOICE_PARTY, "inflateDynamicViewFromFile success");
             oinflateDyna.e(result.a, result);
             k = oinflateDyna.k;
             if (k != null) {
                k.a(1, null);
             }
          label_00bb :
             return l1.a;
          }
       }
       oinflateDyna = new LiveMultiLayerViewController$inflateDynamicViewFromFile$1(this, p2);
       goto label_0018 ;
    }
    public final void e(View p0,i$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMultiLayerViewController.class, "15")) {
          return;
       }
       LiveMultiLayerViewController tc = this.c;
       this.m.addView(p0, -1, -1);
       this.c = p0;
       this.d = p1;
       p0.animate().cancel();
       p0.setAlpha(0);
       p0.animate().setDuration(500).alpha(0x3f800000).setListener(new LiveMultiLayerViewController$b(this, tc));
       return;
    }
    public final void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiLayerViewController.class, "14")) {
          return;
       }
       LiveMultiLayerViewController tc = this.c;
       if (tc != null) {
          tc.animate().cancel();
          this.m.removeView(tc);
          this.c = objArray;
       }
       this.d = objArray;
       this.a.setBackground(objArray);
       if (this.b == null) {
          KwaiImageView kwaiImageVie = new KwaiImageView(this.l);
          this.b = kwaiImageVie;
          a.m(kwaiImageVie);
          kwaiImageVie.setScaleType(ImageView$ScaleType.CENTER_CROP);
          tc = this.b;
          a.m(tc);
          a hierarchy = tc.getHierarchy();
          if (hierarchy != null) {
             hierarchy.x(0);
          }
       }
       LiveMultiLayerViewController tb = this.b;
       a.m(tb);
       int i = this.m.indexOfChild(tb);
       tc = (i != -1)? 1: null;
       if (!tc) {
          this.m.addView(this.b, 0, new ViewGroup$LayoutParams(-1, -1));
       }
       return;
    }
    public final void g(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiLayerViewController.class, "9")) {
          return;
       }
       LiveMultiLayerViewController ti = this.i;
       if (ti != null) {
          b.e0(LiveLogTag.LIVE_VOICE_PARTY, "updateBackgroundInternal", "device", Build.MODEL, "isDynamicBgEnable", Boolean.valueOf(this.e), "resMsg", ti.toString());
          this.b();
          b = true;
          this.f = b;
          if (this.h == null) {
             return;
          }else if(ti instanceof m$b){
             LiveMultiLayerViewController liveMultiLay = ti;
             if (liveMultiLay.d != b) {
                b = false;
             }
             if (b && this.e != null) {
                a.f(this.g, null, null, new LiveMultiLayerViewController$updateBackgroundInternal$$inlined$let$lambda$1(ti, objArray, this), 3, null);
             }else {
                this.a(liveMultiLay.c());
                this.f = false;
                ti = this.k;
                if (ti != null) {
                   ti.a(2, objArray);
                }
             }
          }else if(ti instanceof m$d){
             this.a(ti);
             this.f = false;
          }else if(ti instanceof m$e){
             this.a(ti);
             this.f = false;
          }
       }
       return;
    }
}
