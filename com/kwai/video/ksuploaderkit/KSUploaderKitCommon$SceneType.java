package com.kwai.video.ksuploaderkit.KSUploaderKitCommon$SceneType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSUploaderKitCommon$SceneType extends Enum	// class@00096e
{
    public String mValue;
    public static final KSUploaderKitCommon$SceneType[] $VALUES;
    public static final KSUploaderKitCommon$SceneType CNY23PicUpload;
    public static final KSUploaderKitCommon$SceneType CloseTouch;
    public static final KSUploaderKitCommon$SceneType CommentPicture;
    public static final KSUploaderKitCommon$SceneType Draft;
    public static final KSUploaderKitCommon$SceneType IMSendFile;
    public static final KSUploaderKitCommon$SceneType NormalPublish;
    public static final KSUploaderKitCommon$SceneType PersonalBagVideo;
    public static final KSUploaderKitCommon$SceneType PersonalDynamicPhoto;
    public static final KSUploaderKitCommon$SceneType RePublishAfterLaunching;
    public static final KSUploaderKitCommon$SceneType RetryByUser;
    public static final KSUploaderKitCommon$SceneType SaySthVideo;
    public static final KSUploaderKitCommon$SceneType UploadLog;
    public static final KSUploaderKitCommon$SceneType VideoQualityEvaluatePublish;

    static {
       KSUploaderKitCommon$SceneType sceneType = new KSUploaderKitCommon$SceneType("NormalPublish", 0, "publish");
       KSUploaderKitCommon$SceneType.NormalPublish = sceneType;
       KSUploaderKitCommon$SceneType sceneType1 = new KSUploaderKitCommon$SceneType("Draft", 1, "draft");
       KSUploaderKitCommon$SceneType.Draft = sceneType1;
       KSUploaderKitCommon$SceneType sceneType2 = new KSUploaderKitCommon$SceneType("RePublishAfterLaunching", 2, "rePublish");
       KSUploaderKitCommon$SceneType.RePublishAfterLaunching = sceneType2;
       KSUploaderKitCommon$SceneType sceneType3 = new KSUploaderKitCommon$SceneType("RetryByUser", 3, "retryByUser");
       KSUploaderKitCommon$SceneType.RetryByUser = sceneType3;
       KSUploaderKitCommon$SceneType sceneType4 = new KSUploaderKitCommon$SceneType("PersonalBagVideo", 4, "personalBagVideo");
       KSUploaderKitCommon$SceneType.PersonalBagVideo = sceneType4;
       KSUploaderKitCommon$SceneType sceneType5 = new KSUploaderKitCommon$SceneType("SaySthVideo", 5, "saySthVideo");
       KSUploaderKitCommon$SceneType.SaySthVideo = sceneType5;
       KSUploaderKitCommon$SceneType sceneType6 = new KSUploaderKitCommon$SceneType("UploadLog", 6, "uploadLog");
       KSUploaderKitCommon$SceneType.UploadLog = sceneType6;
       KSUploaderKitCommon$SceneType sceneType7 = new KSUploaderKitCommon$SceneType("PersonalDynamicPhoto", 7, "personalDynamicPhoto");
       KSUploaderKitCommon$SceneType.PersonalDynamicPhoto = sceneType7;
       KSUploaderKitCommon$SceneType sceneType8 = new KSUploaderKitCommon$SceneType("IMSendFile", 8, "imSendFile");
       KSUploaderKitCommon$SceneType.IMSendFile = sceneType8;
       KSUploaderKitCommon$SceneType sceneType9 = new KSUploaderKitCommon$SceneType("CommentPicture", 9, "commentPicture");
       KSUploaderKitCommon$SceneType.CommentPicture = sceneType9;
       KSUploaderKitCommon$SceneType sceneType10 = new KSUploaderKitCommon$SceneType("CNY23PicUpload", 10, "CNY23PicUpload");
       KSUploaderKitCommon$SceneType.CNY23PicUpload = sceneType10;
       KSUploaderKitCommon$SceneType sceneType11 = new KSUploaderKitCommon$SceneType("CloseTouch", 11, "closeTouch");
       KSUploaderKitCommon$SceneType.CloseTouch = sceneType11;
       KSUploaderKitCommon$SceneType sceneType12 = new KSUploaderKitCommon$SceneType("VideoQualityEvaluatePublish", 12, "videoQualityEvaluate");
       KSUploaderKitCommon$SceneType.VideoQualityEvaluatePublish = sceneType12;
       KSUploaderKitCommon$SceneType[] sceneTypeArr = new KSUploaderKitCommon$SceneType[13];
       sceneTypeArr[0] = sceneType;
       sceneTypeArr[1] = sceneType1;
       sceneTypeArr[2] = sceneType2;
       sceneTypeArr[3] = sceneType3;
       sceneTypeArr[4] = sceneType4;
       sceneTypeArr[5] = sceneType5;
       sceneTypeArr[6] = sceneType6;
       sceneTypeArr[7] = sceneType7;
       sceneTypeArr[8] = sceneType8;
       sceneTypeArr[9] = sceneType9;
       sceneTypeArr[10] = sceneType10;
       sceneTypeArr[11] = sceneType11;
       sceneTypeArr[12] = sceneType12;
       KSUploaderKitCommon$SceneType.$VALUES = sceneTypeArr;
    }
    public void KSUploaderKitCommon$SceneType(String p0,int p1,String p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static KSUploaderKitCommon$SceneType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSUploaderKitCommon$SceneType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSUploaderKitCommon$SceneType.class, p0);
    }
    public static KSUploaderKitCommon$SceneType[] values(){
       Object obj = PatchProxy.apply(null, null, KSUploaderKitCommon$SceneType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSUploaderKitCommon$SceneType.$VALUES.clone();
    }
    public String value(){
       return this.mValue;
    }
}
