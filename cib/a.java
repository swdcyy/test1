package cib.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import dc5.c;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import pt7.a;
import q0c.y1;
import kotlin.jvm.internal.a;

public final class a	// class@00051e
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final boolean a(){
       IMConfigInfo obj = PatchProxy.apply(null, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!a.e()) {
          c.g("IMEffectHelper", "isBeautyEnabled false");
          return b;
       }else {
          obj = a.b();
          if (obj != null) {
             b = obj.mEnableImVideoChatBeauty;
          }
          return b;
       }
    }
    public static final boolean b(){
       y1 obj = PatchProxy.apply(null, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = y1.h();
       a.o(obj, "BeautyVersionManager.instance\(\)");
       boolean b = (obj.g())? true: false;
       return b;
    }
    public static final boolean c(){
       IMConfigInfo obj = PatchProxy.apply(null, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!a.e()) {
          c.g("IMEffectHelper", "isFilterEnabled false");
          return b;
       }else {
          obj = a.b();
          if (obj != null) {
             b = obj.mEnableImVideoChatFilter;
          }
          return b;
       }
    }
    public static final boolean d(){
       IMConfigInfo obj = PatchProxy.apply(null, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!a.e()) {
          c.g("IMEffectHelper", "isMakeupEnabled false");
          return b;
       }else {
          obj = a.b();
          if (obj != null) {
             b = obj.mEnableImVideoChatMakeup;
          }
          return b;
       }
    }
    public static final boolean e(){
       boolean b;
       IMConfigInfo obj = PatchProxy.apply(null, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.b();
       obj = (obj != null)? obj.mEnableImVideoChatPrettify: false;
       return obj;
    }
}
