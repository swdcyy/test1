package com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$n;
import p79.f;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import l79.m;
import ec7.a;
import com.yxcorp.gifshow.album.home.AlbumFragment;

public final class AlbumSelectedContainer$n implements f	// class@001ab8
{
    public final AlbumSelectedContainer a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public void AlbumSelectedContainer$n(AlbumSelectedContainer p0,boolean p1,boolean p2,boolean p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, AlbumSelectedContainer$n.class, "1")) {
          return;
       }
       AlbumSelectedContainer$n tb = this.b;
       if (tb != null && (this.c != null && this.d == null)) {
          AlbumSelectedContainer$n ta = this.a;
          AlbumSelectedContainer u = ta.U;
          boolean b = (tb != null && AlbumSelectedContainer.f(ta).getItemCount())? true: false;
          AlbumFragment.Uh(u, b, 0, 0, false, this.d, 14, null);
       }
    label_0038 :
       return;
    }
}
