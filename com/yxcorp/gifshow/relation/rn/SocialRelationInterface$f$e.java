package com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$e;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface;

public final class SocialRelationInterface$f$e implements Runnable	// class@00196b
{
    public final SocialRelationInterface$f b;

    public void SocialRelationInterface$f$e(SocialRelationInterface$f p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SocialRelationInterface$f$e.class, "1")) {
          return;
       }
       SocialRelationInterface$f$e tb = this.b;
       tb.b.onClickCreateIntimateHasInvite(tb.c);
       return;
    }
}
