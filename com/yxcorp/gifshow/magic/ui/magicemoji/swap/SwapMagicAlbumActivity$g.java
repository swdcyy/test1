package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$g;
import erd.o;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Object;
import g26.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.e0;
import kotlin.jvm.internal.a;
import brd.a0;

public final class SwapMagicAlbumActivity$g implements o	// class@001c1f
{
    public final SwapMagicAlbumActivity b;
    public final QMedia c;

    public void SwapMagicAlbumActivity$g(SwapMagicAlbumActivity p0,QMedia p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       a0 uoa0 = PatchProxy.applyOneRefs(p0, this, SwapMagicAlbumActivity$g.class, "1");
       if (uoa0 != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          this.b.T = p0;
          uoa0 = a0.B(this.c);
       }
       return uoa0;
    }
}
