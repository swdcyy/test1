package fp2.b;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager;
import hf3.a;
import msd.a;
import java.lang.String;
import hp2.m;
import fp2.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.System;
import hp2.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import hp2.c$a;
import hp2.c$b;
import hp2.c$c;
import hp2.c$d;
import java.util.Objects;
import java.lang.Long;
import java.lang.Integer;
import k2b.e0;
import qu2.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xs2.m;
import bw2.a;
import co2.f2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTeamPkPackage;
import np2.a;
import np2.j;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import yx2.n;
import yx2.n$a;
import kotlin.NoWhenBranchMatchedException;

public final class b extends TeamPkManager	// class@00299b
{
    public long i;
    public final LiveVoicePartyLogTag j;
    public final a k;

    public void b(a p0,a p1,String p2,m p3,a p4){
       a.p(p0, "longConnection");
       a.p(p1, "liveStreamIdFetcher");
       a.p(p2, "voicePartyId");
       a.p(p3, "param");
       a.p(p4, "logger");
       super(p0, p1, p2, p3);
       this.k = p4;
       this.j = LiveVoicePartyLogTag.TEAM_PK_AUDIENCE;
       this.i = System.currentTimeMillis();
    }
    public LiveVoicePartyLogTag d(){
       return this.j;
    }
    public void e(c p0){
       int i2;
       a b;
       ClientContent$LiveVoicePartyTeamPkPackage liveVoicePar;
       a uoa1;
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar1;
       n$a uoa2;
       Object obj = this;
       ClientEvent$ResultPackage obj1 = p0;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, uob, "1")) {
          return;
       }
       a.p(obj1, "reason");
       super.e(p0);
       b k = obj.k;
       b i = obj.i;
       long l = System.currentTimeMillis();
       e0 obj2 = PatchProxy.applyOneRefs(obj1, obj, uob, "2");
       int i1 = 2;
       if (obj2 != PatchProxyResult.class) {
          i2 = obj2.intValue();
       }else if(a.g(obj1, c$a.d)){
          i2 = 4;
       }else if(a.g(obj1, c$b.d)){
          i2 = 3;
       }else if(a.g(obj1, c$c.d)){
          i2 = 1;
       }else if(a.g(obj1, c$d.d)){
          i2 = 2;
       }else {
          throw new NoWhenBranchMatchedException();
       }
       Objects.requireNonNull(k);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Long.valueOf(i), Long.valueOf(l), Integer.valueOf(i2), k, a.class, "1")) {
          obj2 = k.a.c();
          ClientContent$LiveStreamPackage liveStreamPa = k.a.a();
          b = k.b;
          m om = k.c.invoke();
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             Object[] objArray = new Object[]{obj2,liveStreamPa,b,Long.valueOf(i),Long.valueOf(l),Integer.valueOf(i2),om};
             if (!PatchProxy.applyVoid(objArray, null, uoa, "6")) {
             }
          }else {
          }
       }
    label_0127 :
       return;
    }
}
