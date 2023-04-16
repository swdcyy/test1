package bac.f0$a;
import y8c.f$b;
import bac.f0;
import com.kwai.framework.model.user.RecoUser;
import fac.c;
import fac.b;
import ija.t;
import java.util.List;
import ok.h;
import com.google.common.collect.Lists;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bac.l0;
import java.util.Map;

public class f0$a extends f$b	// class@000400
{
    public QPhoto h;
    public c i;
    public g j;
    public b k;

    public void f0$a(f0 p0,f$b p1,RecoUser p2,c p3,b p4){
       super(p1);
       this.h = Lists.h(p2.mFeedList, t.b).get(0);
       this.i = p3;
       this.j = p0;
       this.k = p4;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f0$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, f0$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(f0$a.class, new l0());
       }else {
          obj.put(f0$a.class, null);
       }
       return obj;
    }
}
