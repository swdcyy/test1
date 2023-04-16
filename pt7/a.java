package pt7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import pt7.f;
import java.util.Objects;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import com.kwai.robust.PatchProxyResult;

public class a	// class@0021f7
{
    public static IMConfigInfo a;

    public void a(){
       super();
    }
    public static void a(){
       if (PatchProxy.applyVoid(null, null, a.class, "2")) {
          return;
       }
       a.a = null;
       Objects.requireNonNull(b.a(0x3a5d2b8e));
       f.e = "";
       f.d = null;
       return;
    }
    public static IMConfigInfo b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (a.a == null) {
          obj = b.a(0x3a5d2b8e);
          Objects.requireNonNull(obj);
          IMConfigInfo iMConfigInfo = PatchProxy.apply(null, obj, f.class, "2");
          if (iMConfigInfo != patchProxyRe) {
          }else {
             Object c = f.c;
             _monitor_enter(c);
             iMConfigInfo = f.d;
             if (iMConfigInfo == null) {
                iMConfigInfo = obj.a();
             }
             _monitor_exit(c);
          }
          a.a = iMConfigInfo;
       }
       return a.a;
    }
    public static void c(){
       if (PatchProxy.applyVoid(null, null, a.class, "3")) {
          return;
       }
       a.a();
       return;
    }
}
