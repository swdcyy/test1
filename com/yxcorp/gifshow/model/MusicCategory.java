package com.yxcorp.gifshow.model.MusicCategory;
import java.io.Serializable;
import java.lang.Object;

public class MusicCategory implements Serializable	// class@001e60
{
    public long mId;
    public String mName;
    public boolean mShowLabel;
    public String mType;
    public static final long serialVersionUID = 0x49265535766a59e8;

    public void MusicCategory(){
       super();
       this.mShowLabel = false;
    }
}
