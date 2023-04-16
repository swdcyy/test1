package dta.d;
import zq6.u;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter;
import java.lang.Object;
import sn5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import jr6.b;

public final class d implements u	// class@00252c
{
    public final BottomActionBarPresenter a;

    public void d(BottomActionBarPresenter p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          a.p(p0, "bottomShowState");
          if (p0.a != null) {
             BottomActionBarPresenter.P8(this.a).a(p0.b);
          }else {
             BottomActionBarPresenter.P8(this.a).e(p0.b);
          }
       }
       return;
    }
}
