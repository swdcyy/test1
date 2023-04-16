package com.yxcorp.gifshow.webview.jsmodel.component.JsSaveImageResultParams;
import java.io.Serializable;
import java.util.ArrayList;
import java.lang.Object;

public class JsSaveImageResultParams implements Serializable	// class@00177e
{
    public ArrayList mImageFilePaths;
    public int mResult;
    public static final long serialVersionUID = 0xf08d5a8ee47f2a58;

    public void JsSaveImageResultParams(int p0,ArrayList p1){
       super();
       this.mResult = p0;
       this.mImageFilePaths = p1;
    }
}
