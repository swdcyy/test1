package com.kwai.feature.post.api.magic.webp.vm.MagicBaseWebpVM$b;
import erd.g;
import com.kwai.feature.post.api.magic.webp.vm.MagicBaseWebpVM;
import w36.b;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Number;

public final class MagicBaseWebpVM$b implements g	// class@0013fa
{
    public final MagicBaseWebpVM b;
    public final b c;

    public void MagicBaseWebpVM$b(MagicBaseWebpVM p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicBaseWebpVM$b.class, "1")) {
       }else {
          p0 = this.b.b.remove(this.c.f());
          if (p0 != null) {
             p0.intValue();
             this.b.n0();
          }
       }
       return;
    }
}
