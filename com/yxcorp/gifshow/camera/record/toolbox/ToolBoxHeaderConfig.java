package com.yxcorp.gifshow.camera.record.toolbox.ToolBoxHeaderConfig;
import com.yxcorp.gifshow.camera.record.toolbox.ToolBoxHeaderConfig$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.toolbox.ToolBoxHeaderConfig$jsonObject$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.camera.record.toolbox.ToolBoxHeaderConfig$flashSearchHint$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ToolBoxHeaderConfig	// class@000f60
{
    public final p a;
    public final p b;
    public final String c;
    public static final ToolBoxHeaderConfig$a d;

    static {
       ToolBoxHeaderConfig.d = new ToolBoxHeaderConfig$a(null);
    }
    public void ToolBoxHeaderConfig(String p0){
       super();
       this.c = p0;
       this.a = s.c(new ToolBoxHeaderConfig$jsonObject$2(this));
       this.b = s.c(new ToolBoxHeaderConfig$flashSearchHint$2(this));
    }
    public final String a(){
       Object obj = PatchProxy.apply(null, this, ToolBoxHeaderConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final String b(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ToolBoxHeaderConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ToolBoxHeaderConfig && a.g(this.c, p0.c))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       ToolBoxHeaderConfig obj = PatchProxy.apply(null, this, ToolBoxHeaderConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ToolBoxHeaderConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ToolBoxHeaderConfig\(json="+this.c+"\)";
    }
}
