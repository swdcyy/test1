package com.yxcorp.upgrade.impl.UpgradeInstallHintDialog;
import androidx.fragment.app.UpgradeSafeDialogFragment;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import android.content.DialogInterface;
import zjd.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import ag6.a;
import android.widget.FrameLayout;
import android.widget.TextView;
import akd.x;
import android.view.View$OnClickListener;
import com.yxcorp.upgrade.impl.g$a;
import java.lang.CharSequence;
import android.text.method.ScrollingMovementMethod;
import android.text.method.MovementMethod;
import akd.w;
import androidx.fragment.app.DialogFragment;
import android.app.Dialog;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowManager$LayoutParams;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.Display;

public class UpgradeInstallHintDialog extends UpgradeSafeDialogFragment	// class@000989
{
    public boolean b;
    public static g$a c;
    public static Activity d;
    public static b e;

    public void UpgradeInstallHintDialog(){
       super();
    }
    public static boolean Ug(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UpgradeInstallHintDialog.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || p0.isFinishing()) {
          return false;
       }
       if (p0.isDestroyed()) {
          return false;
       }
       return true;
    }
    public static void Vg(){
       if (PatchProxy.applyVoid(null, null, UpgradeInstallHintDialog.class, "2")) {
          return;
       }
       Activity d = UpgradeInstallHintDialog.d;
       if (!d instanceof FragmentActivity) {
          return;
       }
       if (!UpgradeInstallHintDialog.Ug(d)) {
          return;
       }
       Fragment uFragment = UpgradeInstallHintDialog.d.getSupportFragmentManager().findFragmentByTag("UpgradeInstallHintDialog");
       if (uFragment instanceof UpgradeSafeDialogFragment) {
          uFragment.dismiss();
       }
       UpgradeInstallHintDialog.d = null;
       return;
    }
    public void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UpgradeInstallHintDialog.class, "7")) {
          return;
       }
       b e = UpgradeInstallHintDialog.e;
       if (e != null) {
          e.a();
          UpgradeInstallHintDialog.e = null;
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, UpgradeInstallHintDialog.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       View view = null;
       if (!UpgradeInstallHintDialog.Ug(this.getActivity())) {
          return view;
       }
       View view1 = a.c(p0, R.layout.arg_RES_7f0d02cd, view, false);
       view1.findViewById(R.id.fl_version_info_container).setVisibility(8);
       view1.findViewById(R.id.tv_install_hint).setVisibility(false);
       view1.findViewById(R.id.iv_close).setOnClickListener(new x(this));
       view1.findViewById(R.id.tv_title).setText(UpgradeInstallHintDialog.c.a);
       TextView textView = view1.findViewById(R.id.tv_desc);
       textView.setText(UpgradeInstallHintDialog.c.b);
       textView.setMovementMethod(new ScrollingMovementMethod());
       view1.findViewById(R.id.tv_upgrade_now).setOnClickListener(new w(this));
       this.setCancelable(true);
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             window.setBackgroundDrawable(new ColorDrawable(false));
             window.requestFeature(true);
          }
       }
       return view1;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UpgradeInstallHintDialog.class, "8")) {
          return;
       }
       b e = UpgradeInstallHintDialog.e;
       if (e != null) {
          e.a();
          UpgradeInstallHintDialog.e = null;
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, UpgradeInstallHintDialog.class, "5")) {
          return;
       }
       super.onPause();
       this.b = true;
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, UpgradeInstallHintDialog.class, "6")) {
          return;
       }
       super.onResume();
       this.b = false;
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, UpgradeInstallHintDialog.class, "4")) {
          return;
       }
       super.onStart();
       FragmentActivity activity = this.getActivity();
       if (!UpgradeInstallHintDialog.Ug(activity)) {
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
