package op1.d$a;
import nw1.b$a;
import op1.b;
import xp5.i;
import java.util.Map;
import z1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import op1.d;
import java.lang.Boolean;
import d61.l0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import k2b.u1;

public final class d$a implements b$a	// class@003551
{
    public final b a;
    public final i b;
    public final Map c;
    public final a d;

    public void d$a(b p0,i p1,Map p2,a p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "5")) {
          return;
       }
       d.a(this.b, this.c, "CONFIRM_SETTING");
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "3")) {
          return;
       }
       d$a ta = this.a;
       if (ta != null) {
          ta.switchCamera();
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "4")) {
          return;
       }
       d.a(this.b, this.c, "CLOSE");
       return;
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "2")) {
          return;
       }
       d$a td = this.d;
       if (td != null) {
          td.accept(Boolean.TRUE);
       }
       td = this.a;
       if (td != null) {
          td.a();
       }
       return;
    }
    public void onShow(){
       d uod = d.class;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, d$a.class, str)) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, uod, "4")) {
          l0.d("LiveMultiChatPrettifyDialogShowed").i(Boolean.TRUE);
       }
       d$a ta = this.a;
       if (ta != null) {
          ta.b();
       }
       ta = this.b;
       d$a tc = this.c;
       if (!PatchProxy.applyVoidTwoRefs(ta, tc, objArray, uod, "6")) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = ta.a();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_VOICE_PARTY_BEAUTIFY_PREVIEW_PANEL";
          i3 oi3 = i3.f();
          oi3.d("type", str);
          Iterator iterator = tc.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             oi3.d(key, uEntry.getValue());
          }
          uElementPack.params = oi3.e();
          u1.B0(new ShowMetaData().setLogPage(ta.getPage()).setContentPackage(uContentPack).setElementPackage(uElementPack));
       }
       return;
    }
}
