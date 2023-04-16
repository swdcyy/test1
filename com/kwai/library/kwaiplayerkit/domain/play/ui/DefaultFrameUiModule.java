package com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule;
import com.kwai.library.kwaiplayerkit.framework.module.ui.UiModule;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule$a;
import nsd.u;
import android.view.View;
import ux6.d;
import ux6.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule$c;
import java.util.Objects;
import com.kwai.library.kwaiplayerkit.domain.play.ui.impl.DefaultFrameViewModel;
import ux6.b;
import rx6.b;
import mrd.a;
import com.kwai.library.kwaiplayerkit.domain.play.ui.impl.DefaultFrameViewModel$c;
import java.lang.Integer;
import qx6.d;
import qx6.c;
import java.util.Map;
import java.lang.ref.WeakReference;
import android.graphics.Bitmap;
import mx6.a;
import java.lang.Class;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import android.widget.ImageView;
import ay6.d;
import yx6.e;
import ox6.b;
import com.kwai.library.kwaiplayerkit.framework.troubleshooting.UiVisibility;
import android.view.SurfaceView;
import android.view.SurfaceHolder;
import android.view.Surface;
import com.kwai.framework.player.ui.TextureViewProxy;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.kwai.library.kwaiplayerkit.domain.play.ui.impl.SurfaceTypeReport;
import java.lang.IllegalArgumentException;
import android.widget.FrameLayout;
import kotlin.Pair;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule$ExecutorImpl;
import px6.e;
import sx6.d;
import nx6.a;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public final class DefaultFrameUiModule extends UiModule	// class@00085d
{
    public static final DefaultFrameUiModule$a g;

    static {
       DefaultFrameUiModule.g = new DefaultFrameUiModule$a(null);
    }
    public void DefaultFrameUiModule(){
       super();
    }
    public a b(View p0,d p1){
       a.p(p0, "view");
       a.p(p1, "viewModel");
       return new DefaultFrameUiModule$c(this, p0);
    }
    public void d(){
       d uod = this.l();
       Objects.requireNonNull(uod, "null cannot be cast to non-null type com.kwai.library.kwaiplayerkit.domain.play.ui.impl.DefaultFrameViewModel");
       b uob = this.n();
       a.m(uob);
       uob = uob.getDataSource();
       if (uob != null) {
          a.p(uob, "dataSource");
          int i = (uob.a())? 2: 0;
          uod.c = uob.d();
          uod.b.d().onNext(Integer.valueOf(i));
       }
       uob = this.n();
       if (uob != null) {
          d uod1 = uob.a();
          a.m(uod1);
          WeakReference weakReferenc = uod1.a.remove("CURRENT_FRAME_BITMAP");
          if (weakReferenc != null) {
             Bitmap uBitmap = weakReferenc.get();
             if (uBitmap != null) {
                a.o(uBitmap, "it");
                a.p(uBitmap, "bitmap");
                uod.b.a().onNext(new WeakReference(uBitmap));
             }
          }
       }
       uob = this.n();
       if (uob != null) {
          a uoa = uob.f(a.class);
          if (uoa != null) {
             IWaynePlayer player = uoa.getPlayer();
             if (player != null) {
                uod.j(player);
             }
          }
       }
       return;
    }
    public void e(IWaynePlayer p0){
       a.p(p0, "player");
       super.e(p0);
       d uod = this.l();
       Objects.requireNonNull(uod, "null cannot be cast to non-null type com.kwai.library.kwaiplayerkit.domain.play.ui.impl.DefaultFrameViewModel");
       uod.j(p0);
    }
    public void f(IWaynePlayer p0){
       a.p(p0, "player");
       super.f(p0);
       d uod = this.l();
       Objects.requireNonNull(uod, "null cannot be cast to non-null type com.kwai.library.kwaiplayerkit.domain.play.ui.impl.DefaultFrameViewModel");
       uod.k();
    }
    public void h(){
       Bitmap bitmapFromCo;
       View view = this.k();
       Objects.requireNonNull(view, "null cannot be cast to non-null type com.kwai.framework.player.ui.impl.PlayerKitContentFrame");
       if (!view.getCover().getVisibility()) {
          bitmapFromCo = view.getBitmapFromCover();
       }else {
          view.o.a("tryGetFrameBitmapDebounce");
          view.L();
          view.o.b();
          bitmapFromCo = view.p;
       }
       if (bitmapFromCo != null) {
          b uob = this.n();
          if (uob != null) {
             d uod = uob.a();
             a.m(uod);
             uod.a("CURRENT_FRAME_BITMAP", new WeakReference(bitmapFromCo));
          }
          view.I(bitmapFromCo);
       }
       d uod1 = this.l();
       Objects.requireNonNull(uod1, "null cannot be cast to non-null type com.kwai.library.kwaiplayerkit.domain.play.ui.impl.DefaultFrameViewModel");
       uod1.k();
       return;
    }
    public e m(){
       UiVisibility uNKNOWN;
       SurfaceTypeReport sURFACE_VIEW;
       View view = this.k();
       e uoe = null;
       if (!view instanceof PlayerKitContentFrame) {
          view = uoe;
       }
       if (view == null) {
          return uoe;
       }else {
          ImageView cover = view.getCover();
          a.o(cover, "contentFrame.cover");
          int visibility = cover.getVisibility();
          if (visibility) {
             if (visibility != 4) {
                uNKNOWN = (visibility != 8)? UiVisibility.UNKNOWN: UiVisibility.GONE;
             }else {
                uNKNOWN = UiVisibility.INVISIBLE;
             }
          }else {
             uNKNOWN = UiVisibility.VISIBLE;
          }
          UiVisibility uiVisibility = uNKNOWN;
          a.o(uiVisibility, "TroubleShootingUtils.deb¡­ntFrame.cover.visibility\)");
          PlayerKitContentFrame d = view.d;
          int i = 1;
          int i1 = 0;
          if (d instanceof SurfaceView) {
             if (d.getHolder().getSurface() != null) {
             label_004c :
                i1 = 1;
             }
          }else if(d instanceof TextureViewProxy && d.getSurfaceTexture() != null){
             goto label_004c ;
          }
          d = view.m;
          int surfaceType = view.getSurfaceType();
          if (surfaceType) {
             if (surfaceType != i) {
                if (surfaceType == 2) {
                   sURFACE_VIEW = SurfaceTypeReport.SURFACE_VIEW;
                }else {
                   throw new IllegalArgumentException("unknown type");
                }
             }else {
                sURFACE_VIEW = SurfaceTypeReport.TEXTURE_VIEW;
             }
          }else {
             sURFACE_VIEW = SurfaceTypeReport.DEFAULT;
          }
          SurfaceTypeReport surfaceTypeR = sURFACE_VIEW;
          a.o(surfaceTypeR, "TroubleShootingUtils.deb¡­contentFrame.surfaceType\)");
          String coverFlags = view.getCoverFlags();
          a.o(coverFlags, "contentFrame.coverFlags");
          b uob = new b(uiVisibility, i1, d, surfaceTypeR, view.getTop(), view.getLeft(), view.getWidth(), view.getHeight(), view.isShown(), coverFlags);
          return v1;
       }
    }
    public Pair p(){
       PlayerKitContentFrame playerKitCon = this.k();
       a.m(playerKitCon);
       d uod = new d(this.n(), "ContentFrameExecutor");
       a.o(uod, "PlayerKitPlugins.withTra¡­XECUTOR_TRACE_CLASS_NAME\)");
       DefaultFrameUiModule$ExecutorImpl uExecutorImp = new DefaultFrameUiModule$ExecutorImpl(playerKitCon, uod);
       return new Pair(a.class, uExecutorImp);
    }
    public View q(ViewGroup p0){
       a.p(p0, "parent");
       PlayerKitContentFrame playerKitCon = new PlayerKitContentFrame(p0.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -1);
       layoutParams.gravity = 17;
       playerKitCon.setLayoutParams(layoutParams);
       p0.addView(playerKitCon, 0);
       return playerKitCon;
    }
    public d r(b p0){
       a.p(p0, "context");
       return new DefaultFrameViewModel(p0);
    }
}
