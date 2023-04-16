package com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$layout$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zqa.b$i;
import msd.l;
import kotlin.jvm.internal.a;
import zqa.b$l;
import zqa.b;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$d;
import zqa.b$e;
import java.util.List;

public final class GrowthTestLayout	// class@00155f
{
    public final ArrayList a;
    public final p b;
    public static final GrowthTestLayout$Companion c;

    static {
       GrowthTestLayout.c = new GrowthTestLayout$Companion(null);
    }
    public void GrowthTestLayout(){
       super();
       this.a = new ArrayList();
       this.b = s.c(new GrowthTestLayout$layout$2(this));
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, GrowthTestLayout.class, "2")) {
          return;
       }
       this.a.add(new b$i());
       return;
    }
    public final void b(String p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GrowthTestLayout.class, "3")) {
          return;
       }
       a.p(p0, "title");
       a.p(p1, "titleScope");
       b$l ol = new b$l(p0);
       if (!this.a.contains(ol)) {
          this.a.add(ol);
       }
       GrowthTestLayout ta = this.a;
       ta = ta.get(ta.indexOf(ol));
       a.o(ta, "mModels[mModels.indexOf\(title\)]");
       if (ta instanceof b$l) {
          p1.invoke(new GrowthTestLayout$Companion$d(this.a, ta));
       }
       return;
    }
}
