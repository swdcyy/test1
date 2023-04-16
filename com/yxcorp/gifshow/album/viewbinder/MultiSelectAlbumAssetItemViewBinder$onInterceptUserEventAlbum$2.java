package com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$2;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder;
import q79.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetItemViewBinder;

public final class MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$2 implements View$OnClickListener	// class@001aeb
{
    public final MultiSelectAlbumAssetItemViewBinder b;
    public final d c;

    public void MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$2(MultiSelectAlbumAssetItemViewBinder p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$2.class, "1")) {
          return;
       }
       MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$2 tc = this.c;
       if (tc != null) {
          MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$2 tb = this.b;
          tb.x(tc, tb.p());
       }
       return;
    }
}
