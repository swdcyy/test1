package com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$UploadSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IUploadInfo$UploadSource extends Enum	// class@0013da
{
    public static final IUploadInfo$UploadSource[] $VALUES;
    public static final IUploadInfo$UploadSource SOURCE_DEFAULT;
    public static final IUploadInfo$UploadSource SOURCE_THIRD_APP;

    static {
       IUploadInfo$UploadSource uploadSource = new IUploadInfo$UploadSource("SOURCE_DEFAULT", 0);
       IUploadInfo$UploadSource.SOURCE_DEFAULT = uploadSource;
       IUploadInfo$UploadSource uploadSource1 = new IUploadInfo$UploadSource("SOURCE_THIRD_APP", 1);
       IUploadInfo$UploadSource.SOURCE_THIRD_APP = uploadSource1;
       IUploadInfo$UploadSource[] uploadSource2 = new IUploadInfo$UploadSource[]{uploadSource,uploadSource1};
       IUploadInfo$UploadSource.$VALUES = uploadSource2;
    }
    public void IUploadInfo$UploadSource(String p0,int p1){
       super(p0, p1);
    }
    public static IUploadInfo$UploadSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IUploadInfo$UploadSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(IUploadInfo$UploadSource.class, p0);
    }
    public static IUploadInfo$UploadSource[] values(){
       Object obj = PatchProxy.apply(null, null, IUploadInfo$UploadSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IUploadInfo$UploadSource.$VALUES.clone();
    }
}
