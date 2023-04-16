package com.yxcorp.gifshow.widget.RecyclerViewCirclePagerIndicator$a;
import com.kwai.library.widget.pageindicator.PagerIndicator$d;
import com.yxcorp.gifshow.widget.RecyclerViewCirclePagerIndicator;
import java.lang.Object;
import com.kwai.library.widget.pageindicator.PagerIndicator$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView$b;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Integer;
import com.yxcorp.gifshow.widget.RecyclerViewCirclePagerIndicator$a$a;
import java.lang.Boolean;

public class RecyclerViewCirclePagerIndicator$a implements PagerIndicator$d	// class@0018b6
{
    public final RecyclerViewCirclePagerIndicator a;

    public void RecyclerViewCirclePagerIndicator$a(RecyclerViewCirclePagerIndicator p0){
       this.a = p0;
       super();
    }
    public void a(PagerIndicator$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecyclerViewCirclePagerIndicator$a.class, "4")) {
          return;
       }
       ViewPagerRecyclerView$b uob = this.a.G.get(p0);
       if (uob != null) {
          this.a.F.y(uob);
       }
       return;
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, RecyclerViewCirclePagerIndicator$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.F.getAdapter().getItemCount();
    }
    public void c(int p0){
       RecyclerViewCirclePagerIndicator$a uoa = RecyclerViewCirclePagerIndicator$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       this.a.F.z(p0);
       return;
    }
    public void d(PagerIndicator$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecyclerViewCirclePagerIndicator$a.class, "5")) {
          return;
       }
       RecyclerViewCirclePagerIndicator$a$a uoa$a = new RecyclerViewCirclePagerIndicator$a$a(this, p0);
       this.a.G.put(p0, uoa$a);
       this.a.F.x(uoa$a);
       return;
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, RecyclerViewCirclePagerIndicator$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.F.getCurrentPosition();
    }
    public boolean isValid(){
       RecyclerViewCirclePagerIndicator obj = PatchProxy.apply(null, this, RecyclerViewCirclePagerIndicator$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.F;
       boolean b = (obj != null && obj.getAdapter() != null)? true: false;
       return b;
    }
}
