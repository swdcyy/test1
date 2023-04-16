package com.kwai.feature.post.api.feature.bridge.JsSelectAndUploadMediaParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Arrays;

public class JsSelectAndUploadMediaParams implements Serializable	// class@00136b
{
    public String mCallback;
    public String mFileType;
    public int mMaxFileSize;
    public String mMediaType;
    public List mSourceTypes;
    public String mToken;
    public static final long serialVersionUID = 0xed2d6b627b3224ec;

    public void JsSelectAndUploadMediaParams(){
       super();
       String[] stringArray = new String[]{"album","camera"};
       this.mSourceTypes = Arrays.asList(stringArray);
    }
}
