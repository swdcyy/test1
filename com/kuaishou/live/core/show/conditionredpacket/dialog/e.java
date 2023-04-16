package com.kuaishou.live.core.show.conditionredpacket.dialog.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.conditionredpacket.dialog.c;
import com.kuaishou.live.core.show.conditionredpacket.dialog.c$c;
import com.kuaishou.live.core.show.conditionredpacket.dialog.d;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import x52.h;
import mm8.a;

public final class e implements b	// class@000a76
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       c$c uoc = c$c.class;
       d uod = new d(this, p1);
       try{
          p0.h(uoc, uod);
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
