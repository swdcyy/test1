package com.yxcorp.gifshow.music.radio.backplay.MusicRadioPlayModel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MusicRadioPlayModel extends Enum	// class@00206f
{
    public static final MusicRadioPlayModel[] $VALUES;
    public static final MusicRadioPlayModel LIST;
    public static final MusicRadioPlayModel RANDOM;
    public static final MusicRadioPlayModel SINGLE;

    static {
       MusicRadioPlayModel musicRadioPl1;
       MusicRadioPlayModel[] musicRadioPl = new MusicRadioPlayModel[]{musicRadioPl1,musicRadioPl1,musicRadioPl1};
       musicRadioPl1 = new MusicRadioPlayModel("LIST", 0);
       MusicRadioPlayModel.LIST = musicRadioPl1;
       musicRadioPl1 = new MusicRadioPlayModel("SINGLE", 1);
       MusicRadioPlayModel.SINGLE = musicRadioPl1;
       musicRadioPl1 = new MusicRadioPlayModel("RANDOM", 2);
       MusicRadioPlayModel.RANDOM = musicRadioPl1;
       MusicRadioPlayModel.$VALUES = musicRadioPl;
    }
    public void MusicRadioPlayModel(String p0,int p1){
       super(p0, p1);
    }
    public static MusicRadioPlayModel valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MusicRadioPlayModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MusicRadioPlayModel.class, p0);
    }
    public static MusicRadioPlayModel[] values(){
       Object obj = PatchProxy.apply(null, null, MusicRadioPlayModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicRadioPlayModel.$VALUES.clone();
    }
}
