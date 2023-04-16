package com.kuaishou.live.core.voiceparty.teampk.stage.AudienceTeamPkStageViewController$stickerCoverInterceptor$2$a;
import fk2.b;
import com.kuaishou.live.core.voiceparty.teampk.stage.AudienceTeamPkStageViewController$stickerCoverInterceptor$2;
import java.lang.Object;
import android.graphics.Rect;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.teampk.stage.AudienceTeamPkStageViewController;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import m91.b;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPrepareContainerView;
import android.widget.RelativeLayout;

public final class AudienceTeamPkStageViewController$stickerCoverInterceptor$2$a implements b	// class@001934
{
    public final AudienceTeamPkStageViewController$stickerCoverInterceptor$2 b;

    public void AudienceTeamPkStageViewController$stickerCoverInterceptor$2$a(AudienceTeamPkStageViewController$stickerCoverInterceptor$2 p0){
       this.b = p0;
       super();
    }
    public final boolean Q0(Rect p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, AudienceTeamPkStageViewController$stickerCoverInterceptor$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.b.this$0.D.r2(AudienceBizRelation.VOICE_PARTY_TEAM_PK)) {
          return b;
       }
       obj = new int[2];
       AudienceTeamPkStageViewController.V2(this.b.this$0).getLocationInWindow(obj);
       return p0.intersects(obj[b], obj[1], (obj[b] + AudienceTeamPkStageViewController.V2(this.b.this$0).getWidth()), (obj[1] + AudienceTeamPkStageViewController.V2(this.b.this$0).getHeight()));
    }
}
