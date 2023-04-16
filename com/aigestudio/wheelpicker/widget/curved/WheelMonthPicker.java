package com.aigestudio.wheelpicker.widget.curved.WheelMonthPicker;
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

public class WheelMonthPicker extends WheelCurvedPicker	// class@000d76
{
    public List Z0;
    public int a1;
    public static final List b1;

    static {
       WheelMonthPicker.b1 = new ArrayList();
       for (int i = 1; i <= 12; i = i + 1) {
          WheelMonthPicker.b1.add(String.valueOf(i));
       }
    }
    public void WheelMonthPicker(Context p0){
       super(p0);
       this.Z0 = WheelMonthPicker.b1;
       this.p();
    }
    public void WheelMonthPicker(Context p0,AttributeSet p1){
       super(p0, p1);
       this.Z0 = WheelMonthPicker.b1;
       this.p();
    }
    public final void p(){
       super.setData(this.Z0);
       this.setCurrentMonth((Calendar.getInstance().get(2) + 1));
    }
    public void setCurrentMonth(int p0){
       p0 = Math.min(Math.max(p0, 1), 12);
       this.a1 = p0;
       this.setItemIndex((p0 - 1));
    }
    public void setData(List p0){
       throw new RuntimeException("Set data will not allow here!");
    }
}
