package com.kwai.sharelib.model.ShareInitResponse$ShareInitArea;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ShareInitResponse$ShareInitArea implements Serializable	// class@0016f1
{
    public ArrayList mArea;
    public String mTitle;
    public static final long serialVersionUID = 0x4825b4182a3b1ca5;

    public void ShareInitResponse$ShareInitArea(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ShareInitResponse$ShareInitArea.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ShareInitArea{mArea="+this.mArea+", mTitle=\'"+this.mTitle+'''+'}';
    }
}
