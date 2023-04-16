package com.yxcorp.gifshow.album.LocalAlbumParams$b;
import java.lang.Object;
import com.yxcorp.gifshow.album.LocalAlbumParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.LocalAlbumParams$a;

public class LocalAlbumParams$b	// class@0019cf
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;

    public void LocalAlbumParams$b(){
       super();
       this.a = true;
       this.b = true;
       this.c = false;
       this.d = true;
       this.e = false;
       this.f = false;
       this.g = true;
       this.h = false;
       this.j = false;
       this.k = false;
       this.l = 0;
       this.m = 3;
    }
    public LocalAlbumParams a(){
       Object obj = PatchProxy.apply(null, this, LocalAlbumParams$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LocalAlbumParams(this, null);
    }
    public LocalAlbumParams$b b(boolean p0){
       this.c = p0;
       return this;
    }
    public LocalAlbumParams$b c(boolean p0){
       this.j = p0;
       return this;
    }
    public LocalAlbumParams$b d(boolean p0){
       this.h = p0;
       return this;
    }
}
