package ll1.b;
import im8.g;
import k51.c;
import io.reactivex.subjects.ReplaySubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ll1.b$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import ll1.a;
import t45.d;
import brd.z;
import ll1.b$b;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import ll1.e;
import java.util.Map;
import java.util.HashMap;
import mk1.h;

public final class b extends c implements g	// class@002f96
{
    public final c p;
    public h q;
    public a r;
    public static String sLivePresenterClassName = "LiveSendGiftLinkagePresenter";

    public void b(){
       super();
       ReplaySubject replaySubjec = ReplaySubject.i(5);
       a.o(replaySubjec, "ReplaySubject.createWithSize\(5\)");
       this.p = replaySubjec;
       this.r = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.X7(this.r.a().observeOn(d.a).subscribe(b$b.b));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, b.class, "4");
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new e());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       Object obj = this.q8(h.class);
       a.o(obj, "inject\(LiveAudienceGiftB¡­allerContext::class.java\)");
       this.q = obj;
       return;
    }
}
