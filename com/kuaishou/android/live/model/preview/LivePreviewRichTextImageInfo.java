package com.kuaishou.android.live.model.preview.LivePreviewRichTextImageInfo;
import java.io.Serializable;
import java.lang.Object;

public class LivePreviewRichTextImageInfo implements Serializable	// class@000848
{
    public CDNUrl[] mCDNUrls;
    public int mHeightDp;
    public int mRadiusDp;
    public int mVerticalAlignment;
    public int mWidthDp;
    public static final long serialVersionUID = 0xde4b59fd988c301f;

    public void LivePreviewRichTextImageInfo(){
       super();
       this.mVerticalAlignment = 0;
    }
}
