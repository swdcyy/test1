package com.kuaishou.live.core.voiceparty.bottombar.InnerMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Integer;
import java.util.List;
import com.kuaishou.live.bottombarapi.LiveAnchorBottomBarId;
import java.lang.Object;
import kotlin.collections.CollectionsKt__CollectionsKt;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class InnerMode extends Enum	// class@00136a
{
    public final List buttons;
    public final Integer frontCoreMode;
    public static final InnerMode[] $VALUES;
    public static final InnerMode CROSS_ROOM_PK_INVITING;
    public static final InnerMode KTV_SINGING;
    public static final InnerMode NONE;

    static {
       InnerMode innerMode;
       LiveAnchorBottomBarId fUNCTION_ITE;
       LiveAnchorBottomBarId fUNCTION_ITE1;
       LiveAnchorBottomBarId fUNCTION_ITE2;
       LiveAnchorBottomBarId fUNCTION_ITE3;
       InnerMode[] innerModeArr = new InnerMode[]{innerMode,innerMode,innerMode};
       innerMode = new InnerMode("NONE", 0, null, null);
       InnerMode.NONE = innerMode;
       LiveAnchorBottomBarId[] liveAnchorBo = new LiveAnchorBottomBarId[]{LiveAnchorBottomBarId.FUNCTION_ITEM_ID_VOICE_PARTY_CROSS_ROOM_PK_WAITING,fUNCTION_ITE,fUNCTION_ITE1,fUNCTION_ITE2,fUNCTION_ITE3};
       fUNCTION_ITE = LiveAnchorBottomBarId.FUNCTION_ITEM_ID_VOICE_PARTY_MIC_INVITE;
       fUNCTION_ITE1 = LiveAnchorBottomBarId.FUNCTION_ITEM_ID_VOICE_PARTY_MUTE;
       fUNCTION_ITE2 = LiveAnchorBottomBarId.FUNCTION_ITEM_ID_GIFT;
       fUNCTION_ITE3 = LiveAnchorBottomBarId.FUNCTION_ITEM_ID_MORE;
       innerMode = new InnerMode("CROSS_ROOM_PK_INVITING", 1, Integer.valueOf(3), CollectionsKt__CollectionsKt.L(liveAnchorBo));
       InnerMode.CROSS_ROOM_PK_INVITING = innerMode;
       liveAnchorBo = new LiveAnchorBottomBarId[12];
       liveAnchorBo[0] = LiveAnchorBottomBarId.FUNCTION_ITEM_ID_VOICE_PARTY_PLAY_AGGREGATION;
       liveAnchorBo[1] = fUNCTION_ITE;
       liveAnchorBo[2] = LiveAnchorBottomBarId.FUNCTION_ITEM_ID_VOICE_PARTY_DECORATION;
       liveAnchorBo[3] = fUNCTION_ITE1;
       liveAnchorBo[4] = fUNCTION_ITE2;
       liveAnchorBo[5] = fUNCTION_ITE3;
       liveAnchorBo[6] = LiveAnchorBottomBarId.FEATURE_ITEM_ID_VOICE_PARTY_PLAY_TYPE_SIX_AUDIO;
       liveAnchorBo[7] = LiveAnchorBottomBarId.FEATURE_ITEM_ID_VOICE_PARTY_PLAY_TYPE_SIX_VIDEO;
       liveAnchorBo[8] = LiveAnchorBottomBarId.FEATURE_ITEM_ID_VOICE_PARTY_PLAY_TYPE_GRID_CHAT;
       liveAnchorBo[9] = LiveAnchorBottomBarId.FEATURE_ITEM_ID_VOICE_PARTY_PLAY_TYPE_KTV;
       liveAnchorBo[10] = LiveAnchorBottomBarId.FEATURE_ITEM_ID_VOICE_PARTY_PLAY_TYPE_THEATER;
       liveAnchorBo[11] = LiveAnchorBottomBarId.FEATURE_ITEM_ID_VOICE_PARTY_PLAY_TYPE_TEAM_PK;
       innerMode = new InnerMode("KTV_SINGING", 2, Integer.valueOf(1), CollectionsKt__CollectionsKt.L(liveAnchorBo));
       InnerMode.KTV_SINGING = innerMode;
       InnerMode.$VALUES = innerModeArr;
    }
    public void InnerMode(String p0,int p1,Integer p2,List p3){
       super(p0, p1);
       this.frontCoreMode = p2;
       this.buttons = p3;
    }
    public void InnerMode(String p0,int p1,Integer p2,List p3,int p4,u p5){
       if (p4 & 0x01) {
          p2 = null;
       }
       if (p4 & 0x02) {
          p3 = CollectionsKt__CollectionsKt.E();
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static InnerMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, InnerMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(InnerMode.class, p0);
    }
    public static InnerMode[] values(){
       Object obj = PatchProxy.apply(null, null, InnerMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return InnerMode.$VALUES.clone();
    }
    public final List getButtons(){
       return this.buttons;
    }
    public final Integer getFrontCoreMode(){
       return this.frontCoreMode;
    }
}
