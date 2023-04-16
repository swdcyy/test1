package com.kuaishou.live.core.basic.activity.c0;
import msd.l;
import java.lang.Object;
import xj3.d;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$Stage;
import java.lang.String;
import java.lang.Boolean;

public final class c0 implements l	// class@00182f
{
    public static final c0 b;

    static {
       c0.b = new c0();
    }
    public void c0(){
       super();
    }
    public final Object invoke(Object p0){
       boolean b = (p0.b() == LivePlayLoader$Stage.WILL_SHOW.getName() || p0.b() == LivePlayLoader$Stage.DID_SHOW.getName())? true: false;
       return Boolean.valueOf(b);
    }
}
