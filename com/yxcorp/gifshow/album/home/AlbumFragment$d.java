package com.yxcorp.gifshow.album.home.AlbumFragment$d;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment;
import java.util.List;
import com.kwai.moved.ks_page.fragment.KsAlbumTabHostFragment;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import androidx.fragment.app.c;
import android.widget.ImageView;
import com.yxcorp.gifshow.album.IAlbumMainFragment$d;

public final class AlbumFragment$d implements ViewPager$i	// class@0019ef
{
    public boolean b;
    public int c;
    public final AlbumFragment d;

    public void AlbumFragment$d(AlbumFragment p0){
       this.d = p0;
       super();
       this.b = true;
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(AlbumFragment$d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, AlbumFragment$d.class, "1")) {
          return;
       }
       if (this.b != null) {
          this.onPageSelected(p0);
          this.b = false;
       }
       return;
    }
    public void onPageSelected(int p0){
       AlbumAssetFragment e;
       AlbumFragment$d uod = AlbumFragment$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "2")) {
          return;
       }
       Log.g("AlbumFragment", "onPageSelected "+p0);
       int i = 1;
       if (!p0) {
          this.c = this.c + i;
       }
       int i1 = 0;
       if (this.c == i) {
          AlbumHomeFragment uAlbumHomeFr = this.d.zh();
          c uoc = null;
          List list = (uAlbumHomeFr != null)? uAlbumHomeFr.ch(): uoc;
          if (list != null && list.size() > 0) {
             Fragment uFragment = list.get(i1);
             if (uFragment instanceof AlbumAssetFragment && uFragment.nh() == 2) {
                e = uFragment.E;
             label_0066 :
                if (e != null) {
                   AlbumFragment$d td = this.d;
                   if (td.f1 != null) {
                      if (uAlbumHomeFr != null) {
                         uoc = uAlbumHomeFr.getFragmentManager();
                      }
                      td.Wh(uoc);
                   }
                }
             }
          }
          e = null;
          goto label_0066 ;
       }
    label_0077 :
       AlbumFragment$d td1 = this.d;
       AlbumFragment s = td1.s;
       if (s != null) {
          if (!td1.t() instanceof AlbumHomeFragment || this.d.W == null) {
             i = false;
          }
          s.setSelected(i);
       }
       uod = this.d;
       AlbumFragment k = uod.K;
       if (k != null) {
          AlbumFragment m = uod.M;
          if (m != -1) {
             k.a(m);
          }
          k.onPageSelected(p0);
          this.d.M = p0;
       }
       return;
    }
}
