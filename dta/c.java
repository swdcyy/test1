package dta.c;
import zq6.u;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import jr6.b;

public final class c implements u	// class@002528
{
    public final BottomActionBarPresenter a;

    public void c(BottomActionBarPresenter p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       float f = p0.floatValue();
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), this, uoc, "1")) {
          BottomActionBarPresenter.P8(this.a).q(f);
       }
       return;
    }
}
