package com.kuaishou.live.core.show.luckystar.m;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.luckystar.c;
import com.kuaishou.live.core.show.luckystar.c$e;
import com.kuaishou.live.core.show.luckystar.l;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import yb2.h;
import mm8.a;

public final class m implements b	// class@000ccf
{

    public void m(){
       super();
    }
    public void a(a p0,Object p1){
       c$e uoe = c$e.class;
       l ol = new l(this, p1);
       try{
          p0.h(uoe, ol);
          p0.h(c.class, new h(this, p1));
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
