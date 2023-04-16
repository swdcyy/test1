package com.kwai.live.gzone.turntable.presenters.f$d;
import com.kwai.live.gzone.widget.f;
import com.kwai.live.gzone.turntable.presenters.f;
import com.kwai.live.gzone.widget.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import y43.a;
import k67.b;
import com.kwai.live.gzone.widget.e;

public class f$d extends f	// class@000e65
{
    public final f G;

    public void f$d(f p0,f$b p1){
       this.G = p0;
       super(p1);
    }
    public int e0(){
       a obj = PatchProxy.apply(null, this, f$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.G.p.d;
       if (obj != null) {
          return obj.z8();
       }
       return super.e0();
    }
}
