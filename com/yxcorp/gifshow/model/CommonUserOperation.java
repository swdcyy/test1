package com.yxcorp.gifshow.model.CommonUserOperation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CommonUserOperation extends Enum	// class@001df7
{
    public final String mOperation;
    public static final CommonUserOperation[] $VALUES;
    public static final CommonUserOperation COLLECT;
    public static final CommonUserOperation COMMENT;
    public static final CommonUserOperation COMMENT_PANEL;
    public static final CommonUserOperation DECLINE_10;
    public static final CommonUserOperation DOWNLOAD;
    public static final CommonUserOperation ENTER_PROFILE;
    public static final CommonUserOperation LIKE;
    public static final CommonUserOperation PHOTO_NEGATIVE;
    public static final CommonUserOperation PHOTO_SHORT_PLAY_3000;
    public static final CommonUserOperation PLAY_END;
    public static final CommonUserOperation PLAY_PHOTO;
    public static final CommonUserOperation SHARE;
    public static final CommonUserOperation UN_FOLLOW_CLICK_AND_RETURN;

    static {
       CommonUserOperation uCommonUserO = new CommonUserOperation("LIKE", 0, "LIKE");
       CommonUserOperation.LIKE = uCommonUserO;
       CommonUserOperation uCommonUserO1 = new CommonUserOperation("COMMENT", 1, "COMMENT");
       CommonUserOperation.COMMENT = uCommonUserO1;
       CommonUserOperation uCommonUserO2 = new CommonUserOperation("PLAY_END", 2, "PLAY_END");
       CommonUserOperation.PLAY_END = uCommonUserO2;
       CommonUserOperation uCommonUserO3 = new CommonUserOperation("COLLECT", 3, "COLLECT");
       CommonUserOperation.COLLECT = uCommonUserO3;
       CommonUserOperation uCommonUserO4 = new CommonUserOperation("SHARE", 4, "SHARE");
       CommonUserOperation.SHARE = uCommonUserO4;
       CommonUserOperation uCommonUserO5 = new CommonUserOperation("DOWNLOAD", 5, "DOWNLOAD");
       CommonUserOperation.DOWNLOAD = uCommonUserO5;
       CommonUserOperation uCommonUserO6 = new CommonUserOperation("PHOTO_SHORT_PLAY_3000", 6, "PHOTO_SHORT_PLAY_3000");
       CommonUserOperation.PHOTO_SHORT_PLAY_3000 = uCommonUserO6;
       CommonUserOperation uCommonUserO7 = new CommonUserOperation("UN_FOLLOW_CLICK_AND_RETURN", 7, "UN_FOLLOW_CLICK_AND_RETURN");
       CommonUserOperation.UN_FOLLOW_CLICK_AND_RETURN = uCommonUserO7;
       CommonUserOperation uCommonUserO8 = new CommonUserOperation("DECLINE_10", 8, "DECLINE_10");
       CommonUserOperation.DECLINE_10 = uCommonUserO8;
       CommonUserOperation uCommonUserO9 = new CommonUserOperation("COMMENT_PANEL", 9, "COMMENT_PANEL");
       CommonUserOperation.COMMENT_PANEL = uCommonUserO9;
       CommonUserOperation uCommonUserO10 = new CommonUserOperation("PLAY_PHOTO", 10, "PLAY_PHOTO");
       CommonUserOperation.PLAY_PHOTO = uCommonUserO10;
       CommonUserOperation uCommonUserO11 = new CommonUserOperation("ENTER_PROFILE", 11, "ENTER_PROFILE");
       CommonUserOperation.ENTER_PROFILE = uCommonUserO11;
       CommonUserOperation uCommonUserO12 = new CommonUserOperation("PHOTO_NEGATIVE", 12, "PHOTO_NEGATIVE");
       CommonUserOperation.PHOTO_NEGATIVE = uCommonUserO12;
       CommonUserOperation[] uCommonUserO13 = new CommonUserOperation[13];
       uCommonUserO13[0] = uCommonUserO;
       uCommonUserO13[1] = uCommonUserO1;
       uCommonUserO13[2] = uCommonUserO2;
       uCommonUserO13[3] = uCommonUserO3;
       uCommonUserO13[4] = uCommonUserO4;
       uCommonUserO13[5] = uCommonUserO5;
       uCommonUserO13[6] = uCommonUserO6;
       uCommonUserO13[7] = uCommonUserO7;
       uCommonUserO13[8] = uCommonUserO8;
       uCommonUserO13[9] = uCommonUserO9;
       uCommonUserO13[10] = uCommonUserO10;
       uCommonUserO13[11] = uCommonUserO11;
       uCommonUserO13[12] = uCommonUserO12;
       CommonUserOperation.$VALUES = uCommonUserO13;
    }
    public void CommonUserOperation(String p0,int p1,String p2){
       super(p0, p1);
       this.mOperation = p2;
    }
    public static CommonUserOperation valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CommonUserOperation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CommonUserOperation.class, p0);
    }
    public static CommonUserOperation[] values(){
       Object obj = PatchProxy.apply(null, null, CommonUserOperation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CommonUserOperation.$VALUES.clone();
    }
    public String value(){
       return this.mOperation;
    }
}
