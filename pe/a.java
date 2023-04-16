package pe.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import java.lang.Boolean;
import android.content.SharedPreferences;
import oe6.o;
import java.util.Locale;
import y1.f;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class a	// class@002918
{
    public static a a;

    public void a(){
       super();
    }
    public static a b(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.a == null) {
          a.a = new a();
       }
       return a.a;
    }
    public boolean a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c(p0, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }
    public final boolean c(Context p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return o.c(p0, "com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(p1, p2);
    }
    public boolean d(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       boolean b = false;
       boolean b1 = (obj != PatchProxyResult.class)? obj.booleanValue(): this.c(p0, "RCTI18nUtil_forceRTL", b);
       if (b1) {
          return true;
       }else {
          obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
          boolean b2 = (obj != PatchProxyResult.class)? obj.booleanValue(): this.c(p0, "RCTI18nUtil_allowRTL", true);
          if (b2) {
             b2 = PatchProxy.apply(null, this, a.class, "9");
             if (b2 != PatchProxyResult.class) {
                b2 = b2.booleanValue();
             }else if(f.a(Locale.getDefault()) == 1){
                b2 = true;
             }else {
                b2 = false;
             }
             if (b2) {
                b = true;
             }
          }
          return b;
       }
    }
    public final void e(Context p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "11")) {
          return;
       }
       SharedPreferences$Editor uEditor = o.c(p0, "com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
       uEditor.putBoolean(p1, p2);
       g.a(uEditor);
       return;
    }
}
