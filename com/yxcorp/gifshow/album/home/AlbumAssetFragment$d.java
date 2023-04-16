package com.yxcorp.gifshow.album.home.AlbumAssetFragment$d;
import erd.g;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import k79.f;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import crd.b;

public final class AlbumAssetFragment$d implements g	// class@0019d6
{
    public final int b;
    public final AlbumAssetFragment c;
    public final f d;

    public void AlbumAssetFragment$d(int p0,AlbumAssetFragment p1,f p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AlbumAssetFragment$d.class, "1")) {
       }else {
          AlbumAssetFragment$d tc = this.c;
          tc.Q = p0;
          a.h(p0, "it");
          tc.th(this.b, p0);
          p0 = this.c.P;
          if (p0 != null) {
             p0.dispose();
          }
          p0.P = null;
          PatchProxy.onMethodExit(AlbumAssetFragment$d.class, "1");
       }
       return;
    }
}
