package com.kuaishou.live.core.show.activityredpacket.b0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.core.show.activityredpacket.c0;
import com.kuaishou.live.core.show.activityredpacket.a0;
import java.lang.Object;
import com.kuaishou.live.core.show.activityredpacket.a0$b;

public class b0 extends Accessor	// class@00093e
{
    public final a0 c;
    public final c0 d;

    public void b0(c0 p0,a0 p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.T;
    }
    public void set(Object p0){
       this.c.T = p0;
    }
}
