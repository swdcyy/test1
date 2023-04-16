package com.kwai.live.gzone.guess.kshell.e0$a;
import tyc.k2;
import com.kwai.live.gzone.guess.kshell.e0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;

public class e0$a extends k2	// class@000d30
{
    public final e0 h;

    public void e0$a(e0 p0,int p1){
       this.h = p0;
       super(p1);
    }
    public int i(int p0,int p1){
       e0$a uoa = e0$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!p0) {
          return a1.e(0);
       }else {
          return super.i(p0, p1);
       }
    }
}
