package com.yxcorp.gifshow.v3.constructor.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.constructor.g;
import com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor$b;
import java.lang.Object;
import android.util.Pair;

public class a extends Accessor	// class@000d3f
{
    public final WorkspaceConstructor$b c;
    public final g d;

    public void a(g p0,WorkspaceConstructor$b p1){
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
