package com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$l;
import z1.a;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.relation.rn.SocialRelationInterface;

public final class SocialRelationInterface$f$l implements a	// class@001972
{
    public final SocialRelationInterface$f a;

    public void SocialRelationInterface$f$l(SocialRelationInterface$f p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationInterface$f$l.class, "1")) {
       }else {
          SocialRelationInterface$f$l ta = this.a;
          a.o(p0, "it");
          ta.b.onClickReverseRemoveFriends(ta.c, p0.booleanValue());
       }
       return;
    }
}
