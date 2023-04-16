package com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mDivider$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedContainerViewBinder;

public final class AlbumSelectedContainer$mDivider$2 extends Lambda implements a	// class@001aac
{
    public final AlbumSelectedContainer this$0;

    public void AlbumSelectedContainer$mDivider$2(AlbumSelectedContainer p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer$mDivider$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.V.o;
    }
    public Object invoke(){
       return this.invoke();
    }
}
