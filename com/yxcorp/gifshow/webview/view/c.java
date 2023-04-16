package com.yxcorp.gifshow.webview.view.c;
import ml8.d;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import ayc.b;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.YodaWebView;
import com.kwai.yoda.model.LaunchModel;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import android.widget.TextView;
import com.yxcorp.gifshow.webview.helper.StateListImageView;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPageButtonParams$Icon;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageButton;
import kyc.e;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPageButtonParams$IconImageUrl;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Integer;
import android.widget.RelativeLayout;
import com.yxcorp.utility.n;
import android.net.Uri;
import ekd.w0;
import com.kuaishou.webkit.WebView;
import lyc.a;
import uxc.a;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPageTitleParams;
import android.graphics.Color;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPageButtonParams;
import com.kwai.yoda.model.ButtonParams$PositionId;
import com.yxcorp.gifshow.webview.view.c$b;
import com.yxcorp.gifshow.webview.view.c$a;
import java.lang.Enum;
import android.widget.FrameLayout;
import java.util.Objects;
import android.content.res.ColorStateList;
import kyc.c;
import kyc.b;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import kyc.f;
import com.yxcorp.gifshow.webview.view.a;
import erd.g;
import kyc.a;
import kyc.d;

public class c implements d	// class@0017a5
{
    public WebView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public View g;
    public View h;
    public View i;
    public View j;
    public View k;
    public KwaiActionBar l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public b t;
    public String u;
    public a v;
    public b w;
    public boolean x;
    public boolean y;
    public boolean z;

    public void c(View p0,String p1){
       super();
       this.t = new b();
       this.x = true;
       this.doBindView(p0);
       this.u = p1;
    }
    public void a(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "17")) {
          return;
       }
       c tb = this.b;
       int i = 0;
       boolean b = (tb instanceof YodaWebView)? q.h(tb.getLaunchModel()): false;
       int i1 = 4;
       this.g.setVisibility(i1);
       this.c.setVisibility(i1);
       this.h.setVisibility(i1);
       this.d.setVisibility(i1);
       c tk = this.k;
       if (tk != null) {
          tk.setVisibility(i1);
       }
       this.e.setVisibility(i);
       this.i.setVisibility(i);
       tk = this.i;
       if (tk instanceof StateListImageView) {
          JsPageButtonParams$Icon bACK = JsPageButtonParams$Icon.BACK;
          tk.b(bACK.getStableDrawable(tk.getContext(), b));
          tk = this.i;
          c uoc = tk;
          uoc.d(bACK.getStableDrawable(tk.getContext(), b));
       }else if(tk instanceof ImageButton){
          tk.setImageDrawable(JsPageButtonParams$Icon.BACK.getStableDrawable(tk.getContext(), b));
       }
       this.f();
       e uoe = new e(this, p0);
       this.e.setOnClickListener(uoe);
       this.i.setOnClickListener(uoe);
       return;
    }
    public View b(){
       return this.i;
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.equals(this.u, "close");
    }
    public boolean d(){
       return this.n;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.l = m1.f(p0, 0x7f0a3f6a);
       this.h = m1.f(p0, 0x7f0a3660);
       this.e = m1.f(p0, 0x7f0a1748);
       this.i = m1.f(p0, 0x7f0a1716);
       this.f = m1.f(p0, 0x7f0a1730);
       this.j = m1.f(p0, 0x7f0a172f);
       this.k = m1.f(p0, 0x7f0a171c);
       this.d = m1.f(p0, 0x7f0a3661);
       this.g = m1.f(p0, 0x7f0a3643);
       this.c = m1.f(p0, 0x7f0a366d);
       return;
    }
    public final void e(StateListImageView p0,JsPageButtonParams$IconImageUrl p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "22")) {
          return;
       }
       if (p0 != null && p1 != null) {
          JsPageButtonParams$IconImageUrl mNormal = p1.mNormal;
          p1 = p1.mPressed;
          if (!PatchProxy.applyVoidTwoRefs(mNormal, p1, p0, StateListImageView.class, "7")) {
             if (TextUtils.x(mNormal) && TextUtils.x(p1)) {
                p0.c.setVisibility(4);
                p0.b.setVisibility(4);
             }else if(!TextUtils.x(mNormal)){
                p0.c.setVisibility(0);
                StateListImageView d = p0.d;
                if (d != null) {
                   p0.c.setPlaceHolderImage(d);
                   p0.c.setFailureImage(p0.d);
                }
                p0.c.L(mNormal);
             }
             if (!TextUtils.x(p1)) {
                p0.b.setVisibility(0);
                StateListImageView e = p0.e;
                if (e != null) {
                   p0.b.setPlaceHolderImage(e);
                   p0.b.setFailureImage(p0.e);
                }
                p0.b.L(p1);
             }
          }
       }
       return;
    }
    public void f(){
       this.n = false;
       this.o = false;
       this.p = false;
       this.q = false;
       this.r = false;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, c.class, "21")) {
          return;
       }
       this.m = false;
       this.f();
       this.r = false;
       return;
    }
    public void h(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "19")) {
          return;
       }
       this.l.setVisibility(p0);
       this.s = true;
       return;
    }
    public void i(){
       Drawable stableDrawab;
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       if (this.d()) {
          return;
       }
       c tb = this.b;
       int i = 0;
       boolean b = (tb instanceof YodaWebView)? q.h(tb.getLaunchModel()): false;
       this.i.setVisibility(i);
       c ti = this.i;
       if (ti instanceof ImageButton) {
          stableDrawab = (this.c())? JsPageButtonParams$Icon.CLOSE.getStableDrawable(n.d(this.i), b): JsPageButtonParams$Icon.BACK.getStableDrawable(n.d(this.i), b);
          ti.setImageDrawable(stableDrawab);
       }else if(ti instanceof StateListImageView){
          Drawable stableDrawab1 = (this.c())? JsPageButtonParams$Icon.CLOSE.getStableDrawable(n.d(this.i), b): JsPageButtonParams$Icon.BACK.getStableDrawable(n.d(this.i), b);
          ti.b(stableDrawab1);
          stableDrawab = (this.c())? JsPageButtonParams$Icon.CLOSE.getStableDrawable(n.d(this.i), b): JsPageButtonParams$Icon.BACK.getStableDrawable(n.d(this.i), b);
          ti.d(stableDrawab);
       }
       return;
    }
    public void j(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       Uri uri = w0.f(p0);
       if (uri != null && uri.isHierarchical()) {
          uri = w0.a(uri, "title");
          if (!TextUtils.x(uri) && !a.a(this.b)) {
             this.l.r(uri);
          }
       }
       return;
    }
    public void k(a p0){
       this.v = p0;
    }
    public void l(JsPageTitleParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "18")) {
          return;
       }
       this.l.r(p0.mTitle);
       if (!TextUtils.x(p0.mTitleTextColor)) {
          this.l.t(Color.parseColor(p0.mTitleTextColor));
       }
       if (!TextUtils.x(p0.mTitleBackgroundColor)) {
          try{
             this.l.setBackgroundColor(Color.parseColor(p0.mTitleBackgroundColor));
          }catch(java.lang.IllegalArgumentException e3){
             ExceptionHandler.handleCaughtException(e3);
          }
       }
    }
    public final void m(JsPageButtonParams p0,ButtonParams$PositionId p1,c$b p2){
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "10")) {
          return;
       }
       if (this.z != null) {
          return;
       }
       c tb = this.b;
       int i = 0;
       boolean b = (tb instanceof YodaWebView)? q.h(tb.getLaunchModel()): false;
       c uoc = PatchProxy.applyOneRefs(p1, this, c.class, "11");
       if (uoc != patchProxyRe) {
       }else {
          int i3 = c$a.a[p1.ordinal()];
          if (i3 != 1) {
             if (i3 != 2) {
                if (i3 != 3) {
                   if (i3 == 4) {
                      uoc = this.h;
                      if (uoc instanceof StateListImageView) {
                      }
                   }
                }else {
                   uoc = this.g;
                   if (uoc instanceof StateListImageView) {
                   }
                }
             }else {
                uoc = this.j;
                if (uoc instanceof StateListImageView) {
                }
             }
          }else {
             uoc = this.i;
             if (uoc instanceof StateListImageView) {
             }
          }
          uoc = null;
       }
       View$OnClickListener onClickListe = PatchProxy.applyOneRefs(p1, this, c.class, "12");
       if (onClickListe != patchProxyRe) {
       }else {
          int i2 = c$a.a[p1.ordinal()];
          if (i2 != 1) {
             if (i2 != 2) {
                if (i2 != 3) {
                   onClickListe = (i2 != 4)? null: this.d;
                }else {
                   onClickListe = this.c;
                }
             }else {
                onClickListe = this.f;
             }
          }else {
             onClickListe = this.e;
          }
       }
       if (uoc != null && onClickListe != null) {
          if (!p0.mShow.booleanValue()) {
             uoc.setVisibility(4);
             onClickListe.setVisibility(4);
             return;
          }else if(this.l.getVisibility()){
             this.l.setVisibility(i);
          }
          if (p1 == ButtonParams$PositionId.LEFT1 && (p0.mIcon == null && TextUtils.x(p0.mText))) {
             p0.mIcon = JsPageButtonParams$Icon.BACK;
          }
       label_00cf :
          if (JsPageButtonParams$Icon.isValid(p0.mIcon)) {
             onClickListe.setVisibility(4);
             uoc.setVisibility(i);
             if (p0.mIcon == JsPageButtonParams$Icon.CUSTOM && JsPageButtonParams$IconImageUrl.isValid(p0.mIconUrl)) {
                this.e(uoc, p0.mIconUrl);
             }else {
                uoc.b(p0.mIcon.getStableDrawable(uoc.getContext(), b));
                uoc.d(p0.mIcon.getStableDrawable(uoc.getContext(), b));
             }
          }else if(!TextUtils.x(p0.mText)){
             uoc.setVisibility(4);
             onClickListe.setVisibility(i);
             c uoc1 = this.t;
             Objects.requireNonNull(uoc1);
             if (!PatchProxy.applyVoidTwoRefs(p0, onClickListe, uoc1, b.class, "1")) {
                if (uoc1.a == null) {
                   uoc1.a = onClickListe.getTextColors();
                }
                onClickListe.setText(p0.mText);
                if (!TextUtils.isEmpty(p0.mTextColor)) {
                   try{
                      onClickListe.setTextColor(Color.parseColor(p0.mTextColor));
                   }catch(java.lang.Exception e0){
                   }
                }else {
                   b a = uoc1.a;
                   if (a != null) {
                      onClickListe.setTextColor(a);
                   }
                }
             }
          }else {
             onClickListe.setVisibility(4);
             uoc.setVisibility(4);
          }
       }
       return;
    }
    public void n(JsPageButtonParams p0,c$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "8")) {
          return;
       }
       this.m(p0, ButtonParams$PositionId.LEFT1, p1);
       return;
    }
    public void o(Activity p0,JsPageButtonParams p1,c$b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "14")) {
          return;
       }
       if (this.k == null) {
          return;
       }
       c tb = this.b;
       int i = 0;
       boolean b = (tb instanceof YodaWebView)? q.h(tb.getLaunchModel()): false;
       JsPageButtonParams mShow = p1.mShow;
       if (mShow == null) {
          mShow = Boolean.TRUE;
       }
       p1.mShow = mShow;
       if (mShow.booleanValue()) {
          this.k.setVisibility(i);
          this.k.setOnClickListener(new b(p1, p2, p0));
          if (p1.mIcon == null) {
             p1.mIcon = JsPageButtonParams$Icon.CLOSE;
          }
          JsPageButtonParams mIcon = p1.mIcon;
          if (mIcon == JsPageButtonParams$Icon.CUSTOM) {
             JsPageButtonParams mIconUrl = p1.mIconUrl;
             if (mIconUrl != null) {
                c tk = this.k;
                if (tk instanceof StateListImageView) {
                   tk.d = 0x7f080644;
                   tk.e = 0x7f080644;
                   this.e(tk, mIconUrl);
                }
             }
          }
          c tk1 = this.k;
          if (tk1 instanceof ImageButton) {
             tk1.setImageDrawable(mIcon.getStableDrawable(this.i.getContext(), b));
          }else if(tk1 instanceof StateListImageView){
             tk1.b(mIcon.getStableDrawable(this.i.getContext(), b));
             this.k.d(p1.mIcon.getStableDrawable(this.i.getContext(), b));
          }else {
             tk1.setVisibility(8);
          }
       }else {
          this.k.setVisibility(8);
       }
       return;
    }
    public void p(JsPageButtonParams p0,c$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "9")) {
          return;
       }
       this.m(p0, ButtonParams$PositionId.LEFT2, p1);
       return;
    }
    public void q(JsPageButtonParams p0,c$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "15")) {
          return;
       }
       this.m(p0, ButtonParams$PositionId.RIGHT1, p1);
       return;
    }
    public void r(JsPageButtonParams p0,c$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "16")) {
          return;
       }
       this.m(p0, ButtonParams$PositionId.RIGHT2, p1);
       return;
    }
    public void s(WebView p0){
       this.b = p0;
    }
    public void t(WebView p0,String p1,boolean p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, c.class, "3")) {
          return;
       }
       if (this.m == null && (!a.a(p0) && p2)) {
          if (TextUtils.n(Uri.decode(p0.getTitle()), Uri.decode(p1)) || TextUtils.m(Uri.decode(p1), p0.getTitle())) {
             this.l.r("");
          }else {
             this.l.r(p0.getTitle());
          }
       }
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p2), this, c.class, "7")) {
          c tw = this.w;
          if (tw != null && !tw.isDisposed()) {
             tw.dispose();
             this.w = null;
             if (!p2) {
                this.i();
             }
          }
          if (this.y != null && (p2 && !this.d())) {
             this.i.setVisibility(4);
          }
       }
    label_0092 :
       return;
    }
    public void u(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       int i = 4;
       if (this.p == null) {
          this.g.setVisibility(i);
          this.c.setVisibility(i);
       }
       if (this.q == null) {
          this.h.setVisibility(i);
          this.d.setVisibility(i);
       }
       if (!this.d()) {
          this.e.setVisibility(i);
          if (!TextUtils.n(this.u, "none") && this.x != null) {
             if (this.y != null) {
                this.w = t.timer(1, TimeUnit.SECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(new f(this), a.b);
             }else {
                this.i();
             }
          }
          c ti = this.i;
          a uoa = (TextUtils.n(this.u, "close"))? new a(p0): new d(this, p0);
          ti.setOnClickListener(uoa);
       }
       return;
    }
}
