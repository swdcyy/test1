package com.aigestudio.wheelpicker.widget.curved.WheelDayPicker;
import com.aigestudio.wheelpicker.view.WheelCurvedPicker;
import java.util.HashMap;
import java.util.Calendar;
import android.content.Context;
import java.util.ArrayList;
import android.util.AttributeSet;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import com.aigestudio.wheelpicker.view.WheelCrossPicker;
import com.aigestudio.wheelpicker.core.AbstractWheelPicker;
import java.lang.Math;
import java.lang.RuntimeException;

public class WheelDayPicker extends WheelCurvedPicker	// class@000d73
{
    public List Z0;
    public int a1;
    public int b1;
    public int c1;
    public int d1;
    public static final HashMap e1;
    public static final Calendar f1;

    static {
       WheelDayPicker.e1 = new HashMap();
       WheelDayPicker.f1 = Calendar.getInstance();
    }
    public void WheelDayPicker(Context p0){
       super(p0);
       this.Z0 = new ArrayList();
       Calendar uCalendar = WheelDayPicker.f1;
       this.a1 = uCalendar.get(5);
       this.b1 = uCalendar.get(2) + 1;
       this.c1 = uCalendar.get(1);
       this.p();
    }
    public void WheelDayPicker(Context p0,AttributeSet p1){
       super(p0, p1);
       this.Z0 = new ArrayList();
       Calendar uCalendar = WheelDayPicker.f1;
       this.a1 = uCalendar.get(5);
       this.b1 = uCalendar.get(2) + 1;
       this.c1 = uCalendar.get(1);
       this.p();
    }
    public final void p(){
       this.q();
       this.r();
    }
    public final void q(){
       List list;
       int actualMaximu = WheelDayPicker.f1.getActualMaximum(5);
       if (actualMaximu == this.d1) {
          return;
       }
       this.d1 = actualMaximu;
       HashMap e1 = WheelDayPicker.e1;
       if (e1.containsKey(Integer.valueOf(actualMaximu))) {
          list = e1.get(Integer.valueOf(actualMaximu));
       }else {
          ArrayList uArrayList = new ArrayList();
          for (int i = 1; i <= actualMaximu; i = i + 1) {
             uArrayList.add(String.valueOf(i));
          }
          WheelDayPicker.e1.put(Integer.valueOf(actualMaximu), uArrayList);
          list = uArrayList;
       }
       this.Z0 = list;
       super.setData(list);
       return;
    }
    public final void r(){
       this.setItemIndex((this.a1 - 1));
    }
    public void setCurrentDay(int p0){
       this.a1 = Math.min(Math.max(p0, 1), this.d1);
       this.r();
    }
    public void setCurrentMonth(int p0){
       this.setMonth(p0);
       this.q();
    }
    public void setCurrentYear(int p0){
       this.setYear(p0);
       this.q();
    }
    public void setData(List p0){
       throw new RuntimeException("Set data will not allow here!");
    }
    public final void setMonth(int p0){
       p0 = Math.min(Math.max(p0, 1), 12);
       this.b1 = p0;
       WheelDayPicker.f1.set(2, (p0 - 1));
    }
    public final void setYear(int p0){
       p0 = Math.min(Math.max(p0, 1), 0x7ffffffe);
       this.c1 = p0;
       WheelDayPicker.f1.set(1, p0);
    }
}
