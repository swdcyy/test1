package com.yxcorp.gifshow.relation.explore.fragment.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment$c;
import com.yxcorp.gifshow.relation.explore.fragment.c;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.explore.fragment.d;
import dac.b;
import com.yxcorp.gifshow.relation.explore.fragment.e;
import java.lang.Class;
import com.yxcorp.gifshow.relation.explore.fragment.f;
import com.yxcorp.gifshow.relation.explore.fragment.g;
import mm8.a;

public final class h implements b	// class@001816
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("AUTO_ALIAS_CALLER_CONTEXT", new c(this, p1));
       p0.i("USER_CLICK_LOGGER", new d(this, p1));
       p0.h(b.class, new e(this, p1));
       f uof = new f(this, p1);
       String str = "USER_FOLLOW_LOGGER";
       try{
          p0.i(str, uof);
          p0.h(ExploreFriendContactFragment$c.class, new g(this, p1));
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
