package com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasResultBase;
import java.io.Serializable;
import java.lang.Object;

public class JsSelectMixMediasResultBase implements Serializable	// class@00137a
{
    public String mFilePath;
    public int mFileType;
    public int mResult;
    public String mTaskId;
    public static final long serialVersionUID = 0x2492b37cc9de8408;

    public void JsSelectMixMediasResultBase(){
       super();
       this.mResult = 1;
    }
    public void copyFrom(JsSelectMixMediasResultBase p0){
       this.mFilePath = p0.mFilePath;
       this.mTaskId = p0.mTaskId;
       this.mFileType = p0.mFileType;
    }
}
