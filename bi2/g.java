package bi2.g;
import com.kuaishou.live.core.show.redpacket.richcard.http.BarTitleTextMap;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfo;
import com.kuaishou.live.core.show.redpacket.richcard.http.EffectInfo;
import com.kuaishou.live.core.show.redpacket.richcard.http.PendantConfig;
import com.kuaishou.live.core.show.redpacket.richcard.http.SpecialScenePopupParams;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.BottomBarInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class g	// class@0003f9
{
    public final BarTitleTextMap a;
    public final RichCardInfo b;
    public final EffectInfo c;
    public final PendantConfig d;
    public final SpecialScenePopupParams e;
    public final int f;
    public final BottomBarInfo g;

    public void g(BarTitleTextMap p0,RichCardInfo p1,EffectInfo p2,PendantConfig p3,SpecialScenePopupParams p4,int p5,BottomBarInfo p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public final BarTitleTextMap a(){
       return this.a;
    }
    public final RichCardInfo b(){
       return this.b;
    }
    public final EffectInfo c(){
       return this.c;
    }
    public final int d(){
       return this.f;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof g && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && (a.g(this.e, p0.e) && (this.f == p0.f && a.g(this.g, p0.g))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       g obj = PatchProxy.apply(null, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       g tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.e;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.f) * 31;
       tb = this.g;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RichCardDetailInfo\(barTitleTextInfo="+this.a+", cardInfo="+this.b+", effectInfo="+this.c+", pendantInfo="+this.d+", specialScenePopUpParams="+this.e+", state="+this.f+", bottomBarInfo="+this.g+"\)";
    }
}
