package com.kwai.feature.post.api.music.data.MusicSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MusicSource extends Enum	// class@001416
{
    public int mValue;
    public static final MusicSource[] $VALUES;
    public static final MusicSource AICUT;
    public static final MusicSource AUTO_MUSIC;
    public static final MusicSource BILLBOARD_MUSIC;
    public static final MusicSource CLOUD_MUSIC;
    public static final MusicSource DEFAULT;
    public static final MusicSource DETAIL;
    public static final MusicSource FLASH;
    public static final MusicSource LOCAL;
    public static final MusicSource MAGICFACE_OWN_MUSIC;
    public static final MusicSource MAGIC_FACE;
    public static final MusicSource PROFILE_COLLECT_TAB_MUSIC;
    public static final MusicSource PROFILE_MUSIC;
    public static final MusicSource RECOMMEND_MUSIC;
    public static final MusicSource RECORD;
    public static final MusicSource RECORD_ENTER_MUSIC_ICON;
    public static final MusicSource REC_SAME_MUSIC;
    public static final MusicSource SEARCH;
    public static final MusicSource SEARCH_FEED;
    public static final MusicSource TAG;
    public static final MusicSource TAG_MAGICFACE;
    public static final MusicSource TAG_MUSIC;
    public static final MusicSource TEMPLATE;
    public static final MusicSource TIME_ALBUM_STYLE;
    public static final MusicSource UNKNOWN;

    static {
       MusicSource musicSource = new MusicSource("UNKNOWN", 0, 0);
       MusicSource.UNKNOWN = musicSource;
       MusicSource musicSource1 = new MusicSource("CLOUD_MUSIC", 1, 1);
       MusicSource.CLOUD_MUSIC = musicSource1;
       MusicSource musicSource2 = new MusicSource("TAG", 2, 2);
       MusicSource.TAG = musicSource2;
       MusicSource musicSource3 = new MusicSource("LOCAL", 3, 3);
       MusicSource.LOCAL = musicSource3;
       MusicSource musicSource4 = new MusicSource("DETAIL", 4, 4);
       MusicSource.DETAIL = musicSource4;
       MusicSource musicSource5 = new MusicSource("RECORD", 5, 5);
       MusicSource.RECORD = musicSource5;
       MusicSource musicSource6 = new MusicSource("DEFAULT", 6, 6);
       MusicSource.DEFAULT = musicSource6;
       MusicSource musicSource7 = new MusicSource("RECOMMEND_MUSIC", 7, 7);
       MusicSource.RECOMMEND_MUSIC = musicSource7;
       MusicSource musicSource8 = new MusicSource("PROFILE_MUSIC", 8, 8);
       MusicSource.PROFILE_MUSIC = musicSource8;
       MusicSource musicSource9 = new MusicSource("PROFILE_COLLECT_TAB_MUSIC", 9, 9);
       MusicSource.PROFILE_COLLECT_TAB_MUSIC = musicSource9;
       MusicSource musicSource10 = new MusicSource("BILLBOARD_MUSIC", 10, 10);
       MusicSource.BILLBOARD_MUSIC = musicSource10;
       MusicSource musicSource11 = new MusicSource("SEARCH_FEED", 11, 11);
       MusicSource.SEARCH_FEED = musicSource11;
       MusicSource musicSource12 = new MusicSource("MAGIC_FACE", 12, 12);
       MusicSource.MAGIC_FACE = musicSource12;
       MusicSource musicSource13 = new MusicSource("AUTO_MUSIC", 13, 13);
       MusicSource.AUTO_MUSIC = musicSource13;
       MusicSource musicSource14 = musicSource13;
       MusicSource musicSource15 = new MusicSource("TAG_MUSIC", 14, 14);
       MusicSource.TAG_MUSIC = musicSource15;
       MusicSource musicSource16 = musicSource15;
       MusicSource musicSource17 = new MusicSource("TAG_MAGICFACE", 15, 15);
       MusicSource.TAG_MAGICFACE = musicSource17;
       MusicSource musicSource18 = musicSource17;
       musicSource13 = new MusicSource("REC_SAME_MUSIC", 16, 16);
       MusicSource.REC_SAME_MUSIC = musicSource13;
       MusicSource musicSource19 = musicSource13;
       musicSource15 = new MusicSource("SEARCH", 17, 17);
       MusicSource.SEARCH = musicSource15;
       MusicSource musicSource20 = musicSource15;
       musicSource17 = new MusicSource("MAGICFACE_OWN_MUSIC", 18, 18);
       MusicSource.MAGICFACE_OWN_MUSIC = musicSource17;
       MusicSource musicSource21 = musicSource17;
       musicSource13 = new MusicSource("FLASH", 19, 19);
       MusicSource.FLASH = musicSource13;
       MusicSource musicSource22 = musicSource13;
       musicSource15 = new MusicSource("AICUT", 20, 20);
       MusicSource.AICUT = musicSource15;
       MusicSource musicSource23 = musicSource15;
       musicSource17 = new MusicSource("TIME_ALBUM_STYLE", 21, 21);
       MusicSource.TIME_ALBUM_STYLE = musicSource17;
       MusicSource musicSource24 = musicSource17;
       MusicSource musicSource25 = musicSource12;
       musicSource13 = new MusicSource("TEMPLATE", 22, 22);
       MusicSource.TEMPLATE = musicSource13;
       MusicSource musicSource26 = musicSource13;
       musicSource17 = new MusicSource("RECORD_ENTER_MUSIC_ICON", 23, 23);
       MusicSource.RECORD_ENTER_MUSIC_ICON = musicSource17;
       MusicSource[] musicSourceA = new MusicSource[24];
       musicSourceA[0] = musicSource;
       musicSourceA[1] = musicSource1;
       musicSourceA[2] = musicSource2;
       musicSourceA[3] = musicSource3;
       musicSourceA[4] = musicSource4;
       musicSourceA[5] = musicSource5;
       musicSourceA[6] = musicSource6;
       musicSourceA[7] = musicSource7;
       musicSourceA[8] = musicSource8;
       musicSourceA[9] = musicSource9;
       musicSourceA[10] = musicSource10;
       musicSourceA[11] = musicSource11;
       musicSourceA[12] = musicSource25;
       musicSourceA[13] = musicSource14;
       musicSourceA[14] = musicSource16;
       musicSourceA[15] = musicSource18;
       musicSourceA[16] = musicSource19;
       musicSourceA[17] = musicSource20;
       musicSourceA[18] = musicSource21;
       musicSourceA[19] = musicSource22;
       musicSourceA[20] = musicSource23;
       musicSourceA[21] = musicSource24;
       musicSourceA[22] = musicSource26;
       musicSourceA[23] = musicSource17;
       MusicSource.$VALUES = musicSourceA;
    }
    public void MusicSource(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static MusicSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MusicSource.class, p0);
    }
    public static MusicSource[] values(){
       Object obj = PatchProxy.apply(null, null, MusicSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicSource.$VALUES.clone();
    }
    public int getValue(){
       return this.mValue;
    }
}
