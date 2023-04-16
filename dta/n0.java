package dta.n0;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter;
import wq6.f;
import pr6.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import rsa.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rsa.h;
import tsa.a;
import tsa.h;
import com.google.android.material.tabs.BottomActionBarTabLayout$a;
import dta.n0$a;

public final class n0 extends BottomActionBarPresenter	// class@002542
{

    public void n0(f p0,d p1){
       a.p(p0, "containerController");
       a.p(p1, "fragmentWrapper");
       super(p0, p1);
    }
    public a S8(){
       Object obj = PatchProxy.apply(null, this, n0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h(this.W8());
    }
    public a V8(){
       Object obj = PatchProxy.apply(null, this, n0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h(this.X8());
    }
    public BottomActionBarTabLayout$a Y8(){
       Object obj = PatchProxy.apply(null, this, n0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new n0$a(this);
    }
}
