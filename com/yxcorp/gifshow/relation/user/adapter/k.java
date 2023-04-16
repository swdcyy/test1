package com.yxcorp.gifshow.relation.user.adapter.k;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.relation.user.adapter.e$b;
import com.yxcorp.gifshow.relation.user.adapter.g;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.user.adapter.h;
import com.yxcorp.gifshow.relation.user.adapter.i;
import com.yxcorp.gifshow.relation.user.adapter.j;
import java.lang.Class;
import mm8.a;

public final class k implements b	// class@0019f6
{

    public void k(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("AUTO_ALIAS_CALLER_CONTEXT", new g(this, p1));
       p0.i("USER_CLICK_LOGGER", new h(this, p1));
       i oi = new i(this, p1);
       String str = "USER_FOLLOW_LOGGER";
       try{
          p0.i(str, oi);
          p0.h(e$b.class, new j(this, p1));
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
