package com.yxcorp.gifshow.music.utils.CloudMusicViewFactory$ElementType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CloudMusicViewFactory$ElementType extends Enum	// class@002088
{
    public static final CloudMusicViewFactory$ElementType[] $VALUES;
    public static final CloudMusicViewFactory$ElementType BILLBOARD;
    public static final CloudMusicViewFactory$ElementType DELETE;
    public static final CloudMusicViewFactory$ElementType FAVORITE;
    public static final CloudMusicViewFactory$ElementType OFFLINE;
    public static final CloudMusicViewFactory$ElementType RETRY;
    public static final CloudMusicViewFactory$ElementType SCISSORS;
    public static final CloudMusicViewFactory$ElementType TAG;

    static {
       CloudMusicViewFactory$ElementType uElementType = new CloudMusicViewFactory$ElementType("FAVORITE", 0);
       CloudMusicViewFactory$ElementType.FAVORITE = uElementType;
       CloudMusicViewFactory$ElementType uElementType1 = new CloudMusicViewFactory$ElementType("SCISSORS", 1);
       CloudMusicViewFactory$ElementType.SCISSORS = uElementType1;
       CloudMusicViewFactory$ElementType uElementType2 = new CloudMusicViewFactory$ElementType("DELETE", 2);
       CloudMusicViewFactory$ElementType.DELETE = uElementType2;
       CloudMusicViewFactory$ElementType uElementType3 = new CloudMusicViewFactory$ElementType("OFFLINE", 3);
       CloudMusicViewFactory$ElementType.OFFLINE = uElementType3;
       CloudMusicViewFactory$ElementType uElementType4 = new CloudMusicViewFactory$ElementType("RETRY", 4);
       CloudMusicViewFactory$ElementType.RETRY = uElementType4;
       CloudMusicViewFactory$ElementType uElementType5 = new CloudMusicViewFactory$ElementType("BILLBOARD", 5);
       CloudMusicViewFactory$ElementType.BILLBOARD = uElementType5;
       CloudMusicViewFactory$ElementType uElementType6 = new CloudMusicViewFactory$ElementType("TAG", 6);
       CloudMusicViewFactory$ElementType.TAG = uElementType6;
       CloudMusicViewFactory$ElementType[] uElementType7 = new CloudMusicViewFactory$ElementType[]{uElementType,uElementType1,uElementType2,uElementType3,uElementType4,uElementType5,uElementType6};
       CloudMusicViewFactory$ElementType.$VALUES = uElementType7;
    }
    public void CloudMusicViewFactory$ElementType(String p0,int p1){
       super(p0, p1);
    }
    public static CloudMusicViewFactory$ElementType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CloudMusicViewFactory$ElementType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CloudMusicViewFactory$ElementType.class, p0);
    }
    public static CloudMusicViewFactory$ElementType[] values(){
       Object obj = PatchProxy.apply(null, null, CloudMusicViewFactory$ElementType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CloudMusicViewFactory$ElementType.$VALUES.clone();
    }
}
