package com.yxcorp.gifshow.nearby.common.helper.migrate.b;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.nearby.common.helper.migrate.MigrateEvents;
import com.yxcorp.gifshow.nearby.common.helper.migrate.c;

public final class b implements Comparator	// class@002111
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p0.mLevel - p1.mLevel);
    }
}
