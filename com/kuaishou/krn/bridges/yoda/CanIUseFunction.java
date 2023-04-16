package com.kuaishou.krn.bridges.yoda.CanIUseFunction;
import com.kuaishou.krn.bridges.yoda.IFunction;
import com.kuaishou.krn.bridges.yoda.KrnYodaModule;
import java.lang.String;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import java.util.Map;
import java.lang.Integer;
import com.kuaishou.krn.bridges.yoda.IFunction$IllegalCallException;
import java.lang.Throwable;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.bridges.yoda.CanIUseFunction$CanUseResultParams;
import com.kuaishou.krn.bridges.yoda.CanIUseFunction$a;
import com.google.gson.Gson;

public class CanIUseFunction extends IFunction	// class@000836
{
    public KrnYodaModule a;

    public void CanIUseFunction(KrnYodaModule p0){
       super();
       this.a = p0;
    }
    public void a(String p0,String p1,String p2,Callback p3){
       Object[] objArray;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, CanIUseFunction.class, "1")) {
          return;
       }
       try{
          JSONObject jSONObject = new JSONObject(p2);
          p1 = jSONObject.getString("name");
          Map map = this.a.getSystemFunctionMap().get(jSONObject.getString("namespace"));
          if (map != null && map.get(p1) != null) {
             objArray = new Object[]{Integer.valueOf(1),this.d(1)};
             p3.invoke(objArray);
          }else {
             objArray = new Object[]{Integer.valueOf(0x1e84f),this.d(0)};
             p3.invoke(objArray);
          }
          return;
       }catch(java.lang.Exception e8){
          throw new IFunction$IllegalCallException(this, e8);
       }
    }
    public void c(long p0){
    }
    public final String d(boolean p0){
       CanIUseFunction$CanUseResultParams obj;
       CanIUseFunction uCanIUseFunc = CanIUseFunction.class;
       if (PatchProxy.isSupport(uCanIUseFunc)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uCanIUseFunc, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new CanIUseFunction$CanUseResultParams(null);
       obj.mCanIUse = p0;
       return new Gson().q(obj);
    }
}
