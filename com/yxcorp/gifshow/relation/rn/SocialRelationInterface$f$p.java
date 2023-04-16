package com.yxcorp.gifshow.relation.rn.SocialRelationInterface$f$p;
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

public final class SocialRelationInterface$f$p implements a	// class@001976
{
    public final i3 a;

    public void SocialRelationInterface$f$p(i3 p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SocialRelationInterface$f$p.class, "1")) {
       }else {
          a.o(p0, "it");
          this.a.c("is_show_remark_name", Integer.valueOf(p0.booleanValue()));
       }
       return;
    }
}
