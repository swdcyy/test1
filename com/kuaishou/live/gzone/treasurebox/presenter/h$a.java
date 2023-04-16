package com.kuaishou.live.gzone.treasurebox.presenter.h$a;
import erd.g;
import com.kuaishou.live.gzone.treasurebox.presenter.h;
import java.lang.Object;
import o53.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.a;
import qvb.n0;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxListResponse;

public class h$a implements g	// class@001c81
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
       }else {
          h t = this.b.T;
          if (t != null && !t.isEmpty()) {
             this.b.T.L0().mTaskInfo = p0.b;
          }
       }
       return;
    }
}
