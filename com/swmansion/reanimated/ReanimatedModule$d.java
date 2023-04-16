package com.swmansion.reanimated.ReanimatedModule$d;
import ze.q0;
import com.swmansion.reanimated.ReanimatedModule;
import java.util.ArrayList;
import java.lang.Object;
import ze.m;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactContext;
import hn8.b;
import java.util.Iterator;
import com.swmansion.reanimated.ReanimatedModule$m;

public class ReanimatedModule$d implements q0	// class@000c93
{
    public final ArrayList a;
    public final ReanimatedModule b;

    public void ReanimatedModule$d(ReanimatedModule p0,ArrayList p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(m p0){
       if (this.b.getReactApplicationContext().hasActiveCatalystInstance()) {
          b nodesManager = this.b.getNodesManager();
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(nodesManager);
          }
       }
       return;
    }
}
