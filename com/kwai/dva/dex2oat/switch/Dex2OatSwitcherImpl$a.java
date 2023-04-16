package com.kwai.dva.dex2oat.switch.Dex2OatSwitcherImpl$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.dva.dex2oat.switch.Dex2OatSwitcherImpl;

public final class Dex2OatSwitcherImpl$a	// class@000d1a
{

    public void Dex2OatSwitcherImpl$a(){
       super();
    }
    public void Dex2OatSwitcherImpl$a(u p0){
       super();
    }
    public final String a(int p0){
       Dex2OatSwitcherImpl$a uoa = Dex2OatSwitcherImpl$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Dex2OatSwitcherImpl.disableDex2Oat(p0);
    }
    public final String b(int p0){
       Dex2OatSwitcherImpl$a uoa = Dex2OatSwitcherImpl$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Dex2OatSwitcherImpl.restoreDex2Oat(p0);
    }
}
