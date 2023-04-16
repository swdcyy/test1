package dlc.j;
import erd.g;
import dlc.l;
import java.lang.Object;
import xkc.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import com.yxcorp.gifshow.entity.TrendingInfo;
import qvb.a;
import java.util.List;
import com.kwai.component.photo.detail.slide.widget.TrendingTextSwitcher;
import java.lang.Runnable;
import android.os.Handler;

public final class j implements g	// class@002253
{
    public final l b;

    public void j(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       a a = p0.a;
       p0 = p0.b;
       if (PatchProxy.applyVoidTwoRefs(a, p0, tb, l.class, "4")) {
       }else if(tb.v.get() != null && (tb.v.get().mTrendingType == null || (!(tb.v.get().mTrendingType).equals(a.mTrendingType) || (tb.v.get() == null && (a.mTrendingType == null || (p0 == null || p0.isEmpty())))))){
          tb.s = p0;
          p0 = p0.getItems();
          tb.A = p0;
          tb.B = 0;
          tb.q.setTexts(p0);
          tb.V8();
          tb.C.removeCallbacks(tb.D);
          tb.C.postDelayed(tb.D, 5000);
          tb.P8();
       }
       return;
    }
}
