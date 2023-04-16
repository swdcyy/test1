package com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$j;
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

public final class SocialRelationInterface$f$j implements a	// class@001970
{
    public final SocialRelationInterface$f a;

    public void SocialRelationInterface$f$j(SocialRelationInterface$f p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationInterface$f$j.class, "1")) {
       }else {
          SocialRelationInterface$f$j ta = this.a;
          a.o(p0, "it");
          ta.b.onClickRemoveFriends(ta.c, p0.booleanValue());
       }
       return;
    }
}
