package ab6.d$b;
import rjd.d;
import java.lang.Object;
import java.lang.String;
import com.google.common.collect.ImmutableSet;
import kotlin.jvm.internal.a;
import okhttp3.Request;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import okhttp3.HttpUrl;
import java.net.URL;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Set;
import okhttp3.RequestBody;
import ojd.c;

public final class d$b implements d	// class@000064
{
    public final Set a;

    public void d$b(){
       super();
       String[] stringArray = new String[0];
       ImmutableSet immutableSet = ImmutableSet.of("/rest/n/ad/business/tab/page/showConfigPage", "/rest/n/ad/business/guidePage/getGuidePageInfo", "/rest/nebula/ad/business/tab/page/showConfigPage", "/rest/nebula/ad/business/guidePage/getGuidePageInfo", "/rest/n/ad/business/businessFunction/index", "/rest/nebula/ad/business/businessFunction/index", stringArray);
       a.o(immutableSet, "ImmutableSet.of\(\n       ¡­ssFunction/index\"\n      \)");
       this.a = immutableSet;
    }
    public boolean a(Request p0){
       boolean b;
       URL obj = PatchProxy.applyOneRefs(p0, this, d$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "request");
       obj = p0.url().url();
       a.o(obj, "request.url\(\).url\(\)");
       String path = obj.getPath();
       if (!TextUtils.x(path) && this.a.contains(path)) {
          return true;
       }
       RequestBody requestBody = p0.body();
       if (requestBody instanceof c) {
          Boolean uBoolean = requestBody.b();
          a.o(uBoolean, "body.shouldValidateBody");
          b = uBoolean.booleanValue();
       }else {
          b = false;
       }
       return b;
    }
}
