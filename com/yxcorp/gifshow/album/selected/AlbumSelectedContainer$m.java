package com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$m;
import java.lang.Runnable;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.util.Objects;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedContainerViewBinder;
import android.view.ViewParent;
import g79.a;
import android.app.Application;
import android.content.Context;
import ea9.a;
import com.yxcorp.gifshow.album.widget.AlbumSelectRecyclerView;
import java.lang.Float;

public final class AlbumSelectedContainer$m implements Runnable	// class@001aa4
{
    public final AlbumSelectedContainer b;
    public final Ref$ObjectRef c;

    public void AlbumSelectedContainer$m(AlbumSelectedContainer p0,Ref$ObjectRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       int bottom;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AlbumSelectedContainer$m.class, "1")) {
          return;
       }
       AlbumSelectedContainer$m tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(this.c.element, tb, AlbumSelectedContainer.class, "65")) {
          View view = tb.V.n();
          View view1 = tb.V.q();
          ViewParent parent = (view != null)? view.getParent(): objArray;
          if (parent instanceof View) {
             objArray = parent;
          }
          if (objArray != null) {
             a c = a.c;
             float f = 6.00f;
             float f1 = (float)(objArray.getLeft() + view.getRight()) + a.a(c.b(), f);
             float f2 = (float)(objArray.getTop() + view.getTop()) - a.a(c.b(), f);
             if (view.getBottom() > 0) {
                bottom = view.getBottom();
             }else if(view1 != null){
                bottom = view1.getBottom();
             }else {
                bottom = 0;
             }
             float f3 = (float)(objArray.getTop() + bottom) + a.a(c.b(), f);
             AlbumSelectRecyclerView uAlbumSelect = tb.D();
             Objects.requireNonNull(uAlbumSelect);
             if (!PatchProxy.isSupport(AlbumSelectRecyclerView.class) || !PatchProxy.applyVoidFourRefs(Float.valueOf(0), Float.valueOf(f2), Float.valueOf(f1), Float.valueOf(f3), uAlbumSelect, AlbumSelectRecyclerView.class, "2")) {
                uAlbumSelect.f = true;
                uAlbumSelect.b = 0;
                uAlbumSelect.c = f1;
                uAlbumSelect.d = f2;
                uAlbumSelect.e = f3;
             }
          }
       }
    label_00c4 :
       return;
    }
}
