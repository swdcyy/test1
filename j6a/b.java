package j6a.b;
import q96.d;
import com.yxcorp.gifshow.detail.slideplay.nasa.location.LocationPermissionCardPresenter;
import java.lang.Object;
import com.kwai.framework.location.model.LocationCityInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import e17.i;
import q96.c;

public class b implements d	// class@002914
{
    public final LocationPermissionCardPresenter a;

    public void b(LocationPermissionCardPresenter p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,LocationCityInfo p1){
       if (PatchProxy.isSupport2(b.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), p1, this, b.class, "1")) {
          return;
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f100edf);
       this.a.R8(true);
       p0.C = null;
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
    public void onError(int p0,String p1){
       p0.C = null;
    }
    public void onFinish(){
       c.b(this);
    }
    public void onStart(){
       c.c(this);
    }
}
