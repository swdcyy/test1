package com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import java.lang.String;
import android.view.View;
import java.lang.Throwable;

public class IllegalViewOperationException extends JSApplicationCausedNativeException	// class@001315
{
    public View mView;

    public void IllegalViewOperationException(String p0){
       super(p0);
    }
    public void IllegalViewOperationException(String p0,View p1,Throwable p2){
       super(p0, p2);
       this.mView = p1;
    }
    public View getView(){
       return this.mView;
    }
}
