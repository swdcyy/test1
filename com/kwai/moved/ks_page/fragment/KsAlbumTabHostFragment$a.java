package com.kwai.moved.ks_page.fragment.KsAlbumTabHostFragment$a;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.moved.ks_page.fragment.KsAlbumTabHostFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.lang.Float;

public class KsAlbumTabHostFragment$a implements ViewPager$i	// class@000f6e
{
    public boolean b;
    public boolean c;
    public final KsAlbumTabHostFragment d;

    public void KsAlbumTabHostFragment$a(KsAlbumTabHostFragment p0){
       this.d = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       KsAlbumTabHostFragment$a uoa = KsAlbumTabHostFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       Objects.requireNonNull(this.d);
       KsAlbumTabHostFragment q = this.d.q;
       if (q != null) {
          q.onPageScrollStateChanged(p0);
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(KsAlbumTabHostFragment$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, KsAlbumTabHostFragment$a.class, "1")) {
          return;
       }
       KsAlbumTabHostFragment q = this.d.q;
       if (q != null) {
          q.onPageScrolled(p0, p1, p2);
       }
       this.b = true;
       return;
    }
    public void onPageSelected(int p0){
       KsAlbumTabHostFragment$a uoa = KsAlbumTabHostFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.c = true;
       if (this.b != null) {
          Objects.requireNonNull(this.d);
       }
       this.d.lh(p0);
       KsAlbumTabHostFragment q = this.d.q;
       if (q != null) {
          q.onPageSelected(p0);
       }
       return;
    }
}
