package com.yxcorp.gifshow.relation.select.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.select.l;
import com.yxcorp.gifshow.relation.select.SelectUsersTabHostFragment$c;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class i extends Accessor	// class@0019a0
{
    public final SelectUsersTabHostFragment$c c;
    public final l d;

    public void i(l p0,SelectUsersTabHostFragment$c p1){
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
