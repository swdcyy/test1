package com.kuaishou.live.common.core.component.gift.giftstore.bean.LivePreviewEffectInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LivePreviewEffectInfo	// class@001316
{
    public final String commonEffectInfo;
    public final boolean needPreviewEffect;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePreviewEffectInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LivePreviewEffectInfo && (this.needPreviewEffect == p0.needPreviewEffect && a.g(this.commonEffectInfo, p0.commonEffectInfo)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       LivePreviewEffectInfo obj = PatchProxy.apply(null, this, LivePreviewEffectInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.needPreviewEffect;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       LivePreviewEffectInfo tcommonEffec = this.commonEffectInfo;
       int i1 = (tcommonEffec != null)? tcommonEffec.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePreviewEffectInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LivePreviewEffectInfo\(needPreviewEffect="+this.needPreviewEffect+", commonEffectInfo="+this.commonEffectInfo+"\)";
    }
}
