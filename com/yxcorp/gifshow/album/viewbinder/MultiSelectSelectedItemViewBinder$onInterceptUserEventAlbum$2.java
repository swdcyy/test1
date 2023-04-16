package com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder$onInterceptUserEventAlbum$2;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder;
import q79.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedItemViewBinder;
import java.util.List;
import r79.c;
import com.yxcorp.gifshow.models.EmptyQMedia;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import kotlin.TypeCastException;

public final class MultiSelectSelectedItemViewBinder$onInterceptUserEventAlbum$2 extends m	// class@001af7
{
    public final MultiSelectSelectedItemViewBinder c;
    public final d d;

    public void MultiSelectSelectedItemViewBinder$onInterceptUserEventAlbum$2(MultiSelectSelectedItemViewBinder p0,d p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       AlbumSelectedContainer uAlbumSelect;
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiSelectSelectedItemViewBinder$onInterceptUserEventAlbum$2.class, "1")) {
          return;
       }
       a.q(p0, "v");
       RecyclerView$ViewHolder viewHolder = this.c.p();
       int adapterPosit = (viewHolder != null)? viewHolder.getAdapterPosition(): 0;
       if (adapterPosit == -1) {
          return;
       }else {
          MultiSelectSelectedItemViewBinder$onInterceptUserEventAlbum$2 td = this.d;
          if (td != null) {
             List list = td.m();
             if (list != null) {
                c uoc = list.get(adapterPosit);
             label_0034 :
                if (uoc instanceof EmptyQMedia) {
                   return;
                }else {
                   Fragment uFragment = this.c.j();
                   if (uFragment != null) {
                      uAlbumSelect = uFragment.wh();
                      if (uAlbumSelect != null) {
                         uAlbumSelect.q();
                      }
                      uFragment = this.c.j();
                      if (uFragment != null) {
                         uAlbumSelect = uFragment.wh();
                         if (uAlbumSelect != null) {
                            uAlbumSelect.c(adapterPosit);
                         }
                         return;
                      }else {
                         throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.home.AlbumFragment");
                      }
                   }else {
                      throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.home.AlbumFragment");
                   }
                }
             }
          }
          uAlbumSelect = 0;
          goto label_0034 ;
       }
    }
}
