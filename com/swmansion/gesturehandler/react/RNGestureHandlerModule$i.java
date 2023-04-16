package com.swmansion.gesturehandler.react.RNGestureHandlerModule$i;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$d;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$a;
import fn8.b;
import com.facebook.react.bridge.WritableMap;
import fn8.m;
import java.lang.String;
import fn8.l;
import ze.p;
import android.content.Context;
import java.lang.Class;

public class RNGestureHandlerModule$i extends RNGestureHandlerModule$d	// class@000c8b
{

    public void RNGestureHandlerModule$i(){
       super(null);
    }
    public void RNGestureHandlerModule$i(RNGestureHandlerModule$a p0){
       super(null);
    }
    public void a(b p0,WritableMap p1){
       super.a(p0, p1);
       p1.putDouble("rotation", p0.C);
       m b = p0.B;
       float f = Float.NaN;
       float f1 = (b == null)? Float.NaN: b.e;
       p1.putDouble("anchorX", (double)p.a(f1));
       b = p0.B;
       if (b != null) {
          f = b.f;
       }
       p1.putDouble("anchorY", (double)p.a(f));
       p1.putDouble("velocity", p0.D);
       return;
    }
    public b c(Context p0){
       return new m();
    }
    public String d(){
       return "RotationGestureHandler";
    }
    public Class e(){
       return m.class;
    }
}
