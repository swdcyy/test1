package com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder$onItemSelect$$inlined$also$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder;
import q79.d;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r79.a;
import w69.k;
import com.yxcorp.gifshow.album.preview.b$a;
import com.yxcorp.gifshow.album.preview.b;
import java.lang.Integer;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder$onItemSelect$$inlined$also$lambda$1$1;
import java.util.Objects;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetItemViewBinder;
import android.widget.ImageView;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$c;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.widget.AlbumSelectRecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.a;
import android.content.Context;
import o79.i;
import c79.c;
import java.io.File;
import o79.o;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewPropertyAnimator;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectAlbumAssetItemViewBinder$startAnim$2;
import android.animation.Animator$AnimatorListener;

public final class MultiSelectAlbumAssetItemViewBinder$onItemSelect$$inlined$also$lambda$1 extends Lambda implements a	// class@001aee
{
    public final AlbumFragment $albumFragment;
    public final QMedia $item$inlined;
    public final int $position$inlined;
    public final d $viewModel$inlined;
    public final MultiSelectAlbumAssetItemViewBinder this$0;

    public void MultiSelectAlbumAssetItemViewBinder$onItemSelect$$inlined$also$lambda$1(AlbumFragment p0,int p1,QMedia p2,MultiSelectAlbumAssetItemViewBinder p3,d p4){
       this.$albumFragment = p0;
       this.$position$inlined = p1;
       this.$item$inlined = p2;
       this.this$0 = p3;
       this.$viewModel$inlined = p4;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       View view1;
       Object[] objArray1;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, obj, MultiSelectAlbumAssetItemViewBinder$onItemSelect$$inlined$also$lambda$1.class, "1")) {
          return;
       }
       AlbumFragment.Uh(obj.$albumFragment, true, 0, obj.$item$inlined.position, false, false, 18, null);
       MultiSelectAlbumAssetItemViewBinder$onItemSelect$$inlined$also$lambda$1 this$0 = obj.this$0;
       if (this$0.j == null) {
          this$0.j = Integer.valueOf(b.b(obj.$viewModel$inlined.s0().m().h(), 0x3f800000).c);
       }
       this$0 = obj.this$0;
       MultiSelectAlbumAssetItemViewBinder$onItemSelect$$inlined$also$lambda$1 $albumFragme = obj.$albumFragment;
       MultiSelectAlbumAssetItemViewBinder$onItemSelect$$inlined$also$lambda$1 $position$in = obj.$position$inlined;
       MultiSelectAlbumAssetItemViewBinder$onItemSelect$$inlined$also$lambda$1 $item$inline = obj.$item$inlined;
       MultiSelectAlbumAssetItemViewBinder$onItemSelect$$inlined$also$lambda$1$1 oonItemSelec = new MultiSelectAlbumAssetItemViewBinder$onItemSelect$$inlined$also$lambda$1$1(obj);
       Objects.requireNonNull(this$0);
       if (!PatchProxy.isSupport(MultiSelectAlbumAssetItemViewBinder.class) || !PatchProxy.applyVoidFourRefs($albumFragme, Integer.valueOf($position$in), $item$inline, oonItemSelec, this$0, MultiSelectAlbumAssetItemViewBinder.class, "6")) {
          int i = 2;
          int[] ointArray = new int[i];
          View view = $albumFragme.getView();
          if (view != null) {
             view.getLocationInWindow(ointArray);
          }
          CompatImageView uCompatImage = this$0.p();
          if (uCompatImage != null) {
             uCompatImage.getLocationInWindow(this$0.m);
          }
          MultiSelectAlbumAssetItemViewBinder m = this$0.m;
          m[0] = m[0] - ointArray[0];
          m[1] = m[1] - ointArray[1];
          uCompatImage = this$0.p();
          int width = (uCompatImage != null)? uCompatImage.getWidth(): AlbumSelectedContainer.V0.b();
          this$0.o = width;
          AlbumSelectedContainer uAlbumSelect = $albumFragme.wh();
          if (uAlbumSelect != null) {
             AlbumSelectedContainer uAlbumSelect1 = AlbumSelectedContainer.class;
             if (PatchProxy.isSupport(uAlbumSelect1)) {
                view1 = PatchProxy.applyOneRefs(Integer.valueOf($position$in), uAlbumSelect, uAlbumSelect1, "77");
                if (view1 != PatchProxyResult.class) {
                }else {
                label_00c7 :
                   RecyclerView$LayoutManager layoutManage = uAlbumSelect.D().getLayoutManager();
                   view = (layoutManage != null)? layoutManage.findViewByPosition($position$in): objArray;
                   if (!view instanceof ViewGroup) {
                      objArray1 = objArray;
                   }
                   view = (objArray1 != null)? objArray1.getChildAt(0): objArray;
                   if (!view instanceof ViewGroup) {
                      objArray1 = objArray;
                   }
                   if (objArray1 != null) {
                      view1 = objArray1.getChildAt(0);
                   }else {
                      view1 = objArray;
                   }
                }
             }else {
                goto label_00c7 ;
             }
             if (view1 != null) {
                view1.getLocationInWindow(this$0.n);
             }
          }
          m = this$0.n;
          m[0] = m[0] - ointArray[0];
          m[1] = m[1] - ointArray[1];
          FragmentActivity activity = $albumFragme.getActivity();
          if (activity == null) {
             a.L();
          }
          a.h(activity, "albumFragment.activity!!");
          CompatImageView uCompatImage1 = new CompatImageView(activity);
          float f = 3.00f;
          uCompatImage1.setCornerRadius((float)i.d(f));
          QMedia path = $item$inline.path;
          a.h(path, "item.path");
          MultiSelectAlbumAssetItemViewBinder j = this$0.j;
          if (j == null) {
             a.L();
          }
          int i1 = j.intValue();
          j = this$0.j;
          if (j == null) {
             a.L();
          }
          o.a(uCompatImage1, path, 0, i1, j.intValue(), $item$inline.mRatio, $item$inline.mThumbnailFile, uCompatImage1.getXmlParams());
          uCompatImage1.setX((float)this$0.m[0]);
          uCompatImage1.setY((float)this$0.m[1]);
          uCompatImage1.setLayoutParams(new ViewGroup$MarginLayoutParams(this$0.o, this$0.o));
          view1 = $albumFragme.getView();
          if (view1 instanceof ViewGroup) {
             objArray = view1;
          }
          if (objArray != null) {
             objArray.addView(uCompatImage1, objArray.getChildCount());
          }
          AlbumSelectedContainer$c v0 = AlbumSelectedContainer.V0;
          m = this$0.o;
          float f1 = ((float)v0.b() - (float)i.d(f)) / (float)m;
          width = (m - v0.b()) / i;
          MultiSelectAlbumAssetItemViewBinder n = this$0.n;
          n[0] = n[0] - width;
          n[1] = n[1] - width;
          uCompatImage1.animate().setDuration(this$0.k).translationX((float)this$0.n[0]).translationY((float)this$0.n[1]).scaleX(f1).scaleY(f1).setListener(new MultiSelectAlbumAssetItemViewBinder$startAnim$2(this$0, oonItemSelec, $albumFragme, uCompatImage1)).start();
       }
       PatchProxy.onMethodExit(MultiSelectAlbumAssetItemViewBinder$onItemSelect$$inlined$also$lambda$1.class, "1");
       return;
    }
}
