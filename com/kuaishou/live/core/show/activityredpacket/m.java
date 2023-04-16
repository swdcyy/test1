package com.kuaishou.live.core.show.activityredpacket.m;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.activityredpacket.k;
import com.kuaishou.live.core.show.activityredpacket.k$b;
import com.kuaishou.live.core.show.activityredpacket.l;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import h22.o;
import mm8.a;

public final class m implements b	// class@00095a
{

    public void m(){
       super();
    }
    public void a(a p0,Object p1){
       k$b uob = k$b.class;
       l ol = new l(this, p1);
       try{
          p0.h(uob, ol);
          p0.h(k.class, new o(this, p1));
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
