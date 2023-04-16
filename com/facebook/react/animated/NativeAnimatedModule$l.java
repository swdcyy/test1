package com.facebook.react.animated.NativeAnimatedModule$l;
import com.facebook.react.animated.NativeAnimatedModule$v;
import com.facebook.react.animated.NativeAnimatedModule;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Object;
import sd.l;
import java.util.Objects;
import android.util.SparseArray;
import sd.b;
import sd.s;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;
import com.facebook.react.animated.EventAnimationDriver;
import java.util.List;
import java.lang.StringBuilder;
import java.util.Map;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.Class;

public class NativeAnimatedModule$l implements NativeAnimatedModule$v	// class@00118b
{
    public final int a;
    public final String b;
    public final ReadableMap c;
    public final NativeAnimatedModule d;

    public void NativeAnimatedModule$l(NativeAnimatedModule p0,int p1,String p2,ReadableMap p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(l p0){
       NativeAnimatedModule$l ta = this.a;
       NativeAnimatedModule$l tb = this.b;
       NativeAnimatedModule$l tc = this.c;
       Objects.requireNonNull(p0);
       int intx = tc.getInt("animatedValueTag");
       b uob = p0.a.get(intx);
       if (uob == null) {
          throw new JSApplicationIllegalArgumentException("Animated node with tag "+intx+" does not exists");
       }
       if (!uob instanceof s) {
          throw new JSApplicationIllegalArgumentException("Animated node connected to event should beof type "+s.class.getName());
       }
       ReadableArray array = tc.getArray("nativeEventPath");
       ArrayList uArrayList = new ArrayList(array.size());
       for (int i = 0; i < array.size(); i = i + 1) {
          uArrayList.add(array.getString(i));
       }
       EventAnimationDriver uEventAnimat = new EventAnimationDriver(uArrayList, uob);
       String str = ta+tb;
       if (p0.d.containsKey(str)) {
          p0.d.get(str).add(uEventAnimat);
       }else {
          ArrayList uArrayList1 = new ArrayList(1);
          uArrayList1.add(uEventAnimat);
          p0.d.put(str, uArrayList1);
       }
       return;
    }
}
