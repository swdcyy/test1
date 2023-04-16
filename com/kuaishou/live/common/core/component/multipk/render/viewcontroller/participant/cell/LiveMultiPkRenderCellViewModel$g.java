package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$g;
import z0.a;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ut1.p;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.util.List;
import java.util.Iterator;
import fe3.e;
import fe3.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;

public final class LiveMultiPkRenderCellViewModel$g implements a	// class@00168d
{
    public final LiveMultiPkRenderCellViewModel a;

    public void LiveMultiPkRenderCellViewModel$g(LiveMultiPkRenderCellViewModel p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       boolean b;
       e obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkRenderCellViewModel$g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          p0 = p0.a();
          if (p0 != null) {
             p0 = p0.e();
             if (p0 != null) {
                p0 = p0.iterator();
                while (true) {
                   if (p0.hasNext()) {
                      obj = p0.next();
                      d uod = obj.h();
                      String str = (uod != null)? uod.b(): null;
                      if (TextUtils.n(str, this.a.getUserId())) {
                         b = obj.c();
                         break ;
                      }
                   }
                }
                return Boolean.valueOf(b);
             }
          }
       }
       b = false;
       goto label_004b ;
    }
}
