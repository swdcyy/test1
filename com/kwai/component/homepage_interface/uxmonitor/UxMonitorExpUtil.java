package com.kwai.component.homepage_interface.uxmonitor.UxMonitorExpUtil;
import com.kwai.component.homepage_interface.uxmonitor.UxMonitorExpUtil$feedUxMonitor$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import ub5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import wh5.c;
import o56.a;
import ssd.e;
import ssd.e$a;

public final class UxMonitorExpUtil	// class@000980
{
    public static final p a;
    public static final UxMonitorExpUtil b;

    static {
       UxMonitorExpUtil.b = new UxMonitorExpUtil();
       UxMonitorExpUtil.a = s.c(UxMonitorExpUtil$feedUxMonitor$2.INSTANCE);
    }
    public void UxMonitorExpUtil(){
       super();
    }
    public final c a(){
       Object obj = PatchProxy.apply(null, this, UxMonitorExpUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UxMonitorExpUtil.a.getValue();
    }
    public final boolean b(boolean p0){
       float f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       UxMonitorExpUtil uxMonitorExp = UxMonitorExpUtil.class;
       if (PatchProxy.isSupport(uxMonitorExp)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uxMonitorExp, "8");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (PatchProxy.isSupport(uxMonitorExp)) {
          Object obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uxMonitorExp, "7");
          if (obj1 != patchProxyRe) {
             f = obj1.floatValue();
          }else if(c.b()){
             f = 0;
          }else if(a.d() && p0){
             f = 0x3f800000;
          }else {
             c uoc = this.a();
             uoc = (uoc != null)? uoc.sampleRatio: 0x3c23d70a;
          }
       }else {
          goto label_0036 ;
       }
       f = (e.b.j() - f <= 0)? true: false;
       return f;
    }
}
