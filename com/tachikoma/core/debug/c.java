package com.tachikoma.core.debug.c;
import java.lang.Object;
import com.tkruntime.v8.V8;
import java.lang.String;
import com.kuaishou.kds.devtools.v8.V8InspectorEventListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.tachikoma.core.debug.b;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.StringBuilder;
import java.util.concurrent.atomic.AtomicInteger;
import no8.a;
import lp8.b;
import lp8.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Throwable;
import android.content.Context;
import java.lang.reflect.Method;

public class c	// class@000dbd
{
    public static b a;
    public static Set b;
    public static Class c;
    public static Method d;
    public static Method e;
    public static Class f;
    public static Method g;
    public static Class h;
    public static Method i;

    public void c(){
       super();
    }
    public static void a(V8 p0,String p1,boolean p2,V8InspectorEventListener p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, c.class, "4")) {
          return;
       }
       b a = c.a;
       if (a != null) {
          a.b(p0, p1, p2, p3);
       }
       return;
    }
    public static String b(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(p0, null, c.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = c.a;
       if (obj != null) {
          Objects.requireNonNull(obj);
          p0 = PatchProxy.apply(null, obj, b.class, "4");
          if (p0 != patchProxyRe) {
          }else {
             p0 = "TK_ANONYMOUS_SCRIPT_"+b.a.getAndIncrement()+".js";
          }
       }
       return p0;
    }
    public static boolean c(String p0){
       String obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.c.booleanValue()) {
          obj = c.a().r3();
          if (c.a().q3() && !TextUtils.isEmpty(obj)) {
             String[] stringArray = obj.split(" ");
             if (stringArray.length > 0) {
                int len = stringArray.length;
                int i = 0;
                while (i < len) {
                   if ((stringArray[i]).equals(p0)) {
                      return true;
                   }
                   i = i + 1;
                }
             }
          }
       }
       return false;
    }
    public static void d(Throwable p0,Context p1){
       if (PatchProxy.applyVoidTwoRefs(p0, null, null, c.class, "19")) {
          return;
       }
       Class[] uClassArray = new Class[]{Throwable.class,Context.class};
       Object[] objArray = new Object[]{p0,null};
       Class.forName("com.tachikoma.debug.util.DebugDialogUtil").getDeclaredMethod("showDialog", uClassArray).invoke(null, objArray);
       return;
    }
}
