package com.kuaishou.live.tuna.presenter.d;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.tuna.presenter.b;
import com.kuaishou.live.tuna.presenter.b$c;
import com.kuaishou.live.tuna.presenter.c;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import aq3.k;
import mm8.a;

public final class d implements b	// class@000fdc
{

    public void d(){
       super();
    }
    public void a(a p0,Object p1){
       b$c uoc = b$c.class;
       c uoc1 = new c(this, p1);
       try{
          p0.h(uoc, uoc1);
          p0.h(b.class, new k(this, p1));
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
