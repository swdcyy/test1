package com.kwai.framework.model.universalfeedtab.UniversalFeed;
import java.io.Serializable;
import java.lang.Object;

public class UniversalFeed implements Serializable	// class@0016d6
{
    public String mFooterBundleId;
    public String mFooterBundleViewKey;
    public String mHeaderBundleId;
    public String mHeaderBundleViewKey;
    public String mId;
    public String mPage2;
    public String mRequestPath;
    public String mSlideUpDownRequestPath;
    public static final long serialVersionUID = 0x5f1a992d690df32;

    public void UniversalFeed(){
       super();
       this.mId = "";
       this.mRequestPath = "";
       this.mSlideUpDownRequestPath = "";
       this.mPage2 = "";
       this.mHeaderBundleId = "";
       this.mHeaderBundleViewKey = "";
       this.mFooterBundleId = "";
       this.mFooterBundleViewKey = "";
    }
}
