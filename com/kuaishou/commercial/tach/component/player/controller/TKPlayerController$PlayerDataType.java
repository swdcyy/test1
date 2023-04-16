package com.kuaishou.commercial.tach.component.player.controller.TKPlayerController$PlayerDataType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TKPlayerController$PlayerDataType extends Enum	// class@001670
{
    public static final TKPlayerController$PlayerDataType[] $VALUES;
    public static final TKPlayerController$PlayerDataType ASSET;
    public static final TKPlayerController$PlayerDataType FILE_PATH;
    public static final TKPlayerController$PlayerDataType Q_PHOTO;
    public static final TKPlayerController$PlayerDataType URL;

    static {
       TKPlayerController$PlayerDataType playerDataTy = new TKPlayerController$PlayerDataType("Q_PHOTO", 0);
       TKPlayerController$PlayerDataType.Q_PHOTO = playerDataTy;
       TKPlayerController$PlayerDataType playerDataTy1 = new TKPlayerController$PlayerDataType("URL", 1);
       TKPlayerController$PlayerDataType.URL = playerDataTy1;
       TKPlayerController$PlayerDataType playerDataTy2 = new TKPlayerController$PlayerDataType("FILE_PATH", 2);
       TKPlayerController$PlayerDataType.FILE_PATH = playerDataTy2;
       TKPlayerController$PlayerDataType playerDataTy3 = new TKPlayerController$PlayerDataType("ASSET", 3);
       TKPlayerController$PlayerDataType.ASSET = playerDataTy3;
       TKPlayerController$PlayerDataType[] playerDataTy4 = new TKPlayerController$PlayerDataType[]{playerDataTy,playerDataTy1,playerDataTy2,playerDataTy3};
       TKPlayerController$PlayerDataType.$VALUES = playerDataTy4;
    }
    public void TKPlayerController$PlayerDataType(String p0,int p1){
       super(p0, p1);
    }
    public static TKPlayerController$PlayerDataType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TKPlayerController$PlayerDataType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TKPlayerController$PlayerDataType.class, p0);
    }
    public static TKPlayerController$PlayerDataType[] values(){
       Object obj = PatchProxy.apply(null, null, TKPlayerController$PlayerDataType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TKPlayerController$PlayerDataType.$VALUES.clone();
    }
}
