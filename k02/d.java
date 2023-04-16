package k02.d;
import com.kuaishou.live.common.treasurebox.widget.LiveAudienceTreasureBoxWidgetView;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import k02.d$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.widget.FrameLayout;
import android.view.ViewParent;
import java.util.Objects;
import android.view.View;
import k02.e;
import java.lang.Boolean;

public final class d	// class@002c55
{
    public float a;
    public float b;
    public float c;
    public float d;
    public final d$a e;
    public final LiveAudienceTreasureBoxWidgetView f;
    public final a g;
    public final a h;

    public void d(LiveAudienceTreasureBoxWidgetView p0,a p1,a p2){
       a.p(p0, "widgetView");
       a.p(p1, "isVoicePartyVideo");
       a.p(p2, "isLiteStreamType");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.e = new d$a(this);
    }
    public final float a(float p0,float p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uod, "10");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       if (this.f.getY() - p0 >= 0) {
          p0 = (this.f.getY() - (this.c() - p1) > 0)? this.c() - p1: this.f.getY();
       }
    label_0047 :
       return p0;
    }
    public final float b(){
       ViewParent obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.f.getParent();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.View");
       return ((float)(obj.getWidth() - this.f.getWidth()) - (float)e.i);
    }
    public final float c(){
       ViewParent obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.f.getParent();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.View");
       return (float)(obj.getHeight() - this.f.getHeight());
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.f.getX() - (this.b() / (float)2) < 0)? true: false;
       return b;
    }
}
