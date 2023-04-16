package me9.l$c;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicNetworkBridgeRequestData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.util.HashMap;
import e4b.a;
import e4b.c;
import brd.t;

public final class l$c implements o	// class@002ffd
{
    public static final l$c b;

    static {
       l$c.b = new l$c();
    }
    public void l$c(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, l$c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "bridgeRequestData");
          String path = p0.getPath();
          p0 = p0.getParams();
          if (p0 == null) {
             p0 = new HashMap();
          }
          ot = c.a().m(path, p0);
       }
       return ot;
    }
}
