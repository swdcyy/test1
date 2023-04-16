package com.yxcorp.gifshow.relation.user.adapter.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.user.adapter.k;
import com.yxcorp.gifshow.relation.user.adapter.e$b;
import java.lang.Object;
import nu7.a;

public class g extends Accessor	// class@0019f2
{
    public final e$b c;
    public final k d;

    public void g(k p0,e$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
