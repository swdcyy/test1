package ta6.h;
import com.yxcorp.retrofit.c$b;
import java.lang.Object;
import okhttp3.Request;
import java.util.Map;
import java.lang.String;
import android.util.Pair;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.lang.Boolean;
import java.util.List;
import ujd.c;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import java.lang.StringBuilder;
import android.app.Application;
import o56.a;
import iud.a;
import java.nio.charset.Charset;
import android.os.Build$VERSION;
import android.content.Context;
import com.yxcorp.gifshow.util.CPU;
import yid.f;

public class h implements c$b	// class@002491
{

    public void h(){
       super();
    }
    public Pair a(Request p0,Map p1,Map p2,String p3){
       HashMap obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap(p2);
       obj.remove("__NSSwitchesEtag");
       p1.remove("__NSWJ");
       if (p0 != null && Boolean.parseBoolean(p0.header("useSig3"))) {
          obj.clear();
       }
       String str = TextUtils.join("", c.a(p1, obj));
       if (!TextUtils.isEmpty(p3)) {
          str = str+p3;
       }
       return new Pair("sig", CPU.getClock(a.b(), str.getBytes(a.f), Build$VERSION.SDK_INT));
    }
    public Pair b(String p0,String p1){
       return f.a(this, p0, p1);
    }
}
