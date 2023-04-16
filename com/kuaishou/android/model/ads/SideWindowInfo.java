package com.kuaishou.android.model.ads.SideWindowInfo;
import java.io.Serializable;
import ip.a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;

public class SideWindowInfo implements Serializable, a	// class@000a7c
{
    public String mAdTag;
    public boolean mEnableSmallWindow;
    public int mInsertType;
    public QPhoto mSidePhoto;
    public String mTemplateId;
    public static final long serialVersionUID = 0x3989c58c1fcb427b;

    public void SideWindowInfo(){
       super();
       this.mInsertType = 0;
    }
    public int getInsertType(){
       return this.mInsertType;
    }
    public QPhoto getSidePhoto(){
       return this.mSidePhoto;
    }
}
