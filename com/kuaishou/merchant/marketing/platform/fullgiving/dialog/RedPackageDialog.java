package com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RedPackageDialog;
import com.kuaishou.merchant.basic.fragment.MerchantBaseControllerDialogFragment;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RedPackageDialog$a;
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
import com.kuaishou.merchant.marketing.platform.fullgiving.model.RedPackage;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RedPackageDialog$c;
import android.content.DialogInterface$OnShowListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.HashMap;
import android.content.DialogInterface;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RedPackageDialog$b;
import ekd.m1;
import android.widget.TextView;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import java.util.List;
import java.lang.CharSequence;
import java.lang.Long;
import java.lang.Number;
import ot3.p0;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RedPackageDialog$d;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RedPackageDialog$e;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;

public final class RedPackageDialog extends MerchantBaseControllerDialogFragment	// class@001b1e
{
    public MerchantKwaiImageView A;
    public RedPackage B;
    public RedPackageDialog$b C;
    public HashMap D;
    public ViewGroup t;
    public ImageView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public MerchantKwaiImageView z;
    public static final RedPackageDialog$a E;

    static {
       RedPackageDialog.E = new RedPackageDialog$a(null);
    }
    public void RedPackageDialog(){
       super();
    }
    public DialogConfig getConfig(){
       DialogConfig obj = PatchProxy.apply(null, this, RedPackageDialog.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new DialogConfig();
       obj.mDialogName = "MerchantFullGivingCouponDialog";
       return obj;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPackageDialog.class, "3")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPackageDialog.class, "1")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          this.B = SerializableHook.getSerializable(p0, "redPackage");
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Window obj = PatchProxy.applyOneRefs(p0, this, RedPackageDialog.class, "2");
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
          this.ph(new RedPackageDialog$c(this));
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RedPackageDialog.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return p0.inflate(0x7f0d02db, p1);
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, RedPackageDialog.class, "10")) {
       }else {
          RedPackageDialog tD = this.D;
          if (tD != null) {
             tD.clear();
          }
       }
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPackageDialog.class, "6")) {
          return;
       }
       super.onDismiss(p0);
       RedPackageDialog tC = this.C;
       if (tC != null) {
          tC.onDismiss();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       List buttonImage;
       RedPackageDialog tz;
       Object[] objArray;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPackageDialog.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.t = m1.f(p0, 0x7f0a36a4);
       this.v = m1.f(p0, 0x7f0a42a5);
       this.w = m1.f(p0, 0x7f0a4220);
       this.x = m1.f(p0, 0x7f0a42f3);
       this.z = m1.f(p0, 0x7f0a152e);
       this.y = m1.f(p0, 0x7f0a419a);
       this.A = m1.f(p0, 0x7f0a14fa);
       RedPackageDialog tB = this.B;
       String str = "mButton";
       if (tB != null) {
          buttonImage = tB.getButtonImage();
          if (buttonImage != null) {
             tz = this.z;
             if (tz == null) {
                a.S(str);
             }
             if (tz != null) {
                tz.P(buttonImage);
             }
          }
       }
       tB = this.B;
       if (tB != null) {
          buttonImage = tB.getBackgroundImage();
          if (buttonImage != null) {
             tz = this.A;
             if (tz == null) {
                a.S("mBackground");
             }
             if (tz != null) {
                tz.P(buttonImage);
             }
          }
       }
       tB = this.v;
       if (tB == null) {
          a.S("mTitle");
       }
       tz = this.B;
       String title = (tz != null)? tz.getTitle(): null;
       tB.setText(title);
       tB = this.x;
       if (tB == null) {
          a.S("mSubTitle");
       }
       tz = this.B;
       title = (tz != null)? tz.getThreshold(): null;
       tB.setText(title);
       tB = this.B;
       if (tB != null) {
          Long price = tB.getPrice();
          if (price != null) {
             long l = price.longValue();
             tB = this.w;
             if (tB == null) {
                a.S("mPrice");
             }
             tB.setText(p0.o(l));
          }
       }
       tB = this.y;
       if (tB == null) {
          a.S("mButtonText");
       }
       RedPackageDialog tB1 = this.B;
       String buttonText = (tB1 != null)? tB1.getButtonText(): null;
       tB.setText(buttonText);
       tB = this.z;
       if (tB == null) {
          a.S(str);
       }
       tB.setOnClickListener(new RedPackageDialog$d(this));
       ImageView imageView = m1.f(p0, R.id.iv_close);
       this.u = imageView;
       if (imageView == null) {
          a.S("mCloseButton");
       }
       imageView.setOnClickListener(new RedPackageDialog$e(this));
       if (!PatchProxy.applyVoid(null, this, RedPackageDialog.class, "7")) {
          RedPackageDialog tw = this.w;
          if (tw == null) {
             a.S("mPrice");
          }
          if (tw != null) {
             tw.setTypeface(d0.a("alte-din.ttf", this.getContext()));
          }
       }
       return;
    }
    public final void th(RedPackageDialog$b p0){
       this.C = p0;
    }
}
