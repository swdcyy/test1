package com.zyu.ReactWheelCurvedPicker$a;
import com.aigestudio.wheelpicker.core.AbstractWheelPicker$a;
import com.zyu.ReactWheelCurvedPicker;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import spd.a;
import android.view.View;
import java.lang.Integer;
import df.b;
import df.c;

public class ReactWheelCurvedPicker$a implements AbstractWheelPicker$a	// class@000c77
{
    public final ReactWheelCurvedPicker a;

    public void ReactWheelCurvedPicker$a(ReactWheelCurvedPicker p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
    }
    public void b(float p0,float p1){
    }
    public void c(int p0,String p1){
       ReactWheelCurvedPicker a1 = this.a.a1;
       if (a1 != null && p0 < a1.size()) {
          ReactWheelCurvedPicker$a ta = this.a;
          ta.Z0.c(new a(ta.getId(), this.a.a1.get(p0).intValue()));
       }
       return;
    }
}
