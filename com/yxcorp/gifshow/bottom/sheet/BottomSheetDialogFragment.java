package com.yxcorp.gifshow.bottom.sheet.BottomSheetDialogFragment;
import androidx.fragment.app.DialogFragment;
import com.yxcorp.gifshow.bottom.sheet.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import qa9.q;
import android.os.Bundle;
import android.app.Dialog;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.bottom.sheet.BottomSheetParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Configuration;
import jz6.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import qa9.j;
import com.yxcorp.gifshow.bottom.sheet.g;
import androidx.fragment.app.c;
import ekd.e0;
import lnc.i3;
import com.yxcorp.utility.TextUtils;
import java.lang.Throwable;
import android.util.Log;
import k2b.u1;

public final class BottomSheetDialogFragment extends DialogFragment	// class@001c5d
{
    public f b;
    public DialogInterface$OnKeyListener c;
    public static final int d;

    public void BottomSheetDialogFragment(){
       super();
    }
    public static void Ug(BottomSheetDialogFragment p0){
       super.dismissAllowingStateLoss();
    }
    public f Vg(){
       Object obj = PatchProxy.apply(null, this, BottomSheetDialogFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = new f(this);
       }
       return this.b;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, BottomSheetDialogFragment.class, "9")) {
          return;
       }
       this.Vg().b.c();
       return;
    }
    public void dismissAllowingStateLoss(){
       if (PatchProxy.applyVoid(null, this, BottomSheetDialogFragment.class, "10")) {
          return;
       }
       this.Vg().b.c();
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomSheetDialogFragment.class, "7")) {
          return;
       }
       super.onActivityCreated(p0);
       Window window = (this.getDialog() != null)? this.getDialog().getWindow(): null;
       if (window != null) {
          window.clearFlags(0x4000000);
          window.addFlags(Integer.MIN_VALUE);
          window.setStatusBarColor(0);
          window.setBackgroundDrawable(new ColorDrawable(0));
          window.setLayout(-1, -1);
          window.setWindowAnimations(0);
          window.setDimAmount(0);
          if (this.Vg().c().mIsSoftInputEnabled != null) {
             window.getDecorView().setSystemUiVisibility(1024);
             window.setSoftInputMode(18);
          }
       }
       if (this.getView() != null && this.getView().getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          window.bottomMargin = this.Vg().c().mBottomMargin;
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomSheetDialogFragment.class, "5")) {
          return;
       }
       super.onConfigurationChanged(p0);
       return;
    }
    public final Dialog onCreateDialog(Bundle p0){
       p0 = PatchProxy.applyOneRefs(p0, this, BottomSheetDialogFragment.class, "6");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       this.setCancelable(false);
       a uoa = new a(this.getContext(), 0x7f110358);
       uoa.requestWindowFeature(1);
       uoa.setCanceledOnTouchOutside(false);
       return uoa;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, BottomSheetDialogFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       BottomSheetParams uBottomSheet = this.Vg().c();
       int i = (uBottomSheet.mIsSoftInputEnabled != null && uBottomSheet.mContainerLayout == 0x7f0d0122)? 0x7f0d0123: uBottomSheet.mContainerLayout;
       return a.g(p0, i, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, BottomSheetDialogFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       this.Vg().f();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BottomSheetDialogFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       f uof = this.Vg();
       uof.g(p0);
       uof.h = new j(this);
       uof.i = new g(this, uof);
       return;
    }
    public void show(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BottomSheetDialogFragment.class, "8")) {
          return;
       }
       super.show(p0, p1);
       return;
    }
}
