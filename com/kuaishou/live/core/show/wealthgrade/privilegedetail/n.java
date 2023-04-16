package com.kuaishou.live.core.show.wealthgrade.privilegedetail.n;
import w07.l;
import java.lang.Object;
import u07.t;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.o;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.widget.TextView;
import qm2.u;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;

public final class n implements l	// class@001278
{
    public static final n a;

    static {
       n.a = new n();
    }
    public void n(){
       super();
    }
    public final void apply(Object p0){
       p0 = p0.z();
       if (p0 != null) {
          p0 = p0.findViewById(R.id.content);
          if (p0 != null) {
             f.F(p0, new u(p0));
          }
       }
       return;
    }
}
