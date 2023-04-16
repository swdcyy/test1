package ft2.h;
import yx2.i;
import ft2.h$b;
import nsd.u;
import android.app.Activity;
import androidx.fragment.app.c;
import qu2.a;
import co2.f2;
import hf3.a;
import qs2.a;
import com.kuaishou.live.core.voiceparty.h;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wa1.h;
import ft2.h$a;
import com.kuaishou.livestream.message.nano.SCMicSeatsInvitationInfo;
import java.lang.Class;
import lf3.g;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import z12.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Number;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import qs2.r;
import java.lang.CharSequence;
import android.text.TextUtils;
import brd.t;
import com.kuaishou.live.core.voiceparty.d0;
import brd.x;
import ft2.h$c;
import erd.g;
import crd.b;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import ft2.h$d;
import ft2.h$e;

public final class h extends i	// class@0029cf
{
    public final h d;
    public boolean e;
    public VoicePartyAudienceInvitationDialog f;
    public AudienceBeingInvitedBottomPanel g;
    public final Activity h;
    public final c i;
    public final a j;
    public final f2 k;
    public final a l;
    public final h m;
    public final MicSeatsDataManager n;
    public static final h$b o;

    static {
       h.o = new h$b(null);
    }
    public void h(Activity p0,c p1,a p2,f2 p3,a p4,a p5,h p6,MicSeatsDataManager p7){
       a.p(p0, "activity");
       a.p(p1, "fragmentManager");
       a.p(p2, "liveBaseContext");
       a.p(p3, "voicePartyContext");
       a.p(p4, "longConnection");
       a.p(p7, "micSeatsDataManager");
       super();
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.k = p3;
       this.l = p5;
       this.m = p6;
       this.n = p7;
       h oh = new h(p4);
       this.d = oh;
       oh.a(440, SCMicSeatsInvitationInfo.class, new h$a(this));
    }
    public void N(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.d.b();
       x.E(this.f);
       f.a(this.g);
       return;
    }
    public final int P(int p0){
       Object obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "9");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       oh = this.n;
       Objects.requireNonNull(oh);
       MicSeatsDataManager micSeatsData = MicSeatsDataManager.class;
       int i = 0;
       if (PatchProxy.isSupport(micSeatsData)) {
          Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), oh, micSeatsData, "13");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else if(oh.m.h() != 5){
             Iterator iterator = oh.a.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   obj = iterator.next();
                   Object obj2 = (obj.mId == p0)? 1: null;
                   if (!obj2) {
                      continue ;
                   }
                }else {
                   obj = null;
                }
                if (obj != null) {
                   if (r.c(obj.mMicSeatTypes)) {
                      i = 2;
                      break ;
                   }else if(r.h(obj.mMicSeatTypes)){
                      i = 1;
                      break ;
                   }
                }
             }
          }
       }else {
          goto label_003e ;
       }
       return i;
    }
    public final void Q(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "7")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       h tm = this.m;
       if (tm != null) {
          tm.a(p0);
       }
       return;
    }
    public final void R(SCMicSeatsInvitationInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "4")) {
          return;
       }
       d0.a(this.h).compose(this.L()).subscribe(new h$c(this, p0), d0.s("VoicePartyAudienceMicInvitation", "onReceiveInvitation"));
       return;
    }
    public final void S(SCMicSeatsInvitationInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "6")) {
          return;
       }
       a uoa = LiveVoicePartyApi.b();
       String liveStreamId = this.j.getLiveStreamId();
       String str = this.k.y();
       boolean b = (p0.invitationType == 2)? true: false;
       uoa.y(liveStreamId, str, b).compose(this.L()).subscribe(h$d.b, h$e.b);
       return;
    }
    public final void T(){
       if (PatchProxy.applyVoid(null, this, h.class, "8")) {
          return;
       }
       if (this.k.g() == 2) {
          h tl = this.l;
          if (tl != null) {
             tl.p();
          }
       }
       return;
    }
}
