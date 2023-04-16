package com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumResult;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumResult$UploadData;
import java.lang.Object;

public class JsUploadVideoFromAlbumResult implements Serializable	// class@001384
{
    public JsUploadVideoFromAlbumResult$UploadData mData;
    public final int mResult;
    public static final long serialVersionUID = 0x1b6b58edd89aa828;

    public void JsUploadVideoFromAlbumResult(JsUploadVideoFromAlbumResult$UploadData p0,int p1){
       super();
       this.mResult = p1;
       this.mData = p0;
    }
}
