package com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest$UploadPostType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IUploadRequest$UploadPostType extends Enum	// class@0013dc
{
    public static final IUploadRequest$UploadPostType[] $VALUES;
    public static final IUploadRequest$UploadPostType INTOWN;
    public static final IUploadRequest$UploadPostType JUXING;
    public static final IUploadRequest$UploadPostType NORMAL;
    public static final IUploadRequest$UploadPostType SCHOOL;
    public static final IUploadRequest$UploadPostType SHOP;
    public static final IUploadRequest$UploadPostType STORY;

    static {
       IUploadRequest$UploadPostType uploadPostTy = new IUploadRequest$UploadPostType("NORMAL", 0);
       IUploadRequest$UploadPostType.NORMAL = uploadPostTy;
       IUploadRequest$UploadPostType uploadPostTy1 = new IUploadRequest$UploadPostType("INTOWN", 1);
       IUploadRequest$UploadPostType.INTOWN = uploadPostTy1;
       IUploadRequest$UploadPostType uploadPostTy2 = new IUploadRequest$UploadPostType("SCHOOL", 2);
       IUploadRequest$UploadPostType.SCHOOL = uploadPostTy2;
       IUploadRequest$UploadPostType uploadPostTy3 = new IUploadRequest$UploadPostType("SHOP", 3);
       IUploadRequest$UploadPostType.SHOP = uploadPostTy3;
       IUploadRequest$UploadPostType uploadPostTy4 = new IUploadRequest$UploadPostType("STORY", 4);
       IUploadRequest$UploadPostType.STORY = uploadPostTy4;
       IUploadRequest$UploadPostType uploadPostTy5 = new IUploadRequest$UploadPostType("JUXING", 5);
       IUploadRequest$UploadPostType.JUXING = uploadPostTy5;
       IUploadRequest$UploadPostType[] uploadPostTy6 = new IUploadRequest$UploadPostType[]{uploadPostTy,uploadPostTy1,uploadPostTy2,uploadPostTy3,uploadPostTy4,uploadPostTy5};
       IUploadRequest$UploadPostType.$VALUES = uploadPostTy6;
    }
    public void IUploadRequest$UploadPostType(String p0,int p1){
       super(p0, p1);
    }
    public static IUploadRequest$UploadPostType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IUploadRequest$UploadPostType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(IUploadRequest$UploadPostType.class, p0);
    }
    public static IUploadRequest$UploadPostType[] values(){
       Object obj = PatchProxy.apply(null, null, IUploadRequest$UploadPostType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IUploadRequest$UploadPostType.$VALUES.clone();
    }
}
