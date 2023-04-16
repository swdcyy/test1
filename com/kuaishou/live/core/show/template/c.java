package com.kuaishou.live.core.show.template.c;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.template.a;
import com.kuaishou.live.core.show.template.a$e;
import com.kuaishou.live.core.show.template.b;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import hl2.c;
import mm8.a;

public final class c implements b	// class@001180
{

    public void c(){
       super();
    }
    public void a(a p0,Object p1){
       a$e uoe = a$e.class;
       b uob = new b(this, p1);
       try{
          p0.h(uoe, uob);
          p0.h(a.class, new c(this, p1));
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
