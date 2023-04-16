package com.kwai.corona.startup.model.DanmakuColor;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Boolean;

public class DanmakuColor implements Serializable	// class@000cf2
{
    public Boolean isAvailable;
    public DanmakuColor$ColorInfoBean mColorInfo;
    public String mDetailUrl;
    public int mId;
    public DanmakuColor$ToastI18NText mToastText;
    public int mType;
    public static final long serialVersionUID = 0x9ef9f3a1af44ad64;

    public void DanmakuColor(){
       super();
       this.isAvailable = Boolean.FALSE;
    }
}
