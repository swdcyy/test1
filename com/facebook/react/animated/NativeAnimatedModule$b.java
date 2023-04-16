package com.facebook.react.animated.NativeAnimatedModule$b;
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

public class NativeAnimatedModule$b implements NativeAnimatedModule$v	// class@001181
{
    public final int a;
    public final NativeAnimatedModule b;

    public void NativeAnimatedModule$b(NativeAnimatedModule p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(l p0){
       NativeAnimatedModule$b ta = this.a;
       b uob = p0.a.get(ta);
       if (uob == null || !uob instanceof s) {
          throw new JSApplicationIllegalArgumentException("Animated node with tag "+ta+" does not exists or is not a \'value\' node");
       }
       uob.f = uob.f + uob.g;
       uob.g = 0;
       return;
    }
}
