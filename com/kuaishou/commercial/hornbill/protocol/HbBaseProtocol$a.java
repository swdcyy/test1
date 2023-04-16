package com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$a;
import java.lang.Object;
import nsd.u;
import com.google.gson.JsonObject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Number;
import kotlin.jvm.internal.a;
import com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol;
import vx.b;

public final class HbBaseProtocol$a	// class@0014e2
{

    public void HbBaseProtocol$a(){
       super();
    }
    public void HbBaseProtocol$a(u p0){
       super();
    }
    public final JsonObject a(JsonObject p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, HbBaseProtocol$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.m0(p1);
       if (p0 == null) {
          p0 = new JsonObject();
       }
       return p0;
    }
    public final int b(int p0,String p1){
       HbBaseProtocol$a uoa = HbBaseProtocol$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p1, "realScene");
       if (p0 == -1000) {
          p0 = -1;
       }else if(HbBaseProtocol.c.a(p0, p1)){
          p0 = 1;
       }else if(HbBaseProtocol.d.a(p0, p1)){
          p0 = 2;
       }else {
          p0 = 0;
       }
       return p0;
    }
}
