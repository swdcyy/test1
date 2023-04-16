package com.kuaishou.ark.rtx.widget.RTXLogger;
import java.lang.Object;
import com.tkruntime.v8.V8Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.V8Value;
import com.kuaishou.ark.rtx.widget.RTXLogger$a;
import java.lang.Throwable;
import wp8.a;

public class RTXLogger	// class@000f94
{
    public RTXLogger$a loggerInterface;

    public void RTXLogger(){
       super();
    }
    public void log(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXLogger.class, "1")) {
          return;
       }
       try{
          Object[] objArray = new Object[]{p0};
          String str = p0.v8.getObject("JSON").executeFunction("stringify", objArray);
          RTXLogger tloggerInter = this.loggerInterface;
          if (tloggerInter != null) {
             tloggerInter.a(str);
          }
       }catch(java.lang.Exception e5){
          a.b(e5, -1);
       }
       return;
    }
    public void registerInterface(RTXLogger$a p0){
       this.loggerInterface = p0;
    }
}
