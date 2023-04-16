package com.tkruntime.v8.utils.AutoExpandedMap;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.utils.V8ObjectUtilsQuick;

public class AutoExpandedMap extends HashMap	// class@000fd4
{

    public void AutoExpandedMap(){
       super();
    }
    public void AutoExpandedMap(Map p0){
       super(p0);
    }
    public Object get(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AutoExpandedMap.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.get(p0);
       if (!obj instanceof V8Value) {
          return obj;
       }
       Object value = V8ObjectUtilsQuick.getValue(obj);
       if (value != obj) {
          this.put(p0, value);
       }
       return value;
    }
}
