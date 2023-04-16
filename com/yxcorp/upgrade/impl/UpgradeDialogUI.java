package com.yxcorp.upgrade.impl.UpgradeDialogUI;
import androidx.fragment.app.UpgradeSafeDialogFragment;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import zjd.h$a;
import com.yxcorp.upgrade.impl.UpgradeDialogUI$a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import zjd.h;
import bkd.b;
import androidx.fragment.app.DialogFragment;
import android.app.Dialog;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowManager$LayoutParams;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.Display;

public class UpgradeDialogUI extends UpgradeSafeDialogFragment	// class@000988
{
    public static UpgradeDialogUI$a b;
    public static boolean c;

    public void UpgradeDialogUI(){
       super();
    }
    public static boolean Ug(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UpgradeDialogUI.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.isFinishing() || UpgradeDialogUI.b == null))? true: false;
       return b;
    }
    public void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UpgradeDialogUI.class, "5")) {
          return;
       }
       if (UpgradeDialogUI.Ug(this.getActivity())) {
          return;
       }
       UpgradeDialogUI.b.a().a();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, UpgradeDialogUI.class, "4");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       FragmentActivity activity = this.getActivity();
       if (UpgradeDialogUI.Ug(activity)) {
          return null;
       }
       h oh = UpgradeDialogUI.b.b();
       b uob = UpgradeDialogUI.b.c();
       View view = oh.c(activity, p0, UpgradeDialogUI.b.a());
       oh.d(uob, UpgradeDialogUI.b.getDownloadStatus());
       boolean b = (UpgradeDialogUI.c && uob.b == null)? true: false;
       this.setCancelable(b);
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             window.setBackgroundDrawable(new ColorDrawable(0));
             window.requestFeature(1);
          }
       }
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, UpgradeDialogUI.class, "9")) {
          return;
       }
       super.onDestroyView();
       if (UpgradeDialogUI.Ug(this.getActivity())) {
          return;
       }
       UpgradeDialogUI.b.b().onDestroyView();
       UpgradeDialogUI.b.a().b();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, UpgradeDialogUI.class, "7")) {
          return;
       }
       super.onPause();
       if (UpgradeDialogUI.Ug(this.getActivity())) {
          return;
       }
       UpgradeDialogUI.b.b().onFragmentPause();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, UpgradeDialogUI.class, "8")) {
          return;
       }
       super.onResume();
       if (UpgradeDialogUI.Ug(this.getActivity())) {
          return;
       }
       h oh = UpgradeDialogUI.b.b();
       oh.onFragmentResume();
       oh.d(UpgradeDialogUI.b.c(), UpgradeDialogUI.b.getDownloadStatus());
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, UpgradeDialogUI.class, "6")) {
          return;
       }
       super.onStart();
       FragmentActivity activity = this.getActivity();
       if (UpgradeDialogUI.Ug(activity)) {
          return;
       }
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             WindowManager$LayoutParams attributes = window.getAttributes();
             activity.getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
             attributes.gravity = 80;
             attributes.width = -1;
             attributes.height = -2;
             window.setAttributes(attributes);
          }
       }
       return;
    }
}
