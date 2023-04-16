package com.yxcorp.gifshow.magic.ui.magicemoji.swap.album.MagicMultiSelectAlbumAssetItemViewBinder$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.album.MagicMultiSelectAlbumAssetItemViewBinder;
import q79.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder;

public final class MagicMultiSelectAlbumAssetItemViewBinder$c implements View$OnClickListener	// class@001c32
{
    public final MagicMultiSelectAlbumAssetItemViewBinder b;
    public final d c;

    public void MagicMultiSelectAlbumAssetItemViewBinder$c(MagicMultiSelectAlbumAssetItemViewBinder p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicMultiSelectAlbumAssetItemViewBinder$c.class, "1")) {
          return;
       }
       if (this.c != null) {
          this.b.w(true);
          this.b.x(this.c, p0);
       }
       return;
    }
}
