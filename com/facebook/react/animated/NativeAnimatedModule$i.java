package com.facebook.react.animated.NativeAnimatedModule$i;
import com.facebook.react.animated.NativeAnimatedModule$v;
import com.facebook.react.animated.NativeAnimatedModule;
import java.lang.Object;
import sd.l;
import android.util.SparseArray;
import sd.b;
import sd.m;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;

public class NativeAnimatedModule$i implements NativeAnimatedModule$v	// class@001188
{
    public final int a;
    public final int b;
    public final NativeAnimatedModule c;

    public void NativeAnimatedModule$i(NativeAnimatedModule p0,int p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(l p0){
       NativeAnimatedModule$i ta = this.a;
       NativeAnimatedModule$i tb = this.b;
       b uob = p0.a.get(ta);
       if (uob == null) {
          throw new JSApplicationIllegalArgumentException("Animated node with tag "+ta+" does not exists");
       }
       if (!uob instanceof m) {
          throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type "+m.class.getName());
       }
       if (uob.e != tb) {
          throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node");
       }
       uob.e = -1;
       return;
    }
}
