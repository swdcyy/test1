package com.facebook.react.modules.timepicker.TimePickerDialogModule$a;
import android.app.TimePickerDialog$OnTimeSetListener;
import android.content.DialogInterface$OnDismissListener;
import com.facebook.react.modules.timepicker.TimePickerDialogModule;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.WritableMap;
import android.widget.TimePicker;
import java.lang.Integer;

public class TimePickerDialogModule$a implements TimePickerDialog$OnTimeSetListener, DialogInterface$OnDismissListener	// class@0012f4
{
    public final Promise b;
    public boolean c;
    public final TimePickerDialogModule d;

    public void TimePickerDialogModule$a(TimePickerDialogModule p0,Promise p1){
       this.d = p0;
       super();
       this.c = false;
       this.b = p1;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimePickerDialogModule$a.class, "2")) {
          return;
       }
       if (this.c == null && this.d.getReactApplicationContext().hasActiveCatalystInstance()) {
          WritableNativeMap writableNati = new WritableNativeMap();
          writableNati.putString("action", "dismissedAction");
          this.b.resolve(writableNati);
          this.c = true;
       }
       return;
    }
    public void onTimeSet(TimePicker p0,int p1,int p2){
       if (PatchProxy.isSupport(TimePickerDialogModule$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TimePickerDialogModule$a.class, "1")) {
          return;
       }
       if (this.c == null && this.d.getReactApplicationContext().hasActiveCatalystInstance()) {
          WritableNativeMap writableNati = new WritableNativeMap();
          writableNati.putString("action", "timeSetAction");
          writableNati.putInt("hour", p1);
          writableNati.putInt("minute", p2);
          this.b.resolve(writableNati);
          this.c = true;
       }
       return;
    }
}
