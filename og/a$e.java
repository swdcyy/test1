package og.a$e;
import erd.o;
import java.util.concurrent.atomic.AtomicReference;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasResultBase;
import java.lang.Object;
import com.feature.post.bridge.util.UploadTokenHelper$ApplyTokenResponse;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.feature.post.bridge.util.UploadTokenHelper;
import java.util.Objects;
import ln.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import com.feature.post.bridge.util.UploadTokenHelper$EndPoint;
import ln.b$a;
import brd.t;
import com.kwai.library.rickon.c;
import og.h;
import og.i;
import erd.a;

public final class a$e implements o	// class@00278c
{
    public final AtomicReference b;
    public final AtomicReference c;
    public final JsSelectMixMediasResultBase d;

    public void a$e(AtomicReference p0,AtomicReference p1,JsSelectMixMediasResultBase p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "applyTokenResponse");
       String mResourceId = p0.getMResourceId();
       a.m(mResourceId);
       this.b.set(mResourceId);
       String str = this.c.get();
       Objects.requireNonNull(UploadTokenHelper.a);
       a.p(p0, "$this$toRickonTokenResponse");
       b uob = new b();
       uob.b = 0;
       uob.a = p0.getMFileToken();
       uob.d = new ArrayList();
       p0 = p0.getMEndPoints().iterator();
       while (p0.hasNext()) {
          UploadTokenHelper$EndPoint uEndPoint = p0.next();
          String mHost = uEndPoint.getMHost();
          short mPort = uEndPoint.getMPort();
          uob.d.add(new b$a(mHost, mPort, uEndPoint.getMProtocol()));
       }
       return c.b(str, uob).map(new h(this)).doFinally(new i(this));
    }
}
