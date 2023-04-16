package com.yxcorp.gifshow.magic.ui.magicemoji.swap.album.MagicMultiSelectAlbumAssetItemViewBinder$b;
import p79.f;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.album.MagicMultiSelectAlbumAssetItemViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.widget.SizeAdjustableTextView;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetItemViewBinder;
import java.lang.CharSequence;
import android.widget.TextView;

public final class MagicMultiSelectAlbumAssetItemViewBinder$b implements f	// class@001c31
{
    public final MagicMultiSelectAlbumAssetItemViewBinder a;

    public void MagicMultiSelectAlbumAssetItemViewBinder$b(MagicMultiSelectAlbumAssetItemViewBinder p0){
       this.a = p0;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, MagicMultiSelectAlbumAssetItemViewBinder$b.class, "1")) {
          return;
       }
       SizeAdjustableTextView sizeAdjustab = this.a.n();
       if (sizeAdjustab != null) {
          sizeAdjustab.setText("");
       }
       return;
    }
}
