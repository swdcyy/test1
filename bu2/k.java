package bu2.k;
import au2.b;
import bu2.l;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import java.lang.Object;
import au2.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ss2.f;
import ss2.g;
import co2.f2;
import co2.q1;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import y8c.g;
import java.lang.Boolean;
import java.lang.Integer;
import bu2.j;
import z1.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import k2b.e0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import qvb.i;

public class k implements b	// class@00045e
{
    public final VoicePartyMicSeatData a;
    public final int b;
    public final l c;

    public void k(l p0,VoicePartyMicSeatData p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(){
       a.e(this);
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "3")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.c.a9();
       l y = this.c.y;
       k ta = this.a;
       f uof = (ta != null)? g.a(ta): null;
       q1.y(liveStreamPa, y, uof, p0);
       return;
    }
    public void c(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.c.e9(p0, 89);
       return;
    }
    public void d(VoicePartyOnlineUser p0,boolean p1,g p2,int p3){
       a.a(this, p0, p1, p2, p3);
    }
    public void e(){
    }
    public void f(VoicePartyOnlineUser p0,boolean p1,g p2,int p3){
       int this;
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, Integer.valueOf(p3), this, k.class, "1")) {
          return;
       }
       this.c.d9(this.a, p0.mApplyUserInfo.mId, this.b, new j(p2, p0));
       this = (p1)? 2: 1;
       k tc = this.c;
       Objects.requireNonNull(tc);
       p2 = PatchProxy.apply(null, tc, l.class, "17");
       BaseFragment uBaseFragmen = (p2 != PatchProxyResult.class)? p2: tc.x.b();
       q1.u(uBaseFragmen, this.c.a9(), this.c.y, this.a, p0.mApplyUserInfo.mId, this);
       return;
    }
    public void g(boolean p0){
       a.c(this, p0);
    }
    public void h(i p0){
       a.f(this, p0);
    }
}
