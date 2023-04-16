package com.facebook.react.modules.timepicker.TimePickerDialogFragment;
import androidx.fragment.app.DialogFragment;
import android.os.Bundle;
import android.app.Dialog;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.Calendar;
import android.content.Context;
import android.text.format.DateFormat;
import com.facebook.react.modules.timepicker.TimePickerMode;
import java.util.Locale;
import te.a;
import android.content.res.Resources;
import android.app.TimePickerDialog$OnTimeSetListener;
import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;

public class TimePickerDialogFragment extends DialogFragment	// class@0012f3
{
    public TimePickerDialog$OnTimeSetListener b;
    public DialogInterface$OnDismissListener c;

    public void TimePickerDialogFragment(){
       super();
    }
    public Dialog onCreateDialog(Bundle p0){
       int intx;
       boolean b1;
       int i4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyOneRefs(p0, this, TimePickerDialogFragment.class, "1");
       if (p0 != patchProxyRe) {
          return p0;
       }
       p0 = this.getArguments();
       FragmentActivity activity = this.getActivity();
       TimePickerDialogFragment tb = this.b;
       a uoa = PatchProxy.applyThreeRefs(p0, activity, tb, null, TimePickerDialogFragment.class, "2");
       if (uoa != patchProxyRe) {
       }else {
          Calendar instance = Calendar.getInstance();
          int i = 11;
          int i1 = instance.get(i);
          int i2 = 12;
          int i3 = instance.get(i2);
          boolean b = DateFormat.is24HourFormat(activity);
          TimePickerMode dEFAULT = TimePickerMode.DEFAULT;
          if (p0 != null) {
             String str = "mode";
             if (p0.getString(str, null) != null) {
                dEFAULT = TimePickerMode.valueOf((p0.getString(str)).toUpperCase(Locale.US));
             }
          }
          if (p0 != null) {
             intx = p0.getInt("minute", instance.get(i2));
             b1 = p0.getBoolean("is24Hour", DateFormat.is24HourFormat(activity));
             i4 = p0.getInt("hour", instance.get(i));
          }else {
             i4 = i1;
             intx = i3;
             b1 = b;
          }
          String str1 = "style";
          if (dEFAULT == TimePickerMode.CLOCK) {
             uoa = new a(activity, activity.getResources().getIdentifier("ClockTimePickerDialog", str1, activity.getPackageName()), tb, i4, intx, b1);
          }else if(dEFAULT == TimePickerMode.SPINNER){
             uoa = new a(activity, activity.getResources().getIdentifier("SpinnerTimePickerDialog", str1, activity.getPackageName()), tb, i4, intx, b1);
          }else {
             uoa = new a(activity, tb, i4, intx, b1);
          }
       }
       return uoa;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimePickerDialogFragment.class, "3")) {
          return;
       }
       super.onDismiss(p0);
       TimePickerDialogFragment tc = this.c;
       if (tc != null) {
          tc.onDismiss(p0);
       }
       return;
    }
}
