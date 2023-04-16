package com.kuaishou.merchant.marketing.platform.fullgiving.dialog.CouponsDialog;
import com.kuaishou.merchant.basic.fragment.MerchantBaseControllerDialogFragment;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.CouponsDialog$a;
import nsd.u;
import com.kuaishou.merchant.popupController.api.models.DialogConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import kotlin.jvm.internal.a;
import android.view.Window;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.merchant.marketing.platform.fullgiving.model.CouponDialogInfo;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.CouponsDialog$c;
import android.content.DialogInterface$OnShowListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.HashMap;
import android.content.DialogInterface;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.CouponsDialog$b;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import android.widget.TextView;
import android.widget.ImageView;
import java.util.List;
import java.lang.CharSequence;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import i84.a;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.CouponsDialog$d;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.CouponsDialog$e;

public final class CouponsDialog extends MerchantBaseControllerDialogFragment	// class@001b0d
{
    public TextView A;
    public ImageView B;
    public TextView C;
    public TextView D;
    public CouponsDialog$b E;
    public CouponDialogInfo F;
    public HashMap G;
    public ViewGroup t;
    public RecyclerView u;
    public MerchantKwaiImageView v;
    public MerchantKwaiImageView w;
    public MerchantKwaiImageView x;
    public TextView y;
    public MerchantKwaiImageView z;
    public static final CouponsDialog$a H;

    static {
       CouponsDialog.H = new CouponsDialog$a(null);
    }
    public void CouponsDialog(){
       super();
    }
    public DialogConfig getConfig(){
       DialogConfig obj = PatchProxy.apply(null, this, CouponsDialog.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new DialogConfig();
       obj.mDialogName = "MerchantFullGivingCouponDialog";
       return obj;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CouponsDialog.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       if (this.getDialog() != null) {
          Dialog dialog = this.getDialog();
          a.m(dialog);
          if (dialog.getWindow() != null) {
             dialog = this.getDialog();
             a.m(dialog);
             Window window = dialog.getWindow();
             a.m(window);
             window.setBackgroundDrawableResource(R.color.arg_RES_7f062057);
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CouponsDialog.class, "1")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          this.F = SerializableHook.getSerializable(p0, "couponDialogInfo");
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Window obj = PatchProxy.applyOneRefs(p0, this, CouponsDialog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       obj = uDialog.getWindow();
       if (obj != null) {
          obj.setBackgroundDrawableResource(0x106000d);
          obj.requestFeature(1);
          obj.setWindowAnimations(R.style.arg_RES_7f1105ab);
          obj.setDimAmount(0.20f);
          this.ph(new CouponsDialog$c(this));
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, CouponsDialog.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return p0.inflate(0x7f0d02da, p1);
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, CouponsDialog.class, "9")) {
       }else {
          CouponsDialog tG = this.G;
          if (tG != null) {
             tG.clear();
          }
       }
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CouponsDialog.class, "6")) {
          return;
       }
       super.onDismiss(p0);
       CouponsDialog tE = this.E;
       if (tE != null) {
          tE.onDismiss();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       List topBackgroun;
       CouponsDialog tz;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CouponsDialog.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.t = m1.f(p0, 0x7f0a36a4);
       this.u = m1.f(p0, 0x7f0a34d1);
       this.z = m1.f(p0, 0x7f0a152e);
       this.y = m1.f(p0, 0x7f0a419a);
       this.B = m1.f(p0, 0x7f0a1509);
       this.D = m1.f(p0, 0x7f0a3f2c);
       this.C = m1.f(p0, 0x7f0a42a5);
       this.v = m1.f(p0, 0x7f0a3fce);
       this.w = m1.f(p0, 0x7f0a0398);
       this.x = m1.f(p0, 0x7f0a0392);
       this.A = m1.f(p0, 0x7f0a3f01);
       CouponsDialog tF = this.F;
       if (tF != null) {
          topBackgroun = tF.getTopBackgroundCdnUrl();
          if (topBackgroun != null) {
             CouponsDialog tv = this.v;
             if (tv == null) {
                a.S("mTopBack");
             }
             tv.P(topBackgroun);
          }
       }
       tF = this.F;
       String str = "mButtonBackground";
       if (tF != null) {
          topBackgroun = tF.getButtonBackgroundCdnUrl();
          if (topBackgroun != null) {
             tz = this.z;
             if (tz == null) {
                a.S(str);
             }
             tz.P(topBackgroun);
          }
       }
       tF = this.F;
       if (tF != null) {
          topBackgroun = tF.getCouponBackgroundCdnUrl();
          if (topBackgroun != null) {
             tz = this.w;
             if (tz == null) {
                a.S("mBackgroundHead");
             }
             tz.P(topBackgroun);
          }
       }
       tF = this.F;
       if (tF != null) {
          topBackgroun = tF.getCouponBeforeBackgroundCdnUrl();
          if (topBackgroun != null) {
             tz = this.x;
             if (tz == null) {
                a.S("mBackgroundBottom");
             }
             tz.P(topBackgroun);
          }
       }
       tF = this.A;
       if (tF == null) {
          a.S("mTipTextView");
       }
       tz = this.F;
       String str1 = null;
       String tips = (tz != null)? tz.getTips(): str1;
       tF.setText(tips);
       LinearLayoutManager linearLayout = new LinearLayoutManager(this.getContext());
       linearLayout.setOrientation(1);
       tz = this.u;
       if (tz == null) {
          a.S("mRecyclerView");
       }
       tz.setLayoutManager(linearLayout);
       a uoa = new a();
       tz = this.F;
       List couponList = (tz != null)? tz.getCouponList(): str1;
       uoa.W0(couponList);
       tz = this.u;
       if (tz == null) {
          a.S("mRecyclerView");
       }
       tz.setAdapter(uoa);
       tF = this.D;
       if (tF == null) {
          a.S("mSubTitle");
       }
       tz = this.F;
       tips = (tz != null)? tz.getSubTitle(): str1;
       tF.setText(tips);
       tF = this.C;
       if (tF == null) {
          a.S("mTitle");
       }
       tz = this.F;
       tips = (tz != null)? tz.getTitle(): str1;
       tF.setText(tips);
       tF = this.y;
       if (tF == null) {
          a.S("mButtonText");
       }
       tz = this.F;
       if (tz != null) {
          str1 = tz.getButtonName();
       }
       tF.setText(str1);
       tF = this.z;
       if (tF == null) {
          a.S(str);
       }
       tF.setOnClickListener(new CouponsDialog$d(this));
       tF = this.B;
       if (tF == null) {
          a.S("mCloseButton");
       }
       tF.setOnClickListener(new CouponsDialog$e(this));
       return;
    }
    public final void th(CouponsDialog$b p0){
       this.E = p0;
    }
}
