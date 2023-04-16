package com.kuaishou.commercial.component.TransparentBgDialogFragment;
import androidx.fragment.app.KwaiDialogFragment;
import java.util.HashSet;
import ow.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import ow.c;
import java.lang.Runnable;
import ekd.k1;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import androidx.fragment.app.Fragment;
import lnc.l1;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.WindowManager$LayoutParams;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import ow.a;
import android.content.DialogInterface$OnKeyListener;
import java.lang.StringBuilder;
import yx.j0;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import ow.d;
import java.util.Iterator;
import java.util.Set;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface;
import k2b.u1;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import android.os.Build$VERSION;
import java.lang.Number;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.content.Context;
import android.os.IBinder;
import java.lang.Throwable;
import android.view.ViewParent;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;

public final class TransparentBgDialogFragment extends KwaiDialogFragment	// class@001493
{
    public Fragment p;
    public View q;
    public View r;
    public boolean s;
    public boolean t;
    public final Set u;
    public DialogContainerFragment$b v;
    public final ViewTreeObserver$OnPreDrawListener w;
    public static final int x;

    public void TransparentBgDialogFragment(){
       super();
       this.u = new HashSet();
       this.w = new b(this);
    }
    public static void sh(TransparentBgDialogFragment p0){
       super.dismissAllowingStateLoss();
    }
    public final void Ah(int p0){
       if (PatchProxy.isSupport(TransparentBgDialogFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TransparentBgDialogFragment.class, "15")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.r.getLayoutParams();
       layoutParams.height = this.uh(p0);
       this.r.setLayoutParams(layoutParams);
       return;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, TransparentBgDialogFragment.class, "10")) {
          return;
       }
       this.wh();
       super.dismiss();
       return;
    }
    public void dismissAllowingStateLoss(){
       if (PatchProxy.applyVoid(null, this, TransparentBgDialogFragment.class, "12")) {
          return;
       }
       this.wh();
       k1.o(new c(this));
       return;
    }
    public void onActivityCreated(Bundle p0){
       Window window;
       if (PatchProxy.applyVoidOneRefs(p0, this, TransparentBgDialogFragment.class, "3")) {
          return;
       }
       int i = 0;
       if (this.getDialog() != null && (this.getDialog().getWindow() == null || this.getView() == null)) {
          Object[] objArray = new Object[i];
          j0.c("TransparentBgDialogFragment", "dialog or dialog\'s window is null, dialog: "+this.getDialog(), objArray);
          return;
       }else {
          window = this.getDialog().getWindow();
          window.setSoftInputMode(34);
          super.onActivityCreated(p0);
          if (this.t == null) {
             if (l1.a()) {
                window.setWindowAnimations(R.style.arg_RES_7f1103e1);
             }else {
                window.setWindowAnimations(R.style.arg_RES_7f1103db);
             }
          }
          window.setGravity(80);
          View decorView = window.getDecorView();
          int i1 = -1;
          window.setLayout(i1, i1);
          if (this.s == null) {
             if (decorView != null) {
                decorView.setPadding(i, decorView.getPaddingTop(), i, i);
             }
             this.Ah(i1);
             this.q.getViewTreeObserver().addOnPreDrawListener(this.w);
          }else if(decorView != null){
             decorView.setPadding(i, i, i, i);
          }
          WindowManager$LayoutParams attributes = window.getAttributes();
          attributes.dimAmount = 0;
          window.setBackgroundDrawable(new ColorDrawable(i));
          window.setAttributes(attributes);
          this.setStyle(2, i);
          this.getDialog().setOnKeyListener(new a(this));
          return;
       }
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TransparentBgDialogFragment.class, "6")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (this.getDialog() == null) {
          return;
       }
       Window window = this.getDialog().getWindow();
       if (window == null) {
          return;
       }
       if (this.t == null) {
          if (p0.orientation == 2) {
             window.setWindowAnimations(R.style.arg_RES_7f1103e1);
          }else {
             window.setWindowAnimations(R.style.arg_RES_7f1103db);
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TransparentBgDialogFragment.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.dismissAllowingStateLoss();
       }
       super.onCreate(p0);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TransparentBgDialogFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d162b, p1, false);
       this.q = view;
       this.r = view.findViewById(0x7f0a4060);
       this.q.postDelayed(new d(this), 16);
       return this.q;
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TransparentBgDialogFragment.class, "13")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, TransparentBgDialogFragment.class, "14")) {
          Iterator iterator = this.u.iterator();
          while (iterator.hasNext()) {
             iterator.next().onDismiss(this.getDialog());
          }
       }
       this.u.clear();
       u1.a();
       super.onDestroy();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TransparentBgDialogFragment.class, "9")) {
          return;
       }
       TransparentBgDialogFragment tq = this.q;
       if (tq != null) {
          tq.getViewTreeObserver().removeOnPreDrawListener(this.w);
       }
       super.onDestroyView();
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TransparentBgDialogFragment.class, "4")) {
          return;
       }
       super.onStart();
       if (this.s != null) {
          if (this.getDialog() != null) {
             objArray = this.getDialog().getWindow();
          }
          if (objArray == null) {
             return;
          }else {
             View view = this.xh(objArray);
             if (Build$VERSION.SDK_INT >= 23) {
                objArray.clearFlags(0x4000000);
                objArray.addFlags(Integer.MIN_VALUE);
             }
             if (view != null) {
                view.setSystemUiVisibility(1280);
             }
          }
       }
       return;
    }
    public void th(DialogInterface$OnDismissListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TransparentBgDialogFragment.class, "7")) {
          return;
       }
       this.u.add(p0);
       return;
    }
    public final int uh(int p0){
       FragmentActivity obj;
       if (PatchProxy.isSupport(TransparentBgDialogFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, TransparentBgDialogFragment.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.getActivity();
       if (obj != null && !l1.a()) {
          p0 = (n.j(obj) - n.A(obj)) - n.n(obj);
       }
       return p0;
    }
    public void vh(boolean p0){
       this.t = p0;
    }
    public final void wh(){
       if (PatchProxy.applyVoid(null, this, TransparentBgDialogFragment.class, "11")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null && n.n(activity) > 0) {
          n.E(activity, this.q.getWindowToken());
       }
       return;
    }
    public final View xh(Window p0){
       View obj = PatchProxy.applyOneRefs(p0, this, TransparentBgDialogFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       try{
          obj = p0.getDecorView();
       }catch(java.lang.Exception e1){
          Object[] objArray = new Object[0];
          j0.d("TransparentBgDialogFragment", e1, objArray);
       }
       if (obj != null) {
          return obj;
       }
       View view = p0.findViewById(0x1020002);
       while (view != null && view.getParent() instanceof View) {
          view = view.getParent();
       }
       return view;
    }
    public void yh(DialogContainerFragment$b p0){
       this.v = p0;
    }
    public void zh(boolean p0){
       this.s = p0;
    }
}
