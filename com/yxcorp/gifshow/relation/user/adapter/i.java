package com.yxcorp.gifshow.relation.user.adapter.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.user.adapter.k;
import com.yxcorp.gifshow.relation.user.adapter.e$b;
import java.lang.Object;
import zbc.d;

public class i extends Accessor	// class@0019f4
{
    public final e$b c;
    public final k d;

    public void i(k p0,e$b p1){
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
