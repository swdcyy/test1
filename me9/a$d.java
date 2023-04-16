package me9.a$d;
import erd.o;
import me9.a;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicBridgeCenterRequestData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import me9.b;
import io.reactivex.g;
import brd.t;

public final class a$d implements o	// class@002fdd
{
    public final a b;

    public void a$d(a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, a$d.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "bridgeData");
          ot = t.create(new b(this, p0));
       }
       return ot;
    }
}
