package com.kuaishou.live.common.core.component.bottombubble.notices.a$a;
import bq5.e;
import com.kuaishou.live.common.core.component.bottombubble.notices.a;
import java.lang.Object;
import nc1.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.turbomode.OptimizedElement;
import qy1.a;

public class a$a implements e	// class@000f86
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public boolean a(Object p0){
       boolean b;
       p0 = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          b = p0.booleanValue();
       }else {
          p0 = this.a.q;
          b = (p0 != null && !p0.Ko(OptimizedElement.COMMENT_NOTICE))? true: false;
       }
       return b;
    }
}
