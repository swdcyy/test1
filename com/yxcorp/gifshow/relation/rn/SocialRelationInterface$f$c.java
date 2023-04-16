package com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface;

public final class SocialRelationInterface$f$c implements Runnable	// class@001969
{
    public final SocialRelationInterface$f b;

    public void SocialRelationInterface$f$c(SocialRelationInterface$f p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SocialRelationInterface$f$c.class, "1")) {
          return;
       }
       SocialRelationInterface$f$c tb = this.b;
       tb.b.onClickCreateIntimate(tb.c);
       return;
    }
}
