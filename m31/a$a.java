package m31.a$a;
import mm1.b;
import m31.a;
import java.lang.Object;
import aq5.d;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import p91.m;
import java.lang.Number;
import t02.a0;
import com.kuaishou.android.live.model.QLivePlayConfig;
import mm1.a;
import iw1.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;

public class a$a implements b	// class@003116
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public d A0(){
       return this.a.r;
    }
    public ClientContent$LiveStreamPackage a(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.p.a();
    }
    public long b(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.p.s();
    }
    public int c(){
       a0 e = this.a.q.e;
       if (e == null) {
          return 0;
       }
       return e.mPatternType;
    }
    public int d(){
       return a.a(this);
    }
    public String m(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.q.O.m();
    }
    public boolean v(){
       return this.a.q.h;
    }
    public ClientContent$LiveVoicePartyPackageV2 y(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.p.y();
    }
}
