package com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$o;
import p79.f;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import l79.m;
import ec7.a;
import com.yxcorp.gifshow.album.home.AlbumFragment;

public final class AlbumSelectedContainer$o implements f	// class@001ab9
{
    public final AlbumSelectedContainer a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public void AlbumSelectedContainer$o(AlbumSelectedContainer p0,boolean p1,boolean p2,boolean p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, AlbumSelectedContainer$o.class, "1")) {
          return;
       }
       AlbumSelectedContainer$o tb = this.b;
       if (tb != null && (this.c != null && this.d == null)) {
          AlbumSelectedContainer$o ta = this.a;
          AlbumSelectedContainer u = ta.U;
          boolean b = (tb != null && AlbumSelectedContainer.f(ta).getItemCount())? true: false;
          AlbumFragment.Uh(u, b, 0, 0, false, false, 30, null);
       }
    label_0037 :
       return;
    }
}
