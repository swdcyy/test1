package com.yxcorp.gifshow.relation.pymk.kem.presenter.PymkDialogInfoEditItemPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.pymk.kem.presenter.PymkDialogInfoEditItemPresenter$mEventListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.response.dialog.PymkDialogItemViewResponse;
import kbc.b;
import k2b.f3;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import android.text.TextPaint;
import android.widget.TextView;
import com.yxcorp.gifshow.pymk.PymkGuideCard;
import java.lang.CharSequence;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import zf6.k;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ub.b;
import com.yxcorp.image.callercontext.a;
import wb5.g;
import com.kuaishou.krn.event.a;
import oj0.a;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.content.Context;
import com.yxcorp.gifshow.util.rx.RxBus;
import cx5.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import lbc.h;
import erd.g;
import eda.q;
import lbc.i;
import tkd.b;
import tkd.d;
import gx5.c;
import lnc.a1;
import android.content.res.ColorStateList;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.yxcorp.gifshow.relation.pymk.kem.presenter.PymkDialogInfoEditItemPresenter$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.pymk.kem.presenter.PymkDialogInfoEditItemPresenter$b;
import java.util.Map;

public final class PymkDialogInfoEditItemPresenter extends PresenterV2	// class@001949
{
    public final p A;
    public KwaiImageView p;
    public EmojiTextView q;
    public TextView r;
    public View s;
    public TextView t;
    public PymkDialogItemViewResponse u;
    public Map v;
    public PymkGuideCard w;
    public b x;
    public b y;
    public int z;

    public void PymkDialogInfoEditItemPresenter(){
       super();
       this.A = s.c(PymkDialogInfoEditItemPresenter$mEventListener$2.INSTANCE);
    }
    public void E8(){
       PymkDialogInfoEditItemPresenter pymkDialogIn = PymkDialogInfoEditItemPresenter.class;
       if (PatchProxy.applyVoid(null, this, pymkDialogIn, "4")) {
          return;
       }
       PymkDialogInfoEditItemPresenter tu = this.u;
       if (tu == null) {
          a.S("mItemResponse");
       }
       this.w = tu.mPymkGuideCard;
       if (!PatchProxy.applyVoid(null, this, pymkDialogIn, "6")) {
          pymkDialogIn = this.w;
          if (pymkDialogIn != null) {
             if (!PatchProxy.applyVoid(null, null, b.class, "17")) {
                f3 uof3 = f3.j("PROFILE_FILL_CARD");
                i3 oi3 = i3.f();
                oi3.c("portal", Integer.valueOf(44));
                uof3.m(oi3.e());
                uof3.g();
             }
             tu = this.q;
             String str = "mNameTV";
             if (tu == null) {
                a.S(str);
             }
             TextPaint paint = tu.getPaint();
             a.o(paint, "mNameTV.paint");
             paint.setFakeBoldText(true);
             tu = this.q;
             if (tu == null) {
                a.S(str);
             }
             tu.setText(pymkDialogIn.mTitle);
             tu = this.r;
             if (tu == null) {
                a.S("mDescTV");
             }
             tu.setText(pymkDialogIn.mSubTitle);
             tu = this.p;
             str = "mAvatar";
             if (tu == null) {
                a.S(str);
             }
             a hierarchy = tu.getHierarchy();
             a.o(hierarchy, "mAvatar.hierarchy");
             hierarchy.L(RoundingParams.a());
             if (k.d() && !TextUtils.x(pymkDialogIn.mDarkHeadUrl)) {
                tu = this.p;
                if (tu == null) {
                   a.S(str);
                }
                g.g(tu, pymkDialogIn.mDarkHeadUrl, HeadImageSize.MIDDLE, null, null);
             }else if(!TextUtils.x(pymkDialogIn.mHeadUrl)){
                tu = this.p;
                if (tu == null) {
                   a.S(str);
                }
                g.g(tu, pymkDialogIn.mHeadUrl, HeadImageSize.MIDDLE, null, null);
             }
             this.S8();
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, PymkDialogInfoEditItemPresenter.class, "5")) {
          return;
       }
       a.b().c("KRNSocialProfileRefreshEvent", this.P8());
       b[] uobArray = new b[]{this.x,this.y};
       b9.b(uobArray);
       return;
    }
    public final a P8(){
       Object obj = PatchProxy.apply(null, this, PymkDialogInfoEditItemPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.A.getValue();
    }
    public final void R8(View p0){
       PymkDialogInfoEditItemPresenter pymkDialogIn = PymkDialogInfoEditItemPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, pymkDialogIn, "8")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, pymkDialogIn, "9")) {
          Context context = this.getContext();
          if (context != null) {
             a.o(context, "context ?: return");
             pymkDialogIn = this.w;
             if (pymkDialogIn != null && (pymkDialogIn.mIsNameEmpty != null || pymkDialogIn.mIsHeadEmpty != null)) {
                b[] uobArray = new b[]{this.x,this.y};
                b9.b(uobArray);
                if (pymkDialogIn.mIsHeadEmpty != null) {
                   this.x = RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).subscribe(new h(this));
                }
                if (pymkDialogIn.mIsNameEmpty != null) {
                   a.b().a("KRNSocialProfileRefreshEvent", this.P8());
                   this.y = RxBus.f.g(q.class, RxBus$ThreadMode.MAIN).subscribe(new i(this));
                }
                d.a(0x763547f8).Sf(context, pymkDialogIn, 44);
             }
          }
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, PymkDialogInfoEditItemPresenter.class, "7")) {
          return;
       }
       PymkDialogInfoEditItemPresenter tw = this.w;
       if (tw != null) {
          String str = "mBtnContainer";
          if (tw.mIsNameEmpty == null && tw.mIsHeadEmpty == null) {
             tw = this.t;
             if (tw == null) {
                a.S("mBtn");
             }
             boolean b = true;
             tw.setSelected(b);
             tw = this.s;
             if (tw == null) {
                a.S(str);
             }
             tw.setSelected(b);
             tw = this.t;
             if (tw == null) {
                a.S("mBtn");
             }
             tw.setText(a1.p(R.string.arg_RES_7f103c4e));
             tw = this.t;
             if (tw == null) {
                a.S("mBtn");
             }
             TextPaint paint = tw.getPaint();
             a.o(paint, "mBtn.paint");
             paint.setFakeBoldText(b);
             tw = this.t;
             if (tw == null) {
                a.S("mBtn");
             }
             tw.setTextColor(ColorStateList.valueOf(a1.a(R.color.arg_RES_7f060a3d)));
          }else {
             tw = this.t;
             if (tw == null) {
                a.S("mBtn");
             }
             tw.setText(a1.p(R.string.arg_RES_7f100912));
             tw = this.t;
             if (tw == null) {
                a.S("mBtn");
             }
             tw.setSelected(false);
             tw = this.s;
             if (tw == null) {
                a.S(str);
             }
             tw.setSelected(false);
          }
       }
       return;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, PymkDialogInfoEditItemPresenter.class, "3")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.avatar);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.avatar\)");
       this.p = view;
       view = m1.f(p0, R.id.name);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.name\)");
       this.q = view;
       view = m1.f(p0, R.id.detail);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.detail\)");
       this.r = view;
       view = m1.f(p0, R.id.follow_button);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.follow_button\)");
       this.s = view;
       view = m1.f(p0, R.id.follow_text);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.follow_text\)");
       this.t = view;
       PymkDialogInfoEditItemPresenter ts = this.s;
       if (ts == null) {
          a.S("mBtnContainer");
       }
       ts.setOnClickListener(new PymkDialogInfoEditItemPresenter$a(this));
       p0.setOnClickListener(new PymkDialogInfoEditItemPresenter$b(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PymkDialogInfoEditItemPresenter.class, "2")) {
          return;
       }
       Object obj = this.q8(PymkDialogItemViewResponse.class);
       a.o(obj, "inject\(PymkDialogItemViewResponse::class.java\)");
       this.u = obj;
       obj = this.r8("ADAPTER_POSITION");
       a.o(obj, "inject\(PageAccessIds.ADAPTER_POSITION\)");
       this.z = obj.intValue();
       obj = this.r8("EXTRAS");
       a.o(obj, "inject\(PageAccessIds.EXTRAS\)");
       this.v = obj;
       return;
    }
}
