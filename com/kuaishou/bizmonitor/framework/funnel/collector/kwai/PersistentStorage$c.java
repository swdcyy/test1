package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage$c;
import nn.e;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage;
import java.lang.String;
import mn.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import on.i;
import com.google.gson.JsonObject;

public class PersistentStorage$c extends e	// class@00114f
{
    public final String b;
    public final String c;
    public final PersistentStorage d;

    public void PersistentStorage$c(PersistentStorage p0,String p1,String p2,String p3){
       this.d = p0;
       super(p1);
       this.b = p2;
       this.c = p3;
    }
    public Object a(b p0,Object p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, PersistentStorage$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return i.a(this.d.c(this.b), this.c);
    }
    public void b(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PersistentStorage$c.class, "2")) {
          return;
       }
       if (this.c == null) {
          this.d.g(this.b, p1);
       }else {
          JsonObject jsonObject = this.d.c(this.b);
          if (!jsonObject instanceof JsonObject) {
             jsonObject = new JsonObject();
          }
          i.c(jsonObject, this.c, p1);
          this.d.g(this.b, jsonObject);
       }
       return;
    }
}
