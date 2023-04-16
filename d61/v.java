package d61.v;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Math;
import java.lang.Float;
import java.lang.NumberFormatException;
import java.lang.Long;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class v	// class@001f42
{

    public void v(){
       super();
    }
    public static boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, v.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       return p0.matches("\\d+");
    }
    public static int b(int p0,int p1,int p2){
       if (PatchProxy.isSupport(v.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), null, v.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return Math.min(Math.max(p0, p1), p2);
    }
    public static boolean c(int p0){
       boolean b = (p0 > 99)? true: false;
       return b;
    }
    public static float d(String p0,float p1){
       v ov = v.class;
       if (PatchProxy.isSupport(ov)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), null, ov, "4");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       try{
          return Float.parseFloat(p0);
       }catch(java.lang.NumberFormatException e4){
          e4.printStackTrace();
          return p1;
       }
    }
    public static int e(String p0,int p1){
       v ov = v.class;
       if (PatchProxy.isSupport(ov)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, ov, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return Integer.parseInt(p0);
       }catch(java.lang.NumberFormatException e4){
          e4.printStackTrace();
          return p1;
       }
    }
    public static long f(String p0,long p1){
       v ov = v.class;
       if (PatchProxy.isSupport(ov)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, ov, "1");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       try{
          return Long.parseLong(p0);
       }catch(java.lang.NumberFormatException e4){
          e4.printStackTrace();
          return p1;
       }
    }
    public static int g(Integer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, v.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (p0 == null)? 0: p0.intValue();
       return i;
    }
    public static int h(String p0,int p1){
       v ov = v.class;
       if (PatchProxy.isSupport(ov)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, ov, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return Integer.valueOf(p0).intValue();
       }catch(java.lang.NumberFormatException e4){
          ExceptionHandler.handleCaughtException(e4);
          return p1;
       }
    }
    public static long i(Long p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, v.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = (p0 == null)? 0: p0.longValue();
       return l;
    }
}
