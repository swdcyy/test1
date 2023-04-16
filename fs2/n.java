package fs2.n;
import aq5.b;
import com.kuaishou.live.viewcontroller.ViewController;
import co2.f2;
import qu2.a;
import android.app.Activity;
import m91.b;
import pq5.c;
import fs2.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import fs2.n$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import rq5.a;

public final class n extends ViewController implements b	// class@0029b5
{
    public final n$a j;
    public final f2 k;
    public final a l;
    public final Activity m;
    public final b n;
    public final c o;
    public final h p;

    public void n(f2 p0,a p1,Activity p2,b p3,c p4,h p5){
       a.p(p0, "voicePartyContext");
       a.p(p1, "liveContext");
       a.p(p2, "currentActivity");
       a.p(p5, "delegate");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       this.j = new n$a(this);
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.V2(true);
       n tn = this.n;
       if (tn != null) {
          a[] uoaArray = new a[]{AudienceBizRelation.GIFT_COMBO,AudienceBizRelation.SPECIAL_ROLE};
          tn.u5(this, uoaArray);
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       n tn = this.n;
       if (tn != null) {
          a[] uoaArray = new a[]{AudienceBizRelation.GIFT_COMBO,AudienceBizRelation.SPECIAL_ROLE};
          tn.G5(this, uoaArray);
       }
       this.V2(0);
       return;
    }
    public final void V2(boolean p0){
       n to;
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, on, "6")) {
          return;
       }
       on = this.n;
       int i = 0;
       boolean b = (on != null)? on.r2(AudienceBizRelation.SPECIAL_ROLE): false;
       b.S(LiveVoicePartyLogTag.KTV.appendTag("VoicePartyKtvAudienceOrderMusicController"), "refreshApplyControlButtonStatus", "isSpecialRole", Boolean.valueOf(b));
       if (!b && p0) {
          i = 1;
       }
       if (i) {
          to = this.o;
          if (to != null) {
             to.eo(this.j);
          }
       }else {
          to = this.o;
          if (to != null) {
             to.g9(this.j);
          }
       }
       return;
    }
    public void e6(a p0,boolean p1){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, on, "3")) {
          return;
       }
       if (p0 == AudienceBizRelation.GIFT_COMBO) {
          this.V2((p1 ^ 0x01));
       }else if(p0 == AudienceBizRelation.SPECIAL_ROLE){
          this.V2(true);
       }
       return;
    }
}
