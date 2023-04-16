package com.kwai.feature.post.api.feature.bridge.JsSelectImageParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class JsSelectImageParams implements Serializable	// class@00136c
{
    public String mCallback;
    public String mColorTheme;
    public int mCount;
    public int mMaxFileSize;
    public int mMaxHeight;
    public int mMaxWidth;
    public int mMinFileSize;
    public int mMinHeight;
    public String mMinHeightWidthAlert;
    public String mMinSizeAlert;
    public int mMinWidth;
    public String mRightButton;
    public List mSeletedList;
    public List mSourceTypes;
    public String mTitle;
    public static final long serialVersionUID = 0x35c9170463111a2e;

    public void JsSelectImageParams(){
       super();
       this.mCount = 1;
       String[] stringArray = new String[]{"album","camera"};
       this.mSourceTypes = Arrays.asList(stringArray);
       this.mMaxFileSize = Integer.MAX_VALUE;
       this.mMaxWidth = Integer.MAX_VALUE;
       this.mMaxHeight = Integer.MAX_VALUE;
       this.mMinFileSize = 0;
       this.mMinWidth = 0;
       this.mMinHeight = 0;
       this.mMinHeightWidthAlert = "";
       this.mMinSizeAlert = "";
       this.mSeletedList = new ArrayList();
    }
}
