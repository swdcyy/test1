package com.kuaishou.live.preview.item.bottomcard.model.LivePreviewBottomCardModel;
import java.io.Serializable;
import java.lang.Object;

public class LivePreviewBottomCardModel implements Serializable	// class@000d99
{
    public int mBizId;
    public LivePreviewBottomCardContentModel mBottomCardContentModel;
    public LivePreviewBottomCardExtraParam mBottomCardExtraParam;
    public int mCardStyle;
    public int mCardType;
    public String mCustomCardContentInfo;
    public long mDelayShowMillis;
    public boolean mIsCardHoldOn;
    public int mPriority;
    public long mShowCardMillis;
    public static final long serialVersionUID = 0x2a54689146f808fb;

    public void LivePreviewBottomCardModel(){
       super();
    }
}
