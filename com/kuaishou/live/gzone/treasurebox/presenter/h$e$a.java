package com.kuaishou.live.gzone.treasurebox.presenter.h$e$a;
import sfc.a;
import com.kuaishou.live.gzone.treasurebox.presenter.h$e;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel$BoxStatus;

public class h$e$a extends a	// class@001c85
{
    public final LiveTreasureBoxModel c;
    public final h$e d;

    public void h$e$a(h$e p0,LiveTreasureBoxModel p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$e$a.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.setBoxStatus(LiveTreasureBoxModel$BoxStatus.COUNTED_DOWN);
       return;
    }
}
