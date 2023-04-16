package eja.p1;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowSummaryPresenter;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class p1 implements g	// class@0026ea
{
    public final HomeFollowSummaryPresenter b;

    public void p1(HomeFollowSummaryPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p1.class, "1")) {
       }else {
          this.b.W8();
       }
       return;
    }
}
