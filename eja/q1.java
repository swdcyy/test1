package eja.q1;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowSummaryPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class q1 implements g	// class@0026ed
{
    public final HomeFollowSummaryPresenter b;

    public void q1(HomeFollowSummaryPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q1.class, "1")) {
       }else {
          this.b.V8();
       }
       return;
    }
}
