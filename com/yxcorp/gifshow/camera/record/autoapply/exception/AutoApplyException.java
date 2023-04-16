package com.yxcorp.gifshow.camera.record.autoapply.exception.AutoApplyException;
import java.lang.IllegalArgumentException;
import java.lang.String;

public class AutoApplyException extends IllegalArgumentException	// class@001d30
{
    public int mState;
    public String mToastMsg;

    public void AutoApplyException(int p0,String p1){
       super(p1);
       this.mState = p0;
       this.mToastMsg = p1;
    }
    public String getToastText(){
       return this.mToastMsg;
    }
}
