package com.kuaishou.android.live.model.preview.LivePreviewRichTextTextInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Arrays;

public class LivePreviewRichTextTextInfo implements Serializable	// class@00084a
{
    public LivePreviewWidgetBackgroundModel mBackgroundInfo;
    public boolean mEnableStrikethrough;
    public String mFontColor;
    public int mFontSizeDp;
    public int mFontStyle;
    public int[] mPaddingsDp;
    public String mText;
    public static final long serialVersionUID = 0x5764f5c4a20a1722;

    public void LivePreviewRichTextTextInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePreviewRichTextTextInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LivePreviewRichTextTextInfo{mText=\'"+this.mText+'''+", mFontColor=\'"+this.mFontColor+'''+", mFontSizeDp="+this.mFontSizeDp+", mFontStyle="+this.mFontStyle+", mBackgroundInfo="+this.mBackgroundInfo+", mEnableStrikethrough="+this.mEnableStrikethrough+", mPaddingsDp="+Arrays.toString(this.mPaddingsDp)+'}';
    }
}
