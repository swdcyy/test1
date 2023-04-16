package com.yxcorp.download.a;
import com.yxcorp.download.DownloadDispatcher;
import com.yxcorp.download.a$a;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.i;

public final class a	// class@0011b5
{

    public static DownloadDispatcher a(){
       return a$a.a;
    }
    public static DownloadDispatcher b(DownloadTask$DownloadTaskType p0){
       if (p0 != DownloadTask$DownloadTaskType.PRE_DOWNLOAD && (p0 == DownloadTask$DownloadTaskType.ENQUEUE || p0 == DownloadTask$DownloadTaskType.INIT_DOWNLOAD)) {
          return a$a.b;
       }
       return a$a.a;
    }
    public static i c(){
       return a$a.b;
    }
}
