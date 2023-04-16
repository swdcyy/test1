package com.swmansion.gesturehandler.react.RNGestureHandlerModule$j;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$d;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$a;
import fn8.b;
import com.facebook.react.bridge.WritableMap;
import fn8.n;
import ze.p;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import android.content.Context;
import java.lang.Class;

public class RNGestureHandlerModule$j extends RNGestureHandlerModule$d	// class@000c8c
{

    public void RNGestureHandlerModule$j(){
       super(null);
    }
    public void RNGestureHandlerModule$j(RNGestureHandlerModule$a p0){
       super(null);
    }
    public void a(b p0,WritableMap p1){
       super.a(p0, p1);
       p1.putDouble("x", (double)p.a(p0.i()));
       p1.putDouble("y", (double)p.a(p0.j()));
       p1.putDouble("absoluteX", (double)p.a(p0.g()));
       p1.putDouble("absoluteY", (double)p.a(p0.h()));
    }
    public void b(b p0,ReadableMap p1){
       super.b(p0, p1);
       String str = "numberOfTaps";
       if (p1.hasKey(str)) {
          p0.G = p1.getInt(str);
       }
       str = "maxDurationMs";
       if (p1.hasKey(str)) {
          p0.E = (long)p1.getInt(str);
       }
       str = "maxDelayMs";
       if (p1.hasKey(str)) {
          p0.F = (long)p1.getInt(str);
       }
       str = "maxDeltaX";
       if (p1.hasKey(str)) {
          p0.B = p.b(p1.getDouble(str));
       }
       str = "maxDeltaY";
       if (p1.hasKey(str)) {
          p0.C = p.b(p1.getDouble(str));
       }
       str = "maxDist";
       if (p1.hasKey(str)) {
          p0.D = p.b(p1.getDouble(str)) * p.b(p1.getDouble(str));
       }
       if (p1.hasKey("minPointers")) {
          p0.H = p1.getInt("minPointers");
       }
       return;
    }
    public b c(Context p0){
       return new n();
    }
    public String d(){
       return "TapGestureHandler";
    }
    public Class e(){
       return n.class;
    }
}
