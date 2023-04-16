package com.kuaishou.live.audience.component.push.LiveAudiencePushFragment$1;
import java.util.HashMap;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import android.util.Pair;
import java.lang.String;
import lnc.a1;
import java.lang.Object;

public class LiveAudiencePushFragment$1 extends HashMap	// class@000bc7
{

    public void LiveAudiencePushFragment$1(){
       super();
       this.put(AudienceBizRelation.VOICE_PARTY, new Pair("normal", a1.p(R.string.arg_RES_7f105104)));
       this.put(AudienceBizRelation.VOICE_PARTY_KTV, new Pair("ktv", a1.p(R.string.arg_RES_7f1050e8)));
       this.put(AudienceBizRelation.VOICE_PARTY_THEATER, new Pair("theater", a1.p(R.string.arg_RES_7f105114)));
       this.put(AudienceBizRelation.VOICE_PARTY_GRID_CHAT, new Pair("gridchat", a1.p(R.string.arg_RES_7f1022a6)));
       this.put(AudienceBizRelation.VOICE_PARTY_TEAM_PK, new Pair("normal", a1.p(R.string.arg_RES_7f105104)));
       this.put(AudienceBizRelation.VOICE_PARTY_VIDEO, new Pair("normal", a1.p(R.string.arg_RES_7f105104)));
       this.put(AudienceBizRelation.VOICE_PARTY_CROSS_ROOM_PK, new Pair("normal", a1.p(R.string.arg_RES_7f105104)));
    }
}
