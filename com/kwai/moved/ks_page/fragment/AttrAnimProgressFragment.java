package com.kwai.moved.ks_page.fragment.AttrAnimProgressFragment;
import android.view.View$OnClickListener;
import androidx.fragment.app.AlbumKwaiDialogFragment;
import androidx.fragment.app.DialogFragment;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.lang.Boolean;
import android.app.Dialog;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import java.lang.CharSequence;
import android.content.DialogInterface;
import java.lang.ref.WeakReference;
import android.content.DialogInterface$OnCancelListener;
import android.view.View;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import o79.i;
import com.kwai.moved.ks_page.fragment.KsAlbumAttrAnimProgressBar;
import android.text.TextUtils;
import android.widget.Button;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import cw9.c;
import java.util.Objects;
import android.animation.ValueAnimator;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import android.content.DialogInterface$OnDismissListener;
import android.view.Window;
import android.view.WindowManager$LayoutParams;

public class AttrAnimProgressFragment extends AlbumKwaiDialogFragment implements View$OnClickListener	// class@000f6c
{
    public Dialog A;
    public DialogInterface$OnDismissListener B;
    public boolean C;
    public View$OnClickListener D;
    public KsAlbumAttrAnimProgressBar s;
    public TextView t;
    public Button u;
    public WeakReference v;
    public CharSequence w;
    public int x;
    public CharSequence y;
    public int z;

    public void AttrAnimProgressFragment(){
       super();
       this.setCancelable(true);
    }
    public void AttrAnimProgressFragment(Activity p0){
       super();
       this.setCancelable(true);
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, AttrAnimProgressFragment.class, "10")) {
          return;
       }
       super.dismiss();
       return;
    }
    public void ih(boolean p0){
       if (PatchProxy.isSupport(AttrAnimProgressFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AttrAnimProgressFragment.class, "14")) {
          return;
       }
       this.C = p0;
       AttrAnimProgressFragment tA = this.A;
       if (tA != null) {
          tA.setCanceledOnTouchOutside(p0);
       }
       return;
    }
    public AttrAnimProgressFragment jh(int p0){
       AttrAnimProgressFragment obj;
       if (PatchProxy.isSupport(AttrAnimProgressFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, AttrAnimProgressFragment.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.w = null;
       this.x = p0;
       obj = this.t;
       if (obj != null) {
          obj.setText(p0);
       }
       return this;
    }
    public AttrAnimProgressFragment kh(CharSequence p0){
       AttrAnimProgressFragment obj = PatchProxy.applyOneRefs(p0, this, AttrAnimProgressFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.w = p0;
       this.x = 0;
       obj = this.t;
       if (obj != null) {
          obj.setText(p0);
       }
       return this;
    }
    public void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AttrAnimProgressFragment.class, "13")) {
          return;
       }
       super.onCancel(p0);
       AttrAnimProgressFragment tv = this.v;
       DialogInterface$OnCancelListener onCancelList = (tv == null)? null: tv.get();
       if (onCancelList != null) {
          onCancelList.onCancel(p0);
       }
       return;
    }
    public void onClick(View p0){
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AttrAnimProgressFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setStyle(1, R.style.arg_RES_7f11057c);
       Dialog uDialog = super.onCreateDialog(p0);
       this.A = uDialog;
       uDialog.setCanceledOnTouchOutside(this.C);
       return this.A;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       AttrAnimProgressFragment tz;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AttrAnimProgressFragment.class, "8");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = i.o(p0, R.layout.arg_RES_7f0d0709, p1, false);
       if (!PatchProxy.applyVoidOneRefs(view, this, AttrAnimProgressFragment.class, "9")) {
          KsAlbumAttrAnimProgressBar ksAlbumAttrA = view.findViewById(R.id.progress);
          this.s = ksAlbumAttrA;
          ksAlbumAttrA.setIntermediateMode(true);
          this.s.setVisibility(false);
          TextView textView = view.findViewById(R.id.label);
          this.t = textView;
          AttrAnimProgressFragment tx = this.x;
          if (tx == null) {
             textView.setText(this.w);
          }else {
             textView.setText(tx);
          }
          i = 8;
          if (TextUtils.isEmpty(this.w) && this.x == null) {
             this.t.setVisibility(i);
          }
          Button uButton = view.findViewById(R.id.button);
          this.u = uButton;
          if (uButton != null) {
             uButton.setOnClickListener(this.D);
             if (!TextUtils.isEmpty(this.y) || this.z != null) {
                this.u.setVisibility(false);
                tz = this.z;
                if (tz == null) {
                   this.u.setText(this.y);
                }else {
                   this.u.setText(tz);
                }
             }else {
                this.u.setVisibility(i);
             }
          }
          tz = this.u;
          if (tz != null && !tz.getVisibility()) {
             view.setMinimumWidth(c.b(this.getResources(), R.dimen.arg_RES_7f0704ad));
             view.setMinimumHeight(c.b(this.getResources(), R.dimen.arg_RES_7f0704ad));
          }else {
             view.setMinimumWidth(c.b(this.getResources(), R.dimen.arg_RES_7f0704aa));
             view.setMinimumHeight(c.b(this.getResources(), R.dimen.arg_RES_7f0704aa));
          }
       }
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, AttrAnimProgressFragment.class, "11")) {
          return;
       }
       AttrAnimProgressFragment ts = this.s;
       Objects.requireNonNull(ts);
       if (!PatchProxy.applyVoid(null, ts, KsAlbumAttrAnimProgressBar.class, "8")) {
          KsAlbumAttrAnimProgressBar o = ts.o;
          if (o != null) {
             o.cancel();
             ts.o = null;
          }
       }
       this.s = null;
       super.onDestroyView();
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AttrAnimProgressFragment.class, "7")) {
          return;
       }
       super.onDismiss(p0);
       AttrAnimProgressFragment tB = this.B;
       if (tB != null) {
          tB.onDismiss(p0);
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, AttrAnimProgressFragment.class, "6")) {
          return;
       }
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
       return;
    }
}
