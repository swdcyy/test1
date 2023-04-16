package com.yxcorp.gifshow.magic.ui.magicemoji.swap.f$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.f;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$i;
import java.util.Objects;
import com.yxcorp.gifshow.albumwrapper.AlbumGifshowActivity;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import kotlin.jvm.internal.a;

public final class f$a implements Runnable	// class@001c3c
{
    public final f b;
    public final QMedia c;

    public void f$a(f p0,QMedia p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$a.class, "1")) {
          return;
       }
       SwapMagicAlbumActivity$i b = this.b.b.b;
       Objects.requireNonNull(b);
       AlbumGifshowActivity uAlbumGifsho = PatchProxy.apply(objArray, b, AlbumGifshowActivity.class, "4");
       if (uAlbumGifsho != PatchProxyResult.class) {
       }else {
          uAlbumGifsho = b.z;
          if (uAlbumGifsho == null) {
             a.S("mAlbumMainFragment");
          }
       }
       uAlbumGifsho.db(this.c, this.b.b.g);
       return;
    }
}
