package com.yxcorp.gifshow.relation.select.j;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.relation.select.l;
import com.yxcorp.gifshow.relation.select.SelectUsersTabHostFragment$c;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class j extends Accessor	// class@0019a1
{
    public final SelectUsersTabHostFragment$c c;
    public final l d;

    public void j(l p0,SelectUsersTabHostFragment$c p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.c;
    }
    public void set(Object p0){
       this.c.c = p0;
    }
}
