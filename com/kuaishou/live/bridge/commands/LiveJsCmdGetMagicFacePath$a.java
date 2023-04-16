package com.kuaishou.live.bridge.commands.LiveJsCmdGetMagicFacePath$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdGetMagicFacePath$a	// class@000df4
{
    public final String effectKey;
    public final long magicFaceId;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdGetMagicFacePath$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdGetMagicFacePath$a && (a.g(this.effectKey, p0.effectKey) && !this.magicFaceId - p0.magicFaceId))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdGetMagicFacePath$a obj = PatchProxy.apply(null, this, LiveJsCmdGetMagicFacePath$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.effectKey;
       int i = (obj != null)? obj.hashCode(): 0;
       LiveJsCmdGetMagicFacePath$a tmagicFaceId = this.magicFaceId;
       return ((i * 31) + (int)(tmagicFaceId ^ (tmagicFaceId >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdGetMagicFacePath$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(effectKey="+this.effectKey+", magicFaceId="+this.magicFaceId+"\)";
    }
}
