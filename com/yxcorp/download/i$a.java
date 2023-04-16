package com.yxcorp.download.i$a;
import java.util.Comparator;
import com.yxcorp.download.i;
import java.lang.Object;
import com.yxcorp.download.DownloadTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.download.DownloadTask$DownloadTaskType;

public class i$a implements Comparator	// class@0011c0
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       int taskQosClass;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, i$a.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if(p0.getTaskQosClass() != p1.getTaskQosClass()){
          i = p0.getTaskQosClass();
          taskQosClass = p1.getTaskQosClass();
       }else if(p0.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD){
          i = p0.getInitPriority();
          taskQosClass = p1.getInitPriority();
       }else {
          i = 0;
       }
       i = i - taskQosClass;
       return i;
    }
}
