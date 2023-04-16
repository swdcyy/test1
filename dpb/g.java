package dpb.g;
import com.yxcorp.gifshow.music.cloudmusic.search.MusicSearchLayout$a;
import dpb.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kob.k;
import java.lang.StringBuilder;
import dpb.i;
import q87.c;
import dpb.h;
import java.util.Objects;
import fpb.d;
import fpb.b;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import sy5.a;
import com.google.gson.JsonObject;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import k2b.e0;

public final class g implements MusicSearchLayout$a	// class@0024de
{
    public final b a;

    public void g(b p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       g og = g.class;
       Object obj = PatchProxy.applyWithListener(null, this, og, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       k.D().w("MusicSearchHandler", "consumeCancelButtonClick: "+this.a.f.a(), objArray);
       this.a.f.e().d();
       PatchProxy.onMethodExit(og, "2");
       return this.a.f.a();
    }
    public void b(){
       if (PatchProxy.applyVoidWithListener(null, this, g.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       k.D().w("MusicSearchHandler", "onFocusChanged: ", objArray);
       this.a.f.e().a();
       PatchProxy.onMethodExit(g.class, "3");
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, g.class, "1")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       k.D().w("MusicSearchHandler", "onClearButtonClick", objArray1);
       g ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, b.class, "5")) {
          b c = ta.c;
          if (c != null && ta.f()) {
             d a = d.a;
             String str = c.a();
             String str1 = c.c();
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidThreeRefs(c, str, str1, a, d.class, "5")) {
                a.p(c, "page");
                a.p(str, "keyWord");
                a.p(str1, "ussid");
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "KEYWORD_DELETE";
                uElementPack.params = a.k().e("name", str).d("params", a.k().e("search_session_id", str1).j()).i();
                ClientEvent$AreaPackage uAreaPackage = new ClientEvent$AreaPackage();
                uAreaPackage.name = "SEARCH_BAR";
                a.h(c, uElementPack, uAreaPackage);
             }
          }
          ta.a();
          ta.l();
       }
       PatchProxy.onMethodExit(g.class, "1");
       return;
    }
}
