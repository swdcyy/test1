package com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$f;
import z1.a;
import lnc.i3;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class SocialRelationInterface$f$f implements a	// class@00196c
{
    public final i3 a;

    public void SocialRelationInterface$f$f(i3 p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationInterface$f$f.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             this.a.d("friendship_status", "friendship_inviting");
          }
       }
       return;
    }
}
