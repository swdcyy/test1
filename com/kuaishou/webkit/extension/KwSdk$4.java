package com.kuaishou.webkit.extension.KwSdk$4;
import java.lang.Runnable;
import com.kuaishou.webkit.extension.KwSdk$InstallCallback;
import com.kuaishou.webkit.internal.ErrorResult;
import java.lang.Object;
import java.lang.String;

public class KwSdk$4 implements Runnable	// class@0012ee
{
    public final KwSdk$InstallCallback val$callback;
    public final boolean val$installed;
    public final ErrorResult val$result;

    public void KwSdk$4(KwSdk$InstallCallback p0,boolean p1,ErrorResult p2){
       this.val$callback = p0;
       this.val$installed = p1;
       this.val$result = p2;
       super();
    }
    public void run(){
       this.val$callback.onFinishWithError(this.val$installed, false, this.val$result.error());
    }
}
