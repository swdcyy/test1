package com.kuaishou.live.preview.item.presenter.g$c;
import wy6.d;
import qvb.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class g$c implements d	// class@000e22
{
    public final i a;

    public void g$c(i p0){
       super();
       this.a = p0;
    }
    public void C(){
    }
    public boolean T(){
       return false;
    }
    public boolean d2(){
       return false;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, g$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.hasMore();
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, g$c.class, "1")) {
          return;
       }
       this.a.load();
       return;
    }
}
