package tw3.a;
import tw3.b;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ml8.c;

public abstract class a implements b	// class@004049
{

    public void a(){
       super();
    }
    public abstract PresenterV2 b();
    public f c(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(this.d(p0), this.b());
    }
    public abstract View d(ViewGroup p0);
    public abstract int getViewType();
}
