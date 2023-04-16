package g19.h;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.side.MilanoItemProfileSidePresenter;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class h implements g	// class@0023bb
{
    public final MilanoItemProfileSidePresenter b;

    public void h(MilanoItemProfileSidePresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, MilanoItemProfileSidePresenter.class, "9")) {
       }else {
          tb.V.z0(p0);
       }
       return;
    }
}
