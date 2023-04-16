package com.facebook.react.uimanager.h$a;
import com.facebook.react.uimanager.UIManagerModule$a;
import com.facebook.react.uimanager.h;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;

public class h$a implements UIManagerModule$a	// class@001349
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public String a(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, h$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.d.get(p0);
       if (obj != null) {
          p0 = obj.get("registrationName");
       }
       return p0;
    }
}
