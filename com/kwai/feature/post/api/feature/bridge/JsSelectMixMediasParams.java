package com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Arrays;

public class JsSelectMixMediasParams implements Serializable	// class@001377
{
    public JsSelectMixMediasParams$AlbumLimitParams mAlbumLimitParams;
    public String mCallback;
    public MessageEncodeConfig mEncodeConfig;
    public JsSelectMixMediasParams$ImageCompressConfig mImageCompressConfig;
    public List mSourceTypes;
    public JsSelectMixMediasParams$ImageCompressConfig mThumbnailCompressConfig;
    public JsSelectMixMediasParams$UploadTokenNeededParams mUploadTokenNeededParams;
    public static final long serialVersionUID = 0x58d21e800eb626a9;

    public void JsSelectMixMediasParams(){
       super();
       String[] stringArray = new String[]{"album","camera"};
       this.mSourceTypes = Arrays.asList(stringArray);
    }
}
