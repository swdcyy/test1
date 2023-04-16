package com.yxcorp.gifshow.widget.RecyclerViewCirclePagerIndicator$a$a;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView$b;
import com.yxcorp.gifshow.widget.RecyclerViewCirclePagerIndicator$a;
import com.kwai.library.widget.pageindicator.PagerIndicator$c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class RecyclerViewCirclePagerIndicator$a$a implements ViewPagerRecyclerView$b	// class@0018b5
{
    public final PagerIndicator$c a;
    public final RecyclerViewCirclePagerIndicator$a b;

    public void RecyclerViewCirclePagerIndicator$a$a(RecyclerViewCirclePagerIndicator$a p0,PagerIndicator$c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0){
       RecyclerViewCirclePagerIndicator$a$a uoa$a = RecyclerViewCirclePagerIndicator$a$a.class;
       if (PatchProxy.isSupport(uoa$a) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa$a, "1")) {
          return;
       }
       this.a.onPageSelected(p0);
       return;
    }
}
