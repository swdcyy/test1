package com.kuaishou.live.core.show.topic.audience.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.topic.audience.d;
import com.kuaishou.live.core.show.topic.audience.d$b;
import com.kuaishou.live.core.show.topic.audience.f;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ql2.j;
import mm8.a;

public final class g implements b	// class@001201
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       d$b uob = d$b.class;
       f uof = new f(this, p1);
       try{
          p0.h(uob, uof);
          p0.h(d.class, new j(this, p1));
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
