package com.yxcorp.gifshow.relation.select.n;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.select.u;
import com.yxcorp.gifshow.relation.select.SelectUsersActivity$a;
import java.lang.Object;
import mrd.c;

public class n extends Accessor	// class@0019ab
{
    public final SelectUsersActivity$a c;
    public final u d;

    public void n(u p0,SelectUsersActivity$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.e;
    }
    public void set(Object p0){
       this.c.e = p0;
    }
}
