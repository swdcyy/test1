package com.kuaishou.android.model.feed.LiveInfo;
import java.io.Serializable;
import sp.c;
import java.lang.Object;
import java.lang.String;

public class LiveInfo implements Serializable, c	// class@000b0c
{
    public String mColor;
    public String mContent;
    public String mIconUrl;
    public int mType;
    public static final long serialVersionUID = 0x86d6bf022abbbe96;

    public void LiveInfo(){
       super();
    }
    public String getColor(){
       return this.mColor;
    }
    public String getContent(){
       return this.mContent;
    }
    public String getIconUrl(){
       return this.mIconUrl;
    }
    public int getType(){
       return 3;
    }
}
