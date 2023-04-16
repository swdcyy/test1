package nf9.d;
import erd.g;
import nf9.a;
import com.kwai.video.westeros.models.ServerMediaRequest;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import w46.b;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;
import kotlin.jvm.internal.a;

public final class d implements g	// class@003179
{
    public final a b;
    public final ServerMediaRequest c;

    public void d(a p0,ServerMediaRequest p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       String key;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          a.D().e("ServerSwapController", "processMediaError", p0);
          String str = "request.key";
          if (p0 instanceof KSException) {
             KSException mReturnedErr = p0.mReturnedErrorCode;
             if (mReturnedErr != Integer.MIN_VALUE && (mReturnedErr < null || mReturnedErr > 100)) {
                key = this.c.getKey();
                a.o(key, str);
                this.b.h2(key, p0.mReturnedErrorCode);
             }
          }
          String key1 = this.c.getKey();
          a.o(key1, str);
          this.b.h2(key1, -1);
       }
       return;
    }
}
