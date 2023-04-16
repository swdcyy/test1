package com.kwai.feature.api.platform.bridge.beans.JsDownloadParams;
import java.io.Serializable;
import java.lang.Object;

public class JsDownloadParams implements Serializable	// class@00105c
{
    public JsDownloadParams$DownloadAction mAction;
    public String mCallback;
    public int mClickType;
    public String mCustomExtension;
    public String mDownloadId;
    public String mDownloadName;
    public String mExtraInfo;
    public JsDownloadParams$DownloadFileType mFileType;
    public String mGameIconUrl;
    public String mGameName;
    public boolean mNotificationHidden;
    public String mPhotoId;
    public String mUrl;
    public boolean notForceReDownload;
    public static final long serialVersionUID = 0x4b79270744615798;

    public void JsDownloadParams(){
       super();
    }
}
