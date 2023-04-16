package com.yxcorp.gifshow.relation.intimate.dialog.r;
import com.yxcorp.gifshow.relation.intimate.dialog.k;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import com.kwai.user.base.intimate.b;
import com.yxcorp.gifshow.model.IntimateRelationInfo;
import lnc.a1;
import e17.i;
import cbc.b;
import java.lang.Integer;
import java.lang.Boolean;
import k2b.e0;
import com.yxcorp.gifshow.relation.intimate.helper.i;
import erd.g;
import xac.s;
import brd.t;
import com.yxcorp.gifshow.relation.intimate.helper.g;
import erd.o;
import bbc.e;
import com.yxcorp.gifshow.relation.intimate.helper.c;
import crd.b;
import android.widget.TextView;
import android.view.View;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.kwai.library.widget.popup.common.c;
import lnc.i3;
import k2b.f3;
import com.kwai.robust.PatchProxyResult;

public class r extends k	// class@001902
{

    public void r(GifshowActivity p0,IntimateRelationDialogParams p1,PopupInterface$h p2){
       super(p0, p1, p2);
       this.k = this.i.mEnableProfileShow;
    }
    public void A(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, r.class, "1")) {
          return;
       }
       if (TextUtils.x(this.i.mTargetId)) {
          return;
       }
       k tn = this.n;
       e ti = this.i;
       if (tn == ti.mCurrentIntimateType) {
          i.d(R.style.arg_RES_7f11066a, a1.r(R.string.arg_RES_7f101782, b.a(0x40193068).c(this.n).mName));
          return;
       }else {
          e tk = this.k;
          IntimateRelationDialogParams mTargetId = ti.mTargetId;
          e tg = this.g;
          if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(tn), Boolean.valueOf(tk), mTargetId, tg, null, b.class, "1")) {
             b.m(tn, "APPLY", tk, mTargetId, "switch", tg, false);
          }
          ti = this.i;
          e tk1 = this.k;
          k tn1 = this.n;
          i oi = i.class;
          if (PatchProxy.isSupport(oi)) {
             Object[] objArray1 = new Object[]{ti,Boolean.valueOf(tk1),Integer.valueOf(tn1),objArray,objArray};
             if (!PatchProxy.applyVoid(objArray1, objArray, oi, "2")) {
             label_009d :
                if (i.f(objArray)) {
                   b.a(-1334121008).g(ti.mTargetId, tk1, tn1, ti.mSource).map(g.b).subscribe(new e(ti, objArray), new c(ti, objArray));
                }
             }
          }else {
             goto label_009d ;
          }
          this.c(11);
          return;
       }
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, r.class, "2")) {
          return;
       }
       e tf = this.f;
       if (tf != null && this.p != null) {
          k tn = this.n;
          if (tn > null && tn != this.i.mCurrentIntimateType) {
             tf.setAlpha(0x3f800000);
             this.p.setAlpha(0x3f800000);
             this.p.setEnabledClick(true);
          }else {
             tf.setAlpha(0x3f000000);
             this.p.setAlpha(0x3f000000);
             this.p.setEnabledClick(false);
          }
       }
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, r.class, "5")) {
          return;
       }
       super.q();
       b.e(this.n, this.k, this.i.mTargetId, this.g);
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, r.class, "4")) {
          return;
       }
       super.r();
       b.e(this.n, this.k, this.i.mTargetId, this.g);
       return;
    }
    public void s(c p0,int p1){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, or, "7")) {
          return;
       }
       super.s(p0, p1);
       if (p1 && p1 != 11) {
          k tn = this.n;
          e tk = this.k;
          IntimateRelationDialogParams mTargetId = this.i.mTargetId;
          e tg = this.g;
          if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(tn), Boolean.valueOf(tk), mTargetId, tg, null, b.class, "2")) {
             b.m(tn, "CLOSE", tk, mTargetId, "switch", tg, false);
          }
       }
       return;
    }
    public void u(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "6")) {
          return;
       }
       e tg = this.g;
       IntimateRelationDialogParams mTargetId = this.i.mTargetId;
       if (!PatchProxy.applyVoidTwoRefs(tg, mTargetId, null, b.class, "10")) {
          i3 oi3 = i3.f();
          oi3.d("invite_type", "switch");
          oi3.d("to_uid", mTargetId);
          f3 uof3 = f3.j("RELATIONSHIP_SELECTION_POPUP");
          uof3.m(oi3.e());
          uof3.h(tg);
       }
       return;
    }
    public boolean z(){
       Object obj = PatchProxy.apply(null, this, r.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.i.mEnableChangeToday != null) {
          return true;
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f101702);
       b.n(this.i.mTargetId, this.g);
       this.d();
       return false;
    }
}
