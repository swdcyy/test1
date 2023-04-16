package com.facebook.react.animated.NativeAnimatedModule$r;
import com.facebook.react.animated.NativeAnimatedModule$v;
import com.facebook.react.animated.NativeAnimatedModule;
import sd.c;
import java.lang.Object;
import sd.l;
import android.util.SparseArray;
import sd.b;
import sd.s;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public class NativeAnimatedModule$r implements NativeAnimatedModule$v	// class@001191
{
    public final int a;
    public final c b;
    public final NativeAnimatedModule c;

    public void NativeAnimatedModule$r(NativeAnimatedModule p0,int p1,c p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(l p0){
       NativeAnimatedModule$r ta = this.a;
       NativeAnimatedModule$r tb = this.b;
       b uob = p0.a.get(ta);
       if (uob == null || !uob instanceof s) {
          throw new JSApplicationIllegalArgumentException("Animated node with tag "+ta+" does not exists or is not a \'value\' node");
       }
       uob.e(tb);
       return;
    }
}
