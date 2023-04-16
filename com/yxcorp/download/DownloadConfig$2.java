package com.yxcorp.download.DownloadConfig$2;
import java.util.HashMap;
import com.yxcorp.download.DownloadConfig;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.lang.Integer;
import java.lang.Object;

public class DownloadConfig$2 extends HashMap	// class@00119d
{
    public final DownloadConfig this$0;

    public void DownloadConfig$2(DownloadConfig p0){
       this.this$0 = p0;
       super();
       this.put(DownloadTask$DownloadTaskType.IMMEDIATE, Integer.valueOf(15));
       this.put(DownloadTask$DownloadTaskType.INIT_DOWNLOAD, Integer.valueOf(9));
       this.put(DownloadTask$DownloadTaskType.ENQUEUE, Integer.valueOf(1));
       this.put(DownloadTask$DownloadTaskType.PRE_DOWNLOAD, Integer.valueOf(0));
    }
}
