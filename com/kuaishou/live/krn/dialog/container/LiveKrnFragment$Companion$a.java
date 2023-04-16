package com.kuaishou.live.krn.dialog.container.LiveKrnFragment$Companion$a;
import ik0.a;
import lp3.e;
import o63.c;
import com.kuaishou.krn.model.LaunchModel;
import o63.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import o63.d;

public final class LiveKrnFragment$Companion$a implements a	// class@001d54
{
    public final e b;
    public final c c;
    public final LaunchModel d;
    public final a e;

    public void LiveKrnFragment$Companion$a(e p0,c p1,LaunchModel p2,a p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public boolean Wc(boolean p0){
       if (PatchProxy.isSupport2(LiveKrnFragment$Companion$a.class, "1")) {
          Object obj = PatchProxy.applyOneRefsWithListener(Boolean.valueOf(p0), this, LiveKrnFragment$Companion$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.c.L();
       PatchProxy.onMethodExit(LiveKrnFragment$Companion$a.class, "1");
       return true;
    }
}
