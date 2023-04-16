package com.aigestudio.wheelpicker.widget.curved.WheelDatePicker$b;
import com.aigestudio.wheelpicker.core.AbstractWheelPicker$a;
import com.aigestudio.wheelpicker.widget.curved.WheelDatePicker;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import com.aigestudio.wheelpicker.widget.curved.WheelDayPicker;
import com.aigestudio.wheelpicker.view.WheelCrossPicker;
import com.aigestudio.wheelpicker.core.AbstractWheelPicker;
import s4.c;
import t4.c;
import java.lang.Runnable;
import android.os.Handler;
import java.lang.StringBuilder;

public class WheelDatePicker$b implements AbstractWheelPicker$a	// class@000d71
{
    public final int a;
    public final WheelDatePicker b;

    public void WheelDatePicker$b(WheelDatePicker p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0){
       WheelDatePicker$b ta = this.a;
       if (ta == null) {
          this.b.j = p0;
       }
       if (ta == 1) {
          this.b.k = p0;
       }
       int i = 2;
       if (ta == i) {
          this.b.l = p0;
       }
       WheelDatePicker$b tb = this.b;
       WheelDatePicker e = tb.e;
       if (e != null) {
          if (tb.j == null && (tb.k == null && tb.l == null)) {
             e.a(0);
          }
       label_002c :
          if (tb.j != i && (tb.k == i || tb.l == i)) {
             e.a(i);
          }
          if (((tb.j + tb.k) + tb.l) == 1) {
             e.a(1);
          }
       }
       return;
    }
    public void b(float p0,float p1){
       WheelDatePicker e = this.b.e;
       if (e != null) {
          e.b(p0, p1);
       }
       return;
    }
    public void c(int p0,String p1){
       WheelDatePicker$b ta = this.a;
       if (ta == null) {
          this.b.f = p1;
       }
       WheelDatePicker$b uob = 1;
       if (ta == uob) {
          this.b.g = p1;
       }
       if (ta == 2) {
          ta.h = p1;
       }
       ta = this.b;
       ta = (!TextUtils.isEmpty(ta.f) && (!TextUtils.isEmpty(ta.g) && !TextUtils.isEmpty(ta.h)))? 1: null;
       if (ta) {
          ta = this.a;
          if (ta == null || ta == uob) {
             ta = this.b;
             WheelDatePicker d = ta.d;
             d.setYear(Integer.valueOf(ta.f).intValue());
             d.setMonth(Integer.valueOf(this.b.g).intValue());
             d.q();
             WheelCrossPicker o = d.O;
             WheelCrossPicker q = d.Q;
             if (o > q) {
                d.I.t(d.c, o, (q - o));
             }
             o = d.O;
             q = d.P;
             if (o < q) {
                d.I.t(d.c, o, (q - o));
             }
             d.h.post(d);
          }
          WheelDatePicker e = this.b.e;
          if (e != null) {
             e.c(-1, this.b.f+"-"+this.b.g+"-"+this.b.h);
          }
       }
       return;
    }
}
