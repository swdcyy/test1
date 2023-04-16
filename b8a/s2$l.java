package b8a.s2$l;
import s4a.b;
import b8a.s2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import f9a.b;
import lnc.i3;
import k2b.u1;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class s2$l implements b	// class@0003f1
{
    public final s2 a;

    public void s2$l(s2 p0){
       this.a = p0;
       super();
    }
    public final void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, s2$l.class, "1")) {
          return;
       }
       s2$l ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, s2.class, "6")) {
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          s2 w = ta.w;
          if (w == null) {
             a.S("mPhoto");
          }
          uElementPack.params = ta.W8().e();
          uElementPack.action2 = "GUIDE_BUBBLE";
          uClickEvent.contentPackage = b.a(w);
          uClickEvent.elementPackage = uElementPack;
          u1.a0(uClickEvent);
       }
       s2 v = this.a.v;
       if (v == null) {
          a.S("mSlidePlayViewModel");
       }
       v.Y(true);
       return;
    }
}
