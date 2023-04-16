package com.zyu.ReactWheelCurvedPickerManager;
import com.facebook.react.uimanager.SimpleViewManager;
import ze.n0;
import android.view.View;
import com.zyu.ReactWheelCurvedPicker;
import com.facebook.react.bridge.ReactContext;
import com.aigestudio.wheelpicker.core.AbstractWheelPicker;
import com.aigestudio.wheelpicker.view.WheelCrossPicker;
import java.util.Map;
import java.lang.Object;
import vd.d;
import java.lang.String;
import java.lang.Integer;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;
import com.facebook.react.bridge.ReadableMap;
import java.util.List;
import ze.p;

public class ReactWheelCurvedPickerManager extends SimpleViewManager	// class@000c79
{

    public void ReactWheelCurvedPickerManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactWheelCurvedPicker createViewInstance(n0 p0){
       ReactWheelCurvedPicker reactWheelCu = new ReactWheelCurvedPicker(p0);
       reactWheelCu.setTextColor(-3355444);
       reactWheelCu.setCurrentTextColor(-1);
       reactWheelCu.setTextSize(50);
       reactWheelCu.setItemSpace(28);
       return reactWheelCu;
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       return d.d("wheelCurvedPickerPageSelected", d.d("registrationName", "onValueChange"));
    }
    public String getName(){
       return "WheelCurvedPicker";
    }
    public void setCurrentTextColor(ReactWheelCurvedPicker p0,Integer p1){
       if (p0 != null) {
          p0.setCurrentTextColor(p1.intValue());
       }
       return;
    }
    public void setData(ReactWheelCurvedPicker p0,ReadableArray p1){
       if (p0 != null) {
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          for (int i = 0; i < p1.size(); i = i + 1) {
             ReadableMap map = p1.getMap(i);
             uArrayList.add(Integer.valueOf(map.getInt("value")));
             uArrayList1.add(map.getString("label"));
          }
          p0.setValueData(uArrayList);
          p0.setData(uArrayList1);
       }
       return;
    }
    public void setItemSpace(ReactWheelCurvedPicker p0,int p1){
       if (p0 != null) {
          p0.setItemSpace((int)p.c((float)p1));
       }
       return;
    }
    public void setPickedBackgroundColor(ReactWheelCurvedPicker p0,Integer p1){
       if (p0 != null) {
          p0.setPickedBackgroundColor(p1);
       }
       return;
    }
    public void setPickedBackgroundRadius(ReactWheelCurvedPicker p0,float p1){
       if (p0 != null) {
          p0.setPickedBackgroundRadius(p1);
       }
       return;
    }
    public void setSelectedIndex(ReactWheelCurvedPicker p0,int p1){
       if (p0 != null && !p0.getState()) {
          p0.setItemIndex(p1);
          p0.invalidate();
       }
       return;
    }
    public void setTextColor(ReactWheelCurvedPicker p0,Integer p1){
       if (p0 != null) {
          p0.setTextColor(p1.intValue());
       }
       return;
    }
    public void setTextSize(ReactWheelCurvedPicker p0,int p1){
       if (p0 != null) {
          p0.setTextSize((int)p.c((float)p1));
       }
       return;
    }
}
