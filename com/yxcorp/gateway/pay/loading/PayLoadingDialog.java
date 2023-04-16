package com.yxcorp.gateway.pay.loading.PayLoadingDialog;
import androidx.fragment.app.KwaiDialogFragment;
import lnc.ea;
import java.lang.Class;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.app.Dialog;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import mv8.b;
import android.animation.Animator$AnimatorListener;

public class PayLoadingDialog extends KwaiDialogFragment	// class@001229
{
    public KwaiImageView p;
    public TextView q;
    public View r;
    public View s;
    public View t;
    public String u;
    public String v;
    public final AnimatorSet w;
    public boolean x;

    static {
       ea.b().c(PayLoadingDialog.class);
    }
    public void PayLoadingDialog(){
       this.w = new AnimatorSet();
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PayLoadingDialog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setStyle(1, R.style.arg_RES_7f11057c);
       return super.onCreateDialog(p0);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PayLoadingDialog.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d0311, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, PayLoadingDialog.class, "5")) {
          return;
       }
       super.onDestroyView();
       if (!PatchProxy.applyVoid(null, this, PayLoadingDialog.class, "9")) {
          this.x = true;
          this.w.cancel();
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, PayLoadingDialog.class, "4")) {
          return;
       }
       try{
          super.onStart();
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             if (window != null) {
                WindowManager$LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = 0;
                window.setAttributes(attributes);
             }
          }
       }catch(java.lang.Exception e0){
          this.dismiss();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PayLoadingDialog.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, PayLoadingDialog.class, "6")) {
          this.p = p0.findViewById(0x7f0a1392);
          this.q = p0.findViewById(0x7f0a3e66);
          this.r = p0.findViewById(0x7f0a443a);
          this.s = p0.findViewById(0x7f0a445d);
          this.t = p0.findViewById(0x7f0a446e);
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, PayLoadingDialog.class, "7")) {
          if (!TextUtils.x(this.u)) {
             this.p.L(this.u);
          }
          if (!TextUtils.x(this.v)) {
             this.q.setText(this.v);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, PayLoadingDialog.class, "8")) {
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.r, View.ALPHA, new float[3]{0x3f266666,0x3e4ccccd,0x3e99999a});
          objectAnimat.setDuration(150);
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this.s, View.ALPHA, new float[3]{0x3e99999a,0x3f266666,0x3e4ccccd});
          objectAnimat1.setDuration(150);
          objectAnimat1.setStartDelay(100);
          ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(this.t, View.ALPHA, new float[3]{0x3e4ccccd,0x3e99999a,0x3f266666});
          objectAnimat2.setDuration(100);
          objectAnimat2.setStartDelay(200);
          Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
          this.w.playTogether(uAnimatorArr);
          this.w.addListener(new b(this));
          this.w.start();
       }
       return;
    }
    public final void sh(String p0){
       this.v = p0;
    }
    public final void th(String p0){
       this.u = p0;
    }
}
