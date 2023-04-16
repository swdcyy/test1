package com.kuaishou.live.core.show.guestactivity.k;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.guestactivity.h;
import n92.d;
import n92.e0;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.core.show.guestactivity.h$f;
import com.kuaishou.live.core.show.guestactivity.j;
import n92.f0;
import mm8.a;

public final class k implements b	// class@000be0
{

    public void k(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(d.class, new e0(this, p1));
       h$f uof = h$f.class;
       j oj = new j(this, p1);
       try{
          p0.h(uof, oj);
          p0.h(h.class, new f0(this, p1));
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
