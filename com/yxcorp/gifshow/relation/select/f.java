package com.yxcorp.gifshow.relation.select.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.select.h;
import com.yxcorp.gifshow.relation.select.v$a;
import java.lang.Object;
import com.kwai.framework.model.user.User;

public class f extends Accessor	// class@001991
{
    public final v$a c;
    public final h d;

    public void f(h p0,v$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
