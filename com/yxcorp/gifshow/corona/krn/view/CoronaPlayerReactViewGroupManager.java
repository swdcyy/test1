package com.yxcorp.gifshow.corona.krn.view.CoronaPlayerReactViewGroupManager;
import com.facebook.react.uimanager.SimpleViewManager;
import com.yxcorp.gifshow.corona.krn.view.CoronaConnerFrameLayout;
import com.yxcorp.gifshow.corona.common.widget.CoronaWarpLoadLayout;
import ss9.e;
import am5.b;
import android.view.View;
import java.lang.Exception;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import lnc.a1;
import bm5.d$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import bm5.d$a$a;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.corona.krn.view.CoronaPlayerReactViewGroupManager$a;
import bm5.d;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.android.model.mix.CoverMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import jp.a;
import com.kwai.framework.model.feed.BaseFeed;
import ub.b;
import wb5.h;
import android.widget.ImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.image.callercontext.a;
import jd.c;
import ze.n0;
import android.content.Context;
import i2b.a;
import android.app.Activity;
import android.content.ContextWrapper;
import ss9.a;
import android.view.View$OnClickListener;
import tkd.b;
import tkd.d;
import cm5.a;
import ss9.c;
import ss9.b;
import erd.g;
import cm5.c;
import java.lang.Boolean;
import fg6.a;
import com.google.gson.Gson;

public class CoronaPlayerReactViewGroupManager extends SimpleViewManager	// class@00128b
{

    public void CoronaPlayerReactViewGroupManager(){
       super();
    }
    public static void a(CoronaPlayerReactViewGroupManager p0,CoronaConnerFrameLayout p1,CoronaWarpLoadLayout p2,e p3,b p4){
       p0.lambda$loadPlayerView$1(p1, p2, p3, p4);
    }
    public static void b(CoronaPlayerReactViewGroupManager p0,CoronaConnerFrameLayout p1,e p2,View p3){
       p0.lambda$loadPlayerView$0(p1, p2, p3);
    }
    public static void c(CoronaPlayerReactViewGroupManager p0,CoronaWarpLoadLayout p1,Exception p2){
       p0.lambda$loadPlayerView$2(p1, p2);
    }
    private void lambda$loadPlayerView$0(CoronaConnerFrameLayout p0,e p1,View p2){
       this.loadPlayerView(p0, p1);
    }
    private void lambda$loadPlayerView$1(CoronaConnerFrameLayout p0,CoronaWarpLoadLayout p1,e p2,b p3){
       this.addPlayerView(p0, p1, p2, p3);
    }
    private void lambda$loadPlayerView$2(CoronaWarpLoadLayout p0,Exception p1){
       KwaiException mErrorMessag = (p1 instanceof KwaiException)? p1.mErrorMessage: null;
       if (TextUtils.x(mErrorMessag)) {
          mErrorMessag = a1.p(R.string.arg_RES_7f100158);
       }
       this.showErrorEmptyView(mErrorMessag, p0);
       return;
    }
    public final void addPlayerView(CoronaConnerFrameLayout p0,CoronaWarpLoadLayout p1,e p2,b p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, CoronaPlayerReactViewGroupManager.class, "4")) {
          return;
       }
       if (p3 != null) {
          p1.setVisibility(8);
          FrameLayout contentView = p3.getContentView();
          contentView.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
          contentView.setId(R.id.corona_warp_player_id);
          p0.addView(contentView);
          e scheme = p2.scheme;
          d$a$a obj = PatchProxy.applyOneRefs(scheme, null, d$a.class, "8");
          if (obj != PatchProxyResult.class) {
          }else {
             obj = d$a.j;
             Objects.requireNonNull(obj);
             obj = PatchProxy.applyOneRefs(scheme, obj, d$a$a.class, "2");
             if (obj != PatchProxyResult.class) {
             }else {
                a.p(scheme, "scheme");
                obj = new d$a(null);
                obj.f = scheme;
             }
          }
          boolean b = true;
          obj.i = b;
          CoronaPlayerReactViewGroupManager$a uoa = new CoronaPlayerReactViewGroupManager$a(this, p2);
          p2 = PatchProxy.applyOneRefs(uoa, obj, d$a.class, "5");
          if (p2 != PatchProxyResult.class) {
             obj = p2;
          }else {
             a.p(uoa, "logPage");
             obj.e = uoa;
          }
          obj.h = b;
          d uod = PatchProxy.apply(null, obj, d$a.class, "6");
          if (uod != PatchProxyResult.class) {
          }else {
             uod = new d(obj);
          }
          p3.a(uod);
       }else {
          this.showErrorEmptyView("player view is null", p1);
       }
       return;
    }
    public final void bindCover(CoronaConnerFrameLayout p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoronaPlayerReactViewGroupManager.class, "6")) {
          return;
       }
       KwaiImageView kwaiImageVie = p0.findViewById(R.id.iv_bg_cover);
       kwaiImageVie.setPlaceHolderImage(new ColorDrawable(a1.a(R.color.arg_RES_7f0600a6)));
       e landscapeCov = p1.landscapeCover;
       if (landscapeCov == null) {
          e photo = p1.photo;
          if (photo != null) {
             photo.getCoverMeta();
             h.d(kwaiImageVie, p1.photo.mEntity, a.c, null);
             kwaiImageVie.setVisibility(0);
          }
       }
       if (landscapeCov != null) {
          h.g(kwaiImageVie, landscapeCov, kwaiImageVie.getMeasuredWidth(), kwaiImageVie.getMeasuredHeight(), null, null, null);
          kwaiImageVie.setVisibility(0);
       }
       return;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public CoronaConnerFrameLayout createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoronaPlayerReactViewGroupManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       CoronaConnerFrameLayout uCoronaConne = a.a(p0, R.layout.arg_RES_7f0d0224);
       uCoronaConne.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       uCoronaConne.setConnerSize(a1.d(R.dimen.arg_RES_7f07034b));
       return uCoronaConne;
    }
    public Activity getActivity(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoronaPlayerReactViewGroupManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Context context = p0.getContext();
       while (true) {
          if (!context instanceof ContextWrapper) {
             return null;
          }
          if (context instanceof Activity) {
             break ;
          }else {
             context = context.getBaseContext();
          }
       }
       return context;
    }
    public String getName(){
       return "RCTCoronaWarpPlayer";
    }
    public final void loadPlayerView(CoronaConnerFrameLayout p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoronaPlayerReactViewGroupManager.class, "3")) {
          return;
       }
       CoronaWarpLoadLayout uCoronaWarpL = p0.findViewById(R.id.corona_warp_load_layout);
       uCoronaWarpL.b();
       uCoronaWarpL.setRetryClickListener(new a(this, p0, p1));
       d.a(0x5f78d73).Tg(p0.getContext(), new c(this, p0, uCoronaWarpL, p1), new b(this, uCoronaWarpL));
       return;
    }
    public void paused(CoronaConnerFrameLayout p0,boolean p1){
       if (PatchProxy.isSupport(CoronaPlayerReactViewGroupManager.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, CoronaPlayerReactViewGroupManager.class, "7")) {
          return;
       }
       b uob = p0.findViewById(R.id.corona_warp_player_id);
       if (uob != null) {
          uob.pause();
       }
       return;
    }
    public void setSource(CoronaConnerFrameLayout p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoronaPlayerReactViewGroupManager.class, "2")) {
          return;
       }
       e uoe = a.a.h(p1, e.class);
       this.bindCover(p0, uoe);
       this.loadPlayerView(p0, uoe);
       return;
    }
    public final void showErrorEmptyView(String p0,CoronaWarpLoadLayout p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoronaPlayerReactViewGroupManager.class, "5")) {
          return;
       }
       p1.a(p0);
       return;
    }
    public void startPlay(CoronaConnerFrameLayout p0,boolean p1){
       if (PatchProxy.isSupport(CoronaPlayerReactViewGroupManager.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, CoronaPlayerReactViewGroupManager.class, "8")) {
          return;
       }
       b uob = p0.findViewById(R.id.corona_warp_player_id);
       if (uob != null) {
          uob.b();
       }
       return;
    }
}
