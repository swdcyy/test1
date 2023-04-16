package com.kuaishou.live.gzone.treasurebox.presenter.x;
import erd.g;
import com.kuaishou.live.gzone.treasurebox.presenter.w;
import java.lang.Object;
import o53.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask;

public class x implements g	// class@001ca2
{
    public final w b;

    public void x(w p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "1")) {
       }else {
          this.b.e9(p0.b);
       }
       return;
    }
}
