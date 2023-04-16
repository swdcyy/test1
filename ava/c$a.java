package ava.c$a;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import kp.y1;

public final class c$a implements g	// class@000323
{
    public static final c$a b;

    static {
       c$a.b = new c$a();
    }
    public void c$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
       }else {
          a.o(p0, "it");
          y1.g(p0.getItems(), 0x272c, p0.mLlsid);
       }
       return;
    }
}
