package com.yxcorp.gifshow.postwork.PostStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PostStatus extends Enum	// class@0010ad
{
    public static final PostStatus[] $VALUES;
    public static final PostStatus ENCODE_CANCELED;
    public static final PostStatus ENCODE_COMPLETE;
    public static final PostStatus ENCODE_FAILED;
    public static final PostStatus ENCODE_PENDING;
    public static final PostStatus ENCODING;
    public static final PostStatus UPLOADING;
    public static final PostStatus UPLOAD_CANCELED;
    public static final PostStatus UPLOAD_COMPLETE;
    public static final PostStatus UPLOAD_FAILED;
    public static final PostStatus UPLOAD_PENDING;
    public static final PostStatus UPLOAD_SUCCEED;

    static {
       PostStatus postStatus = new PostStatus("ENCODE_PENDING", 0);
       PostStatus.ENCODE_PENDING = postStatus;
       PostStatus postStatus1 = new PostStatus("ENCODING", 1);
       PostStatus.ENCODING = postStatus1;
       PostStatus postStatus2 = new PostStatus("ENCODE_COMPLETE", 2);
       PostStatus.ENCODE_COMPLETE = postStatus2;
       PostStatus postStatus3 = new PostStatus("ENCODE_FAILED", 3);
       PostStatus.ENCODE_FAILED = postStatus3;
       PostStatus postStatus4 = new PostStatus("ENCODE_CANCELED", 4);
       PostStatus.ENCODE_CANCELED = postStatus4;
       PostStatus postStatus5 = new PostStatus("UPLOAD_PENDING", 5);
       PostStatus.UPLOAD_PENDING = postStatus5;
       PostStatus postStatus6 = new PostStatus("UPLOADING", 6);
       PostStatus.UPLOADING = postStatus6;
       PostStatus postStatus7 = new PostStatus("UPLOAD_SUCCEED", 7);
       PostStatus.UPLOAD_SUCCEED = postStatus7;
       PostStatus postStatus8 = new PostStatus("UPLOAD_COMPLETE", 8);
       PostStatus.UPLOAD_COMPLETE = postStatus8;
       PostStatus postStatus9 = new PostStatus("UPLOAD_FAILED", 9);
       PostStatus.UPLOAD_FAILED = postStatus9;
       PostStatus postStatus10 = new PostStatus("UPLOAD_CANCELED", 10);
       PostStatus.UPLOAD_CANCELED = postStatus10;
       PostStatus[] postStatusAr = new PostStatus[11];
       postStatusAr[0] = postStatus;
       postStatusAr[1] = postStatus1;
       postStatusAr[2] = postStatus2;
       postStatusAr[3] = postStatus3;
       postStatusAr[4] = postStatus4;
       postStatusAr[5] = postStatus5;
       postStatusAr[6] = postStatus6;
       postStatusAr[7] = postStatus7;
       postStatusAr[8] = postStatus8;
       postStatusAr[9] = postStatus9;
       postStatusAr[10] = postStatus10;
       PostStatus.$VALUES = postStatusAr;
    }
    public void PostStatus(String p0,int p1){
       super(p0, p1);
    }
    public static PostStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PostStatus.class, p0);
    }
    public static PostStatus[] values(){
       Object obj = PatchProxy.apply(null, null, PostStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostStatus.$VALUES.clone();
    }
    public boolean isForbiddenDuplicateEvent(){
       boolean b = (PostStatus.UPLOAD_FAILED != this && (PostStatus.UPLOAD_SUCCEED != this && (PostStatus.UPLOAD_COMPLETE != this && (PostStatus.UPLOAD_CANCELED != this && (PostStatus.ENCODE_COMPLETE != this && (PostStatus.ENCODE_CANCELED == this || PostStatus.ENCODE_FAILED == this))))))? true: false;
       return b;
    }
    public boolean isUploaded(){
       boolean b = (PostStatus.ENCODE_FAILED != this && (PostStatus.UPLOAD_FAILED != this && (PostStatus.ENCODING != this && (PostStatus.ENCODE_PENDING != this && (PostStatus.UPLOADING != this && PostStatus.UPLOAD_PENDING != this)))))? true: false;
       return b;
    }
}
