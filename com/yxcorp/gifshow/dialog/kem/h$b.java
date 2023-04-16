package com.yxcorp.gifshow.dialog.kem.h$b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.dialog.kem.h;
import com.yxcorp.gifshow.model.response.dialog.KemCommonVideoDialogResponse;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.dialog.kem.h$b$a;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import android.widget.ImageView;
import com.yxcorp.gifshow.dialog.kem.h$b$b;
import android.view.View$OnClickListener;
import qrd.l1;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.model.response.dialog.KemDialogResponse;
import x9a.d0;
import java.util.Objects;
import com.kwai.framework.perf.degrade.DegradeScenes;
import ac6.a;
import ac6.d;
import te6.b;
import wx6.a;
import wx6.d;
import hc6.b;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import rx6.d;
import nsd.u;
import com.yxcorp.gifshow.dialog.kem.KemCommonVideoDialog$VideoDialogViewFactory$initKitPlayer$1;
import rx6.b;
import msd.l;
import px6.b;
import nx6.a;
import xx6.f;
import com.yxcorp.gifshow.dialog.kem.i;
import xx6.f$b;
import mx6.a;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import x9a.w;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.wayne.player.main.IPlayerListener;
import x9a.x;
import com.kwai.video.wayne.player.listeners.OnWayneErrorListener;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import lnc.a1;
import android.graphics.drawable.Drawable;
import o07.n;

public final class h$b implements PopupInterface$f	// class@001abc
{
    public ClientEvent$UrlPackage b;
    public c c;
    public KwaiPlayerKitView d;
    public ImageView e;
    public final h$b$a f;
    public final KemCommonVideoDialogResponse g;
    public final h h;

    public void h$b(h p0,KemCommonVideoDialogResponse p1){
       a.p(p1, "response");
       this.h = p0;
       super();
       this.g = p1;
       this.f = new h$b$a(this);
    }
    public static final c c(h$b p0){
       p0 = p0.c;
       if (p0 == null) {
          a.S("dialog");
       }
       return p0;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       h$b td;
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, h$b.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       a.p(p0, "popup");
       a.p(p1, "inflater");
       a.p(p2, "container");
       this.c = p0;
       boolean b = false;
       View view = a.g(p1, R.layout.arg_RES_7f0d02e7, p2, b);
       view.findViewById(R.id.video_dialog_close_btn).setOnClickListener(new h$b$b(this));
       View view1 = view.findViewById(R.id.video_dialog_alternate_icon);
       View view2 = view1;
       view2.setOnClickListener(this.f);
       a.o(view1, "findViewById<ImageView>\(¡­\(clickListener\)\n        }");
       this.e = view2;
       view1 = view.findViewById(R.id.video_dialog_player_view);
       view2 = view1;
       view2.setOnClickListener(this.f);
       a.o(view1, "findViewById<KwaiPlayerK¡­\(clickListener\)\n        }");
       this.d = view2;
       h$b uob = h$b.class;
       if (!PatchProxy.applyVoid(null, this, uob, "2")) {
          Objects.toString(this.h.b());
          int i = 8;
          String str = "iconView";
          String str1 = "kitView";
          if (!d.b(DegradeScenes.GLOBAL_POPUP).a() && this.h.d.t(this.g.mVideoUrl)) {
             td = this.d;
             if (td == null) {
                a.S(str1);
             }
             td.setVisibility(b);
             td = this.e;
             if (td == null) {
                a.S(str);
             }
             td.setVisibility(i);
             td = this.d;
             if (td == null) {
                a.S(str1);
             }
             if (!PatchProxy.applyVoidOneRefs(td, this, uob, "3")) {
                td.c();
                td.setSessionKeyGenerator(new a());
                CDNUrl[] uCDNUrlArray = e0.h(this.g.mVideoUrl);
                a.o(uCDNUrlArray, "CDNUtil.makeCndUrls\(response.mVideoUrl\)");
                b uob1 = new b(uCDNUrlArray, false, 0, null, 14, null);
                td.g(new a(), KemCommonVideoDialog$VideoDialogViewFactory$initKitPlayer$1.INSTANCE);
                a uoa = td.getPlayerKitContext().e(a.class);
                if (uoa != null) {
                   uoa.o(true);
                }
                f uof = td.getPlayerKitContext().h();
                if (uof != null) {
                   uof.l(new i(this));
                }
                uoa = td.getPlayerKitContext().e(a.class);
                if (uoa != null) {
                   IWaynePlayer player = uoa.getPlayer();
                   if (player != null) {
                      player.setLooping(true);
                      player.setPlayerMute(true);
                      player.addOnPreparedListener(new w(player, this));
                      player.addOnWayneErrorListener(new x(this));
                   }
                }
             }
          }else {
             uob = this.d;
             if (uob == null) {
                a.S(str1);
             }
             uob.setVisibility(i);
             uob = this.e;
             if (uob == null) {
                a.S(str);
             }
             uob.setVisibility(b);
             Bitmap uBitmap = BitmapFactory.decodeFile(this.h.d.B(this.g.mMaterialUrl));
             if (uBitmap != null) {
                td = this.e;
                if (td == null) {
                   a.S(str);
                }
                td.setImageDrawable(new BitmapDrawable(a1.m(), uBitmap));
             }else {
                uob = this.c;
                if (uob == null) {
                   a.S("dialog");
                }
                uob.q(-1);
             }
          }
       }
       a.o(view, "KwaiLayoutInflater.infla¡­initViewWithRes\(\)\n      }");
       return view;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "4")) {
          return;
       }
       a.p(p0, "popup");
       n.a(this, p0);
       h$b td = this.d;
       if (td == null) {
          a.S("kitView");
       }
       td.a(true);
       return;
    }
}
