package com.swmansion.gesturehandler.react.RNGestureHandlerModule$f;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$d;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$a;
import fn8.b;
import com.facebook.react.bridge.WritableMap;
import fn8.h;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import android.content.Context;
import java.lang.Class;

public class RNGestureHandlerModule$f extends RNGestureHandlerModule$d	// class@000c88
{

    public void RNGestureHandlerModule$f(){
       super(null);
    }
    public void RNGestureHandlerModule$f(RNGestureHandlerModule$a p0){
       super(null);
    }
    public void a(b p0,WritableMap p1){
       super.a(p0, p1);
       p1.putBoolean("pointerInside", p0.h);
    }
    public void b(b p0,ReadableMap p1){
       super.b(p0, p1);
       String str = "shouldActivateOnStart";
       if (p1.hasKey(str)) {
          p0.B = p1.getBoolean(str);
       }
       if (p1.hasKey("disallowInterruption")) {
          p0.C = p1.getBoolean("disallowInterruption");
       }
       return;
    }
    public b c(Context p0){
       return new h();
    }
    public String d(){
       return "NativeViewGestureHandler";
    }
    public Class e(){
       return h.class;
    }
}
