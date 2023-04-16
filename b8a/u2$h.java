package b8a.u2$h;
import s4a.b;
import b8a.u2;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.Objects;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;

public final class u2$h implements b	// class@000406
{
    public final u2 a;
    public final QPhoto b;

    public void u2$h(u2 p0,QPhoto p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, u2$h.class, "1")) {
          return;
       }
       u2 s = this.a.s;
       if (s == null) {
          a.S("mSlidePlayViewModel");
       }
       s.Y(true);
       u2$h ta = this.a;
       u2$h tb = this.b;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(tb, ta, u2.class, "12")) {
          ClickMetaData uClickMetaDa = new ClickMetaData();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "REGIONAL_FEATURE_CONTENT_POPUP";
          i3 oi3 = i3.f();
          oi3.d("text", ta.W8(tb));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          s = ta.t;
          if (s == null) {
             a.S("mPhoto");
          }
          uContentPack.photoPackage = w1.f(s.mEntity);
          uClickMetaDa.setElementPackage(uElementPack);
          uClickMetaDa.setContentPackage(uContentPack);
          u1.B(uClickMetaDa);
       }
       return;
    }
}
