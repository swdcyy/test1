package com.kwai.feature.post.api.feature.encode.model.VideoEncodeSDKInfo;
import java.io.Serializable;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.List;
import java.lang.Object;

public class VideoEncodeSDKInfo implements Serializable	// class@00139d
{
    public BubblesInfo mBubblesInfo;
    public EditorSdk2V2$VideoEditorProject mOriginProject;
    public final EditorSdk2V2$VideoEditorProject mProject;
    public List mTextBubbleUploadInfoList;
    public static final long serialVersionUID = 0x13b8cecd065ef91d;

    public void VideoEncodeSDKInfo(EditorSdk2V2$VideoEditorProject p0,List p1){
       super();
       this.mProject = p0;
       this.mTextBubbleUploadInfoList = p1;
    }
}
