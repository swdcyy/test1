package com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest;
import java.lang.String;
import com.kwai.kcube.TabIdentifier;
import java.io.File;

public interface abstract IUploadRequest	// class@0013dd
{

    String getFilePath();
    TabIdentifier getMockFeedUploadTarget();
    String getSessionId();
    String getShareAppPackage();
    File getWorkspaceDirectory();
    boolean isPublished();
    boolean isReturnToHome();
    void setEnablePipelineSegmentUpload(boolean p0);
    void setEncodedFileCrc(String p0);
    void setTriggerByEncode(boolean p0);
    void setWorkspaceDirectory(File p0);
}
