package com.kuaishou.android.model.music.MusicType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;

public final class MusicType extends Enum	// class@000e82
{
    public final int mValue;
    public static final MusicType[] $VALUES;
    public static final MusicType BAIDU;
    public static final MusicType BGM;
    public static final MusicType COVER;
    public static final MusicType ELECTRICAL;
    public static final MusicType KARA;
    public static final MusicType LIP;
    public static final MusicType LOCAL;
    public static final MusicType ORIGINAL;
    public static final MusicType SOUNDTRACK;
    public static final MusicType TME;
    public static final MusicType UNKNOWN;

    static {
       MusicType musicType = new MusicType("UNKNOWN", 0, 0);
       MusicType.UNKNOWN = musicType;
       MusicType musicType1 = new MusicType("BGM", 1, 1);
       MusicType.BGM = musicType1;
       MusicType musicType2 = new MusicType("KARA", 2, 2);
       MusicType.KARA = musicType2;
       MusicType musicType3 = new MusicType("LIP", 3, 3);
       MusicType.LIP = musicType3;
       MusicType musicType4 = new MusicType("ELECTRICAL", 4, 4);
       MusicType.ELECTRICAL = musicType4;
       MusicType musicType5 = new MusicType("BAIDU", 5, 5);
       MusicType.BAIDU = musicType5;
       MusicType musicType6 = new MusicType("LOCAL", 6, 6);
       MusicType.LOCAL = musicType6;
       MusicType musicType7 = new MusicType("ORIGINAL", 7, 7);
       MusicType.ORIGINAL = musicType7;
       MusicType musicType8 = new MusicType("COVER", 8, 8);
       MusicType.COVER = musicType8;
       MusicType musicType9 = new MusicType("SOUNDTRACK", 9, 9);
       MusicType.SOUNDTRACK = musicType9;
       MusicType musicType10 = new MusicType("TME", 10, 11);
       MusicType.TME = musicType10;
       MusicType[] musicTypeArr = new MusicType[11];
       musicTypeArr[0] = musicType;
       musicTypeArr[1] = musicType1;
       musicTypeArr[2] = musicType2;
       musicTypeArr[3] = musicType3;
       musicTypeArr[4] = musicType4;
       musicTypeArr[5] = musicType5;
       musicTypeArr[6] = musicType6;
       musicTypeArr[7] = musicType7;
       musicTypeArr[8] = musicType8;
       musicTypeArr[9] = musicType9;
       musicTypeArr[10] = musicType10;
       MusicType.$VALUES = musicTypeArr;
    }
    public void MusicType(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static MusicType valueOf(int p0){
       MusicType[] obj;
       object oobject;
       MusicType musicType = MusicType.class;
       if (PatchProxy.isSupport(musicType)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, musicType, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = MusicType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return MusicType.ELECTRICAL;
          }
          oobject = obj[i];
          if (p0 == oobject.getValue()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static MusicType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MusicType.class, p0);
    }
    public static MusicType[] values(){
       Object obj = PatchProxy.apply(null, null, MusicType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicType.$VALUES.clone();
    }
    public int getValue(){
       return this.mValue;
    }
}
