package com.yxcorp.gifshow.v3.constructor.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.constructor.g;
import com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor$b;
import java.lang.Object;
import qba.d;

public class c extends Accessor	// class@000d41
{
    public final WorkspaceConstructor$b c;
    public final g d;

    public void c(g p0,WorkspaceConstructor$b p1){
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
