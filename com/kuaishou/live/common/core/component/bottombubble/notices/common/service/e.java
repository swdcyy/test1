package com.kuaishou.live.common.core.component.bottombubble.notices.common.service.e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.utility.SystemUtil;
import java.lang.RuntimeException;

public final class e implements g	// class@000f9d
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       if (!SystemUtil.K()) {
          return;
       }
       throw new RuntimeException(p0);
    }
}
