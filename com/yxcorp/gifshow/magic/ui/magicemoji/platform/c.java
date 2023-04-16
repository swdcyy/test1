package com.yxcorp.gifshow.magic.ui.magicemoji.platform.c;
import com.smile.gifmaker.mvps.presenter.a;
import java.lang.String;
import com.kwai.framework.abtest.f;
import lnc.a1;
import x4b.g;
import lnc.s6;
import o56.c;
import o56.a;
import xf6.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import w3b.p;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.yxcorp.gifshow.magic.ui.magicemoji.platform.a;
import erd.g;
import crd.b;
import eoc.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import j4b.k;
import x4b.i;
import j4b.l;
import x4b.j;
import s5b.b;
import q87.c;
import lnc.b9;
import java.util.Objects;
import com.yxcorp.gifshow.magic.ui.magicemoji.platform.AuthorFollowHelper;
import com.yxcorp.gifshow.magic.ui.magicemoji.platform.AuthorFollowHelper$AuthorFollowState;
import java.util.ArrayList;
import java.lang.Float;
import android.view.View;
import android.app.Activity;
import k2b.e0;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;
import android.widget.TextView;
import x4b.f;
import android.view.View$OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.model.MagicFaceExtraParams;
import com.yxcorp.gifshow.model.MagicFaceAuthor;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.j;
import android.view.ViewParent;
import android.view.ViewStub;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.utility.n;

public class c extends a	// class@001be9
{
    public ViewTreeObserver$OnGlobalLayoutListener A;
    public boolean B;
    public int C;
    public View r;
    public TextView s;
    public TextView t;
    public KwaiImageView u;
    public ViewStub v;
    public b w;
    public MagicEmojiPageConfig x;
    public AuthorFollowHelper y;
    public View z;
    public static final int D;

    static {
       float f = (f.a("hidePanelCloseButton"))? 15.00f: 44.00f;
       c.D = a1.e(f);
    }
    public void c(){
       int i;
       super();
       this.A = new g(this);
       this.B = false;
       if (a.a().c()) {
          i = (g.n0() < 5)? g.n0(): f.e("SpecialEffectsArtistnicknameAddfocusbuttononShootingpage");
       }else {
          i = f.e("SpecialEffectsArtistnicknameAddfocusbuttononShootingpage");
       }
       this.C = i;
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.Y8(p.e(this.x));
       this.X7(f.a(PanelShowEvent.class, new a(this)));
       this.X7(f.a(k.class, new i(this)));
       this.X7(f.a(l.class, new j(this)));
       Object[] objArray = new Object[0];
       b.D().w("AuthorSymbolPresenter", "onBind", objArray);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "4")) {
          return;
       }
       b9.a(this.w);
       this.V8();
       c ty = this.y;
       if (ty != null) {
          Objects.requireNonNull(ty);
          if (!PatchProxy.applyVoid(objArray, ty, AuthorFollowHelper.class, "6")) {
             Object[] objArray1 = new Object[0];
             b.D().w(ty.a, "onDestroy invoked", objArray1);
             ty.b = AuthorFollowHelper$AuthorFollowState.NOT_AVAILABLE;
             ty.c = objArray;
             ty.l.clear();
             ty.m.clear();
             ty.d = 0;
             ty.b();
             ty.a();
          }
       }
       return;
    }
    public final void R8(float p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "12")) {
          return;
       }
       uoc = this.r;
       if (uoc == null) {
          return;
       }
       uoc.setAlpha(p0);
       return;
    }
    public final void S8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "7")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       e0 activity = (this.getActivity() instanceof e0)? this.getActivity(): null;
       AuthorFollowHelper uAuthorFollo = new AuthorFollowHelper(p0, activity);
       this.y = uAuthorFollo;
       c tC = this.C;
       Objects.requireNonNull(uAuthorFollo);
       AuthorFollowHelper uAuthorFollo1 = AuthorFollowHelper.class;
       if (!PatchProxy.isSupport(uAuthorFollo1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tC), uAuthorFollo, uAuthorFollo1, "5")) {
          int i = 0;
          Object[] objArray = new Object[i];
          b.D().w(uAuthorFollo.a, "bindView invoked", objArray);
          uAuthorFollo.d = tC;
          if (tC < 1 || tC > 4) {
             PostUtils.D(uAuthorFollo.a, "Invalid mFollowStyleType: "+uAuthorFollo.d, new IllegalArgumentException());
          }
          if (!PatchProxy.isSupport(uAuthorFollo1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tC), uAuthorFollo, uAuthorFollo1, "13")) {
             int i2 = (tC == 1 || tC == 2)? a1.e(0x41f00000): a1.e(22.00f);
             ViewGroup$LayoutParams layoutParams = uAuthorFollo.e.getLayoutParams();
             layoutParams.width = i2;
             uAuthorFollo.e.setLayoutParams(layoutParams);
          }
          if (!PatchProxy.isSupport(uAuthorFollo1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tC), uAuthorFollo, uAuthorFollo1, "14")) {
             uAuthorFollo1 = 3;
             objArray = (tC == 1 || tC == uAuthorFollo1)? 1: 0;
             if (tC == 4 || tC == uAuthorFollo1) {
                i = 1;
             }
             int i1 = (objArray)? 0x7f080262: 0x7f080263;
             uAuthorFollo.e.setBackground(a1.f(i1));
             if (i) {
                i1 = (objArray)? 0x7f0f004c: 0x7f0f004d;
                uAuthorFollo.f().setAnimation(i1);
             }
             uAuthorFollo.e().clearColorFilter();
             uAuthorFollo.c().clearColorFilter();
             if (!objArray) {
                uAuthorFollo.e().setColorFilter(-1);
                if (i) {
                   uAuthorFollo.c().setColorFilter(-1);
                }else {
                   uAuthorFollo.d().setTextColor(-1);
                }
             }
          }
       }
    label_0114 :
       p0 = p0.findViewById(R.id.follow_panel_wrapper);
       p0.setTag(R.id.tag_view_refere, Integer.valueOf(284));
       p0.setOnClickListener(new f(this, p0));
       this.y.i(p.e(this.x));
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, c.class, "15")) {
          return;
       }
       c tz = this.z;
       if (tz != null) {
          tz.getViewTreeObserver().removeOnGlobalLayoutListener(this.A);
       }
       this.B = false;
       return;
    }
    public final boolean W8(){
       c tC = this.C;
       boolean b = (tC > null && tC <= 4)? true: false;
       return b;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, c.class, "13")) {
          return;
       }
       c tr = this.r;
       if (tr == null) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = tr.getLayoutParams();
       int d = c.D;
       int i = 0x7f0a0612;
       if (this.getActivity() != null) {
          this.z = this.getActivity().findViewById(i);
       }
       c tz = this.z;
       if (tz != null) {
          ViewGroup$LayoutParams layoutParams1 = tz.getLayoutParams();
          if (layoutParams1 instanceof ViewGroup$MarginLayoutParams) {
             d = d + layoutParams1.topMargin;
          }
       }
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams.topMargin = d;
       }
       this.r.setLayoutParams(layoutParams);
       return;
    }
    public final void Y8(MagicEmoji$MagicFace p0){
       MagicFaceAuthor mName;
       MagicFaceAuthor mImageUrls;
       MagicFaceAuthor mTitle;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "5")) {
          return;
       }
       c ty = this.y;
       if (ty != null) {
          ty.i(p0);
       }
       Object[] objArray = null;
       if (p0 != null) {
          p0 = p0.mExtraParams;
          if (p0 != null) {
             MagicFaceExtraParams mAuthor = p0.mAuthor;
             if (mAuthor != null) {
                mName = mAuthor.mName;
                mImageUrls = mAuthor.mImageUrls;
                mTitle = mAuthor.mTitle;
             label_0027 :
                c uoc1 = (!TextUtils.x(mName) && (!j.h(mImageUrls) && !TextUtils.x(mTitle)))? 1: null;
                if (uoc1) {
                   if (this.r == null && !PatchProxy.applyVoid(objArray, this, uoc, "6")) {
                      uoc1 = this.v;
                      if (uoc1 != null && uoc1.getParent() != null) {
                         this.r = this.v.inflate();
                         if (this.W8()) {
                            this.S8(this.r);
                         }
                      }else if(this.W8()){
                         View view = this.m8().findViewById(R.id.magic_author_layout_v2);
                         this.r = view;
                         this.S8(view);
                      }else {
                         this.r = this.m8().findViewById(0x7f0a29e3);
                      }
                      this.u = this.r.findViewById(0x7f0a29e9);
                      this.s = this.r.findViewById(0x7f0a29e8);
                      this.t = this.r.findViewById(0x7f0a29e7);
                   }
                   int i = 0x7f0a0612;
                   if (this.getActivity() != null) {
                      this.z = this.getActivity().findViewById(i);
                   }
                   this.X8();
                   if (!PatchProxy.applyVoid(objArray, this, uoc, "14") && this.B == null) {
                      uoc = this.z;
                      if (uoc != null) {
                         uoc.getViewTreeObserver().addOnGlobalLayoutListener(this.A);
                         this.B = true;
                      }
                   }
                   this.u.U(mImageUrls);
                   this.s.setText(mName);
                   this.t.setText(mTitle);
                   n.Y(this.r, 0, 0);
                   n.Y(this.r, 0, true);
                }else {
                   c tr = this.r;
                   if (tr == null) {
                      return;
                   }else {
                      n.Y(tr, 4, 0);
                   }
                }
                return;
             }
          }
       }
       mTitle = objArray;
       mName = mTitle;
       mImageUrls = mName;
       goto label_0027 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       if (this.W8()) {
          this.v = p0.findViewById(0x7f0a29e6);
          p0.findViewById(R.id.magic_author_stub).setVisibility(8);
       }else {
          this.v = p0.findViewById(0x7f0a29e5);
          p0.findViewById(R.id.magic_author_stub_v2).setVisibility(8);
       }
       this.r = null;
       this.y = null;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.x = this.t8("MAGIC_EMOJI_PAGE_CONFIG");
       return;
    }
}
