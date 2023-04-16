package com.yxcorp.gifshow.dialog.flowdialog.FreeTrafficDialogParam;
import java.lang.Object;
import com.yxcorp.gifshow.dialog.flowdialog.FreeTrafficDialogParam$a;

public class FreeTrafficDialogParam	// class@001aa0
{
    public String mCardName;
    public FreeTrafficDialogModel mFreeTrafficDialogModel;
    public int mFreeTrafficMode;

    public void FreeTrafficDialogParam(){
       super();
    }
    public void FreeTrafficDialogParam(FreeTrafficDialogParam$a p0){
       super();
       this.mFreeTrafficDialogModel = p0.a;
       this.mFreeTrafficMode = p0.c;
       this.mCardName = p0.b;
    }
}
