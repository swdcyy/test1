package com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$mSelectedDes$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedContainerViewBinder;

public final class AlbumSelectedContainer$mSelectedDes$2 extends Lambda implements a	// class@001ab3
{
    public final AlbumSelectedContainer this$0;

    public void AlbumSelectedContainer$mSelectedDes$2(AlbumSelectedContainer p0){
       this.this$0 = p0;
       super(0);
    }
    public final TextView invoke(){
       Object obj = PatchProxy.apply(null, this, AlbumSelectedContainer$mSelectedDes$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.V.o();
    }
    public Object invoke(){
       return this.invoke();
    }
}
