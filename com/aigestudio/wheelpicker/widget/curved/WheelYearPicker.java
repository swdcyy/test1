package com.aigestudio.wheelpicker.widget.curved.WheelYearPicker;
import com.aigestudio.wheelpicker.view.WheelCurvedPicker;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import android.content.Context;
import android.util.AttributeSet;
import com.aigestudio.wheelpicker.view.WheelCrossPicker;
import java.util.Calendar;
import java.lang.Math;
import com.aigestudio.wheelpicker.core.AbstractWheelPicker;
import java.lang.RuntimeException;

public class WheelYearPicker extends WheelCurvedPicker	// class@000d7a
{
    public List Z0;
    public int a1;
    public int b1;
    public int c1;
    public static final List d1;

    static {
       WheelYearPicker.d1 = new ArrayList();
       for (int i = 1900; i <= 2100; i = i + 1) {
          WheelYearPicker.d1.add(String.valueOf(i));
       }
    }
    public void WheelYearPicker(Context p0){
       super(p0);
       this.Z0 = WheelYearPicker.d1;
       this.a1 = 1900;
       this.b1 = 2100;
       this.p();
    }
    public void WheelYearPicker(Context p0,AttributeSet p1){
       super(p0, p1);
       this.Z0 = WheelYearPicker.d1;
       this.a1 = 1900;
       this.b1 = 2100;
       this.p();
    }
    public final void p(){
       super.setData(this.Z0);
       this.setCurrentYear(Calendar.getInstance().get(1));
    }
    public void setCurrentYear(int p0){
       p0 = Math.min(Math.max(p0, this.a1), this.b1);
       this.c1 = p0;
       this.setItemIndex((p0 - this.a1));
    }
    public void setData(List p0){
       throw new RuntimeException("Set data will not allow here!");
    }
}
