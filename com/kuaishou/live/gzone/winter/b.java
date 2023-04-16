package com.kuaishou.live.gzone.winter.b;
import erd.g;
import com.kuaishou.live.gzone.winter.c;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import com.kwai.component.list.exposed.behavior.ItemExposedBehavior;

public class b implements g	// class@001d06
{
    public final c b;

    public void b(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else if(p0.booleanValue()){
          this.b.s.clear();
          this.b.w.e(false);
       }
       return;
    }
}
