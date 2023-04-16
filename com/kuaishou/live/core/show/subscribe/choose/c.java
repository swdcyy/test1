package com.kuaishou.live.core.show.subscribe.choose.c;
import y8c.g;
import y8c.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Integer;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.subscribe.choose.c$b;
import com.kuaishou.live.core.show.subscribe.choose.c$a;
import ml8.c;

public class c extends g	// class@0010d5
{
    public a w;

    public void c(){
       super();
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.g.put("DELETE_CONSUMER", this.w);
       return p0;
    }
    public f h1(ViewGroup p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d0df8), new c$b(null));
    }
}
