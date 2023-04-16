package com.yxcorp.plugin.setting.helper.j$c;
import erd.g;
import com.yxcorp.plugin.setting.helper.j;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import oe6.e;
import ok.h;
import com.kwai.framework.model.user.QCurrentUser;

public class j$c implements g	// class@0008bf
{
    public final j b;

    public void j$c(j p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$c.class, "1")) {
       }else {
          e.q0(System.currentTimeMillis());
          p0 = this.b.c;
          if (p0 != null) {
             p0.apply(null);
          }else {
             QCurrentUser.ME.setNotRecommendToContacts(true).commitChanges();
          }
       }
       return;
    }
}
