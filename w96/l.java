package w96.l;
import java.lang.Object;
import aa6.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import w96.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.util.rx.RxBus;
import y96.i;

public class l	// class@00272e
{
    public static boolean a;

    public void l(){
       super();
    }
    public static c a(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, objArray, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.class;
       String str = b.a.getString("LoggingUploadConfig", "");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public static void b(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, l.class, "2")) {
          return;
       }
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putString("LoggingUploadConfig", b.e(p0));
       g.a(uEditor);
       if (!TextUtils.isEmpty(p1) || l.a) {
          l.a = TextUtils.isEmpty(p1) ^ 0x01;
          RxBus.f.b(new i(p1));
       }
       return;
    }
}
