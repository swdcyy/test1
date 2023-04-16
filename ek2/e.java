package ek2.e;
import android.view.View$OnClickListener;
import ek2.c;
import com.kuaishou.live.core.show.stayinfo.StayInfo;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class e implements View$OnClickListener	// class@00274c
{
    public final c b;
    public final StayInfo c;
    public final View$OnClickListener d;
    public final View$OnClickListener e;

    public void e(c p0,StayInfo p1,View$OnClickListener p2,View$OnClickListener p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "1")) {
          return;
       }
       this.e.onClick(p0);
       PatchProxy.onMethodExit(e.class, "1");
       return;
    }
}
