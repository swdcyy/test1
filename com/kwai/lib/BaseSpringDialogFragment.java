package com.kwai.lib.BaseSpringDialogFragment;
import androidx.fragment.app.DialogFragment;
import android.view.View;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.util.DisplayMetrics;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.view.WindowManager;
import android.app.Activity;
import android.view.Display;
import android.app.Dialog;
import android.view.Window;
import java.lang.Exception;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import java.lang.String;
import ag6.a;
import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;
import java.util.Objects;
import android.content.Context;
import q2.a;
import android.content.Intent;
import qrd.l1;
import androidx.fragment.app.e;
import androidx.fragment.app.c;

public abstract class BaseSpringDialogFragment extends DialogFragment	// class@00080f
{
    public View b;
    public DialogInterface$OnDismissListener c;
    public boolean d;

    public void BaseSpringDialogFragment(){
       super();
       this.d = true;
    }
    public final View Ug(int p0){
       BaseSpringDialogFragment tb = this.b;
       a.m(tb);
       return tb.findViewById(p0);
    }
    public void Vg(){
    }
    public abstract int Wg();
    public void Xg(){
    }
    public final void Yg(float p0){
       DisplayMetrics uDisplayMetr1;
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       FragmentActivity activity = this.getActivity();
       a.m(activity);
       activity.getWindowManager().getDefaultDisplay().getMetrics(uDisplayMetr);
       int i = (int)((float)uDisplayMetr.widthPixels * p0);
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          if (i == -1) {
             uDisplayMetr1 = new DisplayMetrics();
             activity = this.getActivity();
             a.m(activity);
             activity.getWindowManager().getDefaultDisplay().getMetrics(uDisplayMetr1);
             uDisplayMetr1 = uDisplayMetr1.widthPixels;
          }
          Window window = dialog.getWindow();
          a.m(window);
          window.setLayout(uDisplayMetr1, -2);
       }
       return;
    }
    public void Zg(){
    }
    public void dismiss(){
       try{
          super.dismiss();
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public void dismissAllowingStateLoss(){
       try{
          super.dismissAllowingStateLoss();
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       a.p(p0, "inflater");
       Dialog dialog = this.getDialog();
       a.m(dialog);
       dialog.requestWindowFeature(1);
       View view = a.c(p0, this.Wg(), p1, false);
       this.b = view;
       return view;
    }
    public void onDestroy(){
       super.onDestroy();
    }
    public void onDismiss(DialogInterface p0){
       a.p(p0, "dialog");
       super.onDismiss(p0);
       BaseSpringDialogFragment tc = this.c;
       if (tc != null) {
          a.m(tc);
          tc.onDismiss(p0);
       }
       FragmentActivity activity = this.getActivity();
       Objects.requireNonNull(activity);
       a.m(activity);
       activity.finish();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       Dialog dialog;
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       BaseSpringDialogFragment td = this.d;
       this.d = td;
       if (this.getDialog() != null) {
          dialog = this.getDialog();
          a.m(dialog);
          dialog.setCanceledOnTouchOutside(td);
       }
       Dialog dialog1 = this.getDialog();
       if (dialog1 != null) {
          Window window = dialog1.getWindow();
          if (window != null) {
             window.setFlags(8192, 8192);
          }
       }
       this.getArguments();
       this.Vg();
       this.Xg();
       this.Zg();
       a uoa = a.b(p0.getContext());
       Intent intent = new Intent("com.android.push.spring.dialog.SHOWN");
       Bundle arguments = this.getArguments();
       String str = "unknown_fragment_tag";
       if (arguments != null) {
          String str1 = arguments.getString("fragment_tag");
          if (str1 != null) {
             str = str1;
          }
       }
       intent.putExtra("fragment_tag", str);
       uoa.d(intent);
       return;
    }
    public void setCancelable(boolean p0){
       super.setCancelable(p0);
    }
    public int show(e p0,String p1){
       String str = "transaction";
       try{
          a.p(p0, str);
          if (!this.isAdded()) {
             return super.show(p0, p1);
          }
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return -1;
    }
    public void show(c p0,String p1){
       String str = "manager";
       try{
          a.p(p0, str);
          p0.executePendingTransactions();
          if (!this.isAdded()) {
             e uoe = p0.beginTransaction();
             a.o(uoe, "manager.beginTransaction\(\)");
             uoe.h(this, p1);
             uoe.m();
          }
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
}
