package b09.c;
import hka.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.tachikoma.AdPlayEndTKPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class c implements a	// class@00034b
{
    public final AdPlayEndTKPresenter b;

    public void c(AdPlayEndTKPresenter p0){
       this.b = p0;
       super();
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.b.X8()) {
          return false;
       }
       this.b.V8(4);
       return true;
    }
}
