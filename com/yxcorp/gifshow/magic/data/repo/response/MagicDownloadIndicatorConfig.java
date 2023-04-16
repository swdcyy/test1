package com.yxcorp.gifshow.magic.data.repo.response.MagicDownloadIndicatorConfig;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.String;
import lnc.a1;

public class MagicDownloadIndicatorConfig implements Serializable, Cloneable	// class@001b8d
{
    public String mIndicatorAppliedFailedText;
    public String mIndicatorAppliedSuccessText;
    public String mIndicatorDownloadingText;
    public int mIndicatorStyle;
    public static final MagicDownloadIndicatorConfig sDefaultIndicator;
    public static final long serialVersionUID;

    static {
       MagicDownloadIndicatorConfig.sDefaultIndicator = new MagicDownloadIndicatorConfig();
    }
    public void MagicDownloadIndicatorConfig(){
       super();
       this.mIndicatorStyle = 0;
       this.mIndicatorDownloadingText = a1.p(0x7f10313c);
       this.mIndicatorAppliedSuccessText = a1.p(0x7f10313b);
       this.mIndicatorAppliedFailedText = a1.p(0x7f103156);
    }
}
