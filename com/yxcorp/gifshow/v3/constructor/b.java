package com.yxcorp.gifshow.v3.constructor.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.constructor.g;
import com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor$b;
import java.lang.Object;
import android.content.Intent;

public class b extends Accessor	// class@000d40
{
    public final WorkspaceConstructor$b c;
    public final g d;

    public void b(g p0,WorkspaceConstructor$b p1){
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
