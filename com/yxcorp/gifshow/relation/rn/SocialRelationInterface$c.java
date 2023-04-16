package com.yxcorp.gifshow.relation.rn.SocialRelationInterface$c;
import erd.g;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hcc.j0;

public final class SocialRelationInterface$c implements g	// class@001964
{
    public final User b;

    public void SocialRelationInterface$c(User p0){
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationInterface$c.class, "1")) {
          return;
       }
       j0.r(this.b);
       return;
    }
}
