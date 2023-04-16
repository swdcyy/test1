package com.yxcorp.download.i$c;
import java.util.Comparator;
import com.yxcorp.download.i;
import java.lang.Object;
import com.yxcorp.download.DownloadTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class i$c implements Comparator	// class@0011c2
{
    public final i b;

    public void i$c(i p0){
       this.b = p0;
       super();
    }
    public int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, i$c.class, "1");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): p0.getInitPriority() - p1.getInitPriority();
       return i;
    }
}
