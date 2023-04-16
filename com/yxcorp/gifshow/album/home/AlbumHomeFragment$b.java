package com.yxcorp.gifshow.album.home.AlbumHomeFragment$b;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kwai.moved.ks_page.fragment.KsAlbumTabHostFragment;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import com.yxcorp.gifshow.album.home.ScrollableHeaderStub;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Objects;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetFragmentViewBinder;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.slider.SliderPositionerLayout;

public final class AlbumHomeFragment$b implements View$OnLayoutChangeListener	// class@0019fb
{
    public final AlbumHomeFragment b;

    public void AlbumHomeFragment$b(AlbumHomeFragment p0){
       this.b = p0;
       super();
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       KsAlbumTabHostFragment k;
       int i;
       if (PatchProxy.isSupport(AlbumHomeFragment$b.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, AlbumHomeFragment$b.class, "1")) {
             return;
          }
       }
       AlbumHomeFragment$b tb = this.b;
       String str = "mViewPager";
       if (tb.C == null) {
          if (tb.getActivity() != null) {
             k = this.b.k;
             a.h(k, str);
             i = k.getHeight() + this.b.rh().k().getHeight();
             this.b.yh(i);
             Log.b("AlbumHomeFragment", "viewPagerHeight="+i);
          }
          i.C = true;
          return;
       }else {
          k = tb.k;
          a.h(k, str);
          if (k.getHeight() && (!p8 || (p4 && this.b.getActivity() != null))) {
             if (p8 == p4) {
                return;
             }else {
                p4 = p4 - p8;
                k = this.b.k;
                a.h(k, str);
                this.b.yh((k.getHeight() + p4));
                tb = this.b;
                Objects.requireNonNull(tb);
                if (!PatchProxy.isSupport(AlbumHomeFragment.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p4), tb, AlbumHomeFragment.class, "31")) {
                   List list = tb.ch();
                   if (list != null) {
                      Iterator iterator = list.iterator();
                      while (iterator.hasNext()) {
                         Fragment uFragment = iterator.next();
                         Integer integer = null;
                         if (!uFragment instanceof AlbumAssetFragment) {
                            uFragment = integer;
                         }
                         if (uFragment != null && (PatchProxy.isSupport(AlbumAssetFragment.class) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p4), uFragment, AlbumAssetFragment.class, "44") && uFragment.K != null))) {
                            RecyclerView recyclerView = uFragment.qh().q();
                            if (recyclerView != null) {
                               integer = Integer.valueOf(recyclerView.getHeight());
                            }
                            if (integer == null) {
                               a.L();
                            }
                            recyclerView = integer.intValue() + p4;
                            AlbumAssetFragment j = uFragment.J;
                            if (j != null) {
                               j.setHeight(recyclerView);
                            }
                         }
                      }
                   }
                }
             }
          }
          return;
       }
    }
}
