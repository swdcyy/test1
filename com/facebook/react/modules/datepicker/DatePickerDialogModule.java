package com.facebook.react.modules.datepicker.DatePickerDialogModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.Promise;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.DialogFragment;
import com.facebook.react.modules.datepicker.DatePickerDialogFragment;
import com.facebook.react.modules.datepicker.DatePickerDialogModule$a;

public class DatePickerDialogModule extends ReactContextBaseJavaModule	// class@0012a4
{

    public void DatePickerDialogModule(ReactApplicationContext p0){
       super(p0);
    }
    public final Bundle createFragmentArguments(ReadableMap p0){
       Bundle obj = PatchProxy.applyOneRefs(p0, this, DatePickerDialogModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       String str = "date";
       if (p0.hasKey(str) && !p0.isNull(str)) {
          obj.putLong(str, (long)p0.getDouble(str));
       }
       str = "minDate";
       if (p0.hasKey(str) && !p0.isNull(str)) {
          obj.putLong(str, (long)p0.getDouble(str));
       }
       str = "maxDate";
       if (p0.hasKey(str) && !p0.isNull(str)) {
          obj.putLong(str, (long)p0.getDouble(str));
       }
       if (p0.hasKey("mode") && !p0.isNull("mode")) {
          obj.putString("mode", p0.getString("mode"));
       }
       return obj;
    }
    public String getName(){
       return "DatePickerAndroid";
    }
    public void open(ReadableMap p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DatePickerDialogModule.class, "1")) {
          return;
       }
       Activity currentActiv = this.getCurrentActivity();
       if (currentActiv == null || !currentActiv instanceof FragmentActivity) {
          p1.reject("E_NO_ACTIVITY", "Tried to open a DatePicker dialog while not attached to a FragmentActivity");
          return;
       }else {
          c supportFragm = currentActiv.getSupportFragmentManager();
          DialogFragment uDialogFragm = supportFragm.findFragmentByTag("DatePickerAndroid");
          if (uDialogFragm != null) {
             uDialogFragm.dismiss();
          }
          DatePickerDialogFragment uDatePickerD = new DatePickerDialogFragment();
          if (p0 != null) {
             uDatePickerD.setArguments(this.createFragmentArguments(p0));
          }
          DatePickerDialogModule$a uoa = new DatePickerDialogModule$a(this, p1);
          uDatePickerD.c = uoa;
          uDatePickerD.b = uoa;
          uDatePickerD.show(supportFragm, "DatePickerAndroid");
          return;
       }
    }
}
