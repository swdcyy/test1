package com.yxcorp.gifshow.v3.constructor.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.constructor.g;
import com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor$b;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class d extends Accessor	// class@000d42
{
    public final WorkspaceConstructor$b c;
    public final g d;

    public void d(g p0,WorkspaceConstructor$b p1){
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
