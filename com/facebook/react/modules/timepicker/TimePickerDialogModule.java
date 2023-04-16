package com.facebook.react.modules.timepicker.TimePickerDialogModule;
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
import com.facebook.react.modules.timepicker.TimePickerDialogFragment;
import com.facebook.react.modules.timepicker.TimePickerDialogModule$a;

public class TimePickerDialogModule extends ReactContextBaseJavaModule	// class@0012f5
{

    public void TimePickerDialogModule(ReactApplicationContext p0){
       super(p0);
    }
    public final Bundle createFragmentArguments(ReadableMap p0){
       Bundle obj = PatchProxy.applyOneRefs(p0, this, TimePickerDialogModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       String str = "hour";
       if (p0.hasKey(str) && !p0.isNull(str)) {
          obj.putInt(str, p0.getInt(str));
       }
       str = "minute";
       if (p0.hasKey(str) && !p0.isNull(str)) {
          obj.putInt(str, p0.getInt(str));
       }
       str = "is24Hour";
       if (p0.hasKey(str) && !p0.isNull(str)) {
          obj.putBoolean(str, p0.getBoolean(str));
       }
       if (p0.hasKey("mode") && !p0.isNull("mode")) {
          obj.putString("mode", p0.getString("mode"));
       }
       return obj;
    }
    public String getName(){
       return "TimePickerAndroid";
    }
    public void open(ReadableMap p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TimePickerDialogModule.class, "1")) {
          return;
       }
       Activity currentActiv = this.getCurrentActivity();
       if (currentActiv == null || !currentActiv instanceof FragmentActivity) {
          p1.reject("E_NO_ACTIVITY", "Tried to open a DatePicker dialog while not attached to a FragmentActivity");
          return;
       }else {
          c supportFragm = currentActiv.getSupportFragmentManager();
          DialogFragment uDialogFragm = supportFragm.findFragmentByTag("TimePickerAndroid");
          if (uDialogFragm != null) {
             uDialogFragm.dismiss();
          }
          TimePickerDialogFragment timePickerDi = new TimePickerDialogFragment();
          if (p0 != null) {
             timePickerDi.setArguments(this.createFragmentArguments(p0));
          }
          TimePickerDialogModule$a uoa = new TimePickerDialogModule$a(this, p1);
          timePickerDi.c = uoa;
          timePickerDi.b = uoa;
          timePickerDi.show(supportFragm, "TimePickerAndroid");
          return;
       }
    }
}
