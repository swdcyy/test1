package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$e;
import erd.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s5b.b;
import w46.b;

public final class SwapMagicAlbumActivity$e implements g	// class@001c1d
{
    public final SwapMagicAlbumActivity b;

    public void SwapMagicAlbumActivity$e(SwapMagicAlbumActivity p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SwapMagicAlbumActivity$e.class, "1")) {
       }else {
          this.b.A3();
          b.D().e("SwapMagicAlbumActivity", "handleSelectedResultAndCompress error", p0);
       }
       return;
    }
}
