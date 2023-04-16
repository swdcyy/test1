package com.yxcorp.gifshow.relation.initmodule.RelationInitModule$a;
import erd.g;
import com.yxcorp.gifshow.relation.initmodule.RelationInitModule;
import java.lang.Object;
import eda.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class RelationInitModule$a implements g	// class@0018d9
{
    public final RelationInitModule b;

    public void RelationInitModule$a(RelationInitModule p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RelationInitModule$a.class, "1")) {
       }else if(p0 != null){
          this.b.onLoginEvent(p0);
       }
       return;
    }
}
