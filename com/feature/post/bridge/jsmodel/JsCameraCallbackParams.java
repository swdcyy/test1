package com.feature.post.bridge.jsmodel.JsCameraCallbackParams;
import java.io.Serializable;
import java.lang.Object;
import com.feature.post.bridge.jsmodel.JsCameraCallbackParams$Param;

public class JsCameraCallbackParams implements Serializable	// class@001488
{
    public String mCallback;
    public JsCameraCallbackParams$Param mParam;

    public void JsCameraCallbackParams(){
       super();
    }
    public int getRecordMode(){
       JsCameraCallbackParams tmParam = this.mParam;
       int i = 2;
       if (tmParam == null || tmParam.mVideoLengthType != i) {
          i = 0;
       }
       return i;
    }
}
