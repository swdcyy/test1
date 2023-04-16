package com.facebook.react.animated.NativeAnimatedModule$f;
import com.facebook.react.animated.NativeAnimatedModule$v;
import com.facebook.react.animated.NativeAnimatedModule;
import java.lang.Object;
import sd.l;
import android.util.SparseArray;
import sd.b;
import java.util.ArrayList;
import od.a;
import java.util.List;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public class NativeAnimatedModule$f implements NativeAnimatedModule$v	// class@001185
{
    public final int a;
    public final int b;
    public final NativeAnimatedModule c;

    public void NativeAnimatedModule$f(NativeAnimatedModule p0,int p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(l p0){
       NativeAnimatedModule$f ta = this.a;
       NativeAnimatedModule$f tb = this.b;
       b uob = p0.a.get(ta);
       String str = " does not exists";
       String str1 = "Animated node with tag ";
       if (uob == null) {
          throw new JSApplicationIllegalArgumentException(str1+ta+str);
       }
       b uob1 = p0.a.get(tb);
       if (uob1 == null) {
          throw new JSApplicationIllegalArgumentException(str1+tb+str);
       }
       if (uob.a == null) {
          uob.a = new ArrayList(1);
       }
       b a = uob.a;
       a.c(a);
       a.add(uob1);
       uob1.a(uob);
       p0.c.put(tb, uob1);
       return;
    }
}
