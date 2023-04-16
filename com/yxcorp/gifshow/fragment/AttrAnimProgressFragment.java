package com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import android.view.View$OnClickListener;
import androidx.fragment.app.KwaiDialogFragment;
import lnc.ea;
import java.lang.Class;
import androidx.fragment.app.DialogFragment;
import android.app.Activity;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kuaishou.ax2c.PreLoader;
import com.kuaishou.ax2c.PreloadParam$Builder;
import android.content.Context;
import com.kuaishou.ax2c.PreloadParam;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gq.a;
import java.lang.Throwable;
import q87.c;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;
import java.lang.ref.WeakReference;
import android.content.DialogInterface;
import android.view.View;
import android.os.Bundle;
import android.app.Dialog;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import i2b.a;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.kwai.library.widget.refresh.path.LoadingStyle;
import android.view.ViewTreeObserver;
import gka.a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.Button;
import android.content.res.Resources;
import cw9.c;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import java.lang.Integer;
import lnc.a1;
import java.lang.Boolean;
import android.os.Build$VERSION;

public class AttrAnimProgressFragment extends KwaiDialogFragment implements View$OnClickListener	// class@00125e
{
    public int A;
    public int B;
    public boolean C;
    public KwaiLoadingView D;
    public TextView p;
    public Button q;
    public WeakReference r;
    public CharSequence s;
    public int t;
    public CharSequence u;
    public int v;
    public Dialog w;
    public DialogInterface$OnDismissListener x;
    public boolean y;
    public View$OnClickListener z;

    static {
       ea.b().c(AttrAnimProgressFragment.class);
    }
    public void AttrAnimProgressFragment(){
       super();
       this.setCancelable(true);
    }
    public void AttrAnimProgressFragment(Activity p0){
       super();
       this.setCancelable(true);
       if (PostExperimentUtils.H0()) {
          PreLoader.getInstance().preload(new PreloadParam$Builder(p0).addLayoutId(R.layout.arg_RES_7f0d1282).build());
       }
       return;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, AttrAnimProgressFragment.class, "16")) {
          return;
       }
       super.dismiss();
       return;
    }
    public void k0(DialogInterface$OnDismissListener p0){
       this.x = p0;
    }
    public void oh(DialogInterface$OnCancelListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AttrAnimProgressFragment.class, "18")) {
          return;
       }
       this.r = new WeakReference(p0);
       return;
    }
    public void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AttrAnimProgressFragment.class, "19")) {
          return;
       }
       super.onCancel(p0);
       AttrAnimProgressFragment tr = this.r;
       DialogInterface$OnCancelListener onCancelList = (tr == null)? null: tr.get();
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
       this.setStyle(1, R.style.arg_RES_7f11035f);
       Dialog uDialog = super.onCreateDialog(p0);
       this.w = uDialog;
       uDialog.setCanceledOnTouchOutside(this.y);
       return this.w;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AttrAnimProgressFragment.class, "10");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       int i = 0x7f0d1282;
       View orWait = (PostExperimentUtils.H0())? PreLoader.getInstance().getOrWait(this.getContext(), i, p1, false): a.g(p0, i, p1, false);
       if (!PatchProxy.applyVoidOneRefs(orWait, this, AttrAnimProgressFragment.class, "11")) {
          AttrAnimProgressFragment tB = this.B;
          if (tB > null) {
             orWait.setMinimumHeight(tB);
          }
          tB = this.A;
          if (tB > null) {
             orWait.setMinimumWidth(tB);
          }
          this.D = orWait.findViewById(0x7f0a2921);
          if (PostExperimentUtils.H0()) {
             this.D.setLoadingStyle(LoadingStyle.WHITE);
          }
          this.D.h();
          if (!PatchProxy.applyVoidOneRefs(orWait, this, AttrAnimProgressFragment.class, "14") && this.C != null) {
             orWait.getViewTreeObserver().addOnGlobalLayoutListener(new a(this, orWait));
          }
          TextView textView = orWait.findViewById(R.id.label);
          this.p = textView;
          AttrAnimProgressFragment tt = this.t;
          if (tt == null) {
             textView.setText(this.s);
          }else {
             textView.setText(tt);
          }
          int i1 = 8;
          if (TextUtils.isEmpty(this.s) && this.t == null) {
             this.p.setVisibility(i1);
          }else {
             this.p.setVisibility(false);
          }
          Button uButton = orWait.findViewById(R.id.button);
          this.q = uButton;
          if (uButton != null) {
             uButton.setOnClickListener(this.z);
             if (!TextUtils.isEmpty(this.u) || this.v != null) {
                this.q.setVisibility(false);
                tB = this.v;
                if (tB == null) {
                   this.q.setText(this.u);
                }else {
                   this.q.setText(tB);
                }
             }else {
                this.q.setVisibility(i1);
             }
          }
          tB = this.q;
          if (tB != null && !tB.getVisibility()) {
             orWait.setMinimumWidth(c.b(this.getResources(), R.dimen.arg_RES_7f07027b));
             orWait.setMinimumHeight(c.b(this.getResources(), R.dimen.arg_RES_7f07027b));
          }else {
             orWait.setMinimumWidth(c.b(this.getResources(), R.dimen.arg_RES_7f070268));
             orWait.setMinimumHeight(c.b(this.getResources(), R.dimen.arg_RES_7f070268));
          }
       }
       return orWait;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, AttrAnimProgressFragment.class, "17")) {
          return;
       }
       this.w = null;
       this.z = null;
       this.x = null;
       this.r = null;
       super.onDestroyView();
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AttrAnimProgressFragment.class, "9")) {
          return;
       }
       super.onDismiss(p0);
       AttrAnimProgressFragment tD = this.D;
       if (tD != null) {
          tD.i();
       }
       tD = this.x;
       if (tD != null) {
          tD.onDismiss(p0);
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, AttrAnimProgressFragment.class, "8")) {
          return;
       }
       this.xh(false);
       super.onPause();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, AttrAnimProgressFragment.class, "7")) {
          return;
       }
       super.onResume();
       this.xh(true);
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, AttrAnimProgressFragment.class, "6")) {
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
       }catch(android.view.WindowManager$BadTokenException e0){
       }catch(java.lang.IllegalStateException e0){
       }catch(java.lang.IllegalArgumentException e0){
       }
       return;
    }
    public AttrAnimProgressFragment sh(CharSequence p0){
       AttrAnimProgressFragment obj = PatchProxy.applyOneRefs(p0, this, AttrAnimProgressFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.u = p0;
       this.v = 0;
       obj = this.q;
       if (obj != null) {
          obj.setText(p0);
       }
       return this;
    }
    public AttrAnimProgressFragment th(View$OnClickListener p0){
       this.z = p0;
       return this;
    }
    public void uh(int p0,int p1){
       if (PatchProxy.isSupport(AttrAnimProgressFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AttrAnimProgressFragment.class, "13")) {
          return;
       }
       this.A = a1.d(p0);
       this.B = a1.d(p1);
       return;
    }
    public void vh(boolean p0){
       this.C = p0;
    }
    public AttrAnimProgressFragment wh(CharSequence p0){
       AttrAnimProgressFragment obj = PatchProxy.applyOneRefs(p0, this, AttrAnimProgressFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.s = p0;
       this.t = 0;
       obj = this.p;
       if (obj != null) {
          obj.setText(p0);
       }
       return this;
    }
    public final void xh(boolean p0){
       if (PatchProxy.isSupport(AttrAnimProgressFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AttrAnimProgressFragment.class, "12")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 31 && !("S").equals(Build$VERSION.CODENAME)) {
          return;
       }
       Dialog dialog = this.getDialog();
       if (dialog == null || (dialog.getWindow() != null && dialog.getWindow().getDecorView() != null)) {
          View decorView = dialog.getWindow().getDecorView();
          int i = (p0)? 0: 8;
          decorView.setVisibility(i);
       }
    label_0050 :
       return;
    }
}
