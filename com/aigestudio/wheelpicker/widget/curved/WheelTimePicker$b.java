package com.aigestudio.wheelpicker.widget.curved.WheelTimePicker$b;
import com.aigestudio.wheelpicker.core.AbstractWheelPicker$a;
import com.aigestudio.wheelpicker.widget.curved.WheelTimePicker;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public class WheelTimePicker$b implements AbstractWheelPicker$a	// class@000d78
{
    public final int a;
    public final WheelTimePicker b;

    public void WheelTimePicker$b(WheelTimePicker p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0){
       WheelTimePicker$b ta = this.a;
       if (ta == null) {
          this.b.h = p0;
       }
       if (ta == 1) {
          this.b.i = p0;
       }
       WheelTimePicker$b tb = this.b;
       WheelTimePicker d = tb.d;
       if (d != null) {
          if (tb.h == null && tb.i == null) {
             d.a(0);
          }
          if (tb.h == 2 || tb.i == 2) {
             d.a(2);
          }
          if ((tb.h + tb.i) == 1) {
             d.a(1);
          }
       }
       return;
    }
    public void b(float p0,float p1){
       WheelTimePicker d = this.b.d;
       if (d != null) {
          d.b(p0, p1);
       }
       return;
    }
    public void c(int p0,String p1){
       WheelTimePicker$b ta = this.a;
       if (ta == null) {
          this.b.e = p1;
       }
       StringBuilder str = 1;
       if (ta == str) {
          ta.f = p1;
       }
       ta = this.b;
       if (TextUtils.isEmpty(ta.e) || TextUtils.isEmpty(ta.f)) {
          str = null;
       }
       if (str) {
          WheelTimePicker d = this.b.d;
          if (d != null) {
             d.c(-1, this.b.e+":"+this.b.f);
          }
       }
       return;
    }
}
