package com.kuaishou.live.core.show.topic.audience.m;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.topic.audience.k;
import com.kuaishou.live.core.show.topic.audience.k$b;
import com.kuaishou.live.core.show.topic.audience.l;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ql2.p;
import mm8.a;

public final class m implements b	// class@00120b
{

    public void m(){
       super();
    }
    public void a(a p0,Object p1){
       k$b uob = k$b.class;
       l ol = new l(this, p1);
       try{
          p0.h(uob, ol);
          p0.h(k.class, new p(this, p1));
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
