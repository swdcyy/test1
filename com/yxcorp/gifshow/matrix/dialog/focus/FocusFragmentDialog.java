package com.yxcorp.gifshow.matrix.dialog.focus.FocusFragmentDialog;
import com.yxcorp.gifshow.matrix.MatrixBaseDialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.lib.BaseSpringDialogFragment;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import java.lang.CharSequence;
import com.facebook.drawee.view.SimpleDraweeView;
import android.widget.ImageView;
import com.kwai.android.common.bean.PushData;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import com.kwai.android.common.bean.Channel;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import p6b.c;
import android.content.DialogInterface$OnKeyListener;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.a;
import android.view.GestureDetector;
import p6b.e;
import android.view.GestureDetector$OnGestureListener;
import p6b.d;
import android.view.View$OnTouchListener;
import android.view.Window;
import android.view.WindowManager$LayoutParams;

public class FocusFragmentDialog extends MatrixBaseDialog	// class@001cea
{
    public KwaiImageView m;
    public KwaiImageView n;
    public View o;
    public View p;
    public TextView q;
    public TextView r;
    public final int s;

    public void FocusFragmentDialog(){
       super();
       this.s = 0x7f0d0453;
    }
    public void Vg(){
       if (PatchProxy.applyVoid(null, this, FocusFragmentDialog.class, "2")) {
          return;
       }
       this.m = this.Ug(0x7f0a0415);
       this.n = this.Ug(0x7f0a0f34);
       this.o = this.Ug(0x7f0a0f35);
       this.p = this.Ug(0x7f0a0f37);
       this.q = this.Ug(0x7f0a0f38);
       this.r = this.Ug(0x7f0a0f36);
       return;
    }
    public int Wg(){
       return this.s;
    }
    public void Xg(){
       if (PatchProxy.applyVoid(null, this, FocusFragmentDialog.class, "3")) {
          return;
       }
       if (!this.eh()) {
          this.dismissAllowingStateLoss();
          return;
       }else {
          KwaiPushMsgData kwaiPushMsgD = this.dh();
          if (kwaiPushMsgD != null) {
             KwaiPushMsgData bgImg = kwaiPushMsgD.bgImg;
             KwaiPushMsgData kwaiPushMsgD1 = 1;
             FocusFragmentDialog uFocusFragme = (bgImg == null || !bgImg.length())? 1: null;
             if (!uFocusFragme) {
                uFocusFragme = this.m;
                if (uFocusFragme != null) {
                   uFocusFragme.setImageURI(kwaiPushMsgD.bgImg);
                }
             }
             bgImg = kwaiPushMsgD.pushLargeIcon;
             if (bgImg != null && bgImg.length()) {
                kwaiPushMsgD1 = null;
             }
             if (!kwaiPushMsgD1) {
                uFocusFragme = this.n;
                if (uFocusFragme != null) {
                   uFocusFragme.setVisibility(0);
                }
                uFocusFragme = this.n;
                if (uFocusFragme != null) {
                   uFocusFragme.setImageURI(kwaiPushMsgD.pushLargeIcon);
                }
             }
             uFocusFragme = this.q;
             if (uFocusFragme != null) {
                uFocusFragme.setText(kwaiPushMsgD.title);
             }
             uFocusFragme = this.r;
             if (uFocusFragme != null) {
                uFocusFragme.setText(kwaiPushMsgD.body);
             }
          }
       label_006b :
          return;
       }
    }
    public void Zg(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FocusFragmentDialog.class, "4")) {
          return;
       }
       FocusFragmentDialog to = this.o;
       if (to != null) {
          to.setOnClickListener(this.bh());
       }
       to = this.p;
       if (to != null) {
          to.setOnClickListener(this.ch());
       }
       Object obj = PatchProxy.apply(objArray, this, FocusFragmentDialog.class, "8");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): a.t().a("focusDialogStyle", 0);
       if (i != 1) {
          if (i == 2) {
             this.gh();
          }
       }else if(this.ah() == Channel.MATRIX_JPUSH){
          this.gh();
       }
       return;
    }
    public final void gh(){
       Dialog dialog;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FocusFragmentDialog.class, "5")) {
          return;
       }
       FocusFragmentDialog to = this.o;
       if (to != null) {
          to.setVisibility(8);
       }
       if (!PatchProxy.applyVoid(objArray, this, FocusFragmentDialog.class, "6")) {
          dialog = this.getDialog();
          if (dialog != null) {
             dialog.setOnKeyListener(new c(this));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, FocusFragmentDialog.class, "7")) {
          ViewConfiguration viewConfigur = ViewConfiguration.get(this.getContext());
          a.o(viewConfigur, "ViewConfiguration.get\(context\)");
          GestureDetector gestureDetec = new GestureDetector(this.getContext(), new e(this, viewConfigur.getScaledTouchSlop()));
          to = this.p;
          if (to != null) {
             to.setOnTouchListener(new d(gestureDetec));
          }
       }
       dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             window.setWindowAnimations(R.style.arg_RES_7f110113);
          }
       }
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FocusFragmentDialog.class, "1")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       Window window = (dialog != null)? dialog.getWindow(): objArray;
       if (window != null) {
          objArray = window.getAttributes();
       }
       if (objArray != null) {
          objArray.gravity = 48;
       }
       if (objArray) {
          objArray.width = -1;
       }
       if (window != null) {
          window.setAttributes(objArray);
       }
       return;
    }
}
