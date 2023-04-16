package com.kwai.framework.model.decompose.metaext.b;
import com.kwai.framework.model.decompose.metaext.c$a;
import java.lang.Object;
import com.kwai.framework.model.decompose.metaext.c;
import java.util.concurrent.ThreadLocalRandom;

public final class b implements c$a	// class@0016b0
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final long a(long p0){
       return ThreadLocalRandom.current().nextLong(p0);
    }
}
