package com.kuaishou.android.security.base.util.m;
import java.lang.Object;
import com.kuaishou.android.security.base.network.d;
import org.json.JSONObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;

public class m	// class@000f2a
{

    public void m(){
       super();
    }
    public static JSONObject a(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JSONObject(p0.a());
    }
}
