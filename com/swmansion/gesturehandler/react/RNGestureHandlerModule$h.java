package com.swmansion.gesturehandler.react.RNGestureHandlerModule$h;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$d;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$a;
import fn8.b;
import com.facebook.react.bridge.WritableMap;
import fn8.k;
import java.lang.String;
import android.view.ScaleGestureDetector;
import ze.p;
import android.content.Context;
import java.lang.Class;

public class RNGestureHandlerModule$h extends RNGestureHandlerModule$d	// class@000c8a
{

    public void RNGestureHandlerModule$h(){
       super(null);
    }
    public void RNGestureHandlerModule$h(RNGestureHandlerModule$a p0){
       super(null);
    }
    public void a(b p0,WritableMap p1){
       super.a(p0, p1);
       p1.putDouble("scale", p0.C);
       k b = p0.B;
       float f = Float.NaN;
       float f1 = (b == null)? Float.NaN: b.getFocusX();
       p1.putDouble("focalX", (double)p.a(f1));
       b = p0.B;
       if (b != null) {
          f = b.getFocusY();
       }
       p1.putDouble("focalY", (double)p.a(f));
       p1.putDouble("velocity", p0.D);
       return;
    }
    public b c(Context p0){
       return new k();
    }
    public String d(){
       return "PinchGestureHandler";
    }
    public Class e(){
       return k.class;
    }
}
