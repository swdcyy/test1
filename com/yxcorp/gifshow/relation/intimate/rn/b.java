package com.yxcorp.gifshow.relation.intimate.rn.b;
import javax.inject.Provider;
import java.lang.Object;
import com.yxcorp.gifshow.relation.intimate.rn.motion.IntMotionManager;

public final class b implements Provider	// class@00191f
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final Object get(){
       return new IntMotionManager();
    }
}
