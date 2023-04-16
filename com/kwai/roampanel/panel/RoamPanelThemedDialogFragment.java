package com.kwai.roampanel.panel.RoamPanelThemedDialogFragment;
import androidx.fragment.app.DialogFragment;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.app.Dialog;
import android.view.Window;
import android.view.View;
import android.os.Build$VERSION;
import com.yxcorp.utility.RomUtils;
import ekd.i;
import ekd.o0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import zf6.l;
import android.os.Bundle;
import android.view.WindowManager$LayoutParams;

public class RoamPanelThemedDialogFragment extends DialogFragment	// class@0013d8
{
    public boolean b;

    public void RoamPanelThemedDialogFragment(){
       super();
    }
    public void Ug(Activity p0,int p1,boolean p2){
       if (PatchProxy.isSupport(RoamPanelThemedDialogFragment.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, RoamPanelThemedDialogFragment.class, "6")) {
          return;
       }
       a.p(p0, "activity");
       Dialog dialog = this.getDialog();
       View view = null;
       Window window = (dialog != null)? dialog.getWindow(): view;
       Dialog dialog1 = this.getDialog();
       if (dialog1 != null) {
          Window window1 = dialog1.getWindow();
          if (window1 != null) {
             view = window1.getDecorView();
          }
       }
       int i = 1280;
       if (Build$VERSION.SDK_INT >= 23) {
          if (window != null) {
             window.clearFlags(0x4000000);
          }
          if (window != null) {
             window.addFlags(Integer.MIN_VALUE);
          }
          if (p2) {
             i = 9472;
             if (RomUtils.q()) {
                i.f(p0, true);
             }else if(RomUtils.o()){
                o0.c(p0, true);
             }
          }
       }
    label_006d :
       if (view != null) {
          view.setSystemUiVisibility(i);
       }
       if (window != null) {
          window.setStatusBarColor(p1);
       }
       if (window != null) {
          window.setNavigationBarColor(window.getNavigationBarColor());
       }
       return;
    }
    public final void Vg(){
       if (PatchProxy.applyVoid(null, this, RoamPanelThemedDialogFragment.class, "5")) {
          return;
       }
       if (i.c()) {
          FragmentActivity activity = this.getActivity();
          a.m(activity);
          a.o(activity, "activity!!");
          this.Ug(activity, 0, l.r());
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoamPanelThemedDialogFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       this.setStyle(0, R.style.arg_RES_7f1105f0);
       this.Vg();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, RoamPanelThemedDialogFragment.class, "2")) {
          return;
       }
       super.onPause();
       this.b = true;
       return;
    }
    public void onStart(){
       Dialog dialog;
       Window window;
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RoamPanelThemedDialogFragment.class, "1")) {
          return;
       }
       if (this.b != null) {
          dialog = this.getDialog();
          if (dialog != null) {
             window = dialog.getWindow();
             if (window != null) {
                window.setWindowAnimations(R.style.arg_RES_7f1105ef);
             }
          }
       }
       super.onStart();
       dialog = this.getDialog();
       window = (dialog != null)? dialog.getWindow(): objArray;
       if (window != null) {
          objArray = window.getAttributes();
       }
       if (objArray != null) {
          objArray.dimAmount = 0;
       }
       if (objArray) {
          objArray.flags = objArray.flags | 0x02;
       }
       if (window != null) {
          window.setAttributes(objArray);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RoamPanelThemedDialogFragment.class, "4")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             WindowManager$LayoutParams attributes = window.getAttributes();
             if (attributes != null) {
                attributes.windowAnimations = 0x7f1105ee;
             }
          }
       }
       this.Vg();
       return;
    }
}
