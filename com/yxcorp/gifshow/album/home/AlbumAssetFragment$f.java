package com.yxcorp.gifshow.album.home.AlbumAssetFragment$f;
import erd.a;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import a79.a;
import q79.d;
import r79.a;
import w69.f;
import k79.f;

public final class AlbumAssetFragment$f implements a	// class@0019d8
{
    public final AlbumAssetFragment b;
    public final boolean c;

    public void AlbumAssetFragment$f(AlbumAssetFragment p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, AlbumAssetFragment$f.class, "1")) {
          return;
       }
       Log.g("AlbumAssetFragment", "add part finished,"+this.b.mh());
       AlbumAssetFragment.ch(this.b).Y0();
       this.b.uh();
       this.b.Kh();
       this.b.Hh();
       if (this.b.rh().z != null) {
          this.b.rh().a1(false);
          AlbumAssetFragment$f tb = this.b;
          AlbumAssetFragment o = tb.O;
          if (o != null) {
             o.d(tb.rh().s0().d().c());
          }
       }
       PatchProxy.onMethodExit(AlbumAssetFragment$f.class, "1");
       return;
    }
}
