package com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder$MultiScrollListener;
import androidx.recyclerview.widget.RecyclerView$r;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public final class MultiSelectAlbumAssetItemViewBinder$MultiScrollListener extends RecyclerView$r	// class@001ae9
{
    public final a a;

    public void MultiSelectAlbumAssetItemViewBinder$MultiScrollListener(a p0){
       a.q(p0, "callback");
       super();
       this.a = p0;
    }
    public void a(RecyclerView p0,int p1){
       MultiSelectAlbumAssetItemViewBinder$MultiScrollListener multiScrollL = MultiSelectAlbumAssetItemViewBinder$MultiScrollListener.class;
       if (PatchProxy.isSupport(multiScrollL) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, multiScrollL, "1")) {
          return;
       }
       a.q(p0, "recyclerView");
       if (!p1) {
          this.a.invoke();
          p0.removeOnScrollListener(this);
       }
       return;
    }
}
