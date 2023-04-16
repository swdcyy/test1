package djc.c1;
import java.lang.String;
import java.lang.Throwable;
import com.google.gson.JsonObject;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.util.Log;
import com.google.gson.JsonElement;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public final class c1	// class@0021d8
{

    public static final void a(String p0,String p1,Throwable p2,JsonObject p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, c1.class, "1")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("error_stack", Log.getStackTraceString(p2));
       jsonObject.c0("error_msg", p1);
       jsonObject.c0("sub_biz", p0);
       jsonObject.G("custom_param", p3);
       b.a(0x4b316083).f1("share_immerse_panel_error_event", jsonObject.toString(), 9);
       return;
    }
    public static void b(String p0,String p1,Throwable p2,JsonObject p3,int p4,Object p5){
       p5 = null;
       if (p4 & 0x04) {
          p2 = p5;
       }
       if (p4 & 0x08) {
          p5 = new JsonObject();
       }
       c1.a(p0, p1, p2, p5);
       return;
    }
}
