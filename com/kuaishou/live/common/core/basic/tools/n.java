package com.kuaishou.live.common.core.basic.tools.n;
import io.reactivex.i;
import java.lang.Object;
import brd.c0;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import java.lang.Long;
import va1.p0;
import com.kwai.framework.network.sntp.a$a;

public final class n implements i	// class@000f00
{
    public static final n a;

    static {
       n.a = new n();
    }
    public void n(){
       super();
    }
    public final void a(c0 p0){
       int i = 0x3b1f7b44;
       if (b.a(i).a() != null) {
          p0.onSuccess(b.a(i).a());
       }else {
          b.a(i).c(new p0(p0));
       }
       return;
    }
}
