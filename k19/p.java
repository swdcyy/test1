package k19.p;
import com.yxcorp.gifshow.ad.util.i$c;
import k19.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import k19.o;
import erd.g;
import k19.b;
import com.kwai.library.widget.viewpager.RecyclerViewPager;
import com.yxcorp.gifshow.ad.detail.widget.RecyclerViewPagerIndicator;
import com.kwai.library.widget.viewpager.RecyclerViewPager$b;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo;
import tw.j;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.StringBuilder;
import com.kwai.library.widget.viewpager.RecyclerViewPager$c;
import android.os.Handler;
import g59.g0;

public class p implements i$c	// class@002a8c
{
    public final k a;

    public void p(k p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, p.class, str)) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       j0.a("AdDetailECommercePresenter", "onHideEnd", objArray1);
       p ta = this.a;
       k c = ta.C;
       k ok = 1;
       if (c <= ok) {
          ok = null;
       }
       if (!ok) {
          o.z().e(140, this.a.p.mEntity).d(new o(this)).a();
          return;
       }else if(ta.A == null){
          ta.A = new b(ta.y, ta.z, c);
          ta = this.a;
          ta.A.c(ta.J);
       }
       PhotoAdvertisement$MerchandiseInfo merchandiseI = j.r(this.a.p);
       if (merchandiseI != null) {
          merchandiseI = merchandiseI.mCarouselTime;
          if (merchandiseI - null > 0) {
             this.a.A.g = merchandiseI;
          }
       }
       k a = this.a.A;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(objArray, a, b.class, str)) {
          str = "AdDetailECommerceBannerCycleHelper";
          if (a.a.getAdapter() == null) {
             Object[] objArray2 = new Object[i];
             j0.a(str, "startCycle, adapter is null", objArray2);
          }else {
             int i1 = a.a.getAdapter().getItemCount() / 2;
             i1 = i1 - a.a(i1, a.e);
             Object[] objArray3 = new Object[i];
             j0.a(str, "startCycle currentIndex, realIndex: "+i1, objArray3);
             a.a.x(a.h);
             a.a.z(i1, i);
             a.i.sendEmptyMessageDelayed(i, a.g);
          }
       }
       return;
    }
    public void b(){
       g0.b(this);
    }
    public void c(){
       g0.d(this);
    }
    public void d(){
       g0.a(this);
    }
}
