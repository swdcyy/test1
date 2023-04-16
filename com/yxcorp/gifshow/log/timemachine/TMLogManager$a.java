package com.yxcorp.gifshow.log.timemachine.TMLogManager$a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.log.timemachine.TMLogManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a3b.a;
import org.json.JSONObject;
import h8c.a;
import java.lang.Throwable;
import q87.c;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.Boolean;
import java.util.Map;
import java.lang.Integer;
import qrd.p;
import java.lang.Float;
import ekd.k1;
import k2b.u1;

public final class TMLogManager$a implements Runnable	// class@001b46
{
    public final String b;
    public final String c;
    public final Object d;

    public void TMLogManager$a(String p0,String p1,Object p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       int i;
       Object[] objArray;
       boolean b;
       float f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TMLogManager tMLogManager = TMLogManager.class;
       if (PatchProxy.applyVoid(null, this, TMLogManager$a.class, "1")) {
          return;
       }
       a uoa = TMLogManager.e.a(this.b);
       JSONObject jSONObject = new JSONObject();
       try{
          i = 0;
          jSONObject.put("bizType", this.b);
          jSONObject.put("launchId", TMLogManager.a);
          jSONObject.put("bizSessionId", uoa.a());
          jSONObject.put("bizContext", uoa.e());
          jSONObject.put("messageType", this.c);
          jSONObject.put("messageDetail", this.d);
       }catch(org.json.JSONException e2){
          objArray = new Object[i];
          a.C().u("TMLogManager", e2, objArray);
       }
       String str = jSONObject.toString();
       a.o(str, "JSONObject\(\).apply {\n   бн     }\n      }.toString\(\)");
       a uoa1 = a.C();
       TMLogManager e = TMLogManager.e;
       TMLogManager$a tb = this.b;
       TMLogManager$a tc = this.c;
       Objects.requireNonNull(e);
       String str1 = PatchProxy.applyTwoRefs(tb, tc, e, tMLogManager, "9");
       if (str1 != patchProxyRe) {
       }else {
          str1 = tb+'_'+tc;
       }
       objArray = new Object[i];
       uoa1.w(str1, str, objArray);
       TMLogManager$a tb1 = this.b;
       tb = this.c;
       Objects.requireNonNull(e);
       Integer obj = PatchProxy.applyTwoRefs(tb1, tb, e, tMLogManager, "8");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = e.b().get(tb1);
          if (obj != null && obj.intValue() == 2) {
             Object obj1 = PatchProxy.apply(null, e, tMLogManager, "2");
             if (obj1 != patchProxyRe) {
             }else {
                obj1 = TMLogManager.d.getValue();
             }
             Map map = obj1.get(tb1);
             if (map != null) {
                Float uFloat = map.get(tb);
                if (uFloat != null) {
                   f = uFloat.floatValue();
                label_00e8 :
                   if (k1.l(f)) {
                   label_00ef :
                      b = i;
                   }
                }
             }
             f = 0x3f800000;
             goto label_00e8 ;
          }
       label_00ee :
          i = 1;
          goto label_00ef ;
       }
       if (!b) {
          u1.R("FeedTimeMachine", str, 5);
       }
       return;
    }
}
