package com.kuaishou.live.bridge.commands.LiveJsCmdGetInteractMagicFaceInfo$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdGetInteractMagicFaceInfo$a	// class@000df1
{
    public final int mainEffectVersion;

    public void LiveJsCmdGetInteractMagicFaceInfo$a(int p0){
       super();
       this.mainEffectVersion = p0;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof LiveJsCmdGetInteractMagicFaceInfo$a && this.mainEffectVersion == p0.mainEffectVersion)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdGetInteractMagicFaceInfo$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mainEffectVersion;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdGetInteractMagicFaceInfo$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "InteractMagicFaceInfoResult\(mainEffectVersion="+this.mainEffectVersion+"\)";
    }
}
