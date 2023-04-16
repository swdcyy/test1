package mx0.e;
import java.lang.Object;
import java.lang.String;
import z1.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.io.File;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import qkd.b;
import brd.a0;
import ekd.j;
import brd.t;
import mx0.c;
import erd.o;

public class e	// class@00323a
{

    public void e(){
       super();
    }
    public static e a(String p0,String p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.b(p0);
       if (!TextUtils.x(obj)) {
          return new e(obj, Integer.valueOf(1));
       }
       obj = e.b(p1);
       if (!TextUtils.x(obj)) {
          return new e(obj, Integer.valueOf(2));
       }
       int i = (TextUtils.x(p0) && TextUtils.x(p1))? 0: 3;
       return new e(null, Integer.valueOf(i));
    }
    public static String b(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uoe, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          String str = PatchProxy.applyOneRefs(p0, null, uoe, "4");
          if (str != patchProxyRe) {
          }else {
             str = LiveResourceFileUtil.k("live_over_room_resource")+File.separator+p0;
          }
          if (b.S(LiveResourceFileUtil.j(LiveResourceFileUtil$LiveResourceFileType.LIVE_OVER_ROOM_RESOURCE, str))) {
             return "file://"+str;
          }
       }
       return null;
    }
    public static a0 c(String[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (j.h(p0)) {
          return a0.B("");
       }
       return t.fromArray(p0).concatMapDelayError(c.b).first("");
    }
}
