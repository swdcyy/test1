package com.kwai.emotionsdk.widget.CommonEmotionPopupWindow;
import androidx.fragment.app.CommitSafeDialogFragment;
import com.kwai.emotionsdk.util.ActivityContext;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.View;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.model.CDNUrl;
import android.app.Activity;
import com.kwai.emotionsdk.widget.FrescoImageView;
import jl5.k;
import androidx.fragment.app.c;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.content.res.Configuration;
import android.content.res.Resources;
import u0.d;
import pd6.a;
import androidx.fragment.app.e;
import java.lang.IllegalArgumentException;

public class CommonEmotionPopupWindow extends CommitSafeDialogFragment	// class@000db9
{
    public View b;
    public FrescoImageView c;
    public CDNUrl[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;

    public void CommonEmotionPopupWindow(){
       super();
       this.i = 0x7f11035d;
       this.j = n.A(ActivityContext.d().b());
       this.k = n.c(ActivityContext.d().b(), 100.00f);
       this.l = n.c(ActivityContext.d().b(), 80.00f);
       this.m = false;
    }
    public void Ug(){
       if (PatchProxy.applyVoid(null, this, CommonEmotionPopupWindow.class, "9")) {
          return;
       }
       if (this.getDialog() != null) {
          this.getDialog().hide();
          this.b.setVisibility(8);
       }
       return;
    }
    public void Vg(int p0){
       this.f = p0;
    }
    public final void Wg(int p0,int p1){
       if (PatchProxy.isSupport(CommonEmotionPopupWindow.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CommonEmotionPopupWindow.class, "8")) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = this.c.getLayoutParams();
       layoutParams.height = p1;
       layoutParams.width = p0;
       this.c.setLayoutParams(layoutParams);
       return;
    }
    public void Xg(int p0){
       this.e = p0;
    }
    public void Yg(FragmentActivity p0,View p1,int p2,int p3,CDNUrl[] p4){
       int i = 2;
       if (PatchProxy.isSupport(CommonEmotionPopupWindow.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, CommonEmotionPopupWindow.class, "7")) {
             return;
          }
       }
       if (p0 == null || (!p0.isFinishing() && p1 != null)) {
          CommonEmotionPopupWindow tc = this.c;
          if (tc != null) {
             k.a(tc, p4);
          }
          this.show(p0.getSupportFragmentManager(), "thirdEmotion");
          int[] ointArray = new int[i];
          p1.getLocationOnScreen(ointArray);
          if (p1.getParent() != null) {
             int[] ointArray1 = new int[i];
             p1.getParent().getLocationOnScreen(ointArray1);
             if (ointArray1[1] > ointArray[1]) {
                ointArray[1] = ointArray1[1];
             }
          }
          this.d = p4;
          this.g = ointArray[0] + p2;
          this.h = (ointArray[1] + p1.getMeasuredHeight()) + p3;
          if (!ActivityContext.d().e()) {
             this.h = this.h - this.j;
          }
          if (this.getDialog() != null && this.getDialog().getWindow() != null) {
             Window window = this.getDialog().getWindow();
             WindowManager$LayoutParams attributes = window.getAttributes();
             attributes.width = -2;
             attributes.height = -2;
             attributes.flags = 40;
             attributes.gravity = 51;
             attributes.x = ointArray[0] + p2;
             attributes.y = (ointArray[1] + p1.getMeasuredHeight()) + p3;
             if (!ActivityContext.d().e()) {
                attributes.y = attributes.y - this.j;
             }
             window.setAttributes(attributes);
          }
       }
    label_00d8 :
       return;
    }
    public void Zg(FragmentActivity p0,View p1,int p2,int p3,CDNUrl[] p4,int p5,int p6){
       int i = 0;
       if (PatchProxy.isSupport(CommonEmotionPopupWindow.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4,Integer.valueOf(p5),Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, CommonEmotionPopupWindow.class, "6")) {
             return;
          }
       }
       if (p0 == null || (!p0.isFinishing() && p1 != null)) {
          this.show(p0.getSupportFragmentManager(), "thirdEmotion");
          int[] ointArray = new int[2];
          p1.getLocationOnScreen(ointArray);
          if (p1.getParent() != null) {
             int[] ointArray1 = new int[2];
             p1.getParent().getLocationOnScreen(ointArray1);
             if (ointArray1[1] > ointArray[1]) {
                ointArray[1] = ointArray1[1];
             }
          }
          this.d = p4;
          this.g = ointArray[i] + p2;
          this.h = (ointArray[1] + (this.k / 2)) + p3;
          if (!ActivityContext.d().e()) {
             this.h = this.h - this.j;
          }
          if (this.getDialog() != null && this.getDialog().getWindow() != null) {
             Window window = this.getDialog().getWindow();
             WindowManager$LayoutParams attributes = window.getAttributes();
             CommonEmotionPopupWindow tk = this.k;
             attributes.width = tk;
             attributes.height = tk;
             attributes.flags = 40;
             attributes.gravity = 51;
             attributes.x = ointArray[i] + p2;
             attributes.y = (ointArray[1] + (tk / 2)) + p3;
             if (!ActivityContext.d().e()) {
                attributes.y = attributes.y - this.j;
             }
             window.setAttributes(attributes);
             if (this.c != null) {
                if (p5 > 0 && p6 > 0) {
                   this.f = p6;
                   this.e = p5;
                   this.Wg(p5, p6);
                }else {
                   CommonEmotionPopupWindow tl = this.l;
                   this.f = tl;
                   this.e = tl;
                   this.Wg(tl, tl);
                }
                if (this.isAdded()) {
                   k.a(this.c, this.d);
                }
             }
          }
       }
    label_0102 :
       return;
    }
    public void onActivityCreated(Bundle p0){
       CommonEmotionPopupWindow tf;
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonEmotionPopupWindow.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       if (!this.getShowsDialog()) {
          return;
       }
       Dialog dialog = this.getDialog();
       Window window = (dialog == null)? null: dialog.getWindow();
       if (window != null) {
          window.setWindowAnimations(R.style.arg_RES_7f1103a5);
          window.setLayout(-1, this.getActivity().getWindow().getDecorView().getHeight());
          if (this.c != null) {
             CommonEmotionPopupWindow te = this.e;
             if (te > null) {
                tf = this.f;
                if (tf > null) {
                   this.Wg(te, tf);
                }
             }
             k.a(this.c, this.d);
          }
          WindowManager$LayoutParams attributes = window.getAttributes();
          if (this.f > null) {
             tf = this.k;
             attributes.width = tf;
             attributes.height = tf;
          }else {
             int i = -2;
             attributes.width = i;
             attributes.height = i;
          }
          attributes.flags = 40;
          attributes.gravity = 51;
          attributes.x = this.g;
          attributes.y = this.h;
          window.setAttributes(attributes);
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonEmotionPopupWindow.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getArguments() != null) {
          this.m = this.getArguments().getBoolean("in_emotion_pkg_details_page");
       }
       this.setCancelable(true);
       this.setStyle(true, this.i);
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.setCancelable(true);
       uDialog.setCanceledOnTouchOutside(true);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Context context;
       int theme;
       d uod;
       Configuration uConfigurati;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, CommonEmotionPopupWindow.class, "2");
       if (p1 != patchProxyRe) {
          return p1;
       }
       if (this.n != null) {
          context = p0.getContext();
          theme = this.getTheme();
          if (PatchProxy.isSupport(CommonEmotionPopupWindow.class)) {
             uod = PatchProxy.applyTwoRefs(context, Integer.valueOf(theme), null, CommonEmotionPopupWindow.class, "10");
             if (uod != patchProxyRe) {
             label_0052 :
                p0 = p0.cloneInContext(uod);
             }
          }
          uConfigurati = new Configuration(context.getResources().getConfiguration());
          uConfigurati.uiMode = 32;
          uod = new d(context, theme);
          a.a(uod, uConfigurati);
          goto label_0052 ;
       }else if(this.o != null){
          context = p0.getContext();
          theme = this.getTheme();
          if (PatchProxy.isSupport(CommonEmotionPopupWindow.class)) {
             uod = PatchProxy.applyTwoRefs(context, Integer.valueOf(theme), null, CommonEmotionPopupWindow.class, "11");
             if (uod != patchProxyRe) {
             label_0095 :
                p0 = p0.cloneInContext(uod);
             }
          }
          uConfigurati = new Configuration(context.getResources().getConfiguration());
          uConfigurati.uiMode = 16;
          uod = new d(context, theme);
          a.a(uod, uConfigurati);
          goto label_0095 ;
       }
       int i = 0x7f0d03f1;
       if (this.m != null) {
          i = 0x7f0d03f2;
       }
       View view = p0.inflate(i, null);
       this.b = view;
       this.c = view.findViewById(0x7f0a0cfb);
       return this.b;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonEmotionPopupWindow.class, "4")) {
          return;
       }
       super.onSaveInstanceState(p0);
       this.dismissAllowingStateLoss();
       return;
    }
    public void show(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommonEmotionPopupWindow.class, "5")) {
          return;
       }
       if (this.getDialog() != null) {
          this.getDialog().show();
       }
       if (this.isAdded() || p0.findFragmentByTag(p1) != null) {
          CommonEmotionPopupWindow tb = this.b;
          if (tb != null && tb.getVisibility()) {
             this.b.setVisibility(0);
          }
          return;
       }else {
          try{
             p0.beginTransaction().u(this).m();
             super.show(p0, p1);
          }catch(java.lang.IllegalArgumentException e3){
             e3.printStackTrace();
          }
          return;
       }
    }
}
