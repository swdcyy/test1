package com.yxcorp.download.h;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.download.DownloadTask;
import com.yxcorp.download.i;

public final class h implements Comparator	// class@0011bf
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final int compare(Object p0,Object p1){
       int i1;
       int i = -1;
       if (p0.getPreDownloadPriority() == p1.getPreDownloadPriority()) {
          if (!p0.getEnqueueTime() - p1.getEnqueueTime()) {
             i1 = 0;
          label_0039 :
             return i1;
          }else if(p0.getEnqueueTime() - p1.getEnqueueTime() < 0){
          label_0037 :
             i = 1;
          }
       }else if(p0.getPreDownloadPriority() > p1.getPreDownloadPriority()){
       }
       i1 = i;
       goto label_0039 ;
    }
}
