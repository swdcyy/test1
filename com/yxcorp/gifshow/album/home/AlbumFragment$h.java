package com.yxcorp.gifshow.album.home.AlbumFragment$h;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import java.lang.Object;
import jlb.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import com.kwai.moved.ks_page.fragment.KsAlbumTabHostFragment;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumFragmentViewBinder;
import androidx.viewpager.widget.ViewPager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.CharSequence;
import android.view.ViewGroup;
import w69.k0;
import r79.a;

public final class AlbumFragment$h implements Observer	// class@0019f3
{
    public final AlbumFragment b;

    public void AlbumFragment$h(AlbumFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AlbumFragment$h.class, "1")) {
       }else if(p0 != null){
          AlbumFragment$h tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(AlbumFragment.class) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.TRUE, tb, AlbumFragment.class, "73")) {
             tb.Th();
             Log.b("AlbumFragment", "onAlbumSelected\(\) called with: album = ["+p0+']');
             PagerSlidingTabStrip g = tb.jh().g;
             ViewPager viewPager = tb.Gh().p();
             int currentItem = (viewPager != null)? viewPager.getCurrentItem(): 0;
             View childAt = g.getChildAt(currentItem);
             if (childAt instanceof TextView) {
                childAt.setText(p0.a());
             }else if(!childAt instanceof ViewGroup){
                childAt = null;
             }
             if (childAt != null) {
                TextView textView = childAt.findViewById(R.id.tab_text);
                if (textView != null) {
                   textView.setText(p0.a());
                }
             }
             k0 ok0 = tb.z.f();
             if (ok0 != null) {
                ok0.e(p0);
             }
             tb.Gc();
          }
       }
       PatchProxy.onMethodExit(AlbumFragment$h.class, "1");
       return;
    }
}
