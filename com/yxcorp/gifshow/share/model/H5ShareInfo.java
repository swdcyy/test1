package com.yxcorp.gifshow.share.model.H5ShareInfo;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.entity.MultiImageLinkInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.LinkInfo;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class H5ShareInfo implements Serializable	// class@001bca
{
    public final String GOODS;
    public String mCallback;
    public String mIcon;
    public List mImages;
    public String mIsGoods;
    public String mKwaiUrl;
    public String mShareMethod;
    public String mSource;
    public String mSourceName;
    public String mSubTitle;
    public String mTitle;
    public String mTokenUrl;
    public static final long serialVersionUID = 0x9d847d6dd35c32be;

    public void H5ShareInfo(){
       super();
       this.GOODS = "1";
       this.mShareMethod = "token";
    }
    public MultiImageLinkInfo convertGoods(){
       MultiImageLinkInfo obj = PatchProxy.apply(null, this, H5ShareInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MultiImageLinkInfo();
       obj.mSourceName = this.mSourceName;
       obj.mTitle = this.mTitle;
       obj.mUrl = this.mKwaiUrl;
       obj.mImageUrls = this.mImages;
       obj.mIconUrl = this.mIcon;
       obj.mDesc = this.mSubTitle;
       return obj;
    }
    public LinkInfo convertShop(){
       LinkInfo obj = PatchProxy.apply(null, this, H5ShareInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkInfo();
       obj.mName = this.mSourceName;
       obj.mTitle = this.mTitle;
       obj.mUrl = this.mKwaiUrl;
       obj.mIconUrl = this.mIcon;
       obj.mDesc = this.mSubTitle;
       return obj;
    }
    public boolean isGoodsShare(){
       Object obj = PatchProxy.apply(null, this, H5ShareInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n("1", this.mIsGoods);
    }
}
