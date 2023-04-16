package com.kwai.feature.post.api.feature.bridge.JsMagicFaceResultParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class JsMagicFaceResultParams implements Serializable	// class@001353
{
    public String mCoverPath;
    public String mName;
    public boolean mResult;
    public static final long serialVersionUID = 0x73d0025f55cef412;

    public void JsMagicFaceResultParams(int p0,String p1,String p2){
       super();
       int i = 1;
       if (p0 == i) {
       }else {
          i = false;
       }
       this.mResult = i;
       this.mName = p1;
       this.mCoverPath = p2;
       return;
    }
}
