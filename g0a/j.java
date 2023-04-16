package g0a.j;
import g0a.e;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import p7c.a;
import android.widget.ImageView;
import p5a.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import org.greenrobot.eventbus.a;
import q5a.b;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import java.lang.Integer;
import com.kuaishou.android.model.mix.VideoMeta;
import com.yxcorp.gifshow.detail.qphotoplayer.f;
import tl8.d;
import ok.h;
import tl8.e;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import java.util.List;
import java.util.Iterator;
import com.kwai.video.player.mid.manifest.RepInterface;
import uw9.o;
import java.lang.Throwable;
import q87.c;

public class j extends e	// class@00239a
{
    public int i;

    public void j(QPhoto p0,GifshowActivity p1){
       super(p0, p1);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       super.d();
       this.i = -100;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       super.doBindView(p0);
       int i = a.b();
       if (!i) {
          i = -100;
       }
       if (i == -100) {
          this.c.setSelected(true);
       }else {
          this.i = h.b(this.f);
          this.b.setSelected(true);
       }
       return;
    }
    public void e(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oj, "7")) {
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
       String str;
       String str1;
       Iterator obj;
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "4")) {
          return;
       }
       a.d().k(new b(this.f.getPhotoId(), this.i, this.g.hashCode()));
       if (!PatchProxy.applyVoid(objArray, this, oj, "6")) {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          ClientEvent$ElementPackage uElementPack = PatchProxy.apply(objArray, this, oj, "8");
          if (uElementPack != patchProxyRe) {
          }else {
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLARITY_CONFIRM";
             JSONObject jSONObject = new JSONObject();
             j ti = this.i;
             if (ti == -100) {
             label_0070 :
                str = "AUTO";
             }else {
                e tf = this.f;
                if (PatchProxy.isSupport(h.class)) {
                   str = PatchProxy.applyTwoRefs(Integer.valueOf(ti), tf, objArray, h.class, "5");
                   if (str != patchProxyRe) {
                   }
                }
                if (ti == -100) {
                   goto label_0070 ;
                }else if(PatchProxy.isSupport(h.class)){
                   obj = PatchProxy.applyTwoRefs(Integer.valueOf(ti), tf, objArray, h.class, "13");
                   if (obj != patchProxyRe) {
                      str = obj;
                   }
                }
                if (tf.useMultiRateV2()) {
                   obj = e.h(tf.mEntity, VideoMeta.class, f.b).getRepList().iterator();
                   while (true) {
                      if (obj.hasNext()) {
                         RepInterface repInterface = obj.next();
                         if (repInterface.getId() == ti) {
                            str1 = repInterface.getQualityType();
                         label_00bc :
                            str = str1;
                         }
                      }
                   }
                }
                str1 = "";
                goto label_00bc ;
             }
             str1 = (this.i == -100)? "fluent_mode": "hd_mode";
             try{
                jSONObject.put("clarity", str);
                jSONObject.put("clarity_name", str1);
                uElementPack.params = jSONObject.toString();
             }catch(org.json.JSONException e1){
                Object[] objArray1 = new Object[0];
                o.C().u("DetailVideoQualitySwitchListDialog", e1, objArray1);
             }
          }
       }
       this.c();
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       super.g();
       this.i = h.b(this.f);
       return;
    }
}
