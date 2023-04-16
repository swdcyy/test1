package com.kwai.middleware.resourcemanager.download.config.DownloadConfig$saveFile$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import java.io.File;
import java.lang.String;
import java.lang.CharSequence;
import ib7.a;
import java.util.List;
import java.lang.Object;

public final class DownloadConfig$saveFile$2 extends Lambda implements a	// class@000f4c
{
    public final DownloadConfig this$0;

    public void DownloadConfig$saveFile$2(DownloadConfig p0){
       this.this$0 = p0;
       super(0);
    }
    public final File invoke(){
       File fileFolder = this.this$0.getFileFolder();
       File uFile = null;
       if (fileFolder != null) {
          String fileName = this.this$0.getFileName();
          if (fileName != null) {
             a uoa = (fileName.length() > 0)? 1: null;
             if (!uoa) {
                fileName = uFile;
             }
             if (fileName != null) {
                uFile = new File(fileFolder, fileName);
             }
          }
          uFile = new File(fileFolder, a.b(a.b, this.this$0.getResourceUrls(), false, 2, uFile));
       }
       return uFile;
    }
    public Object invoke(){
       return this.invoke();
    }
}
