package bx4.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import no8.e;
import oo8.s;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import java.lang.Math;
import java.lang.Throwable;
import zp8.a;

public class b	// class@0003e2
{
    public JsonObject a;
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public static b a(){
       return b.b;
    }
    public boolean b(String p0,String p1){
       boolean b;
       JsonObject jsonObject;
       float f;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = true;
       try{
          if (TextUtils.isEmpty(p0)) {
             return false;
          }
          if (e.b().d() != null) {
             this.a = e.b().d().getValue("tk_resport_event_sample", JsonObject.class, new JsonObject());
          }
          b ta = this.a;
          if (ta == null) {
             return b;
          }else {
             String str = "default";
             if (!ta.s0(p0)) {
                if (this.a.s0(str)) {
                   jsonObject = this.a.e0(str).r();
                }else {
                   return b;
                }
             }else {
                jsonObject = this.a.e0(p0).r();
             }
             if (TextUtils.isEmpty(p1) || !jsonObject.s0(p1)) {
                if (jsonObject.s0(str)) {
                   f = jsonObject.e0(str).n();
                label_008e :
                   if (Math.random() - (double)f >= 0) {
                      b = false;
                   }
                }
             }else {
                f = jsonObject.e0(p1).n();
                goto label_008e ;
             }
             return b;
          }
       }catch(java.lang.Exception e7){
          a.g("SampleReportUtils", e7);
          return b;
       }
    }
}
