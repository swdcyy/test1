package com.yxcorp.gifshow.commercial.model.PhotoAdDownloadCenterItemModel;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.model.PhotoAdDownloadCenterItemModel$ItemType;
import com.yxcorp.gifshow.entity.QPhoto;

public class PhotoAdDownloadCenterItemModel	// class@001145
{
    public final PhotoAdDownloadCenterItemModel$ItemType a;
    public final APKDownloadTask b;
    public final QPhoto c;

    public void PhotoAdDownloadCenterItemModel(APKDownloadTask p0){
       super();
       this.a = PhotoAdDownloadCenterItemModel$ItemType.DOWNLOAD_TASK;
       this.b = p0;
       this.c = null;
    }
    public void PhotoAdDownloadCenterItemModel(PhotoAdDownloadCenterItemModel$ItemType p0){
       super();
       this.a = p0;
       this.c = null;
       this.b = null;
    }
    public void PhotoAdDownloadCenterItemModel(QPhoto p0){
       super();
       this.a = PhotoAdDownloadCenterItemModel$ItemType.H5_GAME;
       this.c = p0;
       this.b = null;
    }
}
