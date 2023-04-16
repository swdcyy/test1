package f4a.p;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.i3;
import com.google.gson.c;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.kuaishou.tuna_logger.KsLogTunaPlcTag;
import java.util.List;
import com.yxcorp.gifshow.detail.plc.helper.f;
import msd.a;
import java.lang.Throwable;
import c15.b;

public class p	// class@0022b4
{

    public void p(){
       super();
    }
    public static String a(String p0,String p1,boolean p2){
       JsonObject obj;
       if (PatchProxy.isSupport(p.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, p.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = "h5";
       if (TextUtils.x(p0)) {
          i3 oi3 = i3.f();
          oi3.d("show_style_status", p1);
          if (!p2) {
             str = "download";
          }
          oi3.d("click_type", str);
          return oi3.e();
       }else {
          try{
             obj = new c().a(p0).r();
             obj.c0("show_style_status", p1);
             if (!p2) {
                str = "download";
             }
             obj.c0("click_type", str);
             return obj.toString();
          }catch(com.google.gson.JsonParseException e8){
             b.e(KsLogTunaPlcTag.PLC.appendTag("GameDownloadLogUtil"), f.b, e8);
             return p0;
          }
       }
    }
}
