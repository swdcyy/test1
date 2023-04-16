package com.kuaishou.live.core.show.wealthgrade.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.wealthgrade.b;
import com.kuaishou.live.core.show.wealthgrade.b$c;
import com.kuaishou.live.core.show.wealthgrade.d;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import hm2.h;
import mm8.a;

public final class e implements b	// class@00125c
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       b$c uoc = b$c.class;
       d uod = new d(this, p1);
       try{
          p0.h(uoc, uod);
          p0.h(b.class, new h(this, p1));
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
