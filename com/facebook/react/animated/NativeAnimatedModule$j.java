package com.facebook.react.animated.NativeAnimatedModule$j;
import com.facebook.react.animated.NativeAnimatedModule$v;
import com.facebook.react.animated.NativeAnimatedModule;
import java.lang.Object;
import sd.l;
import android.util.SparseArray;
import sd.b;
import sd.m;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.JavaOnlyMap;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;

public class NativeAnimatedModule$j implements NativeAnimatedModule$v	// class@001189
{
    public final int a;
    public final NativeAnimatedModule b;

    public void NativeAnimatedModule$j(NativeAnimatedModule p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(l p0){
       b uob = p0.a.get(this.a);
       if (uob == null) {
       }else if(uob instanceof m){
          ReadableMapKeySetIterator readableMapK = uob.i.keySetIterator();
          while (readableMapK.hasNextKey()) {
             uob.i.putNull(readableMapK.nextKey());
          }
          uob.g.synchronouslyUpdateViewOnUIThread(uob.e, uob.i);
       }else {
          throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type "+m.class.getName());
       }
       return;
    }
}
