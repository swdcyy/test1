package com.kwai.live.gzone.propshop.h$e;
import k53.a;
import com.kwai.live.gzone.propshop.h;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public class h$e implements a	// class@000de9
{
    public final h a;

    public void h$e(h p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$e.class, "2")) {
          return;
       }
       this.a.a9();
       return;
    }
    public void b(String p0,boolean p1){
       h$e uoe = h$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "1")) {
          return;
       }
       this.a.c9(p0, p1);
       return;
    }
}
