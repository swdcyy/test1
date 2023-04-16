package c26.b;
import s16.d;
import java.lang.String;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import java.util.List;
import z30.n0;
import um6.a;
import android.content.Intent;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.io.File;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;

public interface abstract b implements d	// class@000640
{

    String getActivityKey();
    AtlasInfo getAtlasInfo();
    String getAudioOutputPath();
    String getAudioProfile();
    String getBackgroundAudioPath();
    boolean getBackgroundAudioRepeat();
    float getBackgroundAudioVolume();
    String getComment();
    int getCount();
    String getCoverPath();
    List getEncodeProfiles();
    byte[] getExtraInfoInSEI();
    long getForegroundAudioClipEndTime();
    long getForegroundAudioClipStartTime();
    String getForegroundAudioPath();
    float getForegroundAudioVolume();
    int getFrameIntervalMs();
    int getHeight();
    n0 getIWorkspace();
    a getKtvInfo();
    String getOutputPath();
    Intent getPreviewIntent();
    String getSessionId();
    int getTemplateGrade();
    int getVideoBitrate();
    String getVideoBufferPath();
    VideoContext getVideoContext();
    int getVideoGopSiz();
    int getVideoType();
    int getWidth();
    File getWorkspaceDirectory();
    String getX264Params();
    String getX264Preset();
    boolean isCrashInEncodingAndGiveUpWorkspace();
    boolean isDisableTranscodeDegrade();
    boolean isExportTaskInQueueing();
    boolean isHdExport();
    boolean isHidden();
    boolean isImport();
    boolean isOverrideParams();
    boolean isPhotoMovie();
    boolean isPipelineSupported();
    EncodeInfo toEncodeInfo(int p0);
}
