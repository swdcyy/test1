package com.yxcorp.upgrade.impl.UpgradeLoadingDialog;
import androidx.fragment.app.UpgradeSafeDialogFragment;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import zjd.d;
import akd.p;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import ag6.a;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

public class UpgradeLoadingDialog extends UpgradeSafeDialogFragment	// class@00098a
{
    public static final int b;

    public void UpgradeLoadingDialog(){
       super();
    }
    public static boolean Ug(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UpgradeLoadingDialog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null || p0.isFinishing())? true: false;
       return b;
    }
    public static void Vg(){
       if (PatchProxy.applyVoid(null, null, UpgradeLoadingDialog.class, "3")) {
          return;
       }
       Activity uActivity = p.c().c();
       if (!uActivity instanceof FragmentActivity) {
          return;
       }
       if (UpgradeLoadingDialog.Ug(uActivity)) {
          return;
       }
       Fragment uFragment = uActivity.getSupportFragmentManager().findFragmentByTag("UpgradeLoadingDialog");
       if (uFragment instanceof UpgradeSafeDialogFragment) {
          uFragment.dismiss();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, UpgradeLoadingDialog.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.c(p0, R.layout.arg_RES_7f0d02fb, p1, false);
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             window.clearFlags(2);
             window.setBackgroundDrawable(new ColorDrawable(false));
             window.requestFeature(1);
          }
       }
       return view;
    }
}
