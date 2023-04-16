package com.kwai.feature.post.api.magic.webp.vm.MagicBaseWebpVM$e;
import erd.g;
import com.kwai.feature.post.api.magic.webp.vm.MagicBaseWebpVM;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;
import java.util.Map;

public final class MagicBaseWebpVM$e implements g	// class@0013fd
{
    public final MagicBaseWebpVM b;

    public void MagicBaseWebpVM$e(MagicBaseWebpVM p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicBaseWebpVM$e.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          p3.D().w("MagicFaceBaseWebpVM", "saveCount size:"+p0.size(), objArray);
          a.o(p0, "it");
          this.b.s0(p0);
       }
       return;
    }
}
