package com.kwai.feature.post.api.feature.bridge.GoToPostValue;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.lang.StringBuilder;

public class GoToPostValue implements Serializable	// class@00131b
{
    public final String mKey;
    public final String mValue;

    public void GoToPostValue(String p0,String p1){
       super();
       this.mKey = p0;
       this.mValue = p1;
    }
    public static GoToPostValue getFromMap(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GoToPostValue.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new GoToPostValue(p0.get("key"), p0.get("value"));
    }
    public Map toKrn(){
       HashMap obj = PatchProxy.apply(null, this, GoToPostValue.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("key", this.mKey);
       obj.put("value", this.mValue);
       return obj;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GoToPostValue.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GoToPostValue{mKey=\'"+this.mKey+'''+", mValue=\'"+this.mValue+'''+'}';
    }
}
