package com.zyu.ReactWheelCurvedPicker;
import com.aigestudio.wheelpicker.view.WheelCurvedPicker;
import com.facebook.react.bridge.ReactContext;
import android.content.Context;
import java.lang.Integer;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import df.c;
import com.zyu.ReactWheelCurvedPicker$a;
import com.aigestudio.wheelpicker.core.AbstractWheelPicker$a;
import com.aigestudio.wheelpicker.core.AbstractWheelPicker;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.aigestudio.wheelpicker.view.WheelCrossPicker;
import android.graphics.Rect;
import java.lang.Runnable;
import android.os.Handler;
import java.util.List;

public class ReactWheelCurvedPicker extends WheelCurvedPicker	// class@000c78
{
    public final c Z0;
    public List a1;
    public Integer b1;
    public float c1;

    public void ReactWheelCurvedPicker(ReactContext p0){
       super(p0);
       this.b1 = Integer.valueOf(-3355444);
       this.c1 = 0x41f00000;
       this.Z0 = p0.getNativeModule(UIManagerModule.class).getEventDispatcher();
       this.setOnWheelChangeListener(new ReactWheelCurvedPicker$a(this));
    }
    public void c(Canvas p0){
       Paint paint = new Paint();
       paint.setColor(this.b1.intValue());
       p0.drawRoundRect(new RectF(this.K), this.c1, this.c1, paint);
    }
    public int getState(){
       return this.m;
    }
    public void setItemIndex(int p0){
       super.setItemIndex(p0);
       this.O = 0;
       this.h.post(this);
    }
    public void setPickedBackgroundColor(Integer p0){
       this.b1 = p0;
    }
    public void setPickedBackgroundRadius(float p0){
       this.c1 = p0;
    }
    public void setValueData(List p0){
       this.a1 = p0;
    }
}
