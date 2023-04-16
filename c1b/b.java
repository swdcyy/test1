package c1b.b;
import y0b.m;
import java.lang.Object;
import y0b.a;
import y0b.l;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.yxcorp.gifshow.listcomponent.module.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ml8.c;

public class b implements m	// class@000497
{

    public void b(){
       super();
    }
    public int a(a p0){
       return l.b(this, p0);
    }
    public f b(ViewGroup p0,a p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new f(p1.d.l(), new PresenterV2());
    }
    public String c(){
       return l.a(this);
    }
}
