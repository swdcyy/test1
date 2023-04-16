package cac.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a implements Runnable	// class@000569
{
    public final int b;
    public final CarouselLayoutManager c;

    public void a(CarouselLayoutManager p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.c.a0(this.b);
       return;
    }
}
