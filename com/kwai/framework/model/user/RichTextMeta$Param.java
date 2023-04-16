package com.kwai.framework.model.user.RichTextMeta$Param;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ka6.b;

public class RichTextMeta$Param implements Serializable, a	// class@001726
{
    public QUserContactName mContactName;
    public boolean mEnableAlias;
    public String mFontName;
    public int mFontSize;
    public String mKeyName;
    public String mLinkUrl;
    public String mTextColor;
    public int mTextType;
    public String mTextValue;
    public String mThirdPartyName;
    public int mTruncationThreshold;
    public long mUserId;
    public static final long serialVersionUID = 0x83552e0918db5a58;

    public void RichTextMeta$Param(){
       super();
       this.mFontSize = 12;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, RichTextMeta$Param.class, "1")) {
          return;
       }
       b.b().c(this, RichTextMeta$Param.class);
       return;
    }
}
