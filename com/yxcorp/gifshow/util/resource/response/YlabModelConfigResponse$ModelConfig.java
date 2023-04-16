package com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse$ModelConfig;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.String;
import java.util.List;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse$ModelConfig$a;

public class YlabModelConfigResponse$ModelConfig implements Cloneable	// class@000cfb
{
    public YlabModelConfigResponse$ModelConfig$DiffInfo mDiffInfo;
    public List mModelUrls;
    public boolean mNeedPreDownload;
    public int mPredownloadPriority;
    public String mResourceKey;

    public void YlabModelConfigResponse$ModelConfig(){
       super();
    }
    public Object clone(){
       YlabModelConfigResponse$ModelConfig modelConfig;
       try{
          modelConfig = super.clone();
          modelConfig.mModelUrls = (this.mModelUrls != null)? new ArrayList(this.mModelUrls): new ArrayList();
       }catch(java.lang.CloneNotSupportedException e0){
          modelConfig = null;
       }
       return modelConfig;
    }
    public String toString(){
       try{
          YlabModelConfigResponse$ModelConfig modelConfig = super.clone();
          modelConfig.mModelUrls = (this.mModelUrls != null)? new ArrayList(this.mModelUrls): new ArrayList();
          modelConfig = this.mModelUrls;
          if (modelConfig != null && modelConfig.size() > 0) {
             return this.mResourceKey+" : "+this.mModelUrls.get(0).mUrl;
          }else {
             return this.mResourceKey+" : null";
          }
       }catch(java.lang.CloneNotSupportedException e0){
          return null;
       }
    }
}
