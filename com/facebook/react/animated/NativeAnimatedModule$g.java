package com.facebook.react.animated.NativeAnimatedModule$g;
import com.facebook.react.animated.NativeAnimatedModule$v;
import com.facebook.react.animated.NativeAnimatedModule;
import java.lang.Object;
import sd.l;
import android.util.SparseArray;
import sd.b;
import java.util.List;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public class NativeAnimatedModule$g implements NativeAnimatedModule$v	// class@001186
{
    public final int a;
    public final int b;
    public final NativeAnimatedModule c;

    public void NativeAnimatedModule$g(NativeAnimatedModule p0,int p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(l p0){
       NativeAnimatedModule$g ta = this.a;
       NativeAnimatedModule$g tb = this.b;
       b uob = p0.a.get(ta);
       String str = " does not exists";
       if (uob == null) {
          throw new JSApplicationIllegalArgumentException("Animated node with tag "+ta+str);
       }
       b uob1 = p0.a.get(tb);
       if (uob1 == null) {
          throw new JSApplicationIllegalArgumentException("Animated node with tag "+tb+str);
       }
       if (uob.a != null) {
          uob1.b(uob);
          uob.a.remove(uob1);
       }
       p0.c.put(tb, uob1);
       return;
    }
}
