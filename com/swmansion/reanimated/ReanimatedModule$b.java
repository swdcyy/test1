package com.swmansion.reanimated.ReanimatedModule$b;
import com.swmansion.reanimated.ReanimatedModule$m;
import com.swmansion.reanimated.ReanimatedModule;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import hn8.b;
import android.util.SparseArray;
import in8.m;

public class ReanimatedModule$b implements ReanimatedModule$m	// class@000c91
{
    public final int a;
    public final Callback b;
    public final ReanimatedModule c;

    public void ReanimatedModule$b(ReanimatedModule p0,int p1,Callback p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(b p0){
       Object[] objArray = new Object[]{p0.a.get(this.a).value()};
       this.b.invoke(objArray);
    }
}
