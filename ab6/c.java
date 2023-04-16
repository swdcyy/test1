package ab6.c;
import java.util.Random;
import java.lang.System;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.lang.String;
import ab6.c$a;
import javax.inject.Provider;
import tpd.a;
import upd.a;
import java.lang.Object;
import java.lang.Long;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Build$VERSION;
import vk7.g0;
import java.lang.Double;
import java.lang.Number;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public final class c	// class@000062
{
    public static final Random a;
    public static final DecimalFormat b;
    public static Point c;
    public static String d;
    public static String e;
    public static String f;
    public static String g;
    public static Integer h;
    public static Integer i;
    public static Long j;
    public static final a k;
    public static final c l;

    static {
       c.l = new c();
       c.a = new Random(System.currentTimeMillis());
       c.b = new DecimalFormat("00000", new DecimalFormatSymbols(Locale.US));
       c.k = a.a(c$a.a);
    }
    public void c(){
       super();
    }
    public static final Long a(c p0){
       return c.j;
    }
    public static final void b(c p0,Long p1){
       c.j = p1;
    }
    public final void c(Map p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "14")) {
          return;
       }
       a.p(p0, "paramsMap");
       a.p(p1, "key");
       a.p(p2, "value");
       if (p0.containsKey(p1)) {
          Log.d("CommonParamsImpl:", "看到这个日志，请联系Android网络库同学，网络库公参和业务公参冲突，有相同的key = "+p1+" 不同的value，网络库中value = "+p2+"  业务中value = "+p0.get(p1));
       }
       p0.put(p1, p2);
       return;
    }
    public final boolean d(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "context");
       boolean b = true;
       if (Build$VERSION.SDK_INT >= 31) {
          if (g0.a(p0, "android.permission.ACCESS_FINE_LOCATION") && g0.a(p0, "android.permission.ACCESS_COARSE_LOCATION")) {
          label_0038 :
             b = false;
          }
       }else if(!g0.a(p0, "android.permission.ACCESS_FINE_LOCATION")){
       }
       return b;
    }
    public final double e(String p0,double p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       try{
          if (p0 != null) {
             p1 = Double.parseDouble(p0);
          }
          return p1;
       }catch(java.lang.NumberFormatException e0){
       }
    }
    public final String f(Map p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "cookieMap");
       if (p0.isEmpty()) {
          return "";
       }
       obj = "";
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          obj = obj+key;
          obj = obj+'='+uEntry.getValue()+';';
       }
       obj.deleteCharAt((obj.length() - 1));
       String str = obj;
       a.o(str, "sb.toString\(\)");
       return str;
    }
}
