package eu2.c;
import eu2.g;
import yx2.i;
import eu2.c$d;
import nsd.u;
import java.lang.String;
import d61.l0;
import android.app.Activity;
import qu2.a;
import co2.f2;
import ks5.c;
import lo2.b;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.pendant.VoicePartyTopicPendantView;
import android.content.Context;
import android.view.View;
import i2b.a;
import eu2.c$e;
import ks5.b;
import crd.a;
import hp2.e;
import brd.t;
import t45.d;
import brd.z;
import eu2.c$a;
import erd.g;
import crd.b;
import krd.a;
import eu2.c$b;
import eu2.e;
import com.kuaishou.live.core.voiceparty.pendant.VoicePartyTopicPendantView$b;
import eu2.c$c;
import java.lang.Long;
import java.lang.Runnable;
import android.os.Handler;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import kx2.a;
import kx2.b;
import android.view.View$OnClickListener;

public final class c extends i implements g	// class@0027f0
{
    public final VoicePartyTopicPendantView d;
    public final c$e e;
    public View$OnClickListener f;
    public final Activity g;
    public final a h;
    public final f2 i;
    public final int j;
    public final c k;
    public final b l;
    public static final l0 m;
    public static final c$d n;

    static {
       c.n = new c$d(null);
       c.m = l0.e("live.voice-party.AudienceChannelTipsShowTimes");
    }
    public void c(Activity p0,a p1,f2 p2,int p3,c p4,b p5){
       z a;
       a.p(p0, "activity");
       a.p(p1, "liveBaseContext");
       a.p(p2, "voicePartyContext");
       a.p(p4, "topPendantAssociateService");
       a.p(p5, "channelFeedService");
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
       this.j = p3;
       this.k = p4;
       this.l = p5;
       View view = PatchProxy.applyOneRefs(p0, this, c.class, "9");
       if (view != PatchProxyResult.class) {
       }else {
          View view1 = a.a(p0, R.layout.arg_RES_7f0d0e67);
          a.o(view1, "KwaiLayoutInflater\n     ¡­el_topic_layout\n        \)");
          view = view1;
       }
       this.d = view;
       c$e uoe = new c$e(this);
       this.e = uoe;
       p4.b(uoe);
       e uoe1 = p2.e();
       a.m(uoe1);
       a = d.a;
       b uob = uoe1.h().observeOn(a).subscribe(new c$a(this));
       String str = "voicePartyContext.contex\x20\x02xt.caption ?: \"\"\)\n      }\x00";
       a.o(uob, str);
       a.b(this.M(), uob);
       e uoe2 = p2.e();
       a.m(uoe2);
       b uob1 = uoe2.getMode().observeOn(a).subscribe(new c$b(this));
       a.o(uob1, str);
       a.b(this.M(), uob1);
       this.S();
       if (!PatchProxy.applyVoid(null, this, c.class, "10")) {
          view.setOnPendantClickListener(new e(this));
       }
       c$c uoc = new c$c(this);
       i oi = i.class;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(500), uoc, this, oi, "3")) {
          a.p(uoc, "action");
          this.b.postDelayed(uoc, 500);
       }
       return;
    }
    public void N(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.k.c(this.e);
       this.M().dispose();
       return;
    }
    public final String P(String p0){
       i3 obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       String str = this.i.b();
       if (str == null) {
          str = "";
       }
       obj.d("name", str);
       obj.d("type", p0);
       p0 = obj.e();
       a.o(p0, "JsonStringBuilder.newIns¡­pe\", type\)\n      .build\(\)");
       return p0;
    }
    public final String Q(int p0){
       String str;
       if (p0 != 2) {
          if (p0 != 3) {
             str = (p0 != 4)? "VOICE_PARTY": "PK";
          }else {
             str = "THEATER";
          }
       }else {
          str = "KTV";
       }
       return str;
    }
    public final void R(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       a.d(this.i, this.h.a(), this.P(this.Q(this.j)));
       return;
    }
    public final void S(){
       if (PatchProxy.applyVoid(null, this, c.class, "11")) {
          return;
       }
       this.d.setChannelForFixedStyle(b.a(this.i));
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "topic");
       this.d.b(1, p0);
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.d.b(1, null);
       return;
    }
    public void n(View$OnClickListener p0){
       this.f = p0;
    }
}
