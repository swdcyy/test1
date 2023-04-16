package com.yxcorp.gifshow.album.home.AlbumAssetFragment$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import q79.d;
import r79.a;
import w69.f;
import w69.k;

public final class AlbumAssetFragment$c implements Runnable	// class@0019d5
{
    public final AlbumAssetFragment b;
    public final int c;

    public void AlbumAssetFragment$c(AlbumAssetFragment p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AlbumAssetFragment$c.class, "1")) {
          return;
       }
       this.b.Ga(this.c);
       this.b.vb(this.c);
       this.b.rh().s0().d().m(false);
       this.b.rh().s0().m().D("");
       return;
    }
}
