package com.kuaishou.webkit.internal.loader.InstallUtils$1;
import com.kuaishou.webkit.internal.loader.CoreChecker$CheckCallback;
import com.kuaishou.webkit.internal.loader.InstallUtils$CoreCheckCallback;
import java.lang.Object;
import com.kuaishou.webkit.internal.ErrorResult;
import java.lang.StringBuilder;
import java.lang.String;
import com.kuaishou.webkit.internal.Logger;

public class InstallUtils$1 implements CoreChecker$CheckCallback	// class@001335
{
    public final InstallUtils$CoreCheckCallback val$callback;

    public void InstallUtils$1(InstallUtils$CoreCheckCallback p0){
       this.val$callback = p0;
       super();
    }
    public void onFinish(ErrorResult p0){
       Logger.d("InstallUtils", "asyncCoreCheck succeed="+p0.succeed());
       this.val$callback.onFinish(p0);
    }
}
