package com.yxcorp.gifshow.commercial.model.PhotoApkDownloadTaskInfo;
import com.yxcorp.gifshow.commercial.model.ApkDownloadTaskInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;

public class PhotoApkDownloadTaskInfo extends ApkDownloadTaskInfo	// class@001146
{
    public AdDataWrapper mAdDataWrapper;
    public int mAdPosition;
    public QPhoto mPhoto;
    public PlcEntryStyleInfo mPlcEntryStyleInfo;
    public static final long serialVersionUID = 0x9f5c1212e887435a;

    public void PhotoApkDownloadTaskInfo(QPhoto p0,PlcEntryStyleInfo p1){
       super();
       this.mPhoto = p0;
       this.mPlcEntryStyleInfo = p1;
    }
    public void PhotoApkDownloadTaskInfo(QPhoto p0,AdDataWrapper p1,int p2){
       super();
       this.mPhoto = p0;
       this.mAdDataWrapper = p1;
       this.mAdPosition = p2;
       if (p1 != null) {
          this.mPkgName = p1.getPackageName();
          this.mAppName = this.mAdDataWrapper.getAppName();
          this.mAppIcon = this.mAdDataWrapper.getAppIconUrl();
       }else if(p0 != null && (p0.mEntity != null && k.B(p0) != null)){
          this.mPkgName = k.B(this.mPhoto).mPackageName;
          this.mAppName = k.B(this.mPhoto).mAppName;
          this.mAppIcon = k.B(this.mPhoto).mAppIconUrl;
       }
       return;
    }
}
