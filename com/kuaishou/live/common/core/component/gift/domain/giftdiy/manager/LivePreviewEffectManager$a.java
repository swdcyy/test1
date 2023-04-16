package com.kuaishou.live.common.core.component.gift.domain.giftdiy.manager.LivePreviewEffectManager$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LivePreviewEffectManager$a	// class@001241
{
    public final int isNotPreview;
    public final String words;

    public void LivePreviewEffectManager$a(String p0,int p1){
       a.p(p0, "words");
       super();
       this.words = p0;
       this.isNotPreview = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePreviewEffectManager$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LivePreviewEffectManager$a && (a.g(this.words, p0.words) && this.isNotPreview == p0.isNotPreview))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LivePreviewEffectManager$a obj = PatchProxy.apply(null, this, LivePreviewEffectManager$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.words;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((i * 31) + this.isNotPreview);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePreviewEffectManager$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Content\(words="+this.words+", isNotPreview="+this.isNotPreview+"\)";
    }
}
