package com.yxcorp.gifshow.profile.krn.widget.ReactWheelDatePickerManager;
import com.facebook.react.uimanager.ViewGroupManager;
import ze.n0;
import android.view.View;
import com.yxcorp.gifshow.profile.krn.widget.ReactWheelDatePickerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.ReactContext;
import java.util.Map;
import vd.d$b;
import vd.d;
import java.lang.Double;
import java.util.Calendar;

public class ReactWheelDatePickerManager extends ViewGroupManager	// class@001376
{

    public void ReactWheelDatePickerManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactWheelDatePickerView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactWheelDatePickerManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactWheelDatePickerView(p0);
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       d$b obj = PatchProxy.apply(null, this, ReactWheelDatePickerManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a();
       obj.b("onDateChanged", d.d("registrationName", "onChange"));
       return obj.a();
    }
    public String getName(){
       return "KSRNDatePicker";
    }
    public void setDate(ReactWheelDatePickerView p0,double p1){
       ReactWheelDatePickerManager reactWheelDa = ReactWheelDatePickerManager.class;
       if (PatchProxy.isSupport(reactWheelDa) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, reactWheelDa, "2")) {
          return;
       }
       Calendar instance = Calendar.getInstance();
       instance.setTimeInMillis((long)p1);
       p0.setDate(instance);
       return;
    }
    public void setDatePickerMode(ReactWheelDatePickerView p0,int p1){
    }
    public void setHorizontalInsets(ReactWheelDatePickerView p0,float p1){
    }
    public void setMaximumDate(ReactWheelDatePickerView p0,double p1){
       ReactWheelDatePickerManager reactWheelDa = ReactWheelDatePickerManager.class;
       if (PatchProxy.isSupport(reactWheelDa) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, reactWheelDa, "4")) {
          return;
       }
       Calendar instance = Calendar.getInstance();
       instance.setTimeInMillis((long)p1);
       p0.setEndDate(instance);
       return;
    }
    public void setMinimumDate(ReactWheelDatePickerView p0,double p1){
       ReactWheelDatePickerManager reactWheelDa = ReactWheelDatePickerManager.class;
       if (PatchProxy.isSupport(reactWheelDa) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, reactWheelDa, "3")) {
          return;
       }
       Calendar instance = Calendar.getInstance();
       instance.setTimeInMillis((long)p1);
       p0.setStartDate(instance);
       return;
    }
}
