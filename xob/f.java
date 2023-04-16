package xob.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.viewbinder.BaseViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;

public class f extends PresenterV2	// class@0048e1
{
    public BaseViewBinder p;
    public f q;

    public void f(){
       super();
    }
    public void f(BaseViewBinder p0){
       super();
       this.p = p0;
    }
    public void E8(){
       PatchProxy.applyVoid(null, this, f.class, "1");
    }
    public final void P8(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       a.p(p0, "presenter");
       this.U7(p0);
       p0.q = this;
       return;
    }
    public final f R8(){
       return this.q;
    }
    public final BaseViewBinder S8(){
       return this.p;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, f.class, "2");
    }
}
