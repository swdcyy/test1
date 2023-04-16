package com.facebook.react.animated.NativeAnimatedModule$n;
import ze.q0;
import com.facebook.react.animated.NativeAnimatedModule;
import java.util.ArrayList;
import java.lang.Object;
import ze.m;
import sd.l;
import java.util.Iterator;
import com.facebook.react.animated.NativeAnimatedModule$v;

public class NativeAnimatedModule$n implements q0	// class@00118d
{
    public final ArrayList a;
    public final NativeAnimatedModule b;

    public void NativeAnimatedModule$n(NativeAnimatedModule p0,ArrayList p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(m p0){
       l nodesManager = this.b.getNodesManager();
       if (nodesManager == null) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(nodesManager);
       }
       return;
    }
}
