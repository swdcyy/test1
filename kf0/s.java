package kf0.s;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import cw9.b;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import rkd.b;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;

public final class s	// class@002d1e
{
    public static int a = 0;
    public static int b = 0;
    public static float c = 0.000000;
    public static final s d;

    static {
       s.d = new s();
    }
    public void s(){
       super();
    }
    public final int a(float p0){
       s os = s.class;
       if (PatchProxy.isSupport(os)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, os, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return (int)((float)a1.e(p0) / this.b());
    }
    public final float b(){
       Object obj = PatchProxy.apply(null, this, s.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (!s.c - 0xbf800000) {
          float f = (b.g())? b.e() / b.b(): 0x3f800000;
          s.c = f;
          TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskPendantCommonUtil", "getGlobalAdaptDpiUiRatio: "+s.c, false, 4, null);
       }
       return s.c;
    }
    public final int c(){
       Object obj = PatchProxy.apply(null, this, s.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!s.b || b.g()) {
          s.b = n.u(a.b());
       }
       return s.b;
    }
}
