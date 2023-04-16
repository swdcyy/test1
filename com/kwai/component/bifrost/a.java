package com.kwai.component.bifrost.a;
import java.util.Comparator;
import java.lang.Object;
import com.kwai.component.bifrost.BifrostActivityEntry;

public final class a implements Comparator	// class@0020ca
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p1.mPriority - p0.mPriority);
    }
}
