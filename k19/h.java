package k19.h;
import java.lang.Runnable;
import k19.k;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import k19.p;
import android.view.View;
import com.yxcorp.gifshow.ad.util.i$c;
import com.yxcorp.gifshow.ad.util.i;

public final class h implements Runnable	// class@002a81
{
    public final k b;

    public void h(k p0){
       this.b = p0;
    }
    public final void run(){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, k.class, "16")) {
       }else if(tb.Z8()){
          Object[] objArray = new Object[0];
          j0.a("AdDetailECommercePresenter", "showECommerceInfo info is already inside screen", objArray);
       }else {
          i.b(tb.x, 200, tb.w, 300, tb.E, new p(tb));
       }
       return;
    }
}
