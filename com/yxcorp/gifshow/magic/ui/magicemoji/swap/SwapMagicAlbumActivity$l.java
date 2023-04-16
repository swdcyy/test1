package com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity$l;
import com.yxcorp.gifshow.album.IAlbumMainFragment$e;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity;
import java.lang.Object;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;

public final class SwapMagicAlbumActivity$l implements IAlbumMainFragment$e	// class@001c24
{
    public final SwapMagicAlbumActivity a;

    public void SwapMagicAlbumActivity$l(SwapMagicAlbumActivity p0){
       this.a = p0;
       super();
    }
    public final void a(int p0,QMedia p1,int p2,boolean p3){
       if (PatchProxy.isSupport(SwapMagicAlbumActivity$l.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, SwapMagicAlbumActivity$l.class, "1")) {
          return;
       }
       this.a.F3(p1, p0, p2, true, p3);
       return;
    }
}
