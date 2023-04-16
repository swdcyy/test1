package com.yxcorp.gifshow.v3.editor.enhancefilter.model.PostModelConfigExtra;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;

public class PostModelConfigExtra implements Serializable	// class@000f8e
{
    public String mAlgoModelAndroidDownloadPath;
    public int mAlgoModelType;

    public void PostModelConfigExtra(){
       super();
       this.mAlgoModelType = 0;
       this.mAlgoModelAndroidDownloadPath = "";
    }
    public List getAlgoModelAndroid(){
       ArrayList obj = PatchProxy.apply(null, this, PostModelConfigExtra.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(new CDNUrl("", this.mAlgoModelAndroidDownloadPath));
       return obj;
    }
    public String getAlgoModelAndroidDownloadPath(){
       return this.mAlgoModelAndroidDownloadPath;
    }
    public int getAlgoModelType(){
       return this.mAlgoModelType;
    }
    public void setAlgoModelAndroidDownloadPath(String p0){
       this.mAlgoModelAndroidDownloadPath = p0;
    }
    public void setAlgoModelType(int p0){
       this.mAlgoModelType = p0;
    }
}
