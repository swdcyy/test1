package com.yxcorp.gifshow.relation.select.m;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.select.u;
import com.yxcorp.gifshow.relation.select.SelectUsersActivity$a;
import java.lang.Object;
import mrd.c;

public class m extends Accessor	// class@0019a4
{
    public final SelectUsersActivity$a c;
    public final u d;

    public void m(u p0,SelectUsersActivity$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.f;
    }
    public void set(Object p0){
       this.c.f = p0;
    }
}
