package com.kuaishou.live.common.core.component.gift.gift.n;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.common.core.component.gift.gift.l;
import com.kuaishou.live.common.core.component.gift.gift.l$c;
import com.kuaishou.live.common.core.component.gift.gift.m;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ik1.w;
import mm8.a;

public final class n implements b	// class@0012af
{

    public void n(){
       super();
    }
    public void a(a p0,Object p1){
       l$c uoc = l$c.class;
       m om = new m(this, p1);
       try{
          p0.h(uoc, om);
          p0.h(l.class, new w(this, p1));
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
