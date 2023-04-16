package com.yxcorp.gifshow.share.OperationModel$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class OperationModel$Type extends Enum	// class@001b58
{
    public static final OperationModel$Type[] $VALUES;
    public static final OperationModel$Type COLLECT;
    public static final OperationModel$Type COMMON_SHARE;
    public static final OperationModel$Type GROUP_CODE_SHARE;
    public static final OperationModel$Type H5;
    public static final OperationModel$Type IMAGE;
    public static final OperationModel$Type LIVE_PLAY;
    public static final OperationModel$Type LIVE_PUSH;
    public static final OperationModel$Type MULTI_PHOTO;
    public static final OperationModel$Type PAGE;
    public static final OperationModel$Type PHOTO;
    public static final OperationModel$Type PHOTO_COMMENT;
    public static final OperationModel$Type POI;
    public static final OperationModel$Type PROFILE;
    public static final OperationModel$Type PUBLIC_GROUP;
    public static final OperationModel$Type QR_CODE_PROFILE;
    public static final OperationModel$Type SHARE_MERCHANT;
    public static final OperationModel$Type SHARE_USER_GROUP;

    static {
       OperationModel$Type[] typeArray = new OperationModel$Type[17];
       OperationModel$Type type = new OperationModel$Type("PHOTO", 0);
       OperationModel$Type.PHOTO = type;
       typeArray[0] = type;
       type = new OperationModel$Type("PROFILE", 1);
       OperationModel$Type.PROFILE = type;
       typeArray[1] = type;
       type = new OperationModel$Type("LIVE_PLAY", 2);
       OperationModel$Type.LIVE_PLAY = type;
       typeArray[2] = type;
       type = new OperationModel$Type("LIVE_PUSH", 3);
       OperationModel$Type.LIVE_PUSH = type;
       typeArray[3] = type;
       type = new OperationModel$Type("IMAGE", 4);
       OperationModel$Type.IMAGE = type;
       typeArray[4] = type;
       type = new OperationModel$Type("COLLECT", 5);
       OperationModel$Type.COLLECT = type;
       typeArray[5] = type;
       type = new OperationModel$Type("PAGE", 6);
       OperationModel$Type.PAGE = type;
       typeArray[6] = type;
       type = new OperationModel$Type("GROUP_CODE_SHARE", 7);
       OperationModel$Type.GROUP_CODE_SHARE = type;
       typeArray[7] = type;
       type = new OperationModel$Type("H5", 8);
       OperationModel$Type.H5 = type;
       typeArray[8] = type;
       type = new OperationModel$Type("POI", 9);
       OperationModel$Type.POI = type;
       typeArray[9] = type;
       type = new OperationModel$Type("SHARE_USER_GROUP", 10);
       OperationModel$Type.SHARE_USER_GROUP = type;
       typeArray[10] = type;
       type = new OperationModel$Type("MULTI_PHOTO", 11);
       OperationModel$Type.MULTI_PHOTO = type;
       typeArray[11] = type;
       type = new OperationModel$Type("COMMON_SHARE", 12);
       OperationModel$Type.COMMON_SHARE = type;
       typeArray[12] = type;
       type = new OperationModel$Type("SHARE_MERCHANT", 13);
       OperationModel$Type.SHARE_MERCHANT = type;
       typeArray[13] = type;
       type = new OperationModel$Type("PUBLIC_GROUP", 14);
       OperationModel$Type.PUBLIC_GROUP = type;
       typeArray[14] = type;
       type = new OperationModel$Type("PHOTO_COMMENT", 15);
       OperationModel$Type.PHOTO_COMMENT = type;
       typeArray[15] = type;
       type = new OperationModel$Type("QR_CODE_PROFILE", 16);
       OperationModel$Type.QR_CODE_PROFILE = type;
       typeArray[16] = type;
       OperationModel$Type.$VALUES = typeArray;
    }
    public void OperationModel$Type(String p0,int p1){
       super(p0, p1);
    }
    public static OperationModel$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, OperationModel$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(OperationModel$Type.class, p0);
    }
    public static OperationModel$Type[] values(){
       Object obj = PatchProxy.apply(null, null, OperationModel$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return OperationModel$Type.$VALUES.clone();
    }
}
