package com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$s;
import z1.a;
import lnc.i3;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Number;

public final class SocialRelationInterface$f$s implements a	// class@001979
{
    public final i3 a;

    public void SocialRelationInterface$f$s(i3 p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationInterface$f$s.class, "1")) {
       }else {
          a.o(p0, "it");
          this.a.c("is_show_send_message", Integer.valueOf(p0.booleanValue()));
       }
       return;
    }
}
