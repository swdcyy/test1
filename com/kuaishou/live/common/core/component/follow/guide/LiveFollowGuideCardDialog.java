package com.kuaishou.live.common.core.component.follow.guide.LiveFollowGuideCardDialog;
import ml8.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import java.util.ArrayList;
import rg1.d;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.follow.LiveFollowGuideExtraInfoResponse;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import java.util.List;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import androidx.fragment.app.DialogFragment;
import va1.b0;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.utility.n;
import va1.l0;
import rg1.f;
import java.lang.Number;
import java.util.Objects;
import rg1.f$a;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.UserVerifiedDetail;
import android.widget.ImageView;
import b61.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import java.lang.Math;
import com.kuaishou.live.core.show.follow.LiveFollowGuideExtraInfoResponse$Label;
import android.graphics.drawable.Drawable;
import lnc.a1;
import d61.k;
import rg1.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.live.common.core.component.follow.guide.LiveFollowGuideCardDialog$a;
import android.view.View$OnClickListener;

public class LiveFollowGuideCardDialog extends LiveSafeDialogFragment implements d	// class@001109
{
    public final List A;
    public UserInfo B;
    public String C;
    public String D;
    public d E;
    public List F;
    public String G;
    public KwaiImageView s;
    public KwaiImageView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public View x;
    public TextView y;
    public TextView z;

    public void LiveFollowGuideCardDialog(){
       super();
       this.A = new ArrayList();
    }
    public static LiveFollowGuideCardDialog wh(d p0,UserInfo p1,LiveFollowGuideExtraInfoResponse p2,String p3,String p4){
       LiveFollowGuideCardDialog obj;
       if (PatchProxy.isSupport(LiveFollowGuideCardDialog.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, null, LiveFollowGuideCardDialog.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LiveFollowGuideCardDialog();
       obj.E = p0;
       obj.B = p1;
       obj.C = p3;
       obj.D = p4;
       if (p2 != null) {
          obj.F = p2.mLabels;
       }
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFollowGuideCardDialog.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a1ce2);
       this.t = m1.f(p0, 0x7f0a1ce7);
       this.u = m1.f(p0, 0x7f0a1ce6);
       this.v = m1.f(p0, 0x7f0a1ce5);
       this.w = m1.f(p0, 0x7f0a1ce3);
       this.x = m1.f(p0, 0x7f0a1ce8);
       this.y = m1.f(p0, 0x7f0a1ce9);
       this.z = m1.f(p0, 0x7f0a1cea);
       this.A.add(this.y);
       this.A.add(this.z);
       this.A.add(m1.f(p0, R.id.live_follow_guide_label_third));
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveFollowGuideCardDialog.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       boolean b = true;
       uDialog.setCanceledOnTouchOutside(b);
       uDialog.setCancelable(b);
       Window window = uDialog.getWindow();
       if (window != null) {
          window.setBackgroundDrawableResource(R.color.arg_RES_7f062030);
          window.requestFeature(b);
          window.setGravity(85);
          window.setDimAmount(0);
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveFollowGuideCardDialog.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0b13, p1, false);
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveFollowGuideCardDialog.class, "6")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog == null) {
          return;
       }
       if (dialog.getWindow() != null) {
          if (b0.a()) {
             dialog.getWindow().setLayout(n.j(ActivityContext.g().e()), -2);
          }else {
             dialog.getWindow().setLayout(-1, -2);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       TextView obj;
       int i1;
       int i2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveFollowGuideCardDialog.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveFollowGuideCardDialog.class, "7")) {
          LiveFollowGuideCardDialog tB = this.B;
          int i = 8;
          if (tB != null) {
             l0.b(this.s, tB);
             tB = this.B;
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             String str = "1";
             obj = PatchProxy.applyOneRefs(tB, objArray, f.class, str);
             String str1 = -1;
             if (obj != patchProxyRe) {
                i1 = obj.intValue();
             }else {
                f$a a = f.a;
                Objects.requireNonNull(a);
                Object obj1 = PatchProxy.applyOneRefs(tB, a, f$a.class, str);
                if (obj1 != patchProxyRe) {
                   i1 = obj1.intValue();
                }else {
                   a.p(tB, "userInfo");
                   UserInfo mVerifiedDet = tB.mVerifiedDetail;
                   if (mVerifiedDet != null) {
                      UserVerifiedDetail mIconType = mVerifiedDet.mIconType;
                      if (mIconType != 1) {
                         if (mIconType != 2) {
                            if (mIconType == 3) {
                               i1 = 0x7f0814b1;
                            }
                         }else {
                            i1 = 0x7f0814af;
                         }
                      }else {
                         i1 = 0x7f0814b0;
                      }
                   }
                   i1 = -1;
                }
             }
             if (i1 != str1) {
                this.t.setImageResource(i1);
                this.t.setVisibility(0);
             }else {
                this.t.setVisibility(i);
             }
             this.u.setText(b.c(this.B));
          }
          this.v.setText(this.C);
          tB = this.w;
          if (!TextUtils.x(this.D)) {
             i = 0;
          }
          tB.setVisibility(i);
          this.w.setText(this.D);
          if (!PatchProxy.applyVoid(objArray, this, LiveFollowGuideCardDialog.class, "8") && !q.f(this.F)) {
             i1 = Math.min(this.A.size(), this.F.size());
             i = 0;
             while (i < i1) {
                LiveFollowGuideExtraInfoResponse$Label label = this.F.get(i);
                if (label != null && !TextUtils.x(label.mText)) {
                   obj = this.A.get(i);
                   obj.setVisibility(0);
                   obj.setText(label.mText);
                   if (!TextUtils.x(label.mReservationId)) {
                      if (TextUtils.x(this.G)) {
                         this.G = label.mReservationId;
                      }
                      Drawable uDrawable = a1.f(R.drawable.arg_RES_7f0814dd);
                      uDrawable.setBounds(0, 0, a1.e(16.00f), a1.e(16.00f));
                      obj.setCompoundDrawables(uDrawable, objArray, objArray, objArray);
                   }
                   if (!PatchProxy.applyVoidTwoRefs(obj, label, this, LiveFollowGuideCardDialog.class, "9")) {
                      if (!TextUtils.x(label.mTextColor)) {
                         i2 = k.b(label.mTextColor);
                         if (i2) {
                            obj.setTextColor(i2);
                         }
                      }
                      if (!TextUtils.x(label.mBackgroundColor)) {
                         i2 = k.b(label.mBackgroundColor);
                         if (i2) {
                            obj.setBackgroundColor(i2);
                         }
                      }
                   }
                label_015b :
                   label = label.mType;
                   if (!PatchProxy.applyVoidOneRefs(label, objArray, e.class, "2")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "LIVE_GUIDE_FOLLOW_SUBCARD";
                      i3 oi3 = i3.f();
                      oi3.d("item", TextUtils.k(label));
                      uElementPack.params = oi3.e();
                      u1.u0(3, uElementPack, objArray);
                   }
                }
             label_0187 :
                i = i + 1;
             }
             if (!this.y.getVisibility() || !this.z.getVisibility()) {
                this.x.setVisibility(0);
             }
          }
       }
    label_01a0 :
       this.w.setOnClickListener(new LiveFollowGuideCardDialog$a(this));
       return;
    }
}
