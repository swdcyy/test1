package com.kuaishou.live.audience.component.push.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.audience.component.push.c;
import com.kuaishou.live.audience.component.push.c$b;
import com.kuaishou.live.audience.component.push.d;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import v21.c;
import mm8.a;

public final class e implements b	// class@000bd0
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       c$b uob = c$b.class;
       d uod = new d(this, p1);
       try{
          p0.h(uob, uod);
          p0.h(c.class, new c(this, p1));
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
