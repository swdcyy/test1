package ht1.b;
import java.lang.Object;
import java.lang.String;
import zs1.b;
import com.kuaishou.protobuf.livestream.nano.MultiPkSkinTheme;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import ut1.f;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import ut1.k;
import ut1.l;
import com.kwai.framework.model.user.UserInfo;

public final class b	// class@002773
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final MultiPkSkinTheme a(String p0,b p1){
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "coreModel");
       f value = p1.l().getValue();
       if (value != null) {
          Map map = value.l();
          if (map != null) {
             Iterator iterator = map.values().iterator();
             while (iterator.hasNext()) {
                obj = iterator.next().f().values().iterator();
                while (true) {
                   if (obj.hasNext()) {
                      l ol = obj.next();
                      if (a.g(p0, ol.c().mId)) {
                         return ol.f;
                      }
                   }else {
                      continue ;
                   }
                }
             }
          }
       }
       return null;
    }
}
