package com.kwai.feature.post.api.feature.bridge.JsPublishToMiddlePlatformParams;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class JsPublishToMiddlePlatformParams implements Serializable	// class@001361
{
    public String bizCustomParam;
    public String caption;
    public String content;
    public List filePathList;
    public String mediaType;
    public String photoMeta;
    public String subBiz;
    public static final long serialVersionUID = 0x2467b9857ae179a8;

    public void JsPublishToMiddlePlatformParams(String p0,String p1,List p2,String p3,String p4,String p5,String p6){
       super();
       this.caption = "";
       this.content = "";
       this.filePathList = new ArrayList();
       this.bizCustomParam = "";
       this.mediaType = "image";
       this.subBiz = "";
       this.photoMeta = null;
       this.caption = p0;
       this.content = p1;
       this.filePathList = p2;
       this.bizCustomParam = p3;
       this.mediaType = p4;
       this.subBiz = p5;
       this.photoMeta = p6;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsPublishToMiddlePlatformParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsPublishToMiddlePlatformParams{caption=\'"+this.caption+'''+", content=\'"+this.content+'''+", filePathList="+this.filePathList+", bizCustomParam=\'"+this.bizCustomParam+'''+", mediaType=\'"+this.mediaType+'''+'}';
    }
}
