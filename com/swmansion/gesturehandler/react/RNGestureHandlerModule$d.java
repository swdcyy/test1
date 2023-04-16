package com.swmansion.gesturehandler.react.RNGestureHandlerModule$d;
import gn8.b;
import java.lang.Object;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$a;
import fn8.b;
import com.facebook.react.bridge.WritableMap;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import android.content.Context;
import java.lang.Class;

public abstract class RNGestureHandlerModule$d implements b	// class@000c86
{

    public void RNGestureHandlerModule$d(){
       super();
    }
    public void RNGestureHandlerModule$d(RNGestureHandlerModule$a p0){
       super();
    }
    public void a(b p0,WritableMap p1){
       p1.putDouble("numberOfPointers", (double)p0.q);
    }
    public void b(b p0,ReadableMap p1){
       String str = "shouldCancelWhenOutside";
       if (p1.hasKey(str)) {
          p0.v(p1.getBoolean(str));
       }
       str = "enabled";
       if (p1.hasKey(str)) {
          boolean booleanx = p1.getBoolean(str);
          if (p0.d != null) {
             p0.c();
          }
          p0.i = booleanx;
       }
       if (p1.hasKey("hitSlop")) {
          RNGestureHandlerModule.handleHitSlopProperty(p0, p1);
       }
       return;
    }
    public abstract b c(Context p0);
    public abstract String d();
    public abstract Class e();
}
