package com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveAudienceSendExplicitGiftConfirmDialog;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import lnc.a1;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveAudienceSendExplicitGiftConfirmDialog$a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import android.os.Bundle;
import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.CheckBox;
import java.util.List;
import android.widget.ImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import ekd.j;
import ij1.d;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import ij1.a;
import android.view.View$OnClickListener;
import ij1.c;
import android.widget.CompoundButton$OnCheckedChangeListener;
import ij1.b;
import java.lang.StringBuilder;

public class LiveAudienceSendExplicitGiftConfirmDialog extends LiveSafeDialogFragment	// class@00124e
{
    public boolean A;
    public String B;
    public String C;
    public String D;
    public int E;
    public int F;
    public int G;
    public String H;
    public String I;
    public Gift J;
    public KwaiImageView s;
    public KwaiImageView t;
    public TextView u;
    public TextView v;
    public CheckBox w;
    public LiveAudienceSendExplicitGiftConfirmDialog$a x;
    public TextView y;
    public TextView z;
    public static int K;

    static {
       LiveAudienceSendExplicitGiftConfirmDialog.K = a1.e(25.00f);
    }
    public void LiveAudienceSendExplicitGiftConfirmDialog(){
       super();
    }
    public static LiveAudienceSendExplicitGiftConfirmDialog wh(Gift p0,LiveAudienceSendExplicitGiftConfirmDialog$a p1,boolean p2,String p3,String p4,String p5,int p6){
       if (PatchProxy.isSupport(LiveAudienceSendExplicitGiftConfirmDialog.class)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,p4,p5,Integer.valueOf(p6)};
          Object obj = PatchProxy.apply(objArray, null, LiveAudienceSendExplicitGiftConfirmDialog.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return LiveAudienceSendExplicitGiftConfirmDialog.xh(p0, p1, p2, p3, p4, p5, p6, 0, 0, null, null);
    }
    public static LiveAudienceSendExplicitGiftConfirmDialog xh(Gift p0,LiveAudienceSendExplicitGiftConfirmDialog$a p1,boolean p2,String p3,String p4,String p5,int p6,int p7,int p8,String p9,String p10){
       LiveAudienceSendExplicitGiftConfirmDialog obj;
       if (PatchProxy.isSupport(LiveAudienceSendExplicitGiftConfirmDialog.class)) {
          Object[] objArray = new Object[11];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Boolean.valueOf(p2);
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          objArray[9] = p9;
          objArray[10] = p10;
          obj = PatchProxy.apply(objArray, null, LiveAudienceSendExplicitGiftConfirmDialog.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LiveAudienceSendExplicitGiftConfirmDialog();
       obj.J = p0;
       obj.x = p1;
       obj.A = p2;
       obj.C = p3;
       obj.B = p4;
       obj.E = p6;
       obj.F = p7;
       obj.G = p8;
       obj.D = TextUtils.i(p5, a1.p(0x7f101e36));
       obj.H = p9;
       obj.I = p10;
       return obj;
    }
    public Dialog onCreateDialog(Bundle p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiveAudienceSendExplicitGiftConfirmDialog.class, "7");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new Dialog(this.getContext(), 0x7f1101f7);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAudienceSendExplicitGiftConfirmDialog.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0b35, p1, false);
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceSendExplicitGiftConfirmDialog.class, "8")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog == null) {
          this.dismissAllowingStateLoss();
       }
       Window window = dialog.getWindow();
       this.setCancelable(false);
       if (window != null) {
          window.setGravity(17);
          window.setBackgroundDrawableResource(0x106000d);
          window.setLayout(a1.e(280.00f), -2);
          this.getDialog().setCancelable(false);
       }else {
          this.dismissAllowingStateLoss();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       boolean i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceSendExplicitGiftConfirmDialog.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSendExplicitGiftConfirmDialog.class, "6")) {
          this.s = m1.f(p0, 0x7f0a254b);
          this.u = m1.f(p0, 0x7f0a254e);
          this.v = m1.f(p0, 0x7f0a254f);
          this.w = m1.f(p0, 0x7f0a254a);
          this.y = m1.f(p0, 0x7f0a2548);
          this.z = m1.f(p0, 0x7f0a2549);
          this.w = m1.f(p0, 0x7f0a254a);
          this.t = m1.f(p0, 0x7f0a254c);
          i = false;
          if (!PatchProxy.applyVoid(null, this, LiveAudienceSendExplicitGiftConfirmDialog.class, "9")) {
             Gift mSubscriptIm = this.J.mSubscriptImageUrl;
             int i1 = 8;
             if (mSubscriptIm == null || !mSubscriptIm.size()) {
                this.t.setVisibility(i1);
             }else {
                this.t.setVisibility(i);
                mSubscriptIm = this.J.mSubscriptImageUrl;
                CDNUrl[] uCDNUrlArray = new CDNUrl[mSubscriptIm.size()];
                CDNUrl[] uCDNUrlArray1 = mSubscriptIm.toArray(uCDNUrlArray);
                LiveAudienceSendExplicitGiftConfirmDialog tt = this.t;
                if (!PatchProxy.applyVoidTwoRefs(tt, uCDNUrlArray1, this, LiveAudienceSendExplicitGiftConfirmDialog.class, "10")) {
                   if (j.h(uCDNUrlArray1)) {
                      tt.setVisibility(i1);
                   }else {
                      tt.setVisibility(i);
                      tt.a0(uCDNUrlArray1, new d(this, tt));
                   }
                }
             }
          }
          this.w.setText(this.D);
          this.w.setChecked(i);
          this.y.setOnClickListener(new a(this));
          this.w.setChecked(this.A);
          this.w.setOnCheckedChangeListener(new c(this));
          this.z.setOnClickListener(new b(this));
       }
       this.s.P(this.J.mImageUrl);
       if (!TextUtils.x(this.C)) {
          this.u.setText(this.C);
       }else {
          this.u.setText(a1.p(R.string.arg_RES_7f104646)+this.J.mName);
       }
       if (!TextUtils.x(this.B)) {
          this.v.setText(this.B);
       }else {
          i = 0x7f100aec;
          if (this.J.isKShellGift()) {
             this.v.setText(a1.q(i, this.J.mVirtualPrice));
          }else {
             this.v.setText(a1.q(i, this.J.mPrice));
          }
       }
       return;
    }
}
