package com.yxcorp.gifshow.relation.select.q;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.select.u;
import com.yxcorp.gifshow.relation.select.SelectUsersActivity$a;
import java.lang.Object;
import mrd.c;

public class q extends Accessor	// class@0019ae
{
    public final SelectUsersActivity$a c;
    public final u d;

    public void q(u p0,SelectUsersActivity$a p1){
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
