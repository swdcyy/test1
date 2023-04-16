package com.kwai.feature.post.api.magic.webp.vm.MagicBaseWebpVM$d;
import erd.o;
import com.kwai.feature.post.api.magic.webp.vm.MagicBaseWebpVM;
import w36.b;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Integer;
import lnc.a1;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;

public final class MagicBaseWebpVM$d implements o	// class@0013fc
{
    public final MagicBaseWebpVM b;
    public final b c;

    public void MagicBaseWebpVM$d(MagicBaseWebpVM p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       int i1;
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, MagicBaseWebpVM$d.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = this.c.a();
          boolean b = true;
          int i = 0;
          if (p0 != null) {
             i1 = (!p0.length)? 1: 0;
             if (!i1) {
                i1 = null;
             label_002d :
                String str = "magicWebpData:";
                if (!i1 && this.c.b() > 0) {
                   i1 = this.b.b.get(this.c.f());
                   i1 = (i1 != null)? i1.intValue(): 0;
                   long l = a1.k();
                   if (i1 >= this.c.b() || (this.c.d() - l > 0 || l - this.c.c() > 0)) {
                      if (l - this.c.c() > 0) {
                         Object[] objArray1 = new Object[i];
                         p3.D().w("MagicFaceBaseWebpVM", str+this.c+" gif is out date, clear count!", objArray1);
                         this.b.b.remove(this.c.f());
                      }
                      b = false;
                   }
                   Object[] objArray = new Object[i];
                   p3.D().s("MagicFaceBaseWebpVM", "isAllowBindWebp magicWebpData:"+this.c+", "+"count:"+i1+", "+"currentTime:"+l+", "+"allow:"+b, objArray);
                   i = b;
                }else {
                   Object[] objArray2 = new Object[i];
                   p3.D().s("MagicFaceBaseWebpVM", str+this.c+" gif is not set!", objArray2);
                   this.b.b.remove(this.c.f());
                }
                uBoolean = Boolean.valueOf(i);
             }
          }
          i1 = 1;
          goto label_002d ;
       }
       return uBoolean;
    }
}
