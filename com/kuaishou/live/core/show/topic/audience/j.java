package com.kuaishou.live.core.show.topic.audience.j;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.topic.audience.h;
import com.kuaishou.live.core.show.topic.audience.h$b;
import com.kuaishou.live.core.show.topic.audience.i;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ql2.o;
import mm8.a;

public final class j implements b	// class@001206
{

    public void j(){
       super();
    }
    public void a(a p0,Object p1){
       h$b uob = h$b.class;
       i oi = new i(this, p1);
       try{
          p0.h(uob, oi);
          p0.h(h.class, new o(this, p1));
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
