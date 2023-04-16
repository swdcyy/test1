package hd2.h;
import java.lang.Object;
import com.kuaishou.live.core.show.pk.model.LivePkConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.y;
import mrd.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCPkStart;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import hd2.l0;

public class h	// class@002d65
{
    public String a;
    public String b;
    public UserInfo c;
    public List d;
    public String e;
    public LivePkConfig f;
    public c g;
    public LivePkResult h;
    public String i;
    public boolean j;
    public int k;
    public boolean l;
    public long m;
    public long n;
    public String o;
    public LiveStreamMessages$SCPkStart p;
    public LiveStreamMessages$SCPkInvitation q;
    public int r;
    public int s;
    public LiveStreamMessages$SCPkStatistic t;
    public List u;
    public int v;
    public LivePkMessages$PkTopScoreUserDetailInfo[] w;
    public long x;
    public long y;

    public void h(){
       super();
       this.r = 1;
       this.v = -1;
       this.y = -1;
       this.f = new LivePkConfig();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       h tg = this.g;
       if (tg != null) {
          tg.onComplete();
       }
       this.g = a.g();
       return;
    }
    public boolean b(){
       h tp = this.p;
       boolean b = (tp != null && tp.pkType == 9)? true: false;
       return b;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.r != 4) {
          return false;
       }
       return l0.f(this.s);
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.r != 3) {
          return false;
       }
       return l0.f(this.s);
    }
}
