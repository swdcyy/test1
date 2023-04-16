package hs1.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.LiveAudienceMultiLineBasicViewController;
import oq1.e;
import oq1.b;
import sq1.a;
import nq1.a;
import sz1.e;
import xp5.i;
import java.lang.String;
import msd.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import js1.c;

public final class a extends LiveAudienceMultiLineBasicViewController	// class@00276d
{
    public final e t;
    public final b u;
    public final a v;
    public final String w;
    public final a x;

    public void a(e p0,b p1,a p2,a p3,e p4,i p5,String p6,a p7){
       a.p(p1, "lineLogParamsProvider");
       a.p(p2, "roomDelegate");
       a.p(p3, "lineBasicModel");
       a.p(p4, "interactManager");
       a.p(p5, "logPackageProvider");
       a.p(p7, "serverTimeProvider");
       super(p0, p1, p2, p3, p4, p5);
       this.t = p0;
       this.u = p1;
       this.v = p2;
       this.w = p6;
       this.x = p7;
    }
    public ViewController V2(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this.w, this.x);
    }
}
