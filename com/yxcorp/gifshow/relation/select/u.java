package com.yxcorp.gifshow.relation.select.u;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.relation.select.SelectUsersActivity$a;
import com.yxcorp.gifshow.relation.select.m;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.select.n;
import com.yxcorp.gifshow.relation.select.o;
import com.yxcorp.gifshow.relation.select.p;
import com.yxcorp.gifshow.relation.select.q;
import com.yxcorp.gifshow.relation.select.r;
import com.yxcorp.gifshow.relation.select.s;
import com.yxcorp.gifshow.relation.select.t;
import java.lang.Class;
import mm8.a;

public final class u implements b	// class@0019c5
{

    public void u(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("SELECT_USERS_MULTI_SELECT_FINISH", new m(this, p1));
       p0.i("SELECT_USERS_MULTI_SELECT", new n(this, p1));
       p0.i("SELECT_USERS_ON_CLOSE", new o(this, p1));
       p0.i("SELECT_USERS_DATE_ERROR", new p(this, p1));
       p0.i("SELECT_USERS_RIGHT_BUTTON_ENABLED_SUBJECT", new q(this, p1));
       p0.i("SELECT_USERS_RIGHT_BUTTON_UPDATE_SUBJECT", new r(this, p1));
       s os = new s(this, p1);
       String str = "SELECT_USERS_RIGHT_BUTTON_SELECT_COUNT_SUBJECT";
       try{
          p0.i(str, os);
          p0.h(SelectUsersActivity$a.class, new t(this, p1));
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
