package com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter$mPermissionHolder$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n7c.c;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.RecoUser;
import g7c.c;
import java.util.Objects;
import java.lang.Integer;
import k2b.f3;
import lnc.i3;
import java.lang.Number;
import k2b.e0;
import com.yxcorp.gifshow.pymk.PymkGuideCard;
import java.lang.CharSequence;
import android.widget.TextView;
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
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import lnc.a1;
import a7c.h;
import com.yxcorp.utility.n;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter$a;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import android.text.TextPaint;
import zf6.j;
import n7c.e;
import brd.t;
import com.yxcorp.gifshow.b;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter$e;
import com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter$f;
import erd.g;
import crd.b;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter$c;
import com.yxcorp.gifshow.pymk.element.PymkListContactItemPresenter$d;
import f7c.c;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class PymkListContactItemPresenter extends PresenterV2	// class@0016bb
{
    public View A;
    public RecoUser B;
    public c C;
    public g D;
    public h E;
    public BaseFragment F;
    public PymkGuideCard G;
    public boolean H;
    public final p I;
    public int p;
    public int q;
    public View r;
    public KwaiImageView s;
    public View t;
    public View u;
    public EmojiTextView v;
    public TextView w;
    public View x;
    public TextView y;
    public View z;

    public void PymkListContactItemPresenter(){
       super();
       this.p = 46;
       this.q = -1;
       this.I = s.c(PymkListContactItemPresenter$mPermissionHolder$2.INSTANCE);
    }
    public void E8(){
       c a;
       PymkListContactItemPresenter pymkListCont = PymkListContactItemPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, pymkListCont, "6")) {
          return;
       }
       this.H = c.f();
       PymkListContactItemPresenter tB = this.B;
       if (tB == null) {
          a.S("mRecoUser");
       }
       this.G = tB.mPymkGuideCard;
       if (!PatchProxy.applyVoid(objArray, this, pymkListCont, "7")) {
          tB = this.G;
          if (tB != null) {
             a = c.a;
             int i = this.S8();
             PymkListContactItemPresenter tF = this.F;
             if (tF == null) {
                a.S("mBaseFragment");
             }
             Objects.requireNonNull(a);
             c uoc = c.class;
             if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), tF, a, uoc, "2")) {
                a.p(tF, "page");
                f3 uof3 = f3.j("OPEN_CONTACTS_CARD");
                i3 oi3 = i3.f();
                oi3.c("portal", Integer.valueOf(i));
                uof3.m(oi3.e());
                uof3.h(tF);
             }
             PymkListContactItemPresenter tv = this.v;
             if (tv == null) {
                a.S("mNameTV");
             }
             tv.setText(tB.mTitle);
             tv = this.w;
             if (tv == null) {
                a.S("mDescTV");
             }
             tv.setText(tB.mSubTitle);
             tv = this.s;
             String str = "mAvatar";
             if (tv == null) {
                a.S(str);
             }
             a hierarchy = tv.getHierarchy();
             a.o(hierarchy, "mAvatar.hierarchy");
             hierarchy.L(objArray);
             if (k.d() && !TextUtils.x(tB.mDarkHeadUrl)) {
                tv = this.s;
                if (tv == null) {
                   a.S(str);
                }
                g.g(tv, tB.mDarkHeadUrl, HeadImageSize.ADJUST_BIG, objArray, objArray);
             }else if(!TextUtils.x(tB.mHeadUrl)){
                tv = this.s;
                if (tv == null) {
                   a.S(str);
                }
                g.g(tv, tB.mHeadUrl, HeadImageSize.ADJUST_BIG, objArray, objArray);
             }
             if (this.H != null) {
                this.W8();
                if (this.R8().d()) {
                   this.X8();
                }
             }else {
                this.V8();
             }
             if (!PatchProxy.applyVoid(objArray, this, pymkListCont, "11")) {
                pymkListCont = this.s;
                if (pymkListCont == null) {
                   a.S(str);
                }
                ViewGroup$LayoutParams layoutParams = pymkListCont.getLayoutParams();
                String str1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
                Objects.requireNonNull(layoutParams, str1);
                tB = this.t;
                String str2 = "mNameLayout";
                if (tB == null) {
                   a.S(str2);
                }
                ViewGroup$LayoutParams layoutParams1 = tB.getLayoutParams();
                Objects.requireNonNull(layoutParams1, str1);
                tF = this.u;
                if (tF == null) {
                   a.S("mDescLayout");
                }
                ViewGroup$LayoutParams layoutParams2 = tF.getLayoutParams();
                Objects.requireNonNull(layoutParams2, str1);
                if (this.H != null) {
                   layoutParams.height = a1.d(0x7f070539);
                   layoutParams.width = a1.d(0x7f070539);
                   layoutParams.leftMargin = a1.d(0x7f07028d);
                   layoutParams1.leftMargin = a1.d(0x7f07034b);
                   layoutParams2.leftMargin = a1.d(0x7f07034b);
                }else {
                   layoutParams.height = a1.d(0x7f070537);
                   layoutParams.width = a1.d(0x7f070537);
                   layoutParams.leftMargin = a1.d(0x7f0702ab);
                   layoutParams1.leftMargin = a1.d(0x7f070271);
                   layoutParams2.leftMargin = a1.d(0x7f070271);
                }
                PymkListContactItemPresenter ts = this.s;
                if (ts == null) {
                   a.S(str);
                }
                ts.setLayoutParams(layoutParams);
                pymkListCont = this.t;
                if (pymkListCont == null) {
                   a.S(str2);
                }
                pymkListCont.setLayoutParams(layoutParams1);
                pymkListCont = this.u;
                if (pymkListCont == null) {
                   a.S("mDescLayout");
                }
                pymkListCont.setLayoutParams(layoutParams2);
             }
             pymkListCont = this.E;
             if (pymkListCont == null) {
                a.S("mPymkParams");
             }
             int i1 = (pymkListCont.g())? 8: 0;
             View[] viewArray = new View[1];
             tv = this.A;
             if (tv == null) {
                a.S("mCloseBtn");
             }
             viewArray[0] = tv;
             n.Z(i1, viewArray);
          }
       }
       return;
    }
    public void P8(){
       String str;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PymkListContactItemPresenter.class, "12")) {
          return;
       }
       if (this.H != null && this.R8().d()) {
          str = "second_view";
       }else if(this.H != null){
          str = "view";
       }else {
          str = "open";
       }
       c a = c.a;
       int i = this.S8();
       PymkListContactItemPresenter tF = this.F;
       if (tF == null) {
          a.S("mBaseFragment");
       }
       a.a(str, i, tF);
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          this.R8().g(objArray, this.S8(), new PymkListContactItemPresenter$a(objArray, this));
       }
       return;
    }
    public final ContactPermissionHolder R8(){
       Object obj = PatchProxy.apply(null, this, PymkListContactItemPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.I.getValue();
    }
    public int S8(){
       return this.p;
    }
    public final void V8(){
       PymkListContactItemPresenter ty;
       TextPaint paint;
       if (PatchProxy.applyVoid(null, this, PymkListContactItemPresenter.class, "8")) {
          return;
       }
       String str = "mBtnContainer";
       boolean b = true;
       String str1 = "mBtn.paint";
       if (this.R8().d()) {
          ty = this.y;
          if (ty == null) {
             a.S("mBtn");
          }
          ty.setText(a1.p(R.string.arg_RES_7f1046e4));
          ty = this.y;
          if (ty == null) {
             a.S("mBtn");
          }
          paint = ty.getPaint();
          a.o(paint, str1);
          paint.setFakeBoldText(b);
          ty = this.y;
          if (ty == null) {
             a.S("mBtn");
          }
          PymkListContactItemPresenter ty1 = this.y;
          if (ty1 == null) {
             a.S("mBtn");
          }
          ty.setTextColor(j.d(ty1, R.color.arg_RES_7f061fbb));
          ty = this.x;
          if (ty == null) {
             a.S(str);
          }
          ty.setBackgroundResource(R.drawable.arg_RES_7f0801b6);
       }else {
          ty = this.y;
          if (ty == null) {
             a.S("mBtn");
          }
          PymkListContactItemPresenter ty2 = this.y;
          if (ty2 == null) {
             a.S("mBtn");
          }
          ty.setTextColor(j.d(ty2, R.color.arg_RES_7f061fc2));
          ty = this.y;
          if (ty == null) {
             a.S("mBtn");
          }
          ty.setText(a1.p(R.string.arg_RES_7f103ac5));
          ty = this.y;
          if (ty == null) {
             a.S("mBtn");
          }
          paint = ty.getPaint();
          a.o(paint, str1);
          paint.setFakeBoldText(b);
          ty = this.x;
          if (ty == null) {
             a.S(str);
          }
          ty.setBackgroundResource(R.drawable.arg_RES_7f0801c8);
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, PymkListContactItemPresenter.class, "9")) {
          return;
       }
       PymkListContactItemPresenter tr = this.r;
       if (tr == null) {
          a.S("mContacBg");
       }
       tr.setVisibility(0);
       boolean b = this.R8().d();
       PymkListContactItemPresenter ty = this.y;
       if (ty == null) {
          a.S("mBtn");
       }
       PymkListContactItemPresenter tx = this.x;
       if (tx == null) {
          a.S("mBtnContainer");
       }
       e.c(b, ty, tx);
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, PymkListContactItemPresenter.class, "10")) {
          return;
       }
       PymkListContactItemPresenter tq = this.q;
       if (tq != -1) {
          PymkListContactItemPresenter tv = this.v;
          if (tv == null) {
             a.S("mNameTV");
          }
          PymkListContactItemPresenter tw = this.w;
          if (tw == null) {
             a.S("mDescTV");
          }
          e.d(tq, tv, tw);
       }else {
          this.X7(b.f().map(new e()).observeOn(d.a).subscribe(new PymkListContactItemPresenter$e(this), PymkListContactItemPresenter$f.b));
       }
       return;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, PymkListContactItemPresenter.class, "5")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.contact_background);
       a.o(view, "ViewBindUtils.bindWidget¡­ R.id.contact_background\)");
       this.r = view;
       view = m1.f(p0, R.id.close);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.close\)");
       this.A = view;
       view = m1.f(p0, R.id.right_arrow);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.right_arrow\)");
       this.z = view;
       view = m1.f(p0, R.id.avatar);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.avatar\)");
       this.s = view;
       view = m1.f(p0, R.id.name);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.name\)");
       this.v = view;
       view = m1.f(p0, R.id.text);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.text\)");
       this.w = view;
       view = m1.f(p0, R.id.follow_button);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.follow_button\)");
       this.x = view;
       view = m1.f(p0, R.id.follow_text);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.follow_text\)");
       this.y = view;
       view = m1.f(p0, R.id.nameLayout);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.nameLayout\)");
       this.t = view;
       view = m1.f(p0, R.id.reco_text_layout);
       a.o(view, "ViewBindUtils.bindWidget¡­w, R.id.reco_text_layout\)");
       this.u = view;
       PymkListContactItemPresenter tx = this.x;
       if (tx == null) {
          a.S("mBtnContainer");
       }
       tx.setOnClickListener(new PymkListContactItemPresenter$b(this));
       p0.setOnClickListener(new PymkListContactItemPresenter$c(this));
       PymkListContactItemPresenter tA = this.A;
       if (tA == null) {
          a.S("mCloseBtn");
       }
       tA.setOnClickListener(new PymkListContactItemPresenter$d(this));
       tA = this.x;
       if (tA == null) {
          a.S("mBtnContainer");
       }
       tA.setVisibility(0);
       tA = this.z;
       if (tA == null) {
          a.S("mRightArrow");
       }
       tA.setVisibility(8);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PymkListContactItemPresenter.class, "4")) {
          return;
       }
       Object obj = this.q8(RecoUser.class);
       a.o(obj, "inject\(RecoUser::class.java\)");
       this.B = obj;
       obj = this.r8("PYMK_ACCESS_IDSITEM_CLICK_LISTENER");
       a.o(obj, "inject\(PymkAccessIds.ITEM_CLICK_LISTENER\)");
       this.C = obj;
       obj = this.r8("PYMK_ADAPTER");
       a.o(obj, "inject\(PymkAccessIds.PYMK_ADAPTER\)");
       this.D = obj;
       obj = this.t8("PYMK_ACCESS_IDSPYMK_PARAMS");
       a.m(obj);
       this.E = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.F = obj;
       return;
    }
}
