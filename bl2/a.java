package bl2.a;
import os5.q;
import java.lang.Object;
import brd.t;
import j26.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import bl2.j;

public class a implements q	// class@000409
{

    public void a(){
       super();
    }
    public boolean isAvailable(){
       return true;
    }
    public PresenterV2 kQ(t p0,c p1,boolean p2){
       if (PatchProxy.isSupport2(a.class, "1")) {
          Object obj = PatchProxy.applyThreeRefsWithListener(p0, p1, Boolean.valueOf(p2), this, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PatchProxy.onMethodExit(a.class, "1");
       return new j(p0, p1, p2);
    }
}
