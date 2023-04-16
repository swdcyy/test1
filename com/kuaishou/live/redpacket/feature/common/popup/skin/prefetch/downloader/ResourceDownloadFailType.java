package com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.ResourceDownloadFailType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ResourceDownloadFailType extends Enum	// class@000f44
{
    public String mMessage;
    public int mType;
    public static final ResourceDownloadFailType[] $VALUES;
    public static final ResourceDownloadFailType DOWNLOAD_FRESCO_INNER_ERROR;
    public static final ResourceDownloadFailType DOWNLOAD_INVALID_PARAM;
    public static final ResourceDownloadFailType SAVE_FRESCO_CACHE_KEY_NOT_EXIST;
    public static final ResourceDownloadFailType SAVE_FRESCO_CACHE_NOT_EXIST;
    public static final ResourceDownloadFailType SAVE_FRESCO_DATA_SOURCE_NOT_FINISH;
    public static final ResourceDownloadFailType SAVE_FRESCO_DATA_SOURCE_NO_RESULT;
    public static final ResourceDownloadFailType SAVE_FRESCO_DATA_SOURCE_REF_INVALID;
    public static final ResourceDownloadFailType SAVE_FRESCO_INNER_ERROR;
    public static final ResourceDownloadFailType SAVE_IO_ERROR;

    static {
       ResourceDownloadFailType resourceDown = new ResourceDownloadFailType("DOWNLOAD_INVALID_PARAM", 0, 1, "DOWNLOAD_INVALID_PARAM");
       ResourceDownloadFailType.DOWNLOAD_INVALID_PARAM = resourceDown;
       ResourceDownloadFailType resourceDown1 = new ResourceDownloadFailType("DOWNLOAD_FRESCO_INNER_ERROR", 1, 2, "DOWNLOAD_FRESCO_ERROR");
       ResourceDownloadFailType.DOWNLOAD_FRESCO_INNER_ERROR = resourceDown1;
       ResourceDownloadFailType resourceDown2 = new ResourceDownloadFailType("SAVE_FRESCO_CACHE_KEY_NOT_EXIST", 2, 3, "SAVE_FRESCO_CACHE_KEY_NOT_EXIST");
       ResourceDownloadFailType.SAVE_FRESCO_CACHE_KEY_NOT_EXIST = resourceDown2;
       ResourceDownloadFailType resourceDown3 = new ResourceDownloadFailType("SAVE_FRESCO_CACHE_NOT_EXIST", 3, 4, "SAVE_FRESCO_CACHE_NOT_EXIST");
       ResourceDownloadFailType.SAVE_FRESCO_CACHE_NOT_EXIST = resourceDown3;
       ResourceDownloadFailType resourceDown4 = new ResourceDownloadFailType("SAVE_IO_ERROR", 4, 5, "SAVE_IO_ERROR");
       ResourceDownloadFailType.SAVE_IO_ERROR = resourceDown4;
       ResourceDownloadFailType resourceDown5 = new ResourceDownloadFailType("SAVE_FRESCO_INNER_ERROR", 5, 6, "SAVE_FRESCO_INNER_ERROR");
       ResourceDownloadFailType.SAVE_FRESCO_INNER_ERROR = resourceDown5;
       ResourceDownloadFailType resourceDown6 = new ResourceDownloadFailType("SAVE_FRESCO_DATA_SOURCE_NOT_FINISH", 6, 7, "SAVE_FRESCO_DATA_SOURCE_NO_FINISH");
       ResourceDownloadFailType.SAVE_FRESCO_DATA_SOURCE_NOT_FINISH = resourceDown6;
       ResourceDownloadFailType resourceDown7 = new ResourceDownloadFailType("SAVE_FRESCO_DATA_SOURCE_NO_RESULT", 7, 8, "SAVE_FRESCO_DATA_SOURCE_NO_RESULT");
       ResourceDownloadFailType.SAVE_FRESCO_DATA_SOURCE_NO_RESULT = resourceDown7;
       ResourceDownloadFailType resourceDown8 = new ResourceDownloadFailType("SAVE_FRESCO_DATA_SOURCE_REF_INVALID", 8, 9, "SAVE_FRESCO_DATA_SOURCE_REF_INVALID");
       ResourceDownloadFailType.SAVE_FRESCO_DATA_SOURCE_REF_INVALID = resourceDown8;
       ResourceDownloadFailType[] resourceDown9 = new ResourceDownloadFailType[9];
       resourceDown9[0] = resourceDown;
       resourceDown9[1] = resourceDown1;
       resourceDown9[2] = resourceDown2;
       resourceDown9[3] = resourceDown3;
       resourceDown9[4] = resourceDown4;
       resourceDown9[5] = resourceDown5;
       resourceDown9[6] = resourceDown6;
       resourceDown9[7] = resourceDown7;
       resourceDown9[8] = resourceDown8;
       ResourceDownloadFailType.$VALUES = resourceDown9;
    }
    public void ResourceDownloadFailType(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.mType = p2;
       this.mMessage = p3;
    }
    public static ResourceDownloadFailType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ResourceDownloadFailType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ResourceDownloadFailType.class, p0);
    }
    public static ResourceDownloadFailType[] values(){
       Object obj = PatchProxy.apply(null, null, ResourceDownloadFailType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ResourceDownloadFailType.$VALUES.clone();
    }
    public String getMessage(){
       return this.mMessage;
    }
    public int getType(){
       return this.mType;
    }
}
