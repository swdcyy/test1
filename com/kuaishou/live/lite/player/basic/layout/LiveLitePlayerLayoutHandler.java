package com.kuaishou.live.lite.player.basic.layout.LiveLitePlayerLayoutHandler;
import lc3.b;
import rc3.b;
import android.app.Activity;
import com.kuaishou.live.lite.LiveLiteParam;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kwai.video.waynelive.LivePlayerController;
import mrd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.kuaishou.live.lite.framework.layoutmanager.widget.PlayerViewCropLayout;
import android.widget.FrameLayout;
import lnc.a1;
import crd.a;
import com.kuaishou.live.lite.framework.layoutmanager.widget.PlayerViewCropLayout$ScaleType;
import fb3.a;
import com.kuaishou.live.lite.player.basic.layout.LiveLitePlayerLayoutHandler$a;
import erd.g;
import crd.b;
import brd.t;
import krd.a;
import cb3.f;
import com.kuaishou.live.lite.player.basic.layout.LiveLitePlayerLayoutHandler$2;
import msd.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lc3.a;
import android.view.View$OnLayoutChangeListener;
import kc3.c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import db3.i;
import androidx.constraintlayout.widget.a;
import android.graphics.Rect;
import java.util.Objects;
import qrd.l1;

public final class LiveLitePlayerLayoutHandler implements b, b	// class@000a67
{
    public final String a;
    public final CardView b;
    public final PlayerViewCropLayout c;
    public final FrameLayout d;
    public final a e;
    public final f f;
    public final int g;
    public final a h;
    public int i;
    public int j;
    public final Activity k;
    public final LiveLiteParam l;
    public final ConstraintLayout m;
    public final LivePlayerController n;
    public final boolean o;
    public final a p;

    public void LiveLitePlayerLayoutHandler(Activity p0,LiveLiteParam p1,ConstraintLayout p2,LivePlayerController p3,boolean p4,a p5){
       a.p(p0, "activity");
       a.p(p1, "liveLiteParam");
       a.p(p2, "container");
       a.p(p3, "playerController");
       a.p(p5, "stageLayoutState");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       this.a = "LiveLitePlayerLayoutHandler";
       View view = p2.findViewById(R.id.live_lite_player_card_view_container);
       a.o(view, "container.findViewById\(R¡­ayer_card_view_container\)");
       this.b = view;
       view = p2.findViewById(R.id.live_lite_player_multi_chat_container);
       a.o(view, "container.findViewById\(R¡­yer_multi_chat_container\)");
       this.c = view;
       View view1 = p2.findViewById(R.id.live_lite_player_view_container);
       a.o(view1, "container.findViewById\(R¡­te_player_view_container\)");
       View view2 = view1;
       this.d = view2;
       this.g = a1.d(0x7f070bf1);
       a uoa = new a();
       this.h = uoa;
       view.setScaleType(PlayerViewCropLayout$ScaleType.CENTER_CROP);
       this.e = new a(p3, view, view2);
       b uob = p5.subscribe(new LiveLitePlayerLayoutHandler$a(this));
       a.o(uob, "stageLayoutState.subscri¡­layerContainers\(it\)\n    }");
       a.b(uoa, uob);
       f uof = new f(p1, p2, view2, p3, p5, new LiveLitePlayerLayoutHandler$2(this));
       this.f = uoa;
       if (PatchProxy.applyVoidOneRefs(view, this, LiveLitePlayerLayoutHandler.class, "9")) {
       }else {
          view.addOnLayoutChangeListener(new a(this));
       }
       return;
    }
    public c a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLitePlayerLayoutHandler.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "placeHolderView");
       return new c(this.c, p0, "multiChatCropContainer");
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayerLayoutHandler.class, "8")) {
          return;
       }
       LiveLiteLogTag pLAYER = LiveLiteLogTag.PLAYER;
       b.Z(pLAYER, this.a+" setPlayerView");
       LiveLitePlayerLayoutHandler liveLitePlay = null;
       if (p0 != null) {
          LiveLitePlayerLayoutHandler liveLitePlay1 = (this.d.indexOfChild(p0) != -1)? 1: null;
          if (liveLitePlay1) {
             b.Z(pLAYER, this.a+" setPlayerView return");
             return;
          }
       }
       this.d.removeAllViews();
       if (p0 != null) {
          b.Z(pLAYER, this.a+" setPlayerView reset");
          p0.animate().cancel();
          p0.setClickable(liveLitePlay);
          p0.setTranslationX(0);
          p0.setTranslationY(0);
          this.d.addView(p0, new FrameLayout$LayoutParams(-1, -1, 17));
       }
       return;
    }
    public c c(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLitePlayerLayoutHandler.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "placeHolderView");
       return new c(this.b, p0, "playerCardViewContainer");
    }
    public void d(i p0){
       LiveLitePlayerLayoutHandler liveLitePlay = LiveLitePlayerLayoutHandler.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveLitePlay, "5")) {
          return;
       }
       a.p(p0, "state");
       b.c0(LiveLiteLogTag.PLAYER, this.a+" adjustPlayerContainers", "state", p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, liveLitePlay, "6")) {
          a uoa = new a();
          uoa.i(this.m);
          uoa.q(R.id.live_lite_player_card_view_container, p0.f);
          uoa.n(R.id.live_lite_player_card_view_container, p0.g);
          uoa.m(R.id.live_lite_player_card_view_container, 3, 0, 3, p0.e().top);
          if (p0.k == null) {
             uoa.g(R.id.live_lite_player_card_view_container, 3);
          }
          uoa.m(R.id.live_lite_player_card_view_container, 4, 0, 4, p0.e().bottom);
          if (p0.m == null) {
             uoa.g(R.id.live_lite_player_card_view_container, 4);
          }
          uoa.m(R.id.live_lite_player_card_view_container, 6, 0, 6, p0.e().left);
          if (p0.j == null) {
             uoa.g(R.id.live_lite_player_card_view_container, 6);
          }
          uoa.m(R.id.live_lite_player_card_view_container, 7, 0, 7, p0.e().right);
          if (p0.l == null) {
             uoa.g(R.id.live_lite_player_card_view_container, 7);
          }
          uoa.J(R.id.live_lite_player_card_view_container, String.valueOf(p0.n));
          uoa.b(this.m);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, liveLitePlay, "7")) {
          float f = (float)p0.o;
          this.b.setRadius(f);
          this.c.setRadius(f);
          this.c.setScaleType(p0.s);
          this.c.setExtraHeight(p0.h);
          liveLitePlay = this.c;
          ViewGroup$LayoutParams layoutParams = liveLitePlay.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
          layoutParams.setMargins(0, 0, 0, 0);
          layoutParams.width = -1;
          layoutParams.height = -1;
          layoutParams.gravity = p0.r;
          liveLitePlay.setLayoutParams(layoutParams);
          this.c.setTranslationX((float)p0.p);
          this.c.setTranslationY((float)p0.q);
       }
       return;
    }
}
