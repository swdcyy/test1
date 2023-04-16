package com.kwai.feature.post.api.feature.bridge.JsIntownPageShareParams$PageShareParams;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.feature.post.api.feature.bridge.JsIntownPageShareParams$ShareFileType;

public class JsIntownPageShareParams$PageShareParams implements Serializable	// class@00134b
{
    public String mCaption;
    public String mDesc;
    public String mImageUrl;
    public JsIntownPageShareParams$SharePlatformType mPlatformType;
    public String mSiteName;
    public String mSiteUrl;
    public JsIntownPageShareParams$ShareFileType mType;
    public static final long serialVersionUID = 0xcb2bd3931d2f89e3;

    public void JsIntownPageShareParams$PageShareParams(){
       super();
       this.mType = JsIntownPageShareParams$ShareFileType.NORMAL;
    }
}
