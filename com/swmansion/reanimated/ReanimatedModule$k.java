package com.swmansion.reanimated.ReanimatedModule$k;
import com.swmansion.reanimated.ReanimatedModule$m;
import com.swmansion.reanimated.ReanimatedModule;
import java.lang.String;
import java.lang.Object;
import hn8.b;
import java.util.Objects;
import java.lang.StringBuilder;
import android.util.SparseArray;
import com.swmansion.reanimated.nodes.EventNode;
import java.util.Map;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;

public class ReanimatedModule$k implements ReanimatedModule$m	// class@000c9a
{
    public final int a;
    public final String b;
    public final int c;
    public final ReanimatedModule d;

    public void ReanimatedModule$k(ReanimatedModule p0,int p1,String p2,int p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(b p0){
       ReanimatedModule$k tc = this.c;
       Objects.requireNonNull(p0);
       String str = this.a+this.b;
       EventNode uEventNode = p0.a.get(tc);
       if (uEventNode == null) {
          throw new JSApplicationIllegalArgumentException("Event node "+tc+" does not exists");
       }
       if (p0.b.containsKey(str)) {
          throw new JSApplicationIllegalArgumentException("Event handler already set for the given view and event type");
       }
       p0.b.put(str, uEventNode);
       return;
    }
}
