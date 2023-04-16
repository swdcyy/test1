package com.kuaishou.live.common.core.basic.tools.g;
import java.lang.Object;
import com.kuaishou.live.common.core.basic.tools.g$d;
import com.kuaishou.live.common.core.basic.tools.g$a;
import com.kuaishou.live.common.core.basic.tools.g$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.kuaishou.live.common.core.basic.tools.g$d$a;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class g	// class@000ef4
{

    public void g(){
       super();
    }
    public static g$c a(g$d p0,g$a p1){
       File obj = PatchProxy.applyTwoRefs(p0, p1, null, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(p0.a());
       if (obj.exists()) {
          obj.delete();
       }
       b.c0(LiveLogTag.LIVE_LIKE, "LiveDownloadUtils", "start download task", p0.toString());
       g$c uoc = new g$c(p0, p1);
       uoc.d();
       return uoc;
    }
    public static g$c b(DownloadTask$DownloadTaskType p0,String p1,String p2,String p3,g$a p4,String p5){
       g$d$a obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, null, og, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new g$d$a();
       String[] stringArray = new String[]{p1};
       obj.i(stringArray);
       obj.g(p2);
       obj.h(p3);
       obj.c(p0);
       obj.a(p5);
       return g.a(obj.b(), p4);
    }
    public static g$c c(DownloadTask$DownloadTaskType p0,String[] p1,String p2,String p3,boolean p4,g$a p5,String p6){
       g$d$a obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),p5,p6};
          obj = PatchProxy.apply(objArray, null, og, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new g$d$a();
       obj.i(p1);
       obj.g(p2);
       obj.h(p3);
       obj.d(p4);
       obj.c(p0);
       obj.a(p6);
       return g.a(obj.b(), p5);
    }
    public static String d(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p1)) {
          return p1;
       }
       p1 = ".zip";
       if (p0.endsWith(p1)) {
          p0 = p0.substring(0, p0.lastIndexOf(p1));
       }
       return p0;
    }
}
