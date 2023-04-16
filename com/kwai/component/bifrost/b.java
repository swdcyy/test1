package com.kwai.component.bifrost.b;
import java.util.Comparator;
import java.lang.Object;
import com.kwai.component.bifrost.BifrostActivityEntry;

public final class b implements Comparator	// class@0020cb
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p1.mPriority - p0.mPriority);
    }
}
