package com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder$onInterceptUserEventAlbum$1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder;
import q79.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedItemViewBinder;
import java.util.List;
import r79.c;
import com.yxcorp.gifshow.models.EmptyQMedia;
import nsd.u;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.album.vm.viewdata.DataType;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder$onInterceptUserEventAlbum$1$$special$$inlined$let$lambda$1;
import java.util.Objects;
import android.view.animation.AlphaAnimation;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder$startAnim$1;
import msd.a;
import android.view.animation.Animation$AnimationListener;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

public final class MultiSelectSelectedItemViewBinder$onInterceptUserEventAlbum$1 implements View$OnClickListener	// class@001af6
{
    public final MultiSelectSelectedItemViewBinder b;
    public final d c;

    public void MultiSelectSelectedItemViewBinder$onInterceptUserEventAlbum$1(MultiSelectSelectedItemViewBinder p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiSelectSelectedItemViewBinder$onInterceptUserEventAlbum$1.class, "1")) {
          return;
       }
       a.q(p0, "v");
       RecyclerView$ViewHolder viewHolder = this.b.p();
       int i = 0;
       int adapterPosit = (viewHolder != null)? viewHolder.getAdapterPosition(): 0;
       if (adapterPosit == -1) {
          return;
       }else {
          MultiSelectSelectedItemViewBinder$onInterceptUserEventAlbum$1 tc = this.c;
          if (tc != null) {
             List list = tc.m();
             if (list != null) {
                c uoc = list.get(adapterPosit);
                if (uoc != null) {
                   EmptyQMedia uEmptyQMedia = new EmptyQMedia(0, 1, null);
                   uEmptyQMedia.path = uoc.getPath();
                   uEmptyQMedia.position = uoc.getPosition();
                   if (uoc.getDataType() != DataType.IMAGE) {
                      i = (uoc.getDataType() == DataType.VIDEO)? 1: -1;
                   }
                label_005e :
                   uEmptyQMedia.type = i;
                   MultiSelectSelectedItemViewBinder$onInterceptUserEventAlbum$1 tb = this.b;
                   MultiSelectSelectedItemViewBinder$onInterceptUserEventAlbum$1$$special$$inlined$let$lambda$1 oonIntercept = new MultiSelectSelectedItemViewBinder$onInterceptUserEventAlbum$1$$special$$inlined$let$lambda$1(uEmptyQMedia, this, adapterPosit);
                   Objects.requireNonNull(tb);
                   if (!PatchProxy.applyVoidOneRefs(oonIntercept, tb, MultiSelectSelectedItemViewBinder.class, "3")) {
                      AlphaAnimation uAlphaAnimat = new AlphaAnimation(0x3f800000, 0);
                      uAlphaAnimat.setDuration(tb.i);
                      uAlphaAnimat.setAnimationListener(new MultiSelectSelectedItemViewBinder$startAnim$1(tb, oonIntercept));
                      CompatImageView uCompatImage = tb.n();
                      if (uCompatImage != null) {
                         uCompatImage.startAnimation(uAlphaAnimat);
                      }
                      View view = tb.k();
                      if (view != null) {
                         view.startAnimation(uAlphaAnimat);
                      }
                      TextView textView = tb.l();
                      if (textView != null) {
                         textView.startAnimation(uAlphaAnimat);
                      }
                   }
                }
             }
          }
          return;
       }
    }
}
