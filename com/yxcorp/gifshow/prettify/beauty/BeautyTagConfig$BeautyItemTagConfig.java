package com.yxcorp.gifshow.prettify.beauty.BeautyTagConfig$BeautyItemTagConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class BeautyTagConfig$BeautyItemTagConfig implements Serializable	// class@0010f0
{
    public String beautyId;
    public String tagName;

    public void BeautyTagConfig$BeautyItemTagConfig(){
       super();
       this.beautyId = "";
       this.tagName = "";
    }
    public final String getBeautyId(){
       return this.beautyId;
    }
    public final String getTagName(){
       return this.tagName;
    }
    public final void setBeautyId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautyTagConfig$BeautyItemTagConfig.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.beautyId = p0;
       return;
    }
    public final void setTagName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BeautyTagConfig$BeautyItemTagConfig.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.tagName = p0;
       return;
    }
}
