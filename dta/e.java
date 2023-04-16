package dta.e;
import zq6.u;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import jr6.b;

public final class e implements u	// class@00252e
{
    public final BottomActionBarPresenter a;

    public void e(BottomActionBarPresenter p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       boolean b = p0.booleanValue();
       e uoe = e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoe, "1")) {
          if (b) {
             BottomActionBarPresenter.P8(this.a).y();
          }else {
             BottomActionBarPresenter.P8(this.a).C();
          }
       }
       return;
    }
}
