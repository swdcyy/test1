package com.kuaishou.live.core.basic.activity.p0;
import msd.l;
import java.lang.Object;
import xj3.d;
import com.kuaishou.live.core.basic.activity.q0;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$Stage;
import java.lang.Boolean;

public final class p0 implements l	// class@00184b
{
    public static final p0 b;

    static {
       p0.b = new p0();
    }
    public void p0(){
       super();
    }
    public final Object invoke(Object p0){
       boolean b = (p0.b() == LivePlayLoader$Stage.WILL_SHOW)? true: false;
       return Boolean.valueOf(b);
    }
}
