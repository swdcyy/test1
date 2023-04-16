package dta.d1;
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
import rsa.i;
import tsa.a;
import tsa.i;
import com.google.android.material.tabs.BottomActionBarTabLayout$a;
import dta.d1$a;

public final class d1 extends BottomActionBarPresenter	// class@00252b
{

    public void d1(f p0,d p1){
       a.p(p0, "containerController");
       a.p(p1, "fragmentWrapper");
       super(p0, p1);
    }
    public a S8(){
       Object obj = PatchProxy.apply(null, this, d1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i(this.W8());
    }
    public a V8(){
       Object obj = PatchProxy.apply(null, this, d1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i();
    }
    public BottomActionBarTabLayout$a Y8(){
       Object obj = PatchProxy.apply(null, this, d1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d1$a();
    }
}
