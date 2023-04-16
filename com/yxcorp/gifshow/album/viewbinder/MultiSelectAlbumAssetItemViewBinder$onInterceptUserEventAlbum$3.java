package com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$3;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder;
import q79.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumItemViewBinder;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetItemViewBinder;
import android.widget.ImageView;
import com.yxcorp.gifshow.models.QMedia;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import kotlin.TypeCastException;

public final class MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$3 extends m	// class@001aec
{
    public final MultiSelectAlbumAssetItemViewBinder c;
    public final d d;

    public void MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$3(MultiSelectAlbumAssetItemViewBinder p0,d p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiSelectAlbumAssetItemViewBinder$onInterceptUserEventAlbum$3.class, "1")) {
          return;
       }
       p0 = this.c.k();
       if (p0 == null || p0.getVisibility()) {
          CompatImageView uCompatImage = this.c.p();
          Fragment uFragment = null;
          Fragment tag = (uCompatImage != null)? uCompatImage.getTag(R.id.ksa_media_item): uFragment;
          if (!tag instanceof QMedia) {
             tag = uFragment;
          }
          if (tag != null && this.d != null) {
             RecyclerView$ViewHolder viewHolder = this.c.l();
             int adapterPosit = (viewHolder != null)? viewHolder.getAdapterPosition(): 0;
             Fragment uFragment1 = this.c.j();
             if (uFragment1 != null) {
                adapterPosit = uFragment1.dh(adapterPosit);
                uFragment1 = this.c.j().getParentFragment();
                if (uFragment1 != null) {
                   uFragment = uFragment1.getParentFragment();
                }
                if (uFragment != null) {
                   AlbumSelectedContainer uAlbumSelect = uFragment.wh();
                   if (uAlbumSelect != null) {
                      uAlbumSelect.q();
                   }
                   uFragment = this.c.j();
                   if (uFragment != null) {
                      uFragment.vb(adapterPosit);
                   }else {
                      throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.home.AlbumAssetFragment");
                   }
                }else {
                   throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.home.AlbumFragment");
                }
             }else {
                throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.home.AlbumAssetFragment");
             }
          }
       }
    label_0097 :
       return;
    }
}
