package com.kuaishou.live.lite.redpacket.a;
import com.kuaishou.live.viewcontroller.ViewController;
import v51.a;
import qd3.r;
import n91.f;
import e93.b;
import xp5.i;
import or5.d;
import com.kuaishou.livestream.message.nano.SCLiveLiteLeeeShow;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.content.Context;
import android.view.View;
import ha1.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import ekd.j;
import android.widget.ImageView;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.lite.tempplay.d;
import com.kuaishou.live.lite.redpacket.LiveLiteRedPackPendantView;
import com.kwai.robust.PatchProxyResult;
import qd3.r$a;
import bd3.e;
import bd3.d;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import java.lang.Long;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import bd3.b;
import bd3.c;
import erd.g;
import crd.b;
import hf3.a;
import bd3.a;
import lf3.g;
import lnc.b9;

public class a extends ViewController	// class@000b0e
{
    public final a j;
    public final f k;
    public final i l;
    public final d m;
    public final r n;
    public final b o;
    public LiveLiteRedPackPendantView p;
    public View q;
    public r$a r;
    public b s;

    public void a(a p0,r p1,f p2,b p3,i p4,d p5){
       super();
       this.j = p0;
       this.l = p4;
       this.n = p1;
       this.k = p2;
       this.o = p3;
       this.m = p5;
    }
    public static void V2(a p0,SCLiveLiteLeeeShow p1){
       Objects.requireNonNull(p0);
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p1, p0, uoa, "5")) {
       }else {
          LiveLiteLogTag lIVE_LITE_RE = LiveLiteLogTag.LIVE_LITE_RED_PACK;
          String str = "LiveLiteRedPackController";
          lIVE_LITE_RE.appendTag(str);
          b.P(lIVE_LITE_RE, "handleRedPackShow");
          if (!PatchProxy.applyVoidOneRefs(p1, p0, uoa, "11")) {
             if (p0.q == null) {
                View view = b.e(p0.D2(), R.layout.arg_RES_7f0d099a);
                view.findViewById(R.id.lite_temp_play_profit_animation_image).setActualImageResource(R.drawable.arg_RES_7f08130d);
                p0.q = view;
             }
             if (p1 != null && !j.h(p1.senderHeadUrl)) {
                KwaiImageView kwaiImageVie = p0.q.findViewById(R.id.lite_temp_play_profit_animation_avatar);
                kwaiImageVie.setVisibility(0);
                kwaiImageVie.U(e0.i(p1.senderHeadUrl));
             }
          }
       label_0067 :
          long l = p1.endTime - p0.k.s();
          if (l - null <= 0) {
             lIVE_LITE_RE.appendTag(str);
             b.P(lIVE_LITE_RE, "handleRedPackShow, countdownMs is invalid");
          }else if(p0.r == null){
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, p0, uoa, "9")) {
                b.P(lIVE_LITE_RE.appendTag(str), "addRedPackItem");
                d.d(p0.l.a(), "PROFIT_INFO", "RED_PACKAGE", objArray);
                LiveLiteRedPackPendantView liveLiteRedP = new LiveLiteRedPackPendantView(p0.D2());
                p0.p = liveLiteRedP;
                e uoe = PatchProxy.applyOneRefs(liveLiteRedP, p0, uoa, "12");
                if (uoe != PatchProxyResult.class) {
                }else {
                   uoe = new e(p0, liveLiteRedP);
                }
                p0.r = uoe;
                p0.n.c(uoe);
             }
          }
          p0.p.setIconUrl(e0.i(p1.authorInfoAreaIconUrl));
          p0.p.setContextText(p1.showText);
          p0.p.setOnClickListener(new d(p0, p1));
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), p0, uoa, "7")) {
             p0.X2();
             p0.s = t.timer(l, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new b(p0), new c(p0));
          }
       }
       return;
    }
    public void F2(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          this.j.u().u0(1024, SCLiveLiteLeeeShow.class, new a(this));
       }
       return;
    }
    public void J2(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          this.j.u().o(1024, new a(this));
       }
       this.X2();
       return;
    }
    public final void W2(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       b.P(LiveLiteLogTag.LIVE_LITE_RED_PACK.appendTag("LiveLiteRedPackController"), "removeRedPackItem");
       a tr = this.r;
       if (tr != null) {
          this.n.b(tr);
          this.r = null;
       }
       return;
    }
    public final void X2(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       b9.a(this.s);
       return;
    }
}
