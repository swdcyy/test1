package com.kuaishou.live.core.show.topic.audience.r;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.topic.audience.o;
import com.kuaishou.live.core.show.topic.audience.o$b;
import com.kuaishou.live.core.show.topic.audience.q;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ql2.q;
import mm8.a;

public final class r implements b	// class@001214
{

    public void r(){
       super();
    }
    public void a(a p0,Object p1){
       o$b uob = o$b.class;
       q oq = new q(this, p1);
       try{
          p0.h(uob, oq);
          p0.h(o.class, new q(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
