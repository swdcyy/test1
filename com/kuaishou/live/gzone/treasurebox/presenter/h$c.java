package com.kuaishou.live.gzone.treasurebox.presenter.h$c;
import com.kwai.live.gzone.widget.f;
import com.kuaishou.live.gzone.treasurebox.presenter.h;
import com.kwai.live.gzone.widget.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import k67.b;
import com.kwai.live.gzone.widget.e;

public class h$c extends f	// class@001c83
{
    public final h G;

    public void h$c(h p0,f$b p1){
       this.G = p0;
       super(p1);
    }
    public int e0(){
       h obj = PatchProxy.apply(null, this, h$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.G.S;
       if (obj != null) {
          return obj.z8();
       }
       return super.e0();
    }
}
