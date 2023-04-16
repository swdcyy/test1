package com.kuaishou.live.core.show.vote.presenter.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.vote.presenter.c;
import com.kuaishou.live.core.show.vote.presenter.c$d;
import com.kuaishou.live.core.show.vote.presenter.d;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import dm2.p;
import mm8.a;

public final class e implements b	// class@001247
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       c$d uod = c$d.class;
       d uod1 = new d(this, p1);
       try{
          p0.h(uod, uod1);
          p0.h(c.class, new p(this, p1));
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
