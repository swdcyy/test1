package com.kuaishou.merchant.marketing.platform.fullgiving.dialog.LuckDrawDialog;
import com.kuaishou.merchant.basic.fragment.MerchantBaseControllerDialogFragment;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.LuckDrawDialog$a;
import nsd.u;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RandomTextView;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.popupController.api.models.DialogConfig;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.merchant.marketing.platform.fullgiving.model.Lottery;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.LuckDrawDialog$c;
import android.content.DialogInterface$OnShowListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import crd.b;
import lnc.b9;
import java.util.HashMap;
import android.content.DialogInterface;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.LuckDrawDialog$b;
import ekd.m1;
import android.widget.ImageView;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import android.widget.TextView;
import java.lang.CharSequence;
import java.util.List;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.LuckDrawDialog$d;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.LuckDrawDialog$e;

public final class LuckDrawDialog extends MerchantBaseControllerDialogFragment	// class@001b14
{
    public MerchantKwaiImageView A;
    public ImageView B;
    public MerchantKwaiImageView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public Lottery G;
    public b H;
    public LuckDrawDialog$b I;
    public HashMap J;
    public RandomTextView t;
    public RandomTextView u;
    public RandomTextView v;
    public ImageView w;
    public ImageView x;
    public ImageView y;
    public ViewGroup z;
    public static final LuckDrawDialog$a K;

    static {
       LuckDrawDialog.K = new LuckDrawDialog$a(null);
    }
    public void LuckDrawDialog(){
       super();
    }
    public static final RandomTextView th(LuckDrawDialog p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mRandomTextView1");
       }
       return p0;
    }
    public static final RandomTextView uh(LuckDrawDialog p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mRandomTextView2");
       }
       return p0;
    }
    public static final RandomTextView vh(LuckDrawDialog p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mRandomTextView3");
       }
       return p0;
    }
    public DialogConfig getConfig(){
       DialogConfig obj = PatchProxy.apply(null, this, LuckDrawDialog.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new DialogConfig();
       obj.mDialogName = "MerchantFullGivingCouponDialog";
       return obj;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LuckDrawDialog.class, "3")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, LuckDrawDialog.class, "1")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          this.G = SerializableHook.getSerializable(p0, "lottery");
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Window obj = PatchProxy.applyOneRefs(p0, this, LuckDrawDialog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       obj = uDialog.getWindow();
       if (obj != null) {
          obj.setBackgroundDrawableResource(0x106000d);
          obj.requestFeature(1);
          obj.setWindowAnimations(R.style.arg_RES_7f1105ab);
          obj.setDimAmount(0.40f);
          this.ph(new LuckDrawDialog$c(this));
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LuckDrawDialog.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return p0.inflate(0x7f0d02d9, p1);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LuckDrawDialog.class, "9")) {
          return;
       }
       super.onDestroy();
       LuckDrawDialog tt = this.t;
       if (tt == null) {
          a.S("mRandomTextView1");
       }
       tt.c();
       tt = this.u;
       if (tt == null) {
          a.S("mRandomTextView2");
       }
       tt.c();
       tt = this.v;
       if (tt == null) {
          a.S("mRandomTextView3");
       }
       tt.c();
       b9.a(this.H);
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, LuckDrawDialog.class, "12")) {
       }else {
          LuckDrawDialog tJ = this.J;
          if (tJ != null) {
             tJ.clear();
          }
       }
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LuckDrawDialog.class, "8")) {
          return;
       }
       super.onDismiss(p0);
       LuckDrawDialog tI = this.I;
       if (tI != null) {
          tI.onDismiss();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       List backgroundIm;
       LuckDrawDialog tC;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LuckDrawDialog.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.z = m1.f(p0, 0x7f0a36a4);
       this.t = m1.f(p0, 0x7f0a33e7);
       this.u = m1.f(p0, 0x7f0a33e9);
       this.v = m1.f(p0, 0x7f0a33eb);
       this.w = m1.f(p0, 0x7f0a33a9);
       this.x = m1.f(p0, 0x7f0a33aa);
       this.y = m1.f(p0, 0x7f0a33ab);
       this.C = m1.f(p0, 0x7f0a152e);
       this.A = m1.f(p0, 0x7f0a14fa);
       this.D = m1.f(p0, 0x7f0a419a);
       this.B = m1.f(p0, 0x7f0a1509);
       this.E = m1.f(p0, 0x7f0a3f2c);
       this.F = m1.f(p0, 0x7f0a3bd1);
       LuckDrawDialog tE = this.E;
       if (tE == null) {
          a.S("mTitleTextView");
       }
       LuckDrawDialog tG = this.G;
       String str = null;
       String title = (tG != null)? tG.getTitle(): str;
       tE.setText(title);
       tE = this.G;
       if (tE != null) {
          backgroundIm = tE.getBackgroundImage();
          if (backgroundIm != null) {
             tG = this.A;
             if (tG == null) {
                a.S("mBgImage");
             }
             tG.P(backgroundIm);
          }
       }
       tE = this.G;
       title = "mIvGoDraw";
       if (tE != null) {
          backgroundIm = tE.getButtonImage();
          if (backgroundIm != null) {
             tC = this.C;
             if (tC == null) {
                a.S(title);
             }
             tC.P(backgroundIm);
          }
       }
       tE = this.D;
       if (tE == null) {
          a.S("mButton");
       }
       tC = this.G;
       String buttonText = (tC != null)? tC.getButtonText(): str;
       tE.setText(buttonText);
       tE = this.F;
       if (tE == null) {
          a.S("mSubTitleTextView");
       }
       tC = this.G;
       if (tC != null) {
          str = tC.getSubTitle();
       }
       tE.setText(str);
       tE = this.C;
       if (tE == null) {
          a.S(title);
       }
       tE.setOnClickListener(new LuckDrawDialog$d(this));
       tE = this.B;
       if (tE == null) {
          a.S("mIvClose");
       }
       tE.setOnClickListener(new LuckDrawDialog$e(this));
       return;
    }
    public final void wh(LuckDrawDialog$b p0){
       this.I = p0;
    }
}
