package wb6.c;
import java.lang.String;
import java.lang.Object;
import km8.b;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.reflect.Type;
import com.yxcorp.retrofit.model.Region;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;
import ta6.c;
import q87.c;

public final class c	// class@002735
{
    public static final SharedPreferences a;
    public static final c b;

    static {
       c.b = new c();
       Object obj = b.b("DefaultPreferenceHelper");
       a.o(obj, "PreferenceContext.get\(\"DefaultPreferenceHelper\"\)");
       c.a = obj;
    }
    public void c(){
       super();
    }
    public static final String a(){
       String id;
       QCurrentUser obj = PatchProxy.apply(null, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = QCurrentUser.me();
       if (obj != null) {
          id = obj.getId();
          if (id != null) {
          label_001f :
             return id;
          }
       }
       id = "0";
       goto label_001f ;
    }
    public static final Region b(Type p0){
       Object obj = null;
       String obj1 = PatchProxy.applyOneRefs(p0, obj, c.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(p0, "type");
       obj1 = c.a.getString(c.a()+"_Region", "");
       if (!TextUtils.isEmpty(obj1)) {
          obj = b.a(obj1, p0);
       }
       return obj;
    }
    public static final void c(Region p0,String p1){
       c uoc = c.class;
       String obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, uoc, "2")) {
          return;
       }
       a.p(p0, "region");
       SharedPreferences$Editor uEditor = c.a.edit();
       String str = PatchProxy.applyOneRefs(p0, obj, uoc, "3");
       if (str != PatchProxyResult.class) {
       }else {
          str = p0.c();
          obj = "region.uid";
          a.o(str, obj);
          str = (str.length() > 0)? 1: null;
          if (str) {
             str = p0.c();
             a.o(str, obj);
          }else {
             str = c.a();
          }
       }
       uEditor.putString(str+"_Region", b.e(p0));
       g.a(uEditor);
       Object[] objArray = new Object[0];
       c.C().w("APIScheduling", p1+". {uid, name, ticket} = "+'{'+p0.c()+", "+p0.a()+", "+p0.b()+'}', objArray);
       return;
    }
}
