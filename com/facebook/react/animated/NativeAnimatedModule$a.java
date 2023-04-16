package com.facebook.react.animated.NativeAnimatedModule$a;
import com.facebook.react.animated.NativeAnimatedModule$v;
import com.facebook.react.animated.NativeAnimatedModule;
import java.lang.Object;
import sd.l;
import android.util.SparseArray;
import sd.b;
import sd.s;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public class NativeAnimatedModule$a implements NativeAnimatedModule$v	// class@001180
{
    public final int a;
    public final double b;
    public final NativeAnimatedModule c;

    public void NativeAnimatedModule$a(NativeAnimatedModule p0,int p1,double p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(l p0){
       NativeAnimatedModule$a ta = this.a;
       NativeAnimatedModule$a tb = this.b;
       b uob = p0.a.get(ta);
       if (uob == null || !uob instanceof s) {
          throw new JSApplicationIllegalArgumentException("Animated node with tag "+ta+" does not exists or is not a \'value\' node");
       }
       uob.g = tb;
       p0.c.put(ta, uob);
       return;
    }
}
