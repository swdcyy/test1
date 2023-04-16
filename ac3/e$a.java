package ac3.e$a;
import hf3.b;
import ac3.i;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import java.util.List;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import com.kuaishou.android.live.model.Race;
import w51.a;
import d61.g;
import java.lang.Boolean;

public final class e$a extends b	// class@000067
{
    public final i B;

    public void e$a(i p0){
       this.B = p0;
       super();
    }
    public String a(){
       QCurrentUser obj = PatchProxy.apply(null, this, e$a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = QCurrentUser.me();
       a.o(obj, "QCurrentUser.me\(\)");
       String apiServiceTo = obj.getApiServiceToken();
       a.o(apiServiceTo, "QCurrentUser.me\(\).apiServiceToken");
       return apiServiceTo;
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.h();
    }
    public String c(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getExpTag();
    }
    public List d(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.j();
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getLiveStreamId();
    }
    public String f(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getLocale();
    }
    public double[] g(){
       return new double[2]{0,0};
    }
    public String h(){
       c obj = PatchProxy.apply(null, this, e$a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       String str = p0.g(obj.a());
       a.o(str, "NetworkUtils.getActiveNe¡­\(AppEnv.get\(\).appContext\)");
       return str;
    }
    public Race i(){
       Race obj = PatchProxy.apply(null, this, e$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.d() && a.s()) {
          obj = g.a();
          a.o(obj, "LiveBasicUtil.buildDebugRace\(\)");
       }else {
          obj = this.B.f();
       }
       return obj;
    }
    public String j(){
       QCurrentUser obj = PatchProxy.apply(null, this, e$a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = QCurrentUser.me();
       a.o(obj, "QCurrentUser.me\(\)");
       String id = obj.getId();
       a.o(id, "QCurrentUser.me\(\).id");
       return id;
    }
    public boolean k(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.B.i();
    }
}
