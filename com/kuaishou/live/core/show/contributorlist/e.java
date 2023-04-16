package com.kuaishou.live.core.show.contributorlist.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.contributorlist.b;
import com.kuaishou.live.core.show.contributorlist.b$b;
import com.kuaishou.live.core.show.contributorlist.d;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import p62.d;
import mm8.a;

public final class e implements b	// class@000adc
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       b$b uob = b$b.class;
       d uod = new d(this, p1);
       try{
          p0.h(uob, uod);
          p0.h(b.class, new d(this, p1));
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
