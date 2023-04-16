package qu2.e;
import qu2.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import com.kuaishou.android.live.model.Race;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.google.gson.JsonObject;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;

public class e implements a	// class@003ecc
{
    public final a a;

    public void e(a p0){
       a.p(p0, "wrapper");
       super();
       this.a = p0;
    }
    public int B0(){
       Object obj = PatchProxy.apply(null, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.B0();
    }
    public boolean U(){
       Object obj = PatchProxy.apply(null, this, e.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.U();
    }
    public ClientContent$LiveStreamPackage a(){
       Object obj = PatchProxy.apply(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.a();
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.b();
    }
    public e0 c(){
       Object obj = PatchProxy.apply(null, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.c();
    }
    public String d(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.d();
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, e.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.e();
    }
    public Race f(){
       Object obj = PatchProxy.apply(null, this, e.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.f();
    }
    public String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getLiveStreamId();
    }
    public LiveStreamFeed j0(){
       Object obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.j0();
    }
    public JsonObject q1(){
       Object obj = PatchProxy.apply(null, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.q1();
    }
    public String q5(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.q5();
    }
    public ClientContent$LiveVoicePartyPackageV2 y(){
       Object obj = PatchProxy.apply(null, this, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.y();
    }
}
