package a4a.a;
import j4a.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import up.a;
import com.kuaishou.android.model.actionreport.PhotoActionReportParams;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.Long;
import com.google.gson.JsonElement;

public final class a extends b	// class@00002e
{
    public final QPhoto b;

    public void a(QPhoto p0){
       super();
       this.b = p0;
    }
    public void a(ClientContent$ContentPackage p0,ClientEvent$ElementPackage p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "1")) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb = tb.getActionReportFetcher();
          if (tb != null) {
             PhotoActionReportParams photoActionR = tb.a();
             if (photoActionR != null) {
                JsonObject jsonObject = new JsonObject();
                ClientEvent$ElementPackage params = p1.params;
                if (params != null) {
                   jsonObject = new Gson().h(params, JsonObject.class);
                   a.o(jsonObject, "Gson\(\).fromJson\(it, JsonObject::class.java\)");
                }
                jsonObject.a0("play_cnt", Integer.valueOf(photoActionR.mPlayCnt));
                jsonObject.a0("play_time", Long.valueOf(photoActionR.mActionRelativeTime));
                p1.params = jsonObject.toString();
             }
          }
       }
       return;
    }
}
