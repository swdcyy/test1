package ex1.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import ekd.w;
import ex1.c;
import com.kwai.robust.PatchProxyResult;
import ex1.d;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import brd.t;
import cjd.e;
import erd.o;
import ex1.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.lang.Number;
import com.kuaishou.live.basic.model.CheckResolutionResponse;
import java.lang.reflect.Type;
import s81.a;
import com.kuaishou.live.basic.model.CheckResolutionResponse$VideoConfig;

public class b	// class@002216
{
    public CheckResolutionResponse a;

    public void b(){
       super();
    }
    public static void a(int p0){
       b uob = b.class;
       String str = "1";
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uob, str)) {
          return;
       }
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), null, null, uob, "2")) {
          int i = w.a();
          double d = w.b();
          d uod = PatchProxy.apply(null, null, c.class, str);
          if (uod != PatchProxyResult.class) {
          }else if(c.a == null){
             c.a = e.b(b.a(-1961311520).a(RouteType.LIVE, d.b), d.class);
          }
          uod = c.a;
          Object obj = uod;
          obj.a(p0, i, d, false).map(new e()).doOnNext(a.b).subscribe(Functions.d());
       }
       return;
    }
    public static int b(){
       CheckResolutionResponse obj = PatchProxy.apply(null, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.o(CheckResolutionResponse.class);
       if (obj == null) {
          return 15;
       }
       return obj.mFps;
    }
    public static String c(){
       CheckResolutionResponse obj = PatchProxy.apply(null, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.o(CheckResolutionResponse.class);
       String str = "";
       if (obj == null) {
          return str;
       }
       obj = obj.mVideoConfig;
       if (obj != null) {
          str = obj.mAryaConfig;
       }
       return str;
    }
    public static String d(){
       CheckResolutionResponse obj = PatchProxy.apply(null, null, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.o(CheckResolutionResponse.class);
       String str = "";
       if (obj == null) {
          return str;
       }
       obj = obj.mVideoConfig;
       if (obj != null) {
          str = obj.mX264CodecConfig;
       }
       return str;
    }
}
