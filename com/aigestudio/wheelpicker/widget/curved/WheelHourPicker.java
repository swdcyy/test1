package com.aigestudio.wheelpicker.widget.curved.WheelHourPicker;
import u4.a;
import com.aigestudio.wheelpicker.view.WheelCurvedPicker;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.lang.StringBuilder;
import android.content.Context;
import android.util.AttributeSet;
import com.aigestudio.wheelpicker.view.WheelCrossPicker;
import java.util.Calendar;
import java.lang.Math;
import com.aigestudio.wheelpicker.core.AbstractWheelPicker;
import java.lang.RuntimeException;

public class WheelHourPicker extends WheelCurvedPicker implements a	// class@000d74
{
    public List Z0;
    public int a1;
    public static final List b1;
    public static final List c1;

    static {
       WheelHourPicker.b1 = new ArrayList();
       WheelHourPicker.c1 = new ArrayList();
       int i = 0;
       int i1 = 0;
       List list = 24;
       while (i1 < list) {
          WheelHourPicker.b1.add(String.valueOf(i1));
          i1 = i1 + 1;
       }
       for (; i < list; i = i + 1) {
          String str = String.valueOf(i);
          if (str.length() == 1) {
             str = "0"+str;
          }
          WheelHourPicker.c1.add(str);
       }
    }
    public void WheelHourPicker(Context p0){
       super(p0);
       this.Z0 = WheelHourPicker.b1;
       this.p();
    }
    public void WheelHourPicker(Context p0,AttributeSet p1){
       super(p0, p1);
       this.Z0 = WheelHourPicker.b1;
       this.p();
    }
    public final void p(){
       super.setData(this.Z0);
       this.setCurrentHour(Calendar.getInstance().get(11));
    }
    public void setCurrentHour(int p0){
       p0 = Math.min(Math.max(p0, 0), 23);
       this.a1 = p0;
       this.setItemIndex(p0);
    }
    public void setData(List p0){
       throw new RuntimeException("Set data will not allow here!");
    }
    public void setDigitType(int p0){
       this.Z0 = (p0 == 1)? WheelHourPicker.b1: WheelHourPicker.c1;
       super.setData(this.Z0);
       return;
    }
}
