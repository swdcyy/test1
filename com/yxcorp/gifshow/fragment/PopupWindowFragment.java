package com.yxcorp.gifshow.fragment.PopupWindowFragment;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.c;
import android.view.View;
import android.content.DialogInterface$OnShowListener;
import java.lang.IllegalStateException;
import java.lang.Integer;
import ukd.a;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import java.lang.Exception;
import android.os.Bundle;
import android.view.ViewPropertyAnimator;
import com.yxcorp.gifshow.fragment.PopupWindowFragment$c;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.fragment.PopupWindowFragment$d;
import android.content.DialogInterface$OnDismissListener;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.fragment.PopupWindowFragment$a;
import android.view.View$OnClickListener;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.fragment.PopupWindowFragment$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import gka.p;
import java.lang.Runnable;
import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;

public abstract class PopupWindowFragment extends KwaiDialogFragment	// class@00126e
{
    public int A;
    public int B;
    public boolean C;
    public int D;
    public boolean E;
    public DialogInterface$OnDismissListener p;
    public DialogInterface$OnCancelListener q;
    public int r;
    public int s;
    public View t;
    public FrameLayout u;
    public int v;
    public int w;
    public View x;
    public boolean y;
    public int z;
    public static final int F;

    public void PopupWindowFragment(){
       super();
       this.D = 0x7f11035d;
       this.E = true;
    }
    public PopupWindowFragment Ah(boolean p0){
       if (PatchProxy.isSupport(PopupWindowFragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, PopupWindowFragment.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.y = p0;
       this.z = 0;
       return this;
    }
    public PopupWindowFragment Bh(int p0){
       this.w = p0;
       return this;
    }
    public void Ch(c p0,String p1,View p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PopupWindowFragment.class, "15")) {
          return;
       }
       if (!PatchProxy.applyVoidFourRefs(p0, p1, p2, null, this, PopupWindowFragment.class, "16")) {
          this.t = p2;
          this.B = 0;
          try{
             this.ph(null);
             super.show(p0, p1);
          }catch(java.lang.IllegalStateException e9){
             e9.printStackTrace();
          }
       }
    }
    public boolean Dh(c p0,String p1,int p2,int p3){
       boolean i = 0;
       if (PatchProxy.isSupport(PopupWindowFragment.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),null};
          Object obj = PatchProxy.apply(objArray, this, PopupWindowFragment.class, "13");
          if (obj != PatchProxyResult.class) {
             i = obj.booleanValue();
          }else {
          label_0036 :
             this.r = p2;
             this.s = p3;
             try{
                this.ph(null);
                a.o(this, "mDismissed", Boolean.FALSE);
                a.o(this, "mShownByMe", Boolean.TRUE);
                e uoe = p0.beginTransaction();
                uoe.h(this, p1);
                uoe.m();
                i = true;
             }catch(java.lang.Exception e7){
                e7.printStackTrace();
             }
          }
       }else {
          goto label_0036 ;
       }
    }
    public void Eh(c p0,String p1,View p2,DialogInterface$OnShowListener p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, PopupWindowFragment.class, "17")) {
          return;
       }
       this.t = p2;
       this.B = 1;
       try{
          this.ph(p3);
          super.show(p0, p1);
       }catch(java.lang.IllegalStateException e8){
          e8.printStackTrace();
       }
       return;
    }
    public void Fh(c p0,String p1,View p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PopupWindowFragment.class, "18")) {
          return;
       }
       this.t = p2;
       this.B = 2;
       try{
          super.show(p0, p1);
       }catch(java.lang.IllegalStateException e7){
          e7.printStackTrace();
       }
       return;
    }
    public void Gh(){
       if (PatchProxy.applyVoid(null, this, PopupWindowFragment.class, "10")) {
          return;
       }
       try{
          if (this.getFragmentManager() != null) {
             super.dismissAllowingStateLoss();
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final void Yg(){
       if (PatchProxy.applyVoid(null, this, PopupWindowFragment.class, "1")) {
          return;
       }
       if (this.getArguments() == null) {
          this.setArguments(new Bundle());
       }
       return;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, PopupWindowFragment.class, "11")) {
          return;
       }
       PopupWindowFragment tx = this.x;
       if (tx == null || !tx.isShown()) {
          this.Gh();
          return;
       }else {
          this.x.animate().setDuration(100).scaleX(0x3f4ccccd).scaleY(0x3f4ccccd).alpha(0).setListener(new PopupWindowFragment$c(this)).start();
          return;
       }
    }
    public void dismissAllowingStateLoss(){
       if (PatchProxy.applyVoid(null, this, PopupWindowFragment.class, "12")) {
          return;
       }
       PopupWindowFragment tx = this.x;
       if (tx == null || !tx.isShown()) {
          super.dismissAllowingStateLoss();
          return;
       }else {
          this.x.animate().setDuration(100).scaleX(0x3f4ccccd).scaleY(0x3f4ccccd).alpha(0).setListener(new PopupWindowFragment$d(this)).start();
          return;
       }
    }
    public void k0(DialogInterface$OnDismissListener p0){
       this.p = p0;
    }
    public void onActivityCreated(Bundle p0){
       int i;
       PopupWindowFragment tw;
       if (PatchProxy.applyVoidOneRefs(p0, this, PopupWindowFragment.class, "4")) {
          return;
       }
       Dialog dialog = this.getDialog();
       super.onActivityCreated(p0);
       if (!this.getShowsDialog()) {
          return;
       }
       Window window = (dialog == null)? null: dialog.getWindow();
       if (window != null) {
          window.setWindowAnimations(R.style.arg_RES_7f1103a5);
          FragmentActivity activity = this.getActivity();
          window.addFlags(1024);
          window.setLayout(-1, activity.getWindow().getDecorView().getHeight());
          if (this.t != null && !PatchProxy.applyVoidOneRefs(activity, this, PopupWindowFragment.class, "6")) {
             int[] ointArray = new int[2];
             this.t.getLocationOnScreen(ointArray);
             if (this.vh()) {
                i = n.k(activity) - ointArray[0];
                if (this.E != null) {
                   tw = this.w;
                   if (tw > null) {
                      i = i - tw;
                   }
                }
                this.u.setPadding(0, 0, i, 0);
             }else if(this.wh()){
                i = ointArray[0] + this.t.getWidth();
                if (this.E != null) {
                   tw = this.w;
                   if (tw < null) {
                      i = i + tw;
                   }
                }
                this.u.setPadding(i, 0, 0, 0);
             }
          }
          this.u.setOnClickListener(new PopupWindowFragment$a(this));
          this.u.getViewTreeObserver().addOnGlobalLayoutListener(new PopupWindowFragment$b(this, window));
       }
       if (this.C != null) {
          this.x.post(new p(this));
       }else {
          this.x.setScaleX(0x3f4ccccd);
          this.x.setScaleY(0x3f4ccccd);
          this.x.animate().setDuration(100).alpha(0x3f800000).scaleX(0x3f800000).scaleY(0x3f800000).start();
       }
       return;
    }
    public void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PopupWindowFragment.class, "8")) {
          return;
       }
       super.onCancel(p0);
       PopupWindowFragment tq = this.q;
       if (tq != null) {
          tq.onCancel(p0);
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PopupWindowFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setCancelable(true);
       this.setStyle(true, this.D);
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.setCancelable(true);
       uDialog.setCanceledOnTouchOutside(true);
       return uDialog;
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PopupWindowFragment.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       FrameLayout uFrameLayout = new FrameLayout(this.getContext());
       this.u = uFrameLayout;
       View view = this.xh(p0, uFrameLayout, p2);
       this.x = view;
       this.u.addView(view);
       return this.u;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PopupWindowFragment.class, "9")) {
          return;
       }
       super.onDismiss(p0);
       PopupWindowFragment tp = this.p;
       if (tp != null) {
          tp.onDismiss(p0);
       }
       return;
    }
    public boolean sh(){
       return true;
    }
    public final boolean th(){
       boolean b = (this.B == null)? true: false;
       return b;
    }
    public final boolean uh(){
       boolean b = true;
       if (this.B == b) {
       }else {
          b = false;
       }
       return b;
    }
    public final boolean vh(){
       boolean b = (this.B == 2)? true: false;
       return b;
    }
    public final boolean wh(){
       boolean b = (this.B == 3)? true: false;
       return b;
    }
    public abstract View xh(LayoutInflater p0,ViewGroup p1,Bundle p2);
    public void yh(int p0,int p1){
    }
    public void zh(int p0,int p1){
    }
}
