package g0a.k;
import g0a.e;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import oe6.e;
import android.widget.ImageView;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import d0a.j;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import uw9.o;
import java.lang.Throwable;
import q87.c;

public class k extends e	// class@00239b
{
    public boolean i;

    public void k(QPhoto p0,GifshowActivity p1){
       super(p0, p1);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       super.d();
       this.i = false;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       super.doBindView(p0);
       boolean b = (e.T() != 1)? true: false;
       this.i = b;
       if (b) {
          this.b.setSelected(true);
       }else {
          this.c.setSelected(true);
       }
       return;
    }
    public void e(){
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ok, "7")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLARITY_CONFIRM";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this.f.mEntity);
          u1.u(1, uElementPack, uContentPack);
       }
       this.c();
       return;
    }
    public void f(){
       ClientContent$ContentPackage uContentPack;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "4")) {
          return;
       }
       RxBus.f.b(new j(this.f.getPhotoId(), this.i));
       if (!PatchProxy.applyVoid(objArray, this, ok, "6")) {
          ClientEvent$ElementPackage uElementPack = PatchProxy.apply(objArray, this, ok, "8");
          if (uElementPack != PatchProxyResult.class) {
          }else {
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLARITY_CONFIRM";
             JSONObject jSONObject = new JSONObject();
             String str = (this.i != null)? "hd_mode": "fluent_mode";
             try{
                jSONObject.put("clarity_name", str);
                uElementPack.params = jSONObject.toString();
             }catch(org.json.JSONException e1){
                Object[] objArray1 = new Object[0];
                o.C().u("PayCourseVideoQualitySwitchListDialog", e1, objArray1);
             }
          }
       }
       this.c();
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       super.g();
       this.i = true;
       return;
    }
}
