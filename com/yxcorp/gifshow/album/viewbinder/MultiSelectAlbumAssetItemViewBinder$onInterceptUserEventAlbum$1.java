package com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder;
import q79.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$1 implements View$OnClickListener	// class@001aea
{
    public final MultiSelectAlbumAssetItemViewBinder b;
    public final d c;

    public void MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$1(MultiSelectAlbumAssetItemViewBinder p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$1.class, "1")) {
          return;
       }
       MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$1 tc = this.c;
       if (tc != null) {
          this.b.x(tc, p0);
       }
       return;
    }
}
