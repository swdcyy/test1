package com.kuaishou.live.basic.ability.LiveResourceAbility$Params;
import java.util.List;
import com.kuaishou.live.basic.ability.LiveResourceAbility$Size;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveResourceAbility$Params	// class@000c73
{
    public final List imagesCdnUrls;
    public final List imagesUrls;
    public final LiveResourceAbility$Size size;

    public void LiveResourceAbility$Params(List p0,List p1,LiveResourceAbility$Size p2){
       super();
       this.imagesCdnUrls = p0;
       this.imagesUrls = p1;
       this.size = p2;
    }
    public static LiveResourceAbility$Params copy$default(LiveResourceAbility$Params p0,List p1,List p2,LiveResourceAbility$Size p3,int p4,Object p5){
       LiveResourceAbility$Params imagesCdnUrl;
       LiveResourceAbility$Params imagesUrls;
       LiveResourceAbility$Params size;
       if (p4 & 0x01) {
          imagesCdnUrl = p0.imagesCdnUrls;
       }
       if (p4 & 0x02) {
          imagesUrls = p0.imagesUrls;
       }
       if (p4 & 0x04) {
          size = p0.size;
       }
       return p0.copy(imagesCdnUrl, imagesUrls, size);
    }
    public final List component1(){
       return this.imagesCdnUrls;
    }
    public final List component2(){
       return this.imagesUrls;
    }
    public final LiveResourceAbility$Size component3(){
       return this.size;
    }
    public final LiveResourceAbility$Params copy(List p0,List p1,LiveResourceAbility$Size p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveResourceAbility$Params.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveResourceAbility$Params(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveResourceAbility$Params.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveResourceAbility$Params && (a.g(this.imagesCdnUrls, p0.imagesCdnUrls) && (a.g(this.imagesUrls, p0.imagesUrls) && a.g(this.size, p0.size))))) {
          return true;
       }
       return false;
    }
    public final List getImagesCdnUrls(){
       return this.imagesCdnUrls;
    }
    public final List getImagesUrls(){
       return this.imagesUrls;
    }
    public final LiveResourceAbility$Size getSize(){
       return this.size;
    }
    public int hashCode(){
       LiveResourceAbility$Params obj = PatchProxy.apply(null, this, LiveResourceAbility$Params.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.imagesCdnUrls;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveResourceAbility$Params timagesUrls = this.imagesUrls;
       int i2 = (timagesUrls != null)? timagesUrls.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       timagesUrls = this.size;
       if (timagesUrls != null) {
          i = timagesUrls.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveResourceAbility$Params.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Params\(imagesCdnUrls="+this.imagesCdnUrls+", imagesUrls="+this.imagesUrls+", size="+this.size+"\)";
    }
}
