package com.facebook.react.modules.dialog.AlertFragment;
import android.content.DialogInterface$OnClickListener;
import androidx.fragment.app.DialogFragment;
import com.facebook.react.modules.dialog.DialogModule$b;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.app.Dialog;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import android.app.AlertDialog$Builder;
import android.content.Context;
import java.lang.CharSequence;
import android.app.AlertDialog;

public class AlertFragment extends DialogFragment implements DialogInterface$OnClickListener	// class@0012a9
{
    public final DialogModule$b b;

    public void AlertFragment(){
       super();
       this.b = null;
    }
    public void AlertFragment(DialogModule$b p0,Bundle p1){
       super();
       this.b = p0;
       this.setArguments(p1);
    }
    public void onClick(DialogInterface p0,int p1){
       if (PatchProxy.isSupport(AlertFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AlertFragment.class, "3")) {
          return;
       }
       AlertFragment tb = this.b;
       if (tb != null) {
          tb.onClick(p0, p1);
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyOneRefs(p0, this, AlertFragment.class, "2");
       if (p0 != patchProxyRe) {
          return p0;
       }
       FragmentActivity activity = this.getActivity();
       Bundle arguments = this.getArguments();
       AlertDialog uAlertDialog = PatchProxy.applyThreeRefs(activity, arguments, this, null, AlertFragment.class, "1");
       if (uAlertDialog != patchProxyRe) {
       }else {
          AlertDialog$Builder uBuilder = new AlertDialog$Builder(activity).setTitle(arguments.getString("title"));
          String str = "button_positive";
          if (arguments.containsKey(str)) {
             uBuilder.setPositiveButton(arguments.getString(str), this);
          }
          str = "button_negative";
          if (arguments.containsKey(str)) {
             uBuilder.setNegativeButton(arguments.getString(str), this);
          }
          str = "button_neutral";
          if (arguments.containsKey(str)) {
             uBuilder.setNeutralButton(arguments.getString(str), this);
          }
          str = "message";
          if (arguments.containsKey(str)) {
             uBuilder.setMessage(arguments.getString(str));
          }
          str = "items";
          if (arguments.containsKey(str)) {
             uBuilder.setItems(arguments.getCharSequenceArray(str), this);
          }
          uAlertDialog = uBuilder.create();
       }
       return uAlertDialog;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlertFragment.class, "4")) {
          return;
       }
       super.onDismiss(p0);
       AlertFragment tb = this.b;
       if (tb != null) {
          tb.onDismiss(p0);
       }
       return;
    }
}
