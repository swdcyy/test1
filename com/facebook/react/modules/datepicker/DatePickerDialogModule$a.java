package com.facebook.react.modules.datepicker.DatePickerDialogModule$a;
import android.app.DatePickerDialog$OnDateSetListener;
import android.content.DialogInterface$OnDismissListener;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import android.widget.DatePicker;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.WritableMap;
import android.content.DialogInterface;

public class DatePickerDialogModule$a implements DatePickerDialog$OnDateSetListener, DialogInterface$OnDismissListener	// class@0012a3
{
    public final Promise b;
    public boolean c;
    public final DatePickerDialogModule d;

    public void DatePickerDialogModule$a(DatePickerDialogModule p0,Promise p1){
       this.d = p0;
       super();
       this.c = false;
       this.b = p1;
    }
    public void onDateSet(DatePicker p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(DatePickerDialogModule$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, DatePickerDialogModule$a.class, "1")) {
          return;
       }
       if (this.c == null && this.d.getReactApplicationContext().hasActiveCatalystInstance()) {
          WritableNativeMap writableNati = new WritableNativeMap();
          writableNati.putString("action", "dateSetAction");
          writableNati.putInt("year", p1);
          writableNati.putInt("month", p2);
          writableNati.putInt("day", p3);
          this.b.resolve(writableNati);
          this.c = true;
       }
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DatePickerDialogModule$a.class, "2")) {
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
}
