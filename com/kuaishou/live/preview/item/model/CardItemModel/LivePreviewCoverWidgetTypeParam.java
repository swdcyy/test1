package com.kuaishou.live.preview.item.model.CardItemModel.LivePreviewCoverWidgetTypeParam;
import java.io.Serializable;
import java.lang.Object;

public class LivePreviewCoverWidgetTypeParam implements Serializable	// class@000ded
{
    public int mIconType;
    public int mReasonTextType;
    public int mTextType;
    public int mType;
    public static final long serialVersionUID = 0x161bc332d4f39e84;

    public void LivePreviewCoverWidgetTypeParam(int p0,int p1,int p2,int p3){
       super();
       this.mType = p0;
       this.mIconType = p1;
       this.mTextType = p2;
       this.mReasonTextType = p3;
    }
}
