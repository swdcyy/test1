package com.kuaishou.live.basic.ability.LiveResourceAbility$Size;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveResourceAbility$Size	// class@000c77
{
    public final Integer height;
    public final Integer width;

    public void LiveResourceAbility$Size(Integer p0,Integer p1){
       super();
       this.width = p0;
       this.height = p1;
    }
    public static LiveResourceAbility$Size copy$default(LiveResourceAbility$Size p0,Integer p1,Integer p2,int p3,Object p4){
       LiveResourceAbility$Size width;
       LiveResourceAbility$Size height;
       if (p3 & 0x01) {
          width = p0.width;
       }
       if (p3 & 0x02) {
          height = p0.height;
       }
       return p0.copy(width, height);
    }
    public final Integer component1(){
       return this.width;
    }
    public final Integer component2(){
       return this.height;
    }
    public final LiveResourceAbility$Size copy(Integer p0,Integer p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveResourceAbility$Size.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveResourceAbility$Size(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveResourceAbility$Size.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveResourceAbility$Size && (a.g(this.width, p0.width) && a.g(this.height, p0.height)))) {
          return true;
       }
       return false;
    }
    public final Integer getHeight(){
       return this.height;
    }
    public final Integer getWidth(){
       return this.width;
    }
    public int hashCode(){
       LiveResourceAbility$Size obj = PatchProxy.apply(null, this, LiveResourceAbility$Size.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.width;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveResourceAbility$Size theight = this.height;
       if (theight != null) {
          i = theight.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveResourceAbility$Size.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Size\(width="+this.width+", height="+this.height+"\)";
    }
}
