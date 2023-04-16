package m11.l;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import w12.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import t02.a0;
import p91.m;
import java.lang.CharSequence;
import android.text.TextUtils;
import no1.j;
import m11.c;
import java.lang.Iterable;
import z1.a;
import qo1.a;
import android.app.Activity;
import d61.y;
import oq5.b;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatReady;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.util.Objects;
import oo1.a;
import java.lang.Number;
import android.os.SystemClock;
import java.lang.Math;
import na2.a;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import q2b.h$b;
import k2b.e0;
import k2b.u1;

public class l	// class@003105
{
    public final Collection a;
    public a0 b;
    public j c;
    public a d;
    public p e;
    public boolean f;
    public boolean g;
    public Activity h;

    public void l(List p0){
       super();
       this.f = false;
       this.g = false;
       this.a = p0;
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "8")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_LINE, "endLine", "reason", p0);
       this.d.n(2);
       return;
    }
    public final boolean b(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       l ol = l.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, ol, "9");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       String str = PatchProxy.apply(null, this, ol, "4");
       if (str != patchProxyRe) {
       }else {
          str = this.b.Z2.getLiveStreamId();
       }
       return TextUtils.equals(str, p0);
    }
    public void c(){
       l ol = l.class;
       if (PatchProxy.applyVoid(null, this, ol, "5")) {
          return;
       }
       if (this.f != null && this.c.f != null) {
          a.b(this.a, c.a);
          this.d.o(1, this.c.f);
          if (y.d(this.h) && !PatchProxy.applyVoid(null, this, ol, "6")) {
             a0 p1 = this.b.p1;
             if (p1 != null) {
                p1.d();
             }
          }
       }
       return;
    }
    public void d(String p0){
       long l;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "11")) {
          return;
       }
       if (this.g == null) {
          l tc = this.c;
          j f = tc.f;
          if (f != null && f.counterpartAuthor != null) {
             j g = tc.g;
             BaseFragment uBaseFragmen = this.b.Z2.b();
             ClientContent$LiveStreamPackage liveStreamPa = this.b.Z2.a();
             l tc1 = this.c;
             j b = tc1.b;
             UserInfos$UserInfo userId = tc1.f.counterpartAuthor.userId;
             Objects.requireNonNull(g);
             Object[] objArray = null;
             Object[] obj = PatchProxy.apply(objArray, g, a.class, "4");
             l = (obj != PatchProxyResult.class)? obj.longValue(): Math.max((SystemClock.elapsedRealtime() - g.c), 0);
             a uoa = a.class;
             if (PatchProxy.isSupport(uoa)) {
                obj = new Object[]{uBaseFragmen,liveStreamPa,b,Long.valueOf(userId),p0,Long.valueOf(l)};
                if (PatchProxy.applyVoid(obj, objArray, uoa, "1")) {
                label_00cf :
                   this.g = true;
                }
             }
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LIVE_ONLINE_PLAY";
             i3 oi3 = i3.f();
             oi3.d("linechat_id", b);
             oi3.c("author_id", Long.valueOf(userId));
             oi3.d("end_reason", p0);
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
             resultPackag.timeCost = l;
             h$b uob = h$b.e(10, "LIVE_ONLINE_PLAY");
             uob.k(uElementPack);
             uob.q(resultPackag);
             uob.h(uContentPack);
             u1.p0("", uBaseFragmen, uob);
             goto label_00cf ;
          }
       }
       return;
    }
}
