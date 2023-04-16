package com.yxcorp.gifshow.commercial.model.PhotoAdDownloadCenterItemModel$ItemType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PhotoAdDownloadCenterItemModel$ItemType extends Enum	// class@001143
{
    public static final PhotoAdDownloadCenterItemModel$ItemType[] $VALUES;
    public static final PhotoAdDownloadCenterItemModel$ItemType DOWNLOAD_TASK;
    public static final PhotoAdDownloadCenterItemModel$ItemType H5_GAME;

    static {
       PhotoAdDownloadCenterItemModel$ItemType itemType = new PhotoAdDownloadCenterItemModel$ItemType("DOWNLOAD_TASK", 0);
       PhotoAdDownloadCenterItemModel$ItemType.DOWNLOAD_TASK = itemType;
       PhotoAdDownloadCenterItemModel$ItemType itemType1 = new PhotoAdDownloadCenterItemModel$ItemType("H5_GAME", 1);
       PhotoAdDownloadCenterItemModel$ItemType.H5_GAME = itemType1;
       PhotoAdDownloadCenterItemModel$ItemType[] itemTypeArra = new PhotoAdDownloadCenterItemModel$ItemType[]{itemType,itemType1};
       PhotoAdDownloadCenterItemModel$ItemType.$VALUES = itemTypeArra;
    }
    public void PhotoAdDownloadCenterItemModel$ItemType(String p0,int p1){
       super(p0, p1);
    }
    public static PhotoAdDownloadCenterItemModel$ItemType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PhotoAdDownloadCenterItemModel$ItemType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PhotoAdDownloadCenterItemModel$ItemType.class, p0);
    }
    public static PhotoAdDownloadCenterItemModel$ItemType[] values(){
       Object obj = PatchProxy.apply(null, null, PhotoAdDownloadCenterItemModel$ItemType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PhotoAdDownloadCenterItemModel$ItemType.$VALUES.clone();
    }
}
