package com.yxcorp.gifshow.relation.select.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.relation.select.v$a;
import com.yxcorp.gifshow.relation.select.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.select.b;
import com.yxcorp.gifshow.relation.select.c;
import com.yxcorp.gifshow.relation.select.d;
import com.yxcorp.gifshow.relation.select.e;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.relation.select.f;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import com.yxcorp.gifshow.relation.select.g;
import mm8.a;

public final class h implements b	// class@001993
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("ADAPTER", new a(this, p1));
       p0.i("SelectedFriendsCallback", new b(this, p1));
       p0.i("SelectedSearchKey", new c(this, p1));
       p0.i("ADAPTER_POSITION", new d(this, p1));
       p0.i("SelectedUsersList", new e(this, p1));
       p0.h(User.class, new f(this, p1));
       if (p1.b != null) {
          Accessors.d().b(p1.b).a(p0, p1.b);
       }
       try{
          p0.h(v$a.class, new g(this, p1));
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
