package com.swmansion.reanimated.ReanimatedModule$h;
import com.swmansion.reanimated.ReanimatedModule$m;
import com.swmansion.reanimated.ReanimatedModule;
import java.lang.Object;
import hn8.b;
import android.util.SparseArray;
import in8.m;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public class ReanimatedModule$h implements ReanimatedModule$m	// class@000c97
{
    public final int a;
    public final int b;
    public final ReanimatedModule c;

    public void ReanimatedModule$h(ReanimatedModule p0,int p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(b p0){
       ReanimatedModule$h tb = this.b;
       m om = p0.a.get(this.a);
       m om1 = p0.a.get(tb);
       if (om1 == null) {
          throw new JSApplicationIllegalArgumentException("Animated node with ID "+tb+" does not exists");
       }
       om.removeChild(om1);
       return;
    }
}