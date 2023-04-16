package com.aigestudio.wheelpicker.widget.curved.WheelMinutePicker;
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

public class WheelMinutePicker extends WheelCurvedPicker implements a	// class@000d75
{
    public List Z0;
    public int a1;
    public static final List b1;
    public static final List c1;

    static {
       WheelMinutePicker.b1 = new ArrayList();
       WheelMinutePicker.c1 = new ArrayList();
       int i = 0;
       int i1 = 0;
       List list = 60;
       while (i1 < list) {
          WheelMinutePicker.b1.add(String.valueOf(i1));
          i1 = i1 + 1;
       }
       for (; i < list; i = i + 1) {
          String str = String.valueOf(i);
          if (str.length() == 1) {
             str = "0"+str;
          }
          WheelMinutePicker.c1.add(str);
       }
    }
    public void WheelMinutePicker(Context p0){
       super(p0);
       this.Z0 = WheelMinutePicker.b1;
       this.p();
    }
    public void WheelMinutePicker(Context p0,AttributeSet p1){
       super(p0, p1);
       this.Z0 = WheelMinutePicker.b1;
       this.p();
    }
    public final void p(){
       super.setData(this.Z0);
       this.setCurrentMinute(Calendar.getInstance().get(12));
    }
    public void setCurrentMinute(int p0){
       p0 = Math.min(Math.max(p0, 0), 59);
       this.a1 = p0;
       this.setItemIndex(p0);
    }
    public void setData(List p0){
       throw new RuntimeException("Set data will not allow here!");
    }
    public void setDigitType(int p0){
       this.Z0 = (p0 == 1)? WheelMinutePicker.b1: WheelMinutePicker.c1;
       super.setData(this.Z0);
       return;
    }
}
