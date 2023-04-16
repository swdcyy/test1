package com.kuaishou.android.model.mix.LivePushResolution;
import java.io.Serializable;
import java.lang.Object;

public class LivePushResolution implements Serializable	// class@000d07
{
    public float mHeight;
    public float mWidth;
    public static final long serialVersionUID = 0xe6a2ee0dedbfde3e;

    public void LivePushResolution(){
       super();
    }
    public boolean isVaild(){
       boolean b = (this.mHeight > 0 && this.mWidth > 0)? true: false;
       return b;
    }
}
