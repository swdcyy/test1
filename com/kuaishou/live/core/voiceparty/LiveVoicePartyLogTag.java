package com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveVoicePartyLogTag extends Enum implements c	// class@00130d
{
    public final String mName;
    public static final LiveVoicePartyLogTag[] $VALUES;
    public static final LiveVoicePartyLogTag ANCHOR;
    public static final LiveVoicePartyLogTag ARYA;
    public static final LiveVoicePartyLogTag AUDIENCE;
    public static final LiveVoicePartyLogTag CROSS_ROOM_TEAM_PK;
    public static final LiveVoicePartyLogTag EMOJI;
    public static final LiveVoicePartyLogTag GRID_CHAT;
    public static final LiveVoicePartyLogTag KTV;
    public static final LiveVoicePartyLogTag LIVE_PREVIEW;
    public static final LiveVoicePartyLogTag MIC_SEAT;
    public static final LiveVoicePartyLogTag MIC_SEATS_MANAGE;
    public static final LiveVoicePartyLogTag MODE_SWITCH;
    public static final LiveVoicePartyLogTag OTHER;
    public static final LiveVoicePartyLogTag PORTRAIT_VIDEO;
    public static final LiveVoicePartyLogTag TEAM_PK;
    public static final LiveVoicePartyLogTag TEAM_PK_ANCHOR;
    public static final LiveVoicePartyLogTag TEAM_PK_AUDIENCE;
    public static final LiveVoicePartyLogTag THEATER;
    public static final LiveVoicePartyLogTag VIDEO_CHAT;

    static {
       LiveVoicePartyLogTag liveVoicePar = new LiveVoicePartyLogTag("ANCHOR", 0, "VoicePartyAnchor");
       LiveVoicePartyLogTag.ANCHOR = liveVoicePar;
       LiveVoicePartyLogTag liveVoicePar1 = new LiveVoicePartyLogTag("AUDIENCE", 1, "VoicePartyAudience");
       LiveVoicePartyLogTag.AUDIENCE = liveVoicePar1;
       LiveVoicePartyLogTag liveVoicePar2 = new LiveVoicePartyLogTag("ARYA", 2, "VoicePartyArya");
       LiveVoicePartyLogTag.ARYA = liveVoicePar2;
       LiveVoicePartyLogTag liveVoicePar3 = new LiveVoicePartyLogTag("MIC_SEATS_MANAGE", 3, "VoicePartyMicSeatsManage");
       LiveVoicePartyLogTag.MIC_SEATS_MANAGE = liveVoicePar3;
       LiveVoicePartyLogTag liveVoicePar4 = new LiveVoicePartyLogTag("MODE_SWITCH", 4, "VoicePartyModeSwitch");
       LiveVoicePartyLogTag.MODE_SWITCH = liveVoicePar4;
       LiveVoicePartyLogTag liveVoicePar5 = new LiveVoicePartyLogTag("TEAM_PK_ANCHOR", 5, "VoicePartyTeamPkAnchor");
       LiveVoicePartyLogTag.TEAM_PK_ANCHOR = liveVoicePar5;
       LiveVoicePartyLogTag liveVoicePar6 = new LiveVoicePartyLogTag("TEAM_PK_AUDIENCE", 6, "VoicePartyTeamPkAudience");
       LiveVoicePartyLogTag.TEAM_PK_AUDIENCE = liveVoicePar6;
       LiveVoicePartyLogTag liveVoicePar7 = new LiveVoicePartyLogTag("EMOJI", 7, "VoicePartyEmoji");
       LiveVoicePartyLogTag.EMOJI = liveVoicePar7;
       LiveVoicePartyLogTag liveVoicePar8 = new LiveVoicePartyLogTag("THEATER", 8, "VoicePartyTheater");
       LiveVoicePartyLogTag.THEATER = liveVoicePar8;
       LiveVoicePartyLogTag liveVoicePar9 = new LiveVoicePartyLogTag("TEAM_PK", 9, "VoicePartyTeamPk");
       LiveVoicePartyLogTag.TEAM_PK = liveVoicePar9;
       LiveVoicePartyLogTag liveVoicePar10 = new LiveVoicePartyLogTag("CROSS_ROOM_TEAM_PK", 10, "CrossRoomTeamPk");
       LiveVoicePartyLogTag.CROSS_ROOM_TEAM_PK = liveVoicePar10;
       LiveVoicePartyLogTag liveVoicePar11 = new LiveVoicePartyLogTag("GRID_CHAT", 11, "GridChat");
       LiveVoicePartyLogTag.GRID_CHAT = liveVoicePar11;
       LiveVoicePartyLogTag liveVoicePar12 = new LiveVoicePartyLogTag("VIDEO_CHAT", 12, "VideoChat");
       LiveVoicePartyLogTag.VIDEO_CHAT = liveVoicePar12;
       LiveVoicePartyLogTag liveVoicePar13 = liveVoicePar12;
       LiveVoicePartyLogTag liveVoicePar14 = new LiveVoicePartyLogTag("PORTRAIT_VIDEO", 13, "PortraitVideo");
       LiveVoicePartyLogTag.PORTRAIT_VIDEO = liveVoicePar14;
       LiveVoicePartyLogTag liveVoicePar15 = liveVoicePar14;
       liveVoicePar12 = new LiveVoicePartyLogTag("KTV", 14, "VoicePartyKtv");
       LiveVoicePartyLogTag.KTV = liveVoicePar12;
       LiveVoicePartyLogTag liveVoicePar16 = liveVoicePar12;
       liveVoicePar14 = new LiveVoicePartyLogTag("LIVE_PREVIEW", 15, "VoicePartyPreviewPlay");
       LiveVoicePartyLogTag.LIVE_PREVIEW = liveVoicePar14;
       LiveVoicePartyLogTag liveVoicePar17 = liveVoicePar14;
       liveVoicePar12 = new LiveVoicePartyLogTag("MIC_SEAT", 16, "MicSeat");
       LiveVoicePartyLogTag.MIC_SEAT = liveVoicePar12;
       LiveVoicePartyLogTag liveVoicePar18 = liveVoicePar12;
       liveVoicePar14 = new LiveVoicePartyLogTag("OTHER", 17, "VoiceParty");
       LiveVoicePartyLogTag.OTHER = liveVoicePar14;
       LiveVoicePartyLogTag[] liveVoicePar19 = new LiveVoicePartyLogTag[18];
       liveVoicePar19[0] = liveVoicePar;
       liveVoicePar19[1] = liveVoicePar1;
       liveVoicePar19[2] = liveVoicePar2;
       liveVoicePar19[3] = liveVoicePar3;
       liveVoicePar19[4] = liveVoicePar4;
       liveVoicePar19[5] = liveVoicePar5;
       liveVoicePar19[6] = liveVoicePar6;
       liveVoicePar19[7] = liveVoicePar7;
       liveVoicePar19[8] = liveVoicePar8;
       liveVoicePar19[9] = liveVoicePar9;
       liveVoicePar19[10] = liveVoicePar10;
       liveVoicePar19[11] = liveVoicePar11;
       liveVoicePar19[12] = liveVoicePar13;
       liveVoicePar19[13] = liveVoicePar15;
       liveVoicePar19[14] = liveVoicePar16;
       liveVoicePar19[15] = liveVoicePar17;
       liveVoicePar19[16] = liveVoicePar18;
       liveVoicePar19[17] = liveVoicePar14;
       LiveVoicePartyLogTag.$VALUES = liveVoicePar19;
    }
    public void LiveVoicePartyLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static LiveVoicePartyLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveVoicePartyLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveVoicePartyLogTag.class, p0);
    }
    public static LiveVoicePartyLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LiveVoicePartyLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveVoicePartyLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
