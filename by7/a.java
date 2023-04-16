package by7.a;
import ay7.a;
import by7.a$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.kwai.yoda.event.EventParams;
import yz7.e;
import java.lang.Throwable;
import yz7.r;
import com.kwai.yoda.event.d;
import java.util.Objects;
import com.kwai.yoda.event.EventListenerParameter;
import yz7.k;
import java.util.Set;
import com.kwai.yoda.function.FunctionResultParams$a;
import nsd.r0;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import com.kwai.yoda.bridge.YodaException;

public class a extends a	// class@00039e
{
    public static final a$a d;

    static {
       a.d = new a$a(null);
    }
    public void a(){
       super();
    }
    public String c(){
       return "addEventListener";
    }
    public String d(){
       return "event";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       EventParams uEventParams1;
       Object[] objArray1;
       String str2;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          throw new YodaException(0x1e850, "client status error: webview is null.");
       }
       EventParams uEventParams = (p1 == null || !p1.length())? 1: null;
       String str = "The Input is invalid: root params should be object.";
       d uod = 0x1e84f;
       if (!uEventParams) {
          try{
             uEventParams1 = e.a(p1, EventParams.class);
          }catch(java.lang.Exception e9){
             r.f(e9);
             uEventParams1 = null;
          }
          if (uEventParams1 != null) {
             uEventParams = uEventParams1.mType;
             uEventParams = (uEventParams == null || !uEventParams.length())? 1: null;
             str = "java.lang.String.format\(format, *args\)";
             String str1 = "The Input [%s] can NOT be null.";
             if (!uEventParams) {
                uEventParams = uEventParams1.mListener;
                d uod1 = (uEventParams == null || !uEventParams.length())? 1: null;
                if (!uod1) {
                   uod1 = d.f();
                   Objects.requireNonNull(uod1);
                   if (!PatchProxy.applyVoidTwoRefs(p0, uEventParams1, uod1, d.class, "2")) {
                      try{
                         EventListenerParameter uEventListen = new EventListenerParameter(p0, uEventParams1.mType, uEventParams1.mListener);
                         Object[] objArray = new Object[]{uEventListen.getHybridId(),uEventParams1.mType};
                         r.h("WebViewEventCommunication", k.a("addEventListener: HybridId = %s , type = %s", objArray));
                         uod1.a.add(uEventListen);
                         uod1.a();
                      }catch(java.lang.Exception e8){
                         r.e("WebViewEventCommunication", e8);
                      }
                   }
                }else {
                   objArray1 = new Object[]{"listener"};
                   str2 = String.format(str1, Arrays.copyOf(objArray1, 1));
                   a.h(str2, str);
                   throw new YodaException(uod, str2);
                }
             }else {
                objArray1 = new Object[]{"type"};
                str2 = String.format(str1, Arrays.copyOf(objArray1, 1));
                a.h(str2, str);
                throw new YodaException(uod, str2);
             }
          }else {
             throw new YodaException(uod, str);
          }
       }else {
          throw new YodaException(uod, str);
       }
    }
}
