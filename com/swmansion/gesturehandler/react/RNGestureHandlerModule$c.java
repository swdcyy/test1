package com.swmansion.gesturehandler.react.RNGestureHandlerModule$c;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$d;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$a;
import fn8.b;
import com.facebook.react.bridge.WritableMap;
import fn8.a;
import ze.p;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import android.content.Context;
import java.lang.Class;

public class RNGestureHandlerModule$c extends RNGestureHandlerModule$d	// class@000c85
{

    public void RNGestureHandlerModule$c(){
       super(null);
    }
    public void RNGestureHandlerModule$c(RNGestureHandlerModule$a p0){
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
       String str = "numberOfPointers";
       if (p1.hasKey(str)) {
          p0.E = p1.getInt(str);
       }
       if (p1.hasKey("direction")) {
          p0.D = p1.getInt("direction");
       }
       return;
    }
    public b c(Context p0){
       return new a();
    }
    public String d(){
       return "FlingGestureHandler";
    }
    public Class e(){
       return a.class;
    }
}
