package com.kwai.live.gzone.tab.accompanyplay.c$a;
import erd.g;
import com.kwai.live.gzone.tab.accompanyplay.c;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class c$a implements g	// class@000e03
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
       }else if(p0.booleanValue()){
          this.b.p.a();
       }
       return;
    }
}
