package com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mPickLayout$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedContainerViewBinder;
import kotlin.jvm.internal.a;

public final class AlbumSelectedContainer$mPickLayout$2 extends Lambda implements a	// class@001aaf
{
    public final AlbumSelectedContainer this$0;

    public void AlbumSelectedContainer$mPickLayout$2(AlbumSelectedContainer p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       AlbumSelectedContainer obj = PatchProxy.apply(objArray, this, AlbumSelectedContainer$mPickLayout$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0.V;
       Objects.requireNonNull(obj);
       AbsSelectedContainerViewBinder uAbsSelected = PatchProxy.apply(objArray, obj, AbsSelectedContainerViewBinder.class, "1");
       if (uAbsSelected != patchProxyRe) {
       }else {
          uAbsSelected = obj.b;
          if (uAbsSelected == null) {
             a.S("mPickLayout");
          }
       }
       return uAbsSelected;
    }
    public Object invoke(){
       return this.invoke();
    }
}
