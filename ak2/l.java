package ak2.l;
import k51.c;
import lnc.a1;
import ak2.k;
import ak2.i;
import ak2.l$a;
import ak2.h;
import ak2.l$b;
import ak2.l$c;
import ak2.l$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ak2.b;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import i2b.a;
import ak2.b$a;
import android.app.Activity;
import d61.y;
import android.widget.TextView;
import android.view.ViewGroup;
import d61.h;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.yxcorp.gifshow.model.CDNUrl;
import ak2.e;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import lu7.f;
import hf1.f;
import java.lang.CharSequence;
import ak2.d;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.live.common.core.basic.widget.MarqueeTextView;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import d61.c0;
import ea1.a;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import ak2.j;
import java.lang.Runnable;
import com.kuaishou.livestream.message.nano.LiveStreamActivityMessages$SCActivityLiveInfo;
import ak2.g;
import lf3.g;
import hf3.a;
import com.kuaishou.live.core.basic.utils.e;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import ks5.b;
import ks5.c;
import t02.a0;
import ak2.f;
import oq5.c;
import jv1.b;
import ds5.c;
import ds5.a;
import mq5.h;
import mq5.b;
import tkd.b;
import tkd.d;
import fs5.a;
import gs5.c;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import ekd.k1;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import wj2.r0;
import com.yxcorp.utility.TextUtils;
import ekd.m1;
import com.kwai.library.widget.recyclerview.CustomFadeEdgeRecyclerView;
import p91.m;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import ds5.e;

public class l extends c	// class@0000f3
{
    public KwaiImageView A;
    public TextView B;
    public View C;
    public b D;
    public KwaiDialogFragment E;
    public LiveStreamFeedWrapper F;
    public m G;
    public a0 H;
    public LivePlayLogger I;
    public a J;
    public e K;
    public b L;
    public LiveSlidePlayService M;
    public r0 N;
    public b O;
    public c P;
    public a Q;
    public final Runnable R;
    public final c S;
    public c T;
    public h U;
    public c V;
    public b$a W;
    public c X;
    public ViewGroup p;
    public ViewGroup q;
    public View r;
    public MarqueeTextView s;
    public KwaiImageView t;
    public TextView u;
    public TextView v;
    public CustomFadeEdgeRecyclerView w;
    public View x;
    public boolean y;
    public View z;
    public static final int Y = 0;
    public static final int Z = 0;
    public static String sLivePresenterClassName = "LiveAudienceTopBarNewGRPRSkinPresenter";

    static {
       l.Y = a1.d(0x7f07029e);
       l.Z = a1.d(0x7f0702ab);
    }
    public void l(){
       super();
       this.R = new k(this);
       this.S = new i(this);
       this.T = new l$a(this);
       this.U = new h(this);
       this.V = new l$b(this);
       this.W = new l$c(this);
       this.X = new l$d(this);
    }
    public void E8(){
       View view;
       l tx;
       RelativeLayout$LayoutParams layoutParams;
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ol, "9")) {
          b uob = new b();
          this.D = uob;
          uob.a = a.a(this.getContext(), 0x7f0d0e0b);
          this.D.t(this.W);
          this.y = y.d(this.getActivity());
          int i = 8;
          this.u.setVisibility(i);
          this.v.setVisibility(0);
          this.w.setVisibility(i);
          this.q.setVisibility(i);
          if (!PatchProxy.applyVoid(objArray, this, ol, "12")) {
             view = h.f(this.m8(), R.id.live_new_pendant_play_top_bar_audience_skin_anchor_info_view_stub, 0x7f0a220e);
             this.z = view;
             this.A = view.findViewById(0x7f0a22eb);
             this.B = this.z.findViewById(0x7f0a22ee);
             this.A.setPlaceHolderImage(R.drawable.detail_avatar_secret);
             a$a uoa1 = a.d();
             uoa1.b(":ks-features:ft-live:live");
             uoa1.d(ImageSource.FEED_AVATAR);
             this.A.W(this.F.getUser().mAvatars, HeadImageSize.MIDDLE.getSize(), HeadImageSize.MIDDLE.getSize(), uoa1.a());
             this.A.setOnClickListener(new e(this));
             this.B.setText(f.e(f.a(this.F.getUser()), 6));
             this.B.setOnClickListener(new d(this));
             if (!PatchProxy.applyVoid(objArray, this, ol, "14")) {
                tx = this.z;
                if (tx != null) {
                   layoutParams = tx.getLayoutParams();
                   layoutParams.topMargin = l.Y;
                   this.z.setLayoutParams(layoutParams);
                }
             }
             if (!PatchProxy.applyVoid(objArray, this, ol, "15")) {
                tx = this.x;
                if (tx != null) {
                   layoutParams = tx.getLayoutParams();
                   layoutParams.height = a1.d(0x7f070253);
                   layoutParams.addRule(6, R.id.live_new_pendant_play_top_bar_audience_skin_anchor_info_container);
                   layoutParams.addRule(i, R.id.live_new_pendant_play_top_bar_audience_skin_anchor_info_container);
                   this.x.setLayoutParams(layoutParams);
                }
             }
          }
       label_011e :
          if (!PatchProxy.applyVoid(objArray, this, ol, "10")) {
             view = this.D.b(objArray);
             this.r = view;
             MarqueeTextView marqueeTextV = view.findViewById(R.id.live_audience_skin_title);
             this.s = marqueeTextV;
             marqueeTextV.setMarqueeEnable(true);
             this.C = this.r.findViewById(0x7f0a22ae);
             this.t = this.r.findViewById(0x7f0a1960);
          }
          this.P8();
          this.C.setBackground(b.a());
          this.t.L(c0.a.b("udata/pkg/kwai-client-image/live_common/live_relevance_gr_white.webp"));
          a uoa = new a(ViewElement.TOP_BAR, new j(this));
          this.Q = uoa;
          uoa.c();
       }
       if (!PatchProxy.applyVoid(objArray, this, ol, "7")) {
          this.J.u0(596, LiveStreamActivityMessages$SCActivityLiveInfo.class, new g(this));
       }
       if (e.s(this.getActivity())) {
          ol = this.M;
          if (ol != null) {
             ol.P4(this.V);
          label_01ae :
             return;
          }
       }
       this.R8();
       goto label_01ae ;
    }
    public void J8(){
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "4")) {
          return;
       }
       if (e.s(this.getActivity())) {
          l tM = this.M;
          if (tM != null) {
             tM.d5(this.V);
          }
       }
       this.S8();
       if (!PatchProxy.applyVoid(objArray, this, ol, "20")) {
          this.u.setVisibility(0);
          this.v.setVisibility(8);
          this.w.setVisibility(0);
          this.q.setVisibility(0);
          this.r.setVisibility(8);
       }
       ol = this.D;
       if (ol != null) {
          ol.t(objArray);
          this.P.c(this.D);
       }
       ol = this.Q;
       if (ol != null) {
          ol.b();
       }
       return;
    }
    public final void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "19")) {
          return;
       }
       if (this.H.l()) {
          int i = (this.y != null)? 0x7f08121f: 0x7f08121e;
          this.C.setBackgroundResource(i);
          this.z.setBackgroundResource(i);
       }
       if (this.y != null) {
          this.C.setOnClickListener(objArray);
       }else {
          this.C.setOnClickListener(new f(this));
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, l.class, "5")) {
          return;
       }
       this.O.H6(this.S);
       this.K.gd(this.T);
       this.L.Km(this.U);
       d.a(-1397441499).HD(this.X);
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, l.class, "6")) {
          return;
       }
       this.O.Q0(this.S);
       this.K.fo(this.T);
       this.L.le(this.U);
       x.E(this.E);
       k1.n(this);
       d.a(-1397441499).T9(this.X);
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, l.class, "13")) {
          return;
       }
       if (this.N != null && this.F.getUser() != null) {
          this.N.w0(f.o(this.F.getUser()), LiveStreamClickType.TOP_AUTHOR_HEAD_PERSONAL_CARD, 1, false, 2);
       }
       return;
    }
    public void W8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "8")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       this.v.setText(p0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a1934);
       this.v = m1.f(p0, 0x7f0a195f);
       this.q = m1.f(p0, 0x7f0a18b1);
       this.w = m1.f(p0, 0x7f0a19ca);
       this.x = m1.f(p0, 0x7f0a1a23);
       this.p = m1.f(p0, 0x7f0a3fd0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.F = this.r8("LIVE_PHOTO");
       this.G = this.r8("LIVE_BASIC_CONTEXT");
       this.H = this.q8(a0.class);
       this.I = this.r8("LIVE_PLAY_LOGGER");
       this.J = this.r8("LIVE_LONG_CONNECTION");
       this.K = this.r8("LIVE_PLAY_CONFIG_SERVICE");
       this.L = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.M = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       this.N = this.q8(r0.class);
       this.O = this.q8(b.class);
       this.P = this.q8(c.class);
       return;
    }
}
