package com.kuaishou.live.core.show.wealthgrade.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.core.show.wealthgrade.e;
import com.kuaishou.live.core.show.wealthgrade.b;
import java.lang.Object;
import com.kuaishou.live.core.show.wealthgrade.b$c;

public class d extends Accessor	// class@00125b
{
    public final b c;
    public final e d;

    public void d(e p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.v;
    }
    public void set(Object p0){
       this.c.v = p0;
    }
}
