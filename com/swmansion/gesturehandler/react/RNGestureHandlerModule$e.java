package com.swmansion.gesturehandler.react.RNGestureHandlerModule$e;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$d;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$a;
import fn8.b;
import com.facebook.react.bridge.WritableMap;
import fn8.g;
import ze.p;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import android.content.Context;
import java.lang.Class;

public class RNGestureHandlerModule$e extends RNGestureHandlerModule$d	// class@000c87
{

    public void RNGestureHandlerModule$e(){
       super(null);
    }
    public void RNGestureHandlerModule$e(RNGestureHandlerModule$a p0){
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
       String str = "minDurationMs";
       if (p1.hasKey(str)) {
          p0.B = (long)p1.getInt(str);
       }
       str = "maxDist";
       if (p1.hasKey(str)) {
          p0.C = p.b(p1.getDouble(str)) * p.b(p1.getDouble(str));
       }
       return;
    }
    public b c(Context p0){
       return new g(p0);
    }
    public String d(){
       return "LongPressGestureHandler";
    }
    public Class e(){
       return g.class;
    }
}
