package com.yxcorp.gifshow.album.home.AlbumAssetFragment$e;
import erd.g;
import kotlin.jvm.internal.Ref$BooleanRef;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$b;

public final class AlbumAssetFragment$e implements g	// class@0019d7
{
    public final Ref$BooleanRef b;
    public final AlbumAssetFragment c;
    public final boolean d;

    public void AlbumAssetFragment$e(Ref$BooleanRef p0,AlbumAssetFragment p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AlbumAssetFragment$e.class, "1")) {
       }else {
          Log.g("AlbumAssetFragment", "add part, isFirst="+this.b.element+", size="+p0.size()+", "+this.c.mh());
          a.h(p0, "partOfList");
          this.c.X.a(this.b.element, p0);
          this.c.Kh();
          p0 = this.b;
          if (p0.element != null) {
             p0.element = false;
          }
          PatchProxy.onMethodExit(AlbumAssetFragment$e.class, "1");
       }
       return;
    }
}
