package i02.s;
import xp5.g;
import p91.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.live.base.service.scenetype.LiveSceneType;
import com.kwai.framework.model.user.User;
import java.lang.Number;
import lp3.e;
import lp3.c;
import lp3.b;

public class s implements g	// class@0027fc
{
    public final m b;

    public void s(m p0){
       super();
       this.b = p0;
    }
    public boolean G1(){
       Object obj = PatchProxy.apply(null, this, s.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b.u5() == LiveSceneType.Escrow)? true: false;
       return b;
    }
    public User I(){
       Object obj = PatchProxy.apply(null, this, s.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.I();
    }
    public boolean U(){
       Object obj = PatchProxy.apply(null, this, s.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.U();
    }
    public int V0(){
       Object obj = PatchProxy.apply(null, this, s.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.B0();
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public String d(){
       Object obj = PatchProxy.apply(null, this, s.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.d();
    }
    public void destroy(){
       b.b(this);
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, s.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.e();
    }
    public String getExpTag(){
       Object obj = PatchProxy.apply(null, this, s.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.i();
    }
    public String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, s.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getLiveStreamId();
    }
}
