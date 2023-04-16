package com.yxcorp.gifshow.detail.common.danmaku.topguide.BaseOpenCloseGuideElement$c;
import com.kwai.framework.player.core.b$b;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.BaseOpenCloseGuideElement;
import java.lang.Object;
import oq7.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import qp7.x0;
import qp7.b;
import java.util.Objects;
import java.lang.Boolean;
import pp7.b;

public final class BaseOpenCloseGuideElement$c implements b$b	// class@0013f4
{
    public final BaseOpenCloseGuideElement b;

    public void BaseOpenCloseGuideElement$c(BaseOpenCloseGuideElement p0){
       this.b = p0;
       super();
    }
    public final void d(int p0){
       j oj1;
       j oj = j.class;
       BaseOpenCloseGuideElement$c uoc = BaseOpenCloseGuideElement$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (p0 != 3) {
          if (p0 == 4) {
             oj1 = this.b.E();
             Objects.requireNonNull(oj1);
             if (!PatchProxy.applyVoid(null, oj1, oj, "2")) {
                oj1.e.f(Boolean.TRUE);
             }
          }
       }else {
          oj1 = this.b.E();
          Objects.requireNonNull(oj1);
          if (!PatchProxy.applyVoid(null, oj1, oj, "3")) {
             oj1.e.f(Boolean.FALSE);
          }
       }
       return;
    }
}
