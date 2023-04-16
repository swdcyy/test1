package ohc.g;
import ohc.a;
import uo7.k;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import ohc.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mhc.g2;
import mhc.g2$a;
import com.yxcorp.gifshow.entity.QPhoto;
import b06.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import org.json.JSONObject;
import org.json.JSONException;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import com.kwai.component.photo.reduce.d;
import zic.x0;
import java.lang.Throwable;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import mhc.o2;
import zsd.u;
import mhc.n1;

public class g extends a	// class@003959
{

    public void g(){
       super();
    }
    public boolean k(k p0,ShareInitResponse$SharePanelElement p1,int p2){
       return this.x(p0, p1, p2);
    }
    public void o(k p0,ShareInitResponse$SharePanelElement p1){
       this.v(p0, p1);
    }
    public void v(k p0,ShareInitResponse$SharePanelElement p1){
       JSONObject jSONObject;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "2")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "panelElement");
       g2$a x = g2.X;
       String str = "SHARE_PANNEL";
       if (a.g(x.A().b(), p1.mId)) {
          QPhoto qPhoto = p0.K();
          if (!PatchProxy.applyVoidTwoRefs(str, qPhoto, null, b.class, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PHOTO_REPORT";
             try{
                jSONObject = new JSONObject();
                jSONObject.put("source", str);
             }catch(org.json.JSONException e4){
                e4.printStackTrace();
             }
             uElementPack.params = jSONObject.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(qPhoto.mEntity);
             u1.u(1, uElementPack, uContentPack);
          }
       }else if(a.g(x.v().b(), p1.mId)){
          d.h(str, p0.K());
       }
       x0.b(p1);
       p1 = p1.mActionUrl;
       a.o(p1, "panelElement.mActionUrl");
       this.s(p0, 1, p1, null);
       return;
    }
    public boolean x(k p0,ShareInitResponse$SharePanelElement p1,int p2){
       if (PatchProxy.isSupport(g.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, g.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "photoKsConf");
       a.p(p1, "panelElement");
       boolean b = false;
       if (!u.I1(o2.a(b, "wechatMomentsUserChoose"), p1.mActionUrl, true)) {
          b = super.k(p0, p1, p2);
       }
       return b;
    }
}
