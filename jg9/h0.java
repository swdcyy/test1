package jg9.h0;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.e0;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.SingleSubject;
import jg9.g0;
import brd.a0;

public final class h0 implements o	// class@002a9a
{
    public static final h0 b;

    static {
       h0.b = new h0();
    }
    public void h0(){
       super();
    }
    public Object apply(Object p0){
       a0 uoa0 = PatchProxy.applyOneRefs(p0, this, h0.class, "1");
       if (uoa0 != PatchProxyResult.class) {
       }else {
          a.p(p0, "item");
          uoa0 = p0.e().C(new g0(p0));
       }
       return uoa0;
    }
}
