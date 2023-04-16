package com.yxcorp.gifshow.relation.select.l;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.relation.select.SelectUsersTabHostFragment$c;
import com.yxcorp.gifshow.relation.select.i;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.select.j;
import com.yxcorp.gifshow.relation.select.k;
import java.lang.Class;
import mm8.a;

public final class l implements b	// class@0019a3
{

    public void l(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("SELECT_USERS_MULTI_SELECT_SUBJECT", new i(this, p1));
       j oj = new j(this, p1);
       String str = "SELECT_USERS_UPDATE_SUBJECT";
       try{
          p0.i(str, oj);
          p0.h(SelectUsersTabHostFragment$c.class, new k(this, p1));
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
