package com.kuaishou.live.gzone.treasurebox.i$d;
import erd.g;
import com.kuaishou.live.gzone.treasurebox.i;
import java.lang.Object;
import o53.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask;

public class i$d implements g	// class@001c6e
{
    public final i b;

    public void i$d(i p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$d.class, "1")) {
       }else {
          this.b.Z8(p0.b);
       }
       return;
    }
}
