package com.yxcorp.gifshow.music.cloudmusic.billboard.model.BillboardMusic;
import java.io.Serializable;
import java.lang.Object;

public class BillboardMusic implements Serializable	// class@001ff2
{
    public CDNUrl[] mImages;
    public List mMusic;
    public String mName;
    public boolean mShowed;
    public int mType;
    public static final long serialVersionUID = 0x58b61c311cc6d576;

    public void BillboardMusic(){
       super();
    }
}
