package com.kuaishou.live.common.core.component.like.particle.LiveHeartParticleBubbleView$c;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Number;
import java.io.File;

public class LiveHeartParticleBubbleView$c	// class@001471
{
    public int[] a;
    public File[] b;

    public void LiveHeartParticleBubbleView$c(){
       super();
    }
    public void LiveHeartParticleBubbleView$c(int[] p0){
       super();
       this.a = p0;
    }
    public int a(int p0){
       LiveHeartParticleBubbleView$c obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveHeartParticleBubbleView$c uoc = LiveHeartParticleBubbleView$c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "4");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       obj = this.a;
       int i = 0;
       if (obj != null) {
          if (obj == null || (p0 < obj.length && p0 >= 0)) {
             i = obj[p0];
          }
       }else if(PatchProxy.isSupport(uoc)){
          Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "5");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }
       }
       LiveHeartParticleBubbleView$c tb = this.b;
       if (tb == null || (p0 < tb.length && p0 >= 0)) {
          i = tb[p0].hashCode();
       }
    label_0056 :
       return i;
    }
    public int b(){
       int len;
       LiveHeartParticleBubbleView$c ta = this.a;
       if (ta != null) {
          len = ta.length;
       }else {
          ta = this.b;
          len = (ta != null)? ta.length: 0;
       }
       return len;
    }
}
