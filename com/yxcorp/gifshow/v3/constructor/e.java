package com.yxcorp.gifshow.v3.constructor.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.v3.constructor.g;
import com.yxcorp.gifshow.v3.constructor.WorkspaceConstructor$b;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;

public class e extends Accessor	// class@000d43
{
    public final WorkspaceConstructor$b c;
    public final g d;

    public void e(g p0,WorkspaceConstructor$b p1){
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
