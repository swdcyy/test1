package com.yxcorp.gifshow.ad.detail.widget.RecyclerViewPagerIndicator$a;
import com.kwai.library.widget.pageindicator.PagerIndicator$d;
import com.yxcorp.gifshow.ad.detail.widget.RecyclerViewPagerIndicator;
import java.lang.Object;
import com.kwai.library.widget.pageindicator.PagerIndicator$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.kwai.library.widget.viewpager.RecyclerViewPager$c;
import com.kwai.library.widget.viewpager.RecyclerViewPager;
import java.lang.Integer;
import com.yxcorp.gifshow.ad.detail.widget.RecyclerViewPagerIndicator$a$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class RecyclerViewPagerIndicator$a implements PagerIndicator$d	// class@001735
{
    public final int a;
    public final RecyclerViewPagerIndicator b;

    public void RecyclerViewPagerIndicator$a(RecyclerViewPagerIndicator p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(PagerIndicator$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecyclerViewPagerIndicator$a.class, "3")) {
          return;
       }
       RecyclerViewPagerIndicator$a tb = this.b;
       tb.F.y(tb.G.get(p0));
       return;
    }
    public int b(){
       return this.a;
    }
    public void c(int p0){
       RecyclerViewPagerIndicator$a uoa = RecyclerViewPagerIndicator$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.b.F.z(p0, true);
       return;
    }
    public void d(PagerIndicator$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecyclerViewPagerIndicator$a.class, "4")) {
          return;
       }
       RecyclerViewPagerIndicator$a$a uoa$a = new RecyclerViewPagerIndicator$a$a(this, p0);
       this.b.G.put(p0, uoa$a);
       this.b.F.x(uoa$a);
       return;
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, RecyclerViewPagerIndicator$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.F.getCurrentItem();
    }
    public boolean isValid(){
       boolean b = (this.b.F != null)? true: false;
       return b;
    }
}
