package mh.b;
import vt5.h;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nh.c;
import lnc.a1;
import com.google.common.collect.ImmutableList;
import pr6.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class b implements h	// class@00268a
{

    public void b(){
       super();
    }
    public List DG(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0x7f103848;
       if (c.a()) {
          return ImmutableList.of(a1.p(0x7f103847), a1.p(i));
       }
       return ImmutableList.of(a1.p(0x7f103849), a1.p(0x7f10384a), a1.p(i));
    }
    public PresenterV2 Sa(d p0){
       p0 = PatchProxy.applyOneRefsWithListener(p0, this, b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       PatchProxy.onMethodExit(b.class, "1");
       return new PresenterV2();
    }
    public boolean isAvailable(){
       return true;
    }
}
