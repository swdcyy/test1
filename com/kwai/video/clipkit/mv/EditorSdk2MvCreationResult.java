package com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import com.kwai.FaceMagic.AE2.AE2Project;
import java.lang.String;
import com.kwai.video.clipkit.TextFilter$TextEffectConfig;
import com.kwai.video.clipkit.mv.KwaiMvParam;
import java.util.List;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.ksspark.model.VideoProjectWrapper;
import com.kwai.video.clipkit.mv.AllMvReplaceableAreaDetail;
import java.util.Map;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult$TemplateType;

public interface abstract EditorSdk2MvCreationResult	// class@001ac0
{

    AE2Project getAE2Project();
    int getErrorCode();
    String getErrorReason();
    int getGrade();
    String getGroupIdByRefId(String p0);
    TextFilter$TextEffectConfig getLyricsConfig();
    KwaiMvParam getMVParam();
    List getMusicAssets();
    String getMusicResourcePath();
    List getMvAssets();
    EditorSdk2V2$VideoEditorProject getProject();
    VideoProjectWrapper getProjectWrapper();
    List getReplaceableMvAssets();
    AllMvReplaceableAreaDetail getSparkAllDetail();
    Map getSparkResMap();
    EditorSdk2MvCreationResult$TemplateType getTemplateType();
    List getThumbnailRenderPosMillis();
    int getVideoHeight();
    int getVideoWidth();
    boolean hasError();
}
