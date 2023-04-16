package com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController$a;
import erd.g;
import com.kuaishou.live.core.voiceparty.teampk.AudienceTeamPkViewController;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.util.Objects;
import java.lang.Integer;
import co2.f2;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import qs2.a;
import e17.i;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import com.yxcorp.gifshow.util.PermissionUtils;

public final class AudienceTeamPkViewController$a implements g	// class@001917
{
    public final AudienceTeamPkViewController b;
    public final int c;

    public void AudienceTeamPkViewController$a(AudienceTeamPkViewController p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       AudienceTeamPkViewController$a uoa = AudienceTeamPkViewController$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoa, "1")) {
          if (b) {
             b = this.b;
             uoa = this.c;
             Objects.requireNonNull(b);
             AudienceTeamPkViewController uAudienceTea = AudienceTeamPkViewController.class;
             if (!PatchProxy.isSupport(uAudienceTea) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(uoa), b, uAudienceTea, "11")) {
                if (b.x.F()) {
                   b.Z(LiveVoicePartyLogTag.TEAM_PK_AUDIENCE, "requestToJoinPkError, already a guest");
                }else {
                   b.Z(LiveVoicePartyLogTag.TEAM_PK_AUDIENCE, "requestToJoinPk startRequest");
                   if (b.x.g() != 3) {
                      uAudienceTea = b.E;
                      if (uAudienceTea != null) {
                         uAudienceTea.I(uoa, b.x.g());
                      }
                   }else {
                      i.a(R.style.arg_RES_7f11066a, 0x7f102dd6);
                   }
                }
             }
          }else {
             String[] stringArray = new String[]{"android.permission.RECORD_AUDIO"};
             PermissionUtils.n(this.b.B2(), stringArray);
          }
       }
       return;
    }
}
