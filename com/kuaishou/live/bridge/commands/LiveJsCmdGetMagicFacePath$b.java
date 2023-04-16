package com.kuaishou.live.bridge.commands.LiveJsCmdGetMagicFacePath$b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdGetMagicFacePath$b	// class@000df5
{
    public final boolean isSuccess;
    public final String path;

    public void LiveJsCmdGetMagicFacePath$b(boolean p0,String p1){
       a.p(p1, "path");
       super();
       this.isSuccess = p0;
       this.path = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdGetMagicFacePath$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdGetMagicFacePath$b && (this.isSuccess == p0.isSuccess && a.g(this.path, p0.path)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       LiveJsCmdGetMagicFacePath$b obj = PatchProxy.apply(null, this, LiveJsCmdGetMagicFacePath$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.isSuccess;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       LiveJsCmdGetMagicFacePath$b tpath = this.path;
       int i1 = (tpath != null)? tpath.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdGetMagicFacePath$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Result\(isSuccess="+this.isSuccess+", path="+this.path+"\)";
    }
}
