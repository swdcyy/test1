package com.yxcorp.gifshow.photo.download.model.StatModel;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.photo.download.model.PhotoStage;
import java.util.HashMap;

public class StatModel implements Serializable	// class@000ed8
{
    public int endIndex;
    public String mDownloadIndex;
    public String mDownloadUrl;
    public final HashMap mElementParams;
    public boolean mIsNetDownload;
    public File mLocalFile;
    public boolean mNeedCdnReport;
    public PhotoStage mPhotoStage;
    public String mSource;
    public long mStartTime;
    public int mWaterMarkType;
    public int startIndex;
    public static final long serialVersionUID = 0x5206305af25ce4be;

    public void StatModel(String p0){
       super();
       this.mPhotoStage = PhotoStage.NORMAL;
       this.mNeedCdnReport = true;
       this.mElementParams = new HashMap();
       this.startIndex = -1;
       this.endIndex = -1;
       this.mSource = p0;
    }
}
