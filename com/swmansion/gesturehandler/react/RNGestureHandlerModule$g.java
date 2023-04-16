package com.swmansion.gesturehandler.react.RNGestureHandlerModule$g;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$d;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$a;
import fn8.b;
import com.facebook.react.bridge.WritableMap;
import fn8.j;
import ze.p;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import android.content.Context;
import java.lang.Class;

public class RNGestureHandlerModule$g extends RNGestureHandlerModule$d	// class@000c89
{

    public void RNGestureHandlerModule$g(){
       super(null);
    }
    public void RNGestureHandlerModule$g(RNGestureHandlerModule$a p0){
       super(null);
    }
    public void a(b p0,WritableMap p1){
       super.a(p0, p1);
       p1.putDouble("x", (double)p.a(p0.i()));
       p1.putDouble("y", (double)p.a(p0.j()));
       p1.putDouble("absoluteX", (double)p.a(p0.g()));
       p1.putDouble("absoluteY", (double)p.a(p0.h()));
       p1.putDouble("translationX", (double)p.a(((p0.T - p0.P) + p0.R)));
       p1.putDouble("translationY", (double)p.a(((p0.U - p0.Q) + p0.S)));
       p1.putDouble("velocityX", (double)p.a(p0.V));
       p1.putDouble("velocityY", (double)p.a(p0.W));
    }
    public void b(b p0,ReadableMap p1){
       double d;
       super.b(p0, p1);
       String str = "activeOffsetXStart";
       int i = 1;
       if (p1.hasKey(str)) {
          p0.C = p.b(p1.getDouble(str));
          d = Double.MIN_VALUE;
       }else {
          d = 0;
       }
       String str1 = "activeOffsetXEnd";
       if (p1.hasKey(str1)) {
          p0.D = p.b(p1.getDouble(str1));
          d = Double.MIN_VALUE;
       }
       str1 = "failOffsetXStart";
       if (p1.hasKey(str1)) {
          p0.E = p.b(p1.getDouble(str1));
          d = Double.MIN_VALUE;
       }
       str1 = "failOffsetXEnd";
       if (p1.hasKey(str1)) {
          p0.F = p.b(p1.getDouble(str1));
          d = Double.MIN_VALUE;
       }
       str1 = "activeOffsetYStart";
       if (p1.hasKey(str1)) {
          p0.G = p.b(p1.getDouble(str1));
          d = Double.MIN_VALUE;
       }
       str1 = "activeOffsetYEnd";
       if (p1.hasKey(str1)) {
          p0.H = p.b(p1.getDouble(str1));
          d = Double.MIN_VALUE;
       }
       str1 = "failOffsetYStart";
       if (p1.hasKey(str1)) {
          p0.I = p.b(p1.getDouble(str1));
          d = Double.MIN_VALUE;
       }
       str1 = "failOffsetYEnd";
       if (p1.hasKey(str1)) {
          p0.J = p.b(p1.getDouble(str1));
          d = Double.MIN_VALUE;
       }
       str1 = "minVelocity";
       if (p1.hasKey(str1)) {
          p0.M = p.b(p1.getDouble(str1)) * p.b(p1.getDouble(str1));
          d = Double.MIN_VALUE;
       }
       str1 = "minVelocityX";
       if (p1.hasKey(str1)) {
          p0.K = p.b(p1.getDouble(str1));
          d = Double.MIN_VALUE;
       }
       str1 = "minVelocityY";
       if (p1.hasKey(str1)) {
          p0.L = p.b(p1.getDouble(str1));
       }else {
          i = d;
       }
       str = "minDist";
       if (p1.hasKey(str)) {
          p0.B(p.b(p1.getDouble(str)));
       }else if(i){
          p0.B(Float.MAX_VALUE);
       }
       str = "minPointers";
       if (p1.hasKey(str)) {
          p0.N = p1.getInt(str);
       }
       str = "maxPointers";
       if (p1.hasKey(str)) {
          p0.O = p1.getInt(str);
       }
       if (p1.hasKey("avgTouches")) {
          p0.Y = p1.getBoolean("avgTouches");
       }
       return;
    }
    public b c(Context p0){
       return new j(p0);
    }
    public String d(){
       return "PanGestureHandler";
    }
    public Class e(){
       return j.class;
    }
}
