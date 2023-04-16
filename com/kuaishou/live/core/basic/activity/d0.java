package com.kuaishou.live.core.basic.activity.d0;
import msd.l;
import java.lang.Object;
import xj3.d;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$Stage;
import java.lang.String;
import java.lang.Boolean;

public final class d0 implements l	// class@001831
{
    public static final d0 b;

    static {
       d0.b = new d0();
    }
    public void d0(){
       super();
    }
    public final Object invoke(Object p0){
       boolean b = (p0.b() == LivePlayLoader$Stage.WILL_SHOW.getName() || p0.b() == LivePlayLoader$Stage.DID_SHOW.getName())? true: false;
       return Boolean.valueOf(b);
    }
}
