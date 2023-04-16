package com.kuaishou.live.core.voiceparty.background.multiimage.LottieConfig;
import com.kuaishou.live.core.voiceparty.background.multiimage.LottieConfig$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LottieConfig	// class@00135d
{
    public final int repeatCount;
    public final String repeatMode;
    public static final LottieConfig$a a;

    static {
       LottieConfig.a = new LottieConfig$a(null);
    }
    public void LottieConfig(){
       a.p("RESTART", "repeatMode");
       super();
       this.repeatMode = "RESTART";
       this.repeatCount = -1;
    }
    public final int a(){
       return this.repeatCount;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LottieConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LottieConfig && (a.g(this.repeatMode, p0.repeatMode) && this.repeatCount == p0.repeatCount))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LottieConfig obj = PatchProxy.apply(null, this, LottieConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.repeatMode;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((i * 31) + this.repeatCount);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LottieConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LottieConfig\(repeatMode="+this.repeatMode+", repeatCount="+this.repeatCount+"\)";
    }
}
