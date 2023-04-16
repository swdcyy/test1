package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.e$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.e;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import im8.f;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import n17.a;

public class e$a extends m	// class@000eac
{
    public final e c;

    public void e$a(e p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       e$a tc = this.c;
       e s = tc.s;
       if (s != null) {
          s.a(tc.m8(), this.c.q.get().intValue(), null);
       }
       return;
    }
}
