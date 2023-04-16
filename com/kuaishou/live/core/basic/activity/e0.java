package com.kuaishou.live.core.basic.activity.e0;
import msd.l;
import java.lang.Object;
import xj3.d;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$Stage;
import java.lang.String;
import java.lang.Boolean;

public final class e0 implements l	// class@001835
{
    public static final e0 b;

    static {
       e0.b = new e0();
    }
    public void e0(){
       super();
    }
    public final Object invoke(Object p0){
       boolean b = (p0.b() == LivePlayLoader$Stage.DID_SHOW.getName() && p0.c() == 3)? true: false;
       return Boolean.valueOf(b);
    }
}
