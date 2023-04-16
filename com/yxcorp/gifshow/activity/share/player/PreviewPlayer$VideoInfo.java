package com.yxcorp.gifshow.activity.share.player.PreviewPlayer$VideoInfo;
import java.io.Serializable;
import java.lang.String;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Object;

public final class PreviewPlayer$VideoInfo implements Serializable	// class@001398
{
    public final String mPhotoFilePath;
    public final Size mSize;

    public void PreviewPlayer$VideoInfo(String p0,Size p1){
       super();
       this.mPhotoFilePath = p0;
       this.mSize = p1;
    }
}
