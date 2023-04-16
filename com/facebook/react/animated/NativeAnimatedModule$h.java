package com.facebook.react.animated.NativeAnimatedModule$h;
import com.facebook.react.animated.NativeAnimatedModule$v;
import com.facebook.react.animated.NativeAnimatedModule;
import java.lang.Object;
import sd.l;
import android.util.SparseArray;
import sd.b;
import sd.m;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;

public class NativeAnimatedModule$h implements NativeAnimatedModule$v	// class@001187
{
    public final int a;
    public final int b;
    public final NativeAnimatedModule c;

    public void NativeAnimatedModule$h(NativeAnimatedModule p0,int p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(l p0){
       NativeAnimatedModule$h ta = this.a;
       NativeAnimatedModule$h tb = this.b;
       b uob = p0.a.get(ta);
       if (uob == null) {
          throw new JSApplicationIllegalArgumentException("Animated node with tag "+ta+" does not exists");
       }
       if (!uob instanceof m) {
          throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type "+m.class.getName());
       }
       b uob1 = uob;
       if (uob1.e != -1) {
          throw new JSApplicationIllegalArgumentException("Animated node "+uob1.d+" is already attached to a view");
       }
       uob1.e = tb;
       p0.c.put(ta, uob);
       return;
    }
}
