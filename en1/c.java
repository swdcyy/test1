package en1.c;
import java.lang.String;
import p91.m;
import com.kwai.robust.PatchProxyResult;
import en1.b;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.u1;

public final class c	// class@0021cf
{
    public final b a;
    public final ClientEvent$ElementPackage b;
    public final ClientContent$ContentPackage c;
    public e0 d;
    public final m e;

    public void c(String p0,m p1){
       ClientContent$LiveStreamPackage liveStreamPa;
       a.p(p0, "action2");
       super();
       this.e = p1;
       Object[] objArray = null;
       b uob = (p1 == null)? objArray: new b(p1);
       this.a = uob;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       this.b = uElementPack;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       this.c = uContentPack;
       uElementPack.action2 = p0;
       if (uob != null) {
          liveStreamPa = PatchProxy.apply(objArray, uob, b.class, "1");
          if (liveStreamPa != PatchProxyResult.class) {
          }else {
             liveStreamPa = uob.a.a();
             a.o(liveStreamPa, "liveBasicContext.liveStreamPackage");
          }
       }else {
          liveStreamPa = objArray;
       }
       uContentPack.liveStreamPackage = liveStreamPa;
       if (uob != null) {
          BaseFragment uBaseFragmen = PatchProxy.apply(objArray, uob, b.class, "2");
          if (uBaseFragmen != PatchProxyResult.class) {
          }else {
             uBaseFragmen = uob.a.b();
             a.o(uBaseFragmen, "liveBasicContext.fragment");
          }
          objArray = uBaseFragmen;
       }
       this.d = objArray;
       return;
    }
    public final c a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "jsonString");
       this.b.params = p0;
       return this;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       u1.L("", this.d, 1, this.b, this.c);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       u1.C0("", this.d, 9, this.b, this.c);
       return;
    }
}
