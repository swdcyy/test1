package com.yxcorp.gifshow.relation.intimate.dialog.i;
import com.yxcorp.gifshow.relation.intimate.dialog.k;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.relation.intimate.dialog.g;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams$ToastInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i;
import cbc.b;
import java.lang.Integer;
import java.lang.Boolean;
import k2b.e0;
import android.widget.TextView;
import com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideConfig;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.content.res.Resources;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.relation.intimate.helper.i;
import erd.g;
import wkd.b;
import xac.s;
import brd.t;
import com.yxcorp.gifshow.relation.intimate.helper.g;
import erd.o;
import bbc.d;
import com.yxcorp.gifshow.relation.intimate.helper.b;
import crd.b;
import com.yxcorp.gifshow.model.IntimateRelationInfo;
import mu7.e;
import java.lang.StringBuilder;
import lnc.a1;
import java.util.ArrayList;
import a17.g;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import a17.c$a;
import java.util.List;
import abc.m;
import a17.b$b;
import com.kwai.library.widget.popup.common.c$b;
import a17.f;
import com.yxcorp.gifshow.relation.intimate.dialog.i$a;
import com.kwai.robust.PatchProxyResult;
import bld.b;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.view.View;
import v6d.a;
import xf6.i;
import ekd.m1;
import android.view.ViewGroup;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import android.widget.LinearLayout$LayoutParams;
import com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideBannerView;
import android.content.Context;
import com.yxcorp.gifshow.relation.intimate.dialog.h;
import com.yxcorp.gifshow.widget.banner.LoopBannerView$a;
import android.view.ViewGroup$LayoutParams;
import abc.n;
import android.view.View$OnClickListener;
import abc.o;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView;
import abc.l;
import abc.q;

public class i extends k	// class@0018f3
{
    public TextView A;
    public IntimateGuideBannerView B;
    public boolean s;
    public final x t;
    public ViewGroup u;
    public ViewGroup v;
    public KwaiImageView w;
    public boolean x;
    public IntimateGuideConfig y;
    public final boolean z;

    public void i(GifshowActivity p0,IntimateRelationDialogParams p1,PopupInterface$h p2){
       super(p0, p1, p2);
       boolean b = true;
       this.s = b;
       this.t = Suppliers.a(g.b);
       this.x = false;
       IntimateRelationDialogParams mToastInfo = this.i.mToastInfo;
       if (mToastInfo == null || TextUtils.x(mToastInfo.mMsg)) {
          b = false;
       }
       this.z = b;
       return;
    }
    public static void C(i p0,c p1,int p2){
       super.s(p1, p2);
    }
    public static void D(i p0,c p1,int p2){
       super.s(p1, p2);
    }
    public void A(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "6")) {
          return;
       }
       if (this.z != null) {
          this.G();
          return;
       }else {
          k tn = this.n;
          if (tn < null) {
             i.a(R.style.arg_RES_7f11066a, 0x7f10177e);
          }else {
             e tk = this.k;
             e ti = this.i;
             IntimateRelationDialogParams mTargetId = ti.mTargetId;
             e tg = this.g;
             IntimateRelationDialogParams mCanRebuild = ti.mCanRebuild;
             b uob = b.class;
             if (PatchProxy.isSupport(uob)) {
                Object[] objArray1 = new Object[]{Integer.valueOf(tn),Boolean.valueOf(tk),mTargetId,tg,Boolean.valueOf(mCanRebuild),Boolean.FALSE};
                if (PatchProxy.applyVoid(objArray1, objArray, uob, "4")) {
                label_006e :
                   this.F();
                }
             }
             String str = (mCanRebuild != null)? "rebuild": "new";
             b.m(tn, "APPLY", tk, mTargetId, str, tg, false);
             goto label_006e ;
          }
          return;
       }
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, i.class, "11")) {
          return;
       }
       e tf = this.f;
       if (tf == null) {
          return;
       }
       if (this.z != null) {
          tf.setAlpha(0x3f000000);
          return;
       }else if(this.n > null){
          tf.setAlpha(0x3f800000);
       }else {
          tf.setAlpha(0x3f000000);
       }
       return;
    }
    public void E(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "9")) {
          return;
       }
       if (p0) {
          IntimateGuideConfig mBgUrl = this.y.mBgUrl;
          if (!TextUtils.x(mBgUrl)) {
             this.w.M(mBgUrl, null);
          }
       }else {
          this.w.setImageDrawable(this.g.getResources().getDrawable(R.drawable.arg_RES_7f0802db));
       }
       return;
    }
    public final void F(){
       if (PatchProxy.applyVoid(null, this, i.class, "14")) {
          return;
       }
       if (TextUtils.x(this.i.mTargetId)) {
          return;
       }
       e ti = this.i;
       e tk = this.k;
       k tn = this.n;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{ti,Boolean.valueOf(tk),Integer.valueOf(tn),null,null};
          if (!PatchProxy.applyVoid(objArray, null, oi, "1")) {
          label_0048 :
             if (i.f(null)) {
                b.a(-1334121008).o(ti.mTargetId, tk, tn, ti.mSource).map(g.b).subscribe(new d(ti, null), new b(ti, null));
             }
          }
       }else {
          goto label_0048 ;
       }
       this.c(11);
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, i.class, "21")) {
          return;
       }
       IntimateRelationDialogParams mToastInfo = this.i.mToastInfo;
       if (mToastInfo != null && !TextUtils.x(mToastInfo.mMsg)) {
          i.d(R.style.arg_RES_7f11066a, this.i.mToastInfo.mMsg);
       }
       return;
    }
    public final void H(){
       int i;
       IntimateRelationDialogParams mTargetName;
       if (PatchProxy.applyVoid(null, this, i.class, "19")) {
          return;
       }
       e ti = this.i;
       int relationCoun = ti.getRelationCount(ti.mIntimateType);
       e th = this.h;
       IntimateRelationInfo mUpperLimit = th.mUpperLimit;
       if (mUpperLimit > null && relationCoun >= mUpperLimit) {
          i.d(R.style.arg_RES_7f11066a, i.e(th.mName, relationCoun));
          this.d();
          return;
       }else {
          String str = b.a(-1878684066).a(this.i.mTargetId);
          if (TextUtils.x(str)) {
             str = this.i.mTargetName;
          }
          str = TextUtils.I(str);
          i = 10;
          if (str.length() > i) {
             str = TextUtils.A(str, i)+"...";
          }
          String str1 = a1.p(R.string.arg_RES_7f10172a);
          Object[] objArray = new Object[2];
          int i1 = 0;
          if (TextUtils.x(str)) {
             mTargetName = this.i.mTargetName;
          }
          objArray[i1] = mTargetName;
          objArray[1] = this.h.mName;
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(new g(a1.p(R.string.arg_RES_7f1007e2), SheetItemStatus.Highlight));
          c$a uoa = new c$a(this.g);
          uoa.j0(uArrayList);
          uoa.n0(String.format(str1, objArray));
          uoa.h0(a1.p(R.string.cancel));
          uoa.i0(new m(this));
          uoa.p();
          f.a(uoa).Y(new i$a(this));
          return;
       }
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, i.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.z() && this.y())? true: false;
       return b;
    }
    public Drawable e(int p0){
       b obj;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oi, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.x != null) {
          p0 = a1.a(R.color.arg_RES_7f0604b2);
       }
       obj = new b();
       obj.s(DrawableCreator$Shape.Oval);
       obj.v(p0);
       return obj.a();
    }
    public int f(){
       return 0x7f0d0640;
    }
    public void n(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "3")) {
          return;
       }
       if (this.x != null) {
          return;
       }
       super.n(p0, p1);
       return;
    }
    public void p(View p0){
       boolean b;
       String str;
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oi, "1")) {
          return;
       }
       Object[] objArray = null;
       IntimateRelationDialogParams obj = PatchProxy.apply(objArray, this, oi, "12");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          e ti = this.i;
          b = (ti.mEnableIntimateEntranceIntensify != null && (ti.mNeedShowGuide != null && (!a.g() || i.c("ENABLE_SHOW_INTIMATE_GUIDE_FORCE"))))? true: false;
       }
       if (b) {
          this.x = true;
       }
       super.p(p0);
       this.A = m1.f(p0, 0x7f0a3bd1);
       this.w = m1.f(p0, 0x7f0a0b5b);
       this.u = m1.f(p0, 0x7f0a3553);
       this.v = m1.f(p0, 0x7f0a355c);
       if (!PatchProxy.applyVoidOneRefs(p0, this, oi, "7")) {
          this.y = a.t().getValue("intimateGuideConfig", IntimateGuideConfig.class, objArray);
          this.E(true);
          obj = (!TextUtils.x(this.i.mTitle))? this.i.mTitle: a1.p(R.string.arg_RES_7f100d94);
          this.o(p0, obj);
          IntimateGuideBannerView intimateGuid = new IntimateGuideBannerView(p0.getContext(), this.y, new h(this));
          this.B = intimateGuid;
          this.u.addView(intimateGuid, new LinearLayout$LayoutParams(-1, -1));
          if (!PatchProxy.applyVoid(objArray, this, oi, "8")) {
             TextView textView = m1.f(this.u, R.id.left_btn);
             TextView textView1 = m1.f(this.u, R.id.right_btn);
             if (this.z != null) {
                textView1.setAlpha(0x3f000000);
             }
             textView.setOnClickListener(new n(this));
             textView1.setOnClickListener(new o(this));
          }
          a.m(true);
       }
       if (this.x != null) {
          n.Y(this.v, 4, true);
          n.Y(this.u, 0, true);
       }else {
          e tb = this.b;
          IntimateRelationDialogParams mTitle = (!TextUtils.x(this.i.mTitle))? this.i.mTitle: a1.p(R.string.arg_RES_7f104611);
          this.o(tb, mTitle);
          n.Y(this.v, 0, true);
          n.Y(this.u, 4, true);
       }
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       super.q();
       e ti = this.i;
       b.c(this.n, this.k, ti.mTargetId, this.g, ti.mCanRebuild, this.x);
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       super.r();
       e ti = this.i;
       b.c(this.n, this.k, ti.mTargetId, this.g, ti.mCanRebuild, this.x);
       return;
    }
    public void s(c p0,int p1){
       String str;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oi, "18")) {
          return;
       }
       super.s(p0, p1);
       if (p1 && p1 != 11) {
          k tn = this.n;
          e tk = this.k;
          e ti = this.i;
          IntimateRelationDialogParams mTargetId = ti.mTargetId;
          e tg = this.g;
          IntimateRelationDialogParams mCanRebuild = ti.mCanRebuild;
          i tx = this.x;
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             Object[] objArray = new Object[]{Integer.valueOf(tn),Boolean.valueOf(tk),mTargetId,tg,Boolean.valueOf(mCanRebuild),Boolean.valueOf(tx)};
             if (!PatchProxy.applyVoid(objArray, null, uob, "5")) {
             }
          }else if(mCanRebuild != null){
             str = "rebuild";
          }else {
             str = "new";
          }
          b.m(tn, "CLOSE", tk, mTargetId, str, tg, tx);
       }
    label_0070 :
       return;
    }
    public void u(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "17")) {
          return;
       }
       e ti = this.i;
       b.k(this.g, this.x, ti.mCanRebuild, ti.mTargetId);
       return;
    }
    public void v(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "16")) {
          return;
       }
       this.B.setMDisableAutoScroll(false);
       this.B.m();
       this.G();
       return;
    }
    public boolean z(){
       i oi = i.class;
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, oi, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       SheetItemStatus sheetItemSta = 0x7f11066a;
       if (this.s != null) {
          obj = this.i;
          if (obj.mHasInvited != null) {
             if (obj.mEnableInviteToday != null) {
                if (!PatchProxy.applyVoid(objArray, this, oi, "20")) {
                   ArrayList uArrayList = new ArrayList();
                   uArrayList.add(new g(a1.p(R.string.arg_RES_7f1007e2), SheetItemStatus.Highlight));
                   c$a uoa = new c$a(this.g);
                   uoa.j0(uArrayList);
                   uoa.l0(R.string.arg_RES_7f101701);
                   uoa.h0(a1.p(R.string.cancel));
                   uoa.i0(new l(this));
                   uoa.p();
                   c$a uoa1 = f.a(uoa);
                   uoa1.Y(new q(this));
                }
             }else if(this.z != null){
                return true;
             }else {
                i.a(sheetItemSta, R.string.arg_RES_7f101700);
                b.n(this.i.mTargetId, this.g);
                this.d();
             }
             return false;
          }
       }
       e ti = this.i;
       IntimateRelationDialogParams mIntimateTyp = ti.mIntimateType;
       if (mIntimateTyp > null) {
          int relationCoun = ti.getRelationCount(mIntimateTyp);
          e th = this.h;
          IntimateRelationInfo mUpperLimit = th.mUpperLimit;
          if (mUpperLimit > null && relationCoun >= mUpperLimit) {
             i.d(sheetItemSta, i.e(th.mName, relationCoun));
             this.d();
             return false;
          }else if(!this.t.get().booleanValue() && this.i.mEnableIntimateEntranceIntensify == null){
             this.H();
             return false;
          }
       }
       return true;
    }
}
