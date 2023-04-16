package com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$g;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface;

public final class SocialRelationInterface$f$g implements Runnable	// class@00196d
{
    public final SocialRelationInterface$f b;

    public void SocialRelationInterface$f$g(SocialRelationInterface$f p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SocialRelationInterface$f$g.class, "1")) {
          return;
       }
       SocialRelationInterface$f$g tb = this.b;
       tb.b.onClickIntimateRelease(tb.c);
       return;
    }
}
