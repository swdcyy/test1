package com.kuaishou.live.core.show.pk.m;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.pk.k;
import hd2.m;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import hd2.n;
import com.kuaishou.live.core.show.pk.n;
import hd2.o;
import java.lang.Class;
import com.kuaishou.live.core.show.pk.k$e;
import com.kuaishou.live.core.show.pk.l;
import iw1.a;
import hd2.p;
import hd2.q;
import mm8.a;

public final class m implements b	// class@000d94
{

    public void m(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_PK_GIFT_CRIT_MOMENT_INFO_SUBJECT_ID", new m(this, p1));
       p0.i("LIVE_PK_STEAL_TOWER_MOMENT_INFO_SUBJECT_ID", new n(this, p1));
       p0.h(n.class, new o(this, p1));
       p0.h(k$e.class, new l(this, p1));
       a uoa = a.class;
       p op = new p(this, p1);
       try{
          p0.h(uoa, op);
          p0.h(k.class, new q(this, p1));
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
