package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$l;
import z0.a;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import zs1.b;
import java.lang.Object;
import eu1.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lu1.r;
import java.util.Map;
import android.graphics.Rect;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import ut1.f;
import lu1.u;
import du1.d;
import sp5.b;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.render.layout.LiveMultiPkViewStyle;

public final class LiveMultiPkRenderCellViewModel$l implements a	// class@001692
{
    public final LiveMultiPkRenderCellViewModel a;
    public final b b;

    public void LiveMultiPkRenderCellViewModel$l(LiveMultiPkRenderCellViewModel p0,b p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object apply(Object p0){
       Rect rect;
       b obj3;
       r or;
       Object obj = this;
       Rect obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       Object obj2 = PatchProxy.applyOneRefs(obj1, obj, LiveMultiPkRenderCellViewModel$l.class, str);
       if (obj2 != patchProxyRe) {
       }else {
          obj2 = null;
          if (obj1 != null) {
             Map map = obj1.e();
             if (map != null) {
                rect = map.get(obj.a.getUserId());
             label_002d :
                f value = obj.b.l().getValue();
                if (obj1 == null || (rect != null && value != null)) {
                   u a = u.a;
                   boolean b = obj.a.C.e();
                   LiveMultiPkRenderCellViewModel b1 = obj.a.B;
                   int i = value.h();
                   b uob = obj1.c();
                   obj1 = obj1.e().get(obj.a.getUserId());
                   if (obj1 == null) {
                      obj1 = new Rect();
                   }
                   Objects.requireNonNull(a);
                   u ou = u.class;
                   int i1 = 2;
                   int i2 = 1;
                   if (PatchProxy.isSupport(ou)) {
                      Object[] objArray = new Object[]{Boolean.valueOf(b),b1,Integer.valueOf(i),uob,obj1};
                      obj3 = PatchProxy.apply(objArray, a, ou, str);
                      if (obj3 != patchProxyRe) {
                         obj2 = obj3;
                      }
                   }
                   a.p(b1, "viewStyle");
                   a.p(uob, "pkWindowSize");
                   a.p(obj1, "userWindow");
                   if (i != i2) {
                      if (i == i1) {
                         if (PatchProxy.isSupport(ou)) {
                            obj3 = uob;
                            obj2 = PatchProxy.applyFourRefs(Boolean.valueOf(b), b1, uob, obj1, a, u.class, "5");
                            if (obj2 != patchProxyRe) {
                            }
                         }else {
                            obj3 = uob;
                         }
                         or = a.a(b1);
                         or.j(a.c(obj3, obj1));
                         if (b) {
                            or.i(a.b(obj3, obj1));
                         }
                      }
                   }else {
                      obj3 = uob;
                      obj2 = PatchProxy.applyThreeRefs(b1, obj3, obj1, a, u.class, "2");
                      if (obj2 != patchProxyRe) {
                      }else if((double)((float)obj1.width() / (float)obj3.a) - 0x3fdf5c28f5c28f5c >= 0){
                         obj2 = PatchProxy.applyThreeRefs(b1, obj3, obj1, a, u.class, "3");
                         if (obj2 != patchProxyRe) {
                         }else {
                            or = a.a(b1);
                            or.j(a.c(obj3, obj1));
                         }
                      }else {
                         obj2 = PatchProxy.applyThreeRefs(b1, obj3, obj1, a, u.class, "4");
                         if (obj2 != patchProxyRe) {
                         }else {
                            or = a.a(b1);
                            or.j(1);
                            or.i(a.b(obj3, obj1));
                         }
                      }
                   }
                   obj2 = or;
                }
             }
          }
          rect = obj2;
          goto label_002d ;
       }
    label_014d :
       return obj2;
    }
}
