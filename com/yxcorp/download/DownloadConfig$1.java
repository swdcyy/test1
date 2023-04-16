package com.yxcorp.download.DownloadConfig$1;
import java.util.HashMap;
import com.yxcorp.download.DownloadConfig;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.lang.Integer;
import java.lang.Object;

public class DownloadConfig$1 extends HashMap	// class@00119c
{
    public final DownloadConfig this$0;

    public void DownloadConfig$1(DownloadConfig p0){
       this.this$0 = p0;
       super();
       this.put(DownloadTask$DownloadTaskType.IMMEDIATE, Integer.valueOf(31));
       this.put(DownloadTask$DownloadTaskType.INIT_DOWNLOAD, Integer.valueOf(17));
       this.put(DownloadTask$DownloadTaskType.ENQUEUE, Integer.valueOf(1));
       this.put(DownloadTask$DownloadTaskType.PRE_DOWNLOAD, Integer.valueOf(0));
    }
}
