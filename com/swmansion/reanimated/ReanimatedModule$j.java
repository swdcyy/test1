package com.swmansion.reanimated.ReanimatedModule$j;
import com.swmansion.reanimated.ReanimatedModule$m;
import com.swmansion.reanimated.ReanimatedModule;
import java.lang.Object;
import hn8.b;
import android.util.SparseArray;
import in8.m;
import in8.q;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;

public class ReanimatedModule$j implements ReanimatedModule$m	// class@000c99
{
    public final int a;
    public final int b;
    public final ReanimatedModule c;

    public void ReanimatedModule$j(ReanimatedModule p0,int p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(b p0){
       ReanimatedModule$j ta = this.a;
       m om = p0.a.get(ta);
       if (om == null) {
          throw new JSApplicationIllegalArgumentException("Animated node with ID "+ta+" does not exists");
       }
       if (!om instanceof q) {
          throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type "+q.class.getName());
       }
       om.c = -1;
       return;
    }
}