package ek2.c0;
import android.view.View$OnClickListener;
import ek2.a0;
import com.kuaishou.live.core.show.stayinfo.StayInfo;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c0 implements View$OnClickListener	// class@002746
{
    public final a0 b;
    public final StayInfo c;
    public final View$OnClickListener d;
    public final View$OnClickListener e;

    public void c0(a0 p0,StayInfo p1,View$OnClickListener p2,View$OnClickListener p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c0.class, "1")) {
          return;
       }
       this.e.onClick(p0);
       PatchProxy.onMethodExit(c0.class, "1");
       return;
    }
}
