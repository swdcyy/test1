package com.kuaishou.tuna_core.button.d$a;
import ov5.c;
import brd.v;
import java.lang.Object;
import java.lang.String;
import com.kwai.feature.api.social.login.model.PrePhoneNumModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import com.kuaishou.tuna_core.button.TunaLocalPhoneUtils$Companion$tryGetLocalPhoneInfo$1$1$1;
import msd.a;
import c15.b;
import brd.g;

public final class d$a implements c	// class@0010ba
{
    public final v a;

    public void d$a(v p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,Object p1,String p2){
       if (!PatchProxy.isSupport(d$a.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, d$a.class, "1")) {
          b.g(KsLogTunaCoreTag.TUNA_BUTTON.appendTag("tryGetLocalPhoneInfo"), new TunaLocalPhoneUtils$Companion$tryGetLocalPhoneInfo$1$1$1(p0, p1, p2));
          if (p0 && p1 != null) {
             this.a.onNext(p1);
          }else {
             this.a.onNext(new PrePhoneNumModel());
          }
       }
       return;
    }
}
