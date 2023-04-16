package f2b.n;
import erd.g;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.d;
import java.lang.Object;
import com.yxcorp.gifshow.local.sub.entrance.sizer.model.NearbySubSizerResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.local.sub.entrance.sizer.sizermanager.LocalSizerDataProvider;

public final class n implements g	// class@00287c
{
    public final d b;

    public void n(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "3")) {
       }else {
          tb.r.notifyData(p0);
       }
       return;
    }
}
