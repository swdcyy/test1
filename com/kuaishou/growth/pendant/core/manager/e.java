package com.kuaishou.growth.pendant.core.manager.e;
import java.util.Comparator;
import java.lang.Object;
import java.io.File;
import com.kuaishou.growth.pendant.core.manager.f;
import java.lang.String;

public final class e implements Comparator	// class@00064a
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p0.getName()).compareTo(p1.getName());
    }
}
