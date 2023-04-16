package com.tkruntime.v8.utils.AutoExpandedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.utils.V8ObjectUtilsQuick;

public class AutoExpandedList extends ArrayList	// class@000fd3
{

    public void AutoExpandedList(){
       super();
    }
    public void AutoExpandedList(List p0){
       super(p0);
    }
    public Object get(int p0){
       Object obj;
       if (PatchProxy.isSupport(AutoExpandedList.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, AutoExpandedList.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = super.get(p0);
       if (obj instanceof V8Value) {
          Object value = V8ObjectUtilsQuick.getValue(obj);
          if (value != obj) {
             this.set(p0, value);
          }
          return value;
       }else {
          return obj;
       }
    }
}
