package com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$h;
import z1.a;
import lnc.i3;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class SocialRelationInterface$f$h implements a	// class@00196e
{
    public final i3 a;

    public void SocialRelationInterface$f$h(i3 p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationInterface$f$h.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             this.a.d("friendship_status", "friendship_remove");
          }
       }
       return;
    }
}
