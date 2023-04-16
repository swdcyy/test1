package com.kuaishou.live.core.show.showprofile.a$c;
import wj2.n0;
import com.kuaishou.live.core.show.showprofile.a;
import java.lang.Object;
import com.kwai.component.misc.report.ReportInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wj2.e;

public class a$c implements n0	// class@00101a
{
    public final a a;

    public void a$c(a p0){
       this.a = p0;
       super();
    }
    public void a(ReportInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "2")) {
          return;
       }
       this.a.r.c(p0);
       return;
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$c.class, "1")) {
          return;
       }
       this.a.r.a(p0, p1);
       return;
    }
}
