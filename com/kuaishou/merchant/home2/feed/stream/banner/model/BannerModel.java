package com.kuaishou.merchant.home2.feed.stream.banner.model.BannerModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class BannerModel implements Serializable	// class@0017d0
{
    public String imageUrl;
    public String jumpUrl;

    public void BannerModel(){
       super();
    }
    public static BannerModel create(String p0){
       BannerModel obj = PatchProxy.applyOneRefs(p0, null, BannerModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new BannerModel();
       obj.imageUrl = p0;
       obj.jumpUrl = "https://www.baidu.com";
       return obj;
    }
}
