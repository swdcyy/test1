package com.kuaishou.live.common.core.basic.arya.c;
import ok.x;
import java.lang.Object;
import com.kuaishou.live.common.core.basic.arya.LiveSnowManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jw4.f;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import w51.a;

public final class c implements x	// class@000e75
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object get(){
       f uof = PatchProxy.apply(null, null, LiveSnowManager.class, "15");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f();
          uof.a = "kuaishou_android";
          uof.b = QCurrentUser.ME.getId();
          uof.c = a.m;
          uof.d = a.a;
          if (a.o()) {
             uof.e = 0xffffffff;
             uof.f = LiveSnowManager.a;
          }
       }
       return uof;
    }
}
