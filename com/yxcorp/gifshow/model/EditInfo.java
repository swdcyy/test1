package com.yxcorp.gifshow.model.EditInfo;
import java.io.Serializable;
import java.lang.Object;

public final class EditInfo implements Serializable	// class@001e05
{
    public boolean mAllowMusicReedit;
    public Long mEditTime;
    public boolean mEnable;
    public int mEspStatus;
    public boolean mMusicTort;

    public void EditInfo(){
       super();
       this.mEnable = false;
       this.mAllowMusicReedit = false;
       this.mMusicTort = false;
    }
}
