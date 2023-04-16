package com.kwai.feature.post.api.magic.webp.vm.MagicBaseWebpVM$c;
import java.util.concurrent.Callable;
import com.kwai.feature.post.api.magic.webp.vm.MagicBaseWebpVM;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;

public final class MagicBaseWebpVM$c implements Callable	// class@0013fb
{
    public final MagicBaseWebpVM b;

    public void MagicBaseWebpVM$c(MagicBaseWebpVM p0){
       this.b = p0;
       super();
    }
    public Object call(){
       Map map = PatchProxy.apply(null, this, MagicBaseWebpVM$c.class, "1");
       if (map != PatchProxyResult.class) {
       }else {
          map = this.b.r0();
       }
       return map;
    }
}
