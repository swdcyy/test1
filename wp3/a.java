package wp3.a;
import vp3.a;
import java.lang.Class;
import nsd.u;
import java.lang.Object;
import sp3.a;
import com.kuaishou.live.tuna.explain.view.TunaExplainTKRender;
import java.lang.String;
import tx4.h;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public abstract class a implements a	// class@004490
{
    public final Class b;

    public void a(){
       super(null, 1, null);
    }
    public void a(Class p0){
       super();
       this.b = p0;
    }
    public void a(Class p0,int p1,u p2){
       super(null);
    }
    public final Object b(a p0,TunaExplainTKRender p1,String p2,h p3){
       a uoa;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          a.p(p0, "tunaLiveExplainContext");
          a.p(p1, "tkRender");
          obj = null;
          if (p2 == null || !p2.length()) {
             uoa = 1;
          label_002b :
             if (!uoa) {
                uoa = this.b;
                if (uoa != null) {
                   obj = a.a.h(p2, uoa);
                }
             }
          }else {
             uoa = null;
             goto label_002b ;
          }
       }catch(java.lang.Exception e10){
          ExceptionHandler.handleCaughtException(e10);
       }
       return this.c(p0, p1, obj, p3);
    }
    public abstract Object c(a p0,TunaExplainTKRender p1,Object p2,h p3);
    public final String d(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       try{
          p0 = a.a.q(p0);
          a.o(p0, "Gsons.KWAI_GSON.toJson\(result\)");
          return p0;
       }catch(java.lang.Exception e3){
          ExceptionHandler.handleCaughtException(e3);
          return obj;
       }
    }
    public void destroy(){
    }
}
