package com.swmansion.reanimated.ReanimatedModule$c;
import com.swmansion.reanimated.ReanimatedModule$m;
import com.swmansion.reanimated.ReanimatedModule;
import java.lang.Double;
import java.lang.Object;
import hn8.b;
import android.util.SparseArray;
import in8.m;
import in8.u;

public class ReanimatedModule$c implements ReanimatedModule$m	// class@000c92
{
    public final int a;
    public final Double b;
    public final ReanimatedModule c;

    public void ReanimatedModule$c(ReanimatedModule p0,int p1,Double p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(b p0){
       ReanimatedModule$c tb = this.b;
       m om = p0.a.get(this.a);
       if (om != null) {
          om.b(tb);
       }
       return;
    }
}
