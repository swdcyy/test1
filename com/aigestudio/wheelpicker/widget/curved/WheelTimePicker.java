package com.aigestudio.wheelpicker.widget.curved.WheelTimePicker;
import com.aigestudio.wheelpicker.core.a;
import u4.a;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import s4.a;
import com.aigestudio.wheelpicker.view.WheelCrossPicker;
import java.lang.String;
import com.aigestudio.wheelpicker.widget.curved.WheelTimePicker$a;
import android.content.res.Resources;
import cw9.c;
import android.widget.LinearLayout$LayoutParams;
import com.aigestudio.wheelpicker.widget.curved.WheelHourPicker;
import com.aigestudio.wheelpicker.widget.curved.WheelMinutePicker;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.aigestudio.wheelpicker.view.WheelCurvedPicker;
import com.aigestudio.wheelpicker.widget.curved.WheelTimePicker$b;
import com.aigestudio.wheelpicker.core.AbstractWheelPicker$a;
import com.aigestudio.wheelpicker.core.AbstractWheelPicker;
import java.util.List;
import java.lang.RuntimeException;

public class WheelTimePicker extends LinearLayout implements a, a	// class@000d79
{
    public WheelHourPicker b;
    public WheelMinutePicker c;
    public AbstractWheelPicker$a d;
    public String e;
    public String f;
    public int g;
    public int h;
    public int i;
    public float j;

    public void WheelTimePicker(Context p0){
       super(p0);
       this.g = 0xff000000;
       this.c();
    }
    public void WheelTimePicker(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g = 0xff000000;
       this.c();
    }
    public void a(boolean p0,a p1){
       this.b.a(p0, p1);
       this.c.a(p0, p1);
    }
    public final void b(WheelCrossPicker p0,String p1){
       p0.a(true, new WheelTimePicker$a(this, p1));
    }
    public final void c(){
       this.setGravity(17);
       this.setOrientation(0);
       int i = c.b(this.getResources(), R.dimen.arg_RES_7f070004);
       int i1 = i * 2;
       this.j = (float)i;
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
       this.b = new WheelHourPicker(this.getContext());
       this.c = new WheelMinutePicker(this.getContext());
       this.b.setPadding(0, i, i1, i);
       this.c.setPadding(0, i, i1, i);
       this.b(this.b, "Ê±");
       this.b(this.c, "·Ö");
       this.addView(this.b, layoutParams);
       this.addView(this.c, layoutParams);
       this.d(this.b, 0);
       this.d(this.c, 1);
    }
    public void clearCache(){
       this.b.clearCache();
       this.c.clearCache();
    }
    public final void d(WheelCrossPicker p0,int p1){
       p0.setOnWheelChangeListener(new WheelTimePicker$b(this, p1));
    }
    public void setCurrentTextColor(int p0){
       this.b.setCurrentTextColor(p0);
       this.c.setCurrentTextColor(p0);
    }
    public void setData(List p0){
       throw new RuntimeException("Set data will not allow here!");
    }
    public void setDigitType(int p0){
       this.b.setDigitType(p0);
       this.c.setDigitType(p0);
    }
    public void setItemCount(int p0){
       this.b.setItemCount(p0);
       this.c.setItemCount(p0);
    }
    public void setItemIndex(int p0){
       this.b.setItemIndex(p0);
       this.c.setItemIndex(p0);
    }
    public void setItemSpace(int p0){
       this.b.setItemSpace(p0);
       this.c.setItemSpace(p0);
    }
    public void setLabelColor(int p0){
       this.g = p0;
       this.invalidate();
    }
    public void setLabelTextSize(float p0){
       this.j = p0;
       this.invalidate();
    }
    public void setOnWheelChangeListener(AbstractWheelPicker$a p0){
       this.d = p0;
    }
    public void setTextColor(int p0){
       this.b.setTextColor(p0);
       this.c.setTextColor(p0);
    }
    public void setTextSize(int p0){
       this.b.setTextSize(p0);
       this.c.setTextSize(p0);
    }
}
