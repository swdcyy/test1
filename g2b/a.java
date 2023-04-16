package g2b.a;
import java.lang.Object;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import com.yxcorp.gifshow.local.sub.entrance.sizer.sizermanager.LocalSizerDataProvider;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a	// class@002a6b
{
    public static LocalSizerDataProvider a;
    public static LocalSizerDataProvider b;

    public void a(){
       super();
    }
    public static LocalSizerDataProvider a(LocalDelegateType p0){
       LocalSizerDataProvider localSizerDa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LocalDelegateType obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = LocalDelegateType.HOME_LOCAL;
       if (p0 == obj) {
          localSizerDa = PatchProxy.apply(null, null, a.class, "2");
          if (localSizerDa != patchProxyRe) {
          }else if(a.b == null){
             a.b = new LocalSizerDataProvider(obj);
          }
          localSizerDa = a.b;
          return localSizerDa;
       }else {
          localSizerDa = PatchProxy.apply(null, null, a.class, "3");
          if (localSizerDa != patchProxyRe) {
          }else if(a.a == null){
             a.a = new LocalSizerDataProvider(LocalDelegateType.ACTIVITY_LOCAL);
          }
          localSizerDa = a.a;
          return localSizerDa;
       }
    }
}
