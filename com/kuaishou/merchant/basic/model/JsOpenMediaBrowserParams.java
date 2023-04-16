package com.kuaishou.merchant.basic.model.JsOpenMediaBrowserParams;
import java.io.Serializable;
import java.lang.Object;

public class JsOpenMediaBrowserParams implements Serializable	// class@0015c7
{
    public ArrayList mMediaItemList;
    public JsOpenMediaBrowserParams$JsOpenMediaPositionParams mOriginRectPosition;
    public int mPageIndex;
    public boolean mShowBackButton;
    public boolean mShowCloseButton;
    public static final long serialVersionUID = 0xc9c778d937ddebcb;

    public void JsOpenMediaBrowserParams(){
       super();
       this.mShowBackButton = false;
    }
}
