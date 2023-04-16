package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$s;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject;
import o69.n2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o69.d2;
import com.yxcorp.gifshow.aicut.VideoTemplateResponse;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import qrd.l1;

public final class AICutAnnualMemoryProject$s implements Callable	// class@001963
{
    public final AICutAnnualMemoryProject b;
    public final n2 c;

    public void AICutAnnualMemoryProject$s(AICutAnnualMemoryProject p0,n2 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       if (PatchProxy.applyVoid(null, this, AICutAnnualMemoryProject$s.class, "1")) {
       }else {
          d2 uod2 = this.c.a();
          uod2.j(true);
          uod2.k(true);
          uod2.i(true);
          VideoTemplateResponse videoTemplat = this.b.M0();
          int mDpi = (videoTemplat != null)? videoTemplat.getMDpi(): 0;
          uod2.h(mDpi);
       }
       return l1.a;
    }
}
