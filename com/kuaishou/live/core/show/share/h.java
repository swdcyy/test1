package com.kuaishou.live.core.show.share.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.share.f;
import com.kuaishou.live.core.show.share.f$b;
import com.kuaishou.live.core.show.share.g;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import pj2.x;
import mm8.a;

public final class h implements b	// class@001016
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       f$b uob = f$b.class;
       g og = new g(this, p1);
       try{
          p0.h(uob, og);
          p0.h(f.class, new x(this, p1));
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
