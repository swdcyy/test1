package com.yxcorp.utility.e;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.utility.f$c;
import java.lang.Long;

public final class e implements Comparator	// class@0009bc
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Long.compare(p0.e, p1.e);
    }
}
