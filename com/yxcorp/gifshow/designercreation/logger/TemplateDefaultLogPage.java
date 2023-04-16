package com.yxcorp.gifshow.designercreation.logger.TemplateDefaultLogPage;
import k2b.e0;
import hw9.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.designercreation.logger.TemplateDefaultLogPage$logAdapter$2;
import msd.a;
import qrd.p;
import qrd.s;
import k2b.d0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import k2b.e0$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.util.Objects;
import android.app.Activity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;

public final class TemplateDefaultLogPage implements e0	// class@0012fd
{
    public final p b;
    public final b c;

    public void TemplateDefaultLogPage(b p0){
       a.p(p0, "logParamsGetter");
       super();
       this.c = p0;
       this.b = s.c(TemplateDefaultLogPage$logAdapter$2.INSTANCE);
    }
    public int D4(){
       return d0.h(this);
    }
    public ClientEvent$ExpTagTrans I1(){
       return d0.e(this);
    }
    public ClientEvent$ExpTagTrans K5(){
       return d0.d(this);
    }
    public int Lb(){
       return d0.j(this);
    }
    public int M(){
       Object obj = PatchProxy.apply(null, this, TemplateDefaultLogPage.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a().M();
    }
    public ClientContent$ContentPackage Nf(){
       Object obj = PatchProxy.apply(null, this, TemplateDefaultLogPage.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(this.a());
       return null;
    }
    public String P7(){
       return d0.i(this);
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, TemplateDefaultLogPage.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(this.a());
       return null;
    }
    public final e0$a a(){
       Object obj = PatchProxy.apply(null, this, TemplateDefaultLogPage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public String a2(){
       Object obj = PatchProxy.apply(null, this, TemplateDefaultLogPage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(this.a());
       return "";
    }
    public Activity cd(){
       return d0.f(this);
    }
    public boolean eg(){
       return d0.a(this);
    }
    public int getPage(){
       Object obj = PatchProxy.apply(null, this, TemplateDefaultLogPage.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(this.a());
       return 0;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, TemplateDefaultLogPage.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getPageParams();
    }
    public String h5(){
       return d0.g(this);
    }
    public ClientEvent$ElementPackage j4(){
       Object obj = PatchProxy.apply(null, this, TemplateDefaultLogPage.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(this.a());
       return null;
    }
    public String o(){
       return "FEATURED_DETAIL";
    }
    public String pg(){
       return d0.k(this);
    }
    public ClientContentWrapper$ContentWrapper ye(){
       return d0.b(this);
    }
}
