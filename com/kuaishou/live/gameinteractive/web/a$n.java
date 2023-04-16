package com.kuaishou.live.gameinteractive.web.a$n;
import erd.g;
import com.kuaishou.live.gameinteractive.web.a;
import java.lang.String;
import v43.c;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import t02.a0;
import ft5.b;
import pp.a;
import java.lang.Throwable;
import q87.c;
import java.lang.Exception;

public class a$n implements g	// class@001c07
{
    public final String b;
    public final c c;
    public final a d;

    public void a$n(a p0,String p1,c p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$n.class, "1")) {
       }else {
          int i = 0;
          if (p0.booleanValue()) {
             try{
                this.d.p.Y1.U2(this.b);
                this.c.onSuccess();
             }catch(java.lang.Exception e4){
                objArray = new Object[i];
                a.C().u("GameInteractiveCommonBridgeImpl", e4, objArray);
                this.c.onError(-1, e4.getMessage());
             }
          }else {
             objArray = new Object[i];
             a.C().t("GameInteractiveCommonBridgeImpl", "request permission failed!", objArray);
             this.c.onError(-2, "request permission failed!");
          }
       }
    }
}
