package com.kuaishou.webkit.internal.loader.InstallUtils$4;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.kuaishou.webkit.internal.loader.InstallUtils;

public class InstallUtils$4 implements Runnable	// class@001338
{
    public final String val$finalError;
    public final long val$timeoutMs;

    public void InstallUtils$4(String p0,long p1){
       this.val$finalError = p0;
       this.val$timeoutMs = p1;
       super();
    }
    public void run(){
       String str = (TextUtils.isEmpty(this.val$finalError))? "timeout:"+String.valueOf(this.val$timeoutMs): this.val$finalError;
       InstallUtils.onInstallFinish(false, str);
       return;
    }
}
