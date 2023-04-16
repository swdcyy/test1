package com.aigestudio.wheelpicker.widget.curved.WheelDatePicker;
import com.aigestudio.wheelpicker.core.a;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import s4.a;
import com.aigestudio.wheelpicker.view.WheelCrossPicker;
import java.lang.String;
import com.aigestudio.wheelpicker.widget.curved.WheelDatePicker$a;
import android.content.res.Resources;
import cw9.c;
import android.widget.LinearLayout$LayoutParams;
import com.aigestudio.wheelpicker.widget.curved.WheelYearPicker;
import com.aigestudio.wheelpicker.widget.curved.WheelMonthPicker;
import com.aigestudio.wheelpicker.widget.curved.WheelDayPicker;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.aigestudio.wheelpicker.view.WheelCurvedPicker;
import com.aigestudio.wheelpicker.widget.curved.WheelDatePicker$b;
import com.aigestudio.wheelpicker.core.AbstractWheelPicker$a;
import com.aigestudio.wheelpicker.core.AbstractWheelPicker;
import java.util.List;
import java.lang.RuntimeException;

public class WheelDatePicker extends LinearLayout implements a	// class@000d72
{
    public WheelYearPicker b;
    public WheelMonthPicker c;
    public WheelDayPicker d;
    public AbstractWheelPicker$a e;
    public String f;
    public String g;
    public String h;
    public int i;
    public int j;
    public int k;
    public int l;
    public float m;

    public void WheelDatePicker(Context p0){
       super(p0);
       this.i = 0xff000000;
       this.c();
    }
    public void WheelDatePicker(Context p0,AttributeSet p1){
       super(p0, p1);
       this.i = 0xff000000;
       this.c();
    }
    public void a(boolean p0,a p1){
       this.b.a(p0, p1);
       this.c.a(p0, p1);
       this.d.a(p0, p1);
    }
    public final void b(WheelCrossPicker p0,String p1){
       p0.a(true, new WheelDatePicker$a(this, p1));
    }
    public final void c(){
       this.setGravity(17);
       this.setOrientation(0);
       int i = c.b(this.getResources(), R.dimen.arg_RES_7f070004);
       int i1 = i * 2;
       this.m = (float)i;
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
       this.b = new WheelYearPicker(this.getContext());
       this.c = new WheelMonthPicker(this.getContext());
       this.d = new WheelDayPicker(this.getContext());
       this.b.setPadding(0, i, i1, i);
       this.c.setPadding(0, i, i1, i);
       this.d.setPadding(0, i, i1, i);
       this.b(this.b, "Äê");
       this.b(this.c, "ÔÂ");
       this.b(this.d, "ÈÕ");
       this.addView(this.b, layoutParams);
       this.addView(this.c, layoutParams);
       this.addView(this.d, layoutParams);
       this.d(this.b, 0);
       this.d(this.c, 1);
       this.d(this.d, 2);
    }
    public void clearCache(){
       this.b.clearCache();
       this.c.clearCache();
       this.d.clearCache();
    }
    public final void d(WheelCrossPicker p0,int p1){
       p0.setOnWheelChangeListener(new WheelDatePicker$b(this, p1));
    }
    public void setCurrentTextColor(int p0){
       this.b.setCurrentTextColor(p0);
       this.c.setCurrentTextColor(p0);
       this.d.setCurrentTextColor(p0);
    }
    public void setData(List p0){
       throw new RuntimeException("Set data will not allow here!");
    }
    public void setItemCount(int p0){
       this.b.setItemCount(p0);
       this.c.setItemCount(p0);
       this.d.setItemCount(p0);
    }
    public void setItemIndex(int p0){
       this.b.setItemIndex(p0);
       this.c.setItemIndex(p0);
       this.d.setItemIndex(p0);
    }
    public void setItemSpace(int p0){
       this.b.setItemSpace(p0);
       this.c.setItemSpace(p0);
       this.d.setItemSpace(p0);
    }
    public void setLabelColor(int p0){
       this.i = p0;
       this.invalidate();
    }
    public void setLabelTextSize(float p0){
       this.m = p0;
       this.invalidate();
    }
    public void setOnWheelChangeListener(AbstractWheelPicker$a p0){
       this.e = p0;
    }
    public void setTextColor(int p0){
       this.b.setTextColor(p0);
       this.c.setTextColor(p0);
       this.d.setTextColor(p0);
    }
    public void setTextSize(int p0){
       this.b.setTextSize(p0);
       this.c.setTextSize(p0);
       this.d.setTextSize(p0);
    }
}
