package com.kuaishou.live.audience.component.push.LiveAudienceBottomBarPushPresenter$1;
import java.util.HashMap;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import java.lang.Integer;
import java.lang.Object;

public class LiveAudienceBottomBarPushPresenter$1 extends HashMap	// class@000bc1
{

    public void LiveAudienceBottomBarPushPresenter$1(){
       super();
       Integer integer = Integer.valueOf(R.string.arg_RES_7f1050fe);
       this.put(AudienceBizRelation.VOICE_PARTY, integer);
       this.put(AudienceBizRelation.VOICE_PARTY_KTV, Integer.valueOf(R.string.arg_RES_7f105100));
       this.put(AudienceBizRelation.VOICE_PARTY_THEATER, Integer.valueOf(R.string.arg_RES_7f105102));
       this.put(AudienceBizRelation.VOICE_PARTY_GRID_CHAT, Integer.valueOf(R.string.arg_RES_7f1050ff));
       this.put(AudienceBizRelation.VOICE_PARTY_VIDEO, integer);
       this.put(AudienceBizRelation.VOICE_PARTY_TEAM_PK, integer);
       this.put(AudienceBizRelation.VOICE_PARTY_CROSS_ROOM_PK, integer);
    }
}
