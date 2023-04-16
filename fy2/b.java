package fy2.b;
import java.lang.Object;
import xp5.i;
import k2b.e0;
import java.lang.Long;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import q2b.h$b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import java.lang.CharSequence;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.u1;

public final class b	// class@002a0e
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void a(i p0,e0 p1,Long p2,Long p3,String p4,String p5,int p6){
       b uob = b.class;
       int i = 1;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
             return;
          }
       }
       a.p(p0, "logPackageProvider");
       a.p(p1, "logPage");
       h$b uob1 = h$b.e(p6, "DEEP_AEC_EFFECT");
       b.P(LiveLogTag.LIVE_ARYA.appendTag("LiveDeepAecHelper"), "logDeepAecTaskEvent");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "DEEP_AEC_EFFECT";
       i3 oi3 = i3.f();
       if (p2 != null) {
          oi3.c("start_timestamp", p2);
       }
       if (p3 != null) {
          oi3.c("end_timestamp", p3);
       }
       if (p4 != null) {
          String str = (p4.length() > 0)? 1: null;
          if (str) {
             oi3.d("voice_nine_room_id", p4);
          }
       }
       if (p5 != null) {
          if (p5.length() <= 0) {
             i = 0;
          }
          if (i) {
             oi3.d("voice_party_pk_id", p5);
          }
       }
       uElementPack.params = oi3.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveVoicePartyPackage = p0.l3();
       uContentPack.liveStreamPackage = p0.a();
       a.o(uob1, "builder");
       uob1.h(uContentPack);
       uob1.k(uElementPack);
       u1.p0("", p1, uob1);
       return;
    }
}
