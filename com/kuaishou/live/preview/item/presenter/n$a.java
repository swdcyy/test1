package com.kuaishou.live.preview.item.presenter.n$a;
import com.kuaishou.live.preview.item.presenter.n$h;
import com.kuaishou.live.preview.item.presenter.n;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class n$a implements n$h	// class@000e30
{
    public final n a;

    public void n$a(n p0){
       this.a = p0;
       super();
    }
    public Map a(){
       Object obj = PatchProxy.apply(null, this, n$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.R8();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, n$a.class, "2")) {
          return;
       }
       this.a.Y8();
       return;
    }
}
