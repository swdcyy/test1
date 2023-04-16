package iq8.n;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.util.DisplayMetrics;
import java.lang.Integer;
import android.content.Context;
import iq8.q;
import android.content.res.Resources;
import cw9.c;
import java.lang.reflect.Field;

public class n	// class@002717
{
    public static DisplayMetrics a;
    public static int b;

    public void n(){
       super();
    }
    public static int a(float p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), null, on, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 >= 0) {
          return (int)((n.c().density * p0) + 0x3f000000);
       }else {
          return (int)((n.c().density * p0) - 0x3f000000);
       }
    }
    public static int b(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, on, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 >= 0) {
          return (int)((n.c().density * (float)p0) + 0x3f000000);
       }else {
          return (int)((n.c().density * (float)p0) - 0x3f000000);
       }
    }
    public static DisplayMetrics c(){
       Object obj = PatchProxy.apply(null, null, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (n.a == null) {
          n.a = c.c(q.a().getResources());
       }
       return n.a;
    }
    public static int d(){
       Resources obj = PatchProxy.apply(null, null, n.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int b = n.b;
       if (b > 0) {
          return b;
       }
       obj = q.a().getResources();
       String str = "status_bar_height";
       int identifier = obj.getIdentifier(str, "dimen", "android");
       if (identifier > 0) {
          n.b = c.b(obj, identifier);
       }else {
          Class uClass = Class.forName("com.android.internal.R$dimen");
          Object obj1 = uClass.newInstance();
          Field field = uClass.getField(str);
          field.setAccessible(true);
          n.b = c.b(obj, Integer.parseInt(field.get(obj1).toString()));
       }
       return n.b;
    }
    public static int e(float p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), null, on, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 >= 0) {
          return (int)((p0 / n.c().density) + 0x3f000000);
       }else {
          return (int)((p0 / n.c().density) - 0x3f000000);
       }
    }
    public static int f(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, on, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 >= 0) {
          return (int)(((float)p0 / n.c().density) + 0x3f000000);
       }else {
          return (int)(((float)p0 / n.c().density) - 0x3f000000);
       }
    }
    public static float g(float p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), null, on, "8");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return (p0 / n.c().density);
    }
}
