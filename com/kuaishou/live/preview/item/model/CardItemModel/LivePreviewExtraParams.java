package com.kuaishou.live.preview.item.model.CardItemModel.LivePreviewExtraParams;
import java.io.Serializable;
import java.lang.Object;

public class LivePreviewExtraParams implements Serializable	// class@000dee
{
    public int mAutoShowPanelType;
    public String mCardStyle;
    public String mSubscribeID;
    public static final long serialVersionUID = 0x3f7df220123042b4;

    public void LivePreviewExtraParams(){
       super();
       this.mAutoShowPanelType = 0;
    }
}
