package com.kuaishou.live.comments.bulletin.LiveBulletinStageType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveBulletinStageType extends Enum	// class@000e3e
{
    public static final LiveBulletinStageType[] $VALUES;
    public static final LiveBulletinStageType Audio;
    public static final LiveBulletinStageType AudioChat;
    public static final LiveBulletinStageType CrossRoomPk;
    public static final LiveBulletinStageType GridChat;
    public static final LiveBulletinStageType KTV;
    public static final LiveBulletinStageType MultiLine;
    public static final LiveBulletinStageType MultiPk;
    public static final LiveBulletinStageType None;
    public static final LiveBulletinStageType PK;
    public static final LiveBulletinStageType RecruitExplain;
    public static final LiveBulletinStageType Show;
    public static final LiveBulletinStageType TeamPk;
    public static final LiveBulletinStageType Theater;
    public static final LiveBulletinStageType VideoChat;

    static {
       LiveBulletinStageType[] liveBulletin = new LiveBulletinStageType[14];
       LiveBulletinStageType liveBulletin1 = new LiveBulletinStageType("None", 0);
       LiveBulletinStageType.None = liveBulletin1;
       liveBulletin[0] = liveBulletin1;
       liveBulletin1 = new LiveBulletinStageType("Show", 1);
       LiveBulletinStageType.Show = liveBulletin1;
       liveBulletin[1] = liveBulletin1;
       liveBulletin1 = new LiveBulletinStageType("Audio", 2);
       LiveBulletinStageType.Audio = liveBulletin1;
       liveBulletin[2] = liveBulletin1;
       liveBulletin1 = new LiveBulletinStageType("PK", 3);
       LiveBulletinStageType.PK = liveBulletin1;
       liveBulletin[3] = liveBulletin1;
       liveBulletin1 = new LiveBulletinStageType("MultiPk", 4);
       LiveBulletinStageType.MultiPk = liveBulletin1;
       liveBulletin[4] = liveBulletin1;
       liveBulletin1 = new LiveBulletinStageType("MultiLine", 5);
       LiveBulletinStageType.MultiLine = liveBulletin1;
       liveBulletin[5] = liveBulletin1;
       liveBulletin1 = new LiveBulletinStageType("AudioChat", 6);
       LiveBulletinStageType.AudioChat = liveBulletin1;
       liveBulletin[6] = liveBulletin1;
       liveBulletin1 = new LiveBulletinStageType("VideoChat", 7);
       LiveBulletinStageType.VideoChat = liveBulletin1;
       liveBulletin[7] = liveBulletin1;
       liveBulletin1 = new LiveBulletinStageType("TeamPk", 8);
       LiveBulletinStageType.TeamPk = liveBulletin1;
       liveBulletin[8] = liveBulletin1;
       liveBulletin1 = new LiveBulletinStageType("CrossRoomPk", 9);
       LiveBulletinStageType.CrossRoomPk = liveBulletin1;
       liveBulletin[9] = liveBulletin1;
       liveBulletin1 = new LiveBulletinStageType("GridChat", 10);
       LiveBulletinStageType.GridChat = liveBulletin1;
       liveBulletin[10] = liveBulletin1;
       liveBulletin1 = new LiveBulletinStageType("Theater", 11);
       LiveBulletinStageType.Theater = liveBulletin1;
       liveBulletin[11] = liveBulletin1;
       liveBulletin1 = new LiveBulletinStageType("KTV", 12);
       LiveBulletinStageType.KTV = liveBulletin1;
       liveBulletin[12] = liveBulletin1;
       liveBulletin1 = new LiveBulletinStageType("RecruitExplain", 13);
       LiveBulletinStageType.RecruitExplain = liveBulletin1;
       liveBulletin[13] = liveBulletin1;
       LiveBulletinStageType.$VALUES = liveBulletin;
    }
    public void LiveBulletinStageType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveBulletinStageType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveBulletinStageType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveBulletinStageType.class, p0);
    }
    public static LiveBulletinStageType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveBulletinStageType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveBulletinStageType.$VALUES.clone();
    }
}
