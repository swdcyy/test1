package nx1.c;
import sx4.e$a;
import java.lang.Object;
import java.lang.String;
import com.google.gson.JsonObject;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import java.util.Iterator;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import org.json.JSONException;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;
import java.lang.Number;
import tx4.h;
import ox1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;

public final class c implements e$a	// class@00340c
{
    public int b;
    public String c;
    public int d;
    public ClientContent$LiveStreamPackage e;

    public void c(){
       super();
       this.b = -1;
    }
    public final JsonObject a(String p0){
       JsonObject obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       String obj = PatchProxy.applyOneRefs(p0, this, uoc, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          obj1 = PatchProxy.applyOneRefs(p0, this, uoc, "5");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = new JsonObject();
             JSONObject jSONObject = new JSONObject(p0);
             Iterator iterator = jSONObject.keys();
             a.o(iterator, "jsonObject.keys\(\)");
             while (iterator.hasNext()) {
                obj = iterator.next();
                obj1.c0(obj, jSONObject.getString(obj));
             }
          }
       }catch(org.json.JSONException e5){
          b.B(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "json excption:"+e5.getMessage());
       }
       obj1.c0("biz_id", this.c);
       obj1.a0("index", Integer.valueOf(this.b));
       obj1.a0("type", Integer.valueOf(this.d));
       return obj1;
    }
    public Object b(String p0,String p1,h p2){
       JsonObject jsonObject;
       c te;
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack;
       a uoa = a.class;
       c uoc = c.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (p0 == null) {
       label_00a2 :
          b.B(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "un impl function name "+p0+", data:"+p1);
       }else {
          int i = p0.hashCode();
          if (i != -1261615456) {
             if (i == 0x6c121ece && p0.equals("tkWidgetOnClick")) {
                if (!PatchProxy.applyVoidOneRefs(p1, this, uoc, "2")) {
                   jsonObject = this.a(p1);
                   te = this.e;
                   if (!PatchProxy.applyVoidTwoRefs(jsonObject, te, null, uoa, "5")) {
                      uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "LIVE_INTERACT_PENDANT";
                      uElementPack.params = jsonObject.toString();
                      uContentPack = new ClientContent$ContentPackage();
                      uContentPack.liveStreamPackage = te;
                      u1.G("", 1, uElementPack, uContentPack);
                   }
                }
             }else {
                goto label_00a2 ;
             }
          }else if(p0.equals("onWidgetShow")){
             if (!PatchProxy.applyVoidOneRefs(p1, this, uoc, "3")) {
                jsonObject = this.a(p1);
                te = this.e;
                if (!PatchProxy.applyVoidTwoRefs(jsonObject, te, null, uoa, "4")) {
                   uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "LIVE_INTERACT_PENDANT";
                   uElementPack.params = jsonObject.toString();
                   uContentPack = new ClientContent$ContentPackage();
                   uContentPack.liveStreamPackage = te;
                   u1.u0(3, uElementPack, uContentPack);
                }
             }
          }else {
             goto label_00a2 ;
          }
       }
       return "success";
    }
    public final void d(int p0,String p1,int p2,ClientContent$LiveStreamPackage p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), p3, this, c.class, "6")) {
          return;
       }
       a.p(p1, "widgetId");
       a.p(p3, "liveStreamPackage");
       this.b = p0;
       this.d = p2;
       this.c = p1;
       this.e = p3;
       return;
    }
}
