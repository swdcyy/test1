package com.facebook.react.modules.datepicker.DatePickerDialogFragment;
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
import com.facebook.react.modules.datepicker.DatePickerMode;
import java.util.Locale;
import com.facebook.react.modules.datepicker.DatePickerDialogFragment$a;
import java.lang.Enum;
import ke.a;
import android.content.Context;
import android.app.DatePickerDialog$OnDateSetListener;
import android.view.Window;
import android.app.DatePickerDialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.widget.DatePicker;
import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;

public class DatePickerDialogFragment extends DialogFragment	// class@0012a2
{
    public DatePickerDialog$OnDateSetListener b;
    public DialogInterface$OnDismissListener c;

    public void DatePickerDialogFragment(){
       super();
    }
    public Dialog onCreateDialog(Bundle p0){
       a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyOneRefs(p0, this, DatePickerDialogFragment.class, "1");
       if (p0 != patchProxyRe) {
          return p0;
       }
       p0 = this.getArguments();
       FragmentActivity activity = this.getActivity();
       DatePickerDialogFragment tb = this.b;
       String str = PatchProxy.applyThreeRefs(p0, activity, tb, null, DatePickerDialogFragment.class, "2");
       if (str != patchProxyRe) {
       }else {
          Calendar instance = Calendar.getInstance();
          if (p0 != null) {
             str = "date";
             if (p0.containsKey(str)) {
                instance.setTimeInMillis(p0.getLong(str));
             }
          }
          int i = 1;
          int i1 = instance.get(i);
          int i2 = 2;
          int i3 = instance.get(i2);
          int i4 = instance.get(5);
          DatePickerMode dEFAULT = DatePickerMode.DEFAULT;
          String str1 = null;
          if (p0 != null) {
             String str2 = "mode";
             if (p0.getString(str2, str1) != null) {
                dEFAULT = DatePickerMode.valueOf((p0.getString(str2)).toUpperCase(Locale.US));
             }
          }
          int i5 = DatePickerDialogFragment$a.a[dEFAULT.ordinal()];
          if (i5 != i) {
             if (i5 != i2) {
                if (i5 != 3) {
                   str = str1;
                label_00bb :
                   DatePicker datePicker = str.getDatePicker();
                   i5 = 14;
                   if (p0 != null) {
                      String str3 = "minDate";
                      if (p0.containsKey(str3)) {
                         instance.setTimeInMillis(p0.getLong(str3));
                         instance.set(11, 0);
                         instance.set(12, 0);
                         instance.set(13, 0);
                         instance.set(i5, 0);
                         datePicker.setMinDate(instance.getTimeInMillis());
                      label_00f4 :
                         if (p0 != null) {
                            str3 = "maxDate";
                            if (p0.containsKey(str3)) {
                               instance.setTimeInMillis(p0.getLong(str3));
                               instance.set(11, 23);
                               instance.set(12, 59);
                               instance.set(13, 59);
                               instance.set(i5, 999);
                               datePicker.setMaxDate(instance.getTimeInMillis());
                            }
                         }
                      }
                   }
                   datePicker.setMinDate(0xfffffdfdae01dbff);
                   goto label_00f4 ;
                }else {
                   uoa = new a(activity, tb, i1, i3, i4);
                }
             }else {
                uoa = new a(activity, 0x1030073, tb, i1, i3, i4);
                v11.getWindow().setBackgroundDrawable(new ColorDrawable(0));
             }
          }else {
             uoa = new a(activity, activity.getResources().getIdentifier("CalendarDatePickerDialog", "style", activity.getPackageName()), tb, i1, i3, i4);
          }
          uoa = v11;
          goto label_00bb ;
       }
       return str;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DatePickerDialogFragment.class, "3")) {
          return;
       }
       super.onDismiss(p0);
       DatePickerDialogFragment tc = this.c;
       if (tc != null) {
          tc.onDismiss(p0);
       }
       return;
    }
}
