package by7.c;
import ay7.a;
import by7.c$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.kwai.yoda.event.EventParams;
import yz7.e;
import java.lang.Exception;
import yz7.r;
import android.text.TextUtils;
import com.kwai.yoda.event.d;
import java.util.Objects;
import java.lang.Boolean;
import com.kwai.yoda.event.EventListenerParameter;
import yz7.k;
import java.util.Set;
import java.lang.Iterable;
import brd.t;
import zx7.c;
import erd.r;
import zx7.a;
import erd.g;
import brd.a0;
import java.util.List;
import java.util.Collection;
import java.lang.Throwable;
import com.kwai.yoda.function.FunctionResultParams$a;
import nsd.r0;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import com.kwai.yoda.bridge.YodaException;

public class c extends a	// class@0003a2
{
    public static final c$a d;

    static {
       c.d = new c$a(null);
    }
    public void c(){
       super();
    }
    public String c(){
       return "removeEventListener";
    }
    public String d(){
       return "event";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       EventParams uEventParams1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 == null) {
          throw new YodaException(0x1e850, "client status error: webview is null.");
       }
       int i = 0;
       EventParams uEventParams = (p1 == null || !p1.length())? 1: null;
       String str = "The Input is invalid: root params should be object.";
       d uod = 0x1e84f;
       if (!uEventParams) {
          try{
             uEventParams1 = e.a(p1, EventParams.class);
          }catch(java.lang.Exception e9){
             r.i(e9.getMessage());
             uEventParams1 = null;
          }
          if (uEventParams1 != null) {
             if (!TextUtils.isEmpty(uEventParams1.mType)) {
                d uod1 = d.f();
                Objects.requireNonNull(uod1);
                Object[] obj1 = PatchProxy.applyTwoRefs(p0, uEventParams1, uod1, d.class, "5");
                if (obj1 != patchProxyRe) {
                   obj1.booleanValue();
                }else if(!TextUtils.isEmpty(uEventParams1.mType) && !TextUtils.isEmpty(uEventParams1.mListener)){
                   EventListenerParameter uEventListen = new EventListenerParameter(p0, uEventParams1.mType, uEventParams1.mListener);
                   obj1 = new Object[]{uEventListen.getHybridId(),uEventParams1.mType};
                   r.h("WebViewEventCommunication", k.a("removeEventListener: HybridId = %s , type = %s", obj1));
                   uod1.a.remove(uEventListen);
                }else if(!TextUtils.isEmpty(uEventParams1.mType)){
                   List list = t.fromIterable(uod1.a).filter(new c(uEventParams1, String.valueOf(p0.hashCode()))).doOnNext(new a(uEventParams1)).toList().e();
                   if (!list.isEmpty()) {
                      uod1.a.removeAll(list);
                   }
                }
             }else {
                Object[] objArray = new Object[]{"type"};
                String str1 = String.format("The Input [%s] can NOT be null.", Arrays.copyOf(objArray, 1));
                a.h(str1, "java.lang.String.format\(format, *args\)");
                throw new YodaException(uod, str1);
             }
          }else {
             throw new YodaException(uod, str);
          }
       }else {
          throw new YodaException(uod, str);
       }
    }
}
