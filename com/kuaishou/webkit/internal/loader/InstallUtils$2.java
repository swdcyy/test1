package com.kuaishou.webkit.internal.loader.InstallUtils$2;
import java.lang.Runnable;
import android.content.Context;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.webkit.process.UtilsProcessService;

public class InstallUtils$2 implements Runnable	// class@001336
{
    public final Context val$context;
    public final File val$installDir;

    public void InstallUtils$2(Context p0,File p1){
       this.val$context = p0;
       this.val$installDir = p1;
       super();
    }
    public void run(){
       UtilsProcessService.startDeleteOldVersionService(this.val$context, this.val$installDir.getAbsolutePath());
    }
}
