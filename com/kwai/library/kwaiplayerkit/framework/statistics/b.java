package com.kwai.library.kwaiplayerkit.framework.statistics.b;
import java.util.Comparator;
import java.lang.Object;
import android.util.Pair;
import java.lang.Long;

public final class b implements Comparator	// class@000891
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final int compare(Object p0,Object p1){
       int i;
       if (!p0.first.longValue() - Long.MAX_VALUE) {
          i = 1;
       }else if(!p1.first.longValue() - Long.MAX_VALUE){
          i = -1;
       }else {
          i = (int)(p0.first.longValue() - p1.first.longValue());
       }
       return i;
    }
}
