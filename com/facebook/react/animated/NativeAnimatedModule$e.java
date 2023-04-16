package com.facebook.react.animated.NativeAnimatedModule$e;
import com.facebook.react.animated.NativeAnimatedModule$v;
import com.facebook.react.animated.NativeAnimatedModule;
import java.lang.Object;
import sd.l;
import android.util.SparseArray;
import sd.d;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import java.lang.String;
import com.facebook.react.bridge.Callback;

public class NativeAnimatedModule$e implements NativeAnimatedModule$v	// class@001184
{
    public final int a;
    public final NativeAnimatedModule b;

    public void NativeAnimatedModule$e(NativeAnimatedModule p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(l p0){
       NativeAnimatedModule$e ta = this.a;
       int i = 0;
       while (i < p0.b.size()) {
          d uod = p0.b.valueAt(i);
          if (uod.d == ta) {
             if (uod.c != null) {
                WritableMap writableMap = Arguments.createMap();
                writableMap.putBoolean("finished", false);
                Object[] objArray = new Object[]{writableMap};
                uod.c.invoke(objArray);
             }
             p0.b.removeAt(i);
             break ;
          }else {
             i = i + 1;
          }
       }
       return;
    }
}
