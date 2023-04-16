package com.yxcorp.gifshow.v3.editor.magicfinger.o$b;
import com.yxcorp.gifshow.widget.adv.ITimelineView$e;
import com.yxcorp.gifshow.v3.editor.magicfinger.o;
import java.lang.Object;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$RangeHandler;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import wyc.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;

public class o$b implements ITimelineView$e	// class@00103e
{
    public final o a;

    public void o$b(o p0){
       this.a = p0;
       super();
    }
    public boolean a(ITimelineView$IRangeView$RangeHandler p0,ITimelineView$IRangeView$a p1,double p2){
       return false;
    }
    public boolean b(ITimelineView$IRangeView$RangeHandler p0,ITimelineView$IRangeView$a p1,double p2){
       return false;
    }
    public void c(ITimelineView$IRangeView$RangeHandler p0,ITimelineView$IRangeView$a p1,double p2){
       b.b(this, p0, p1, p2);
    }
    public boolean d(){
       return false;
    }
    public boolean e(ITimelineView$IRangeView$RangeHandler p0,ITimelineView$IRangeView$a p1,double p2,boolean p3){
       return false;
    }
    public boolean f(double p0){
       o$b uob = o$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uob = this.a;
       uob.U = false;
       uob.M = true;
       uob.P8().pause();
       this.a.P8().seekTo(p0);
       return true;
    }
    public void g(ITimelineView$IRangeView$a p0,int p1,boolean p2){
       b.a(this, p0, p1, p2);
    }
    public boolean h(ITimelineView$IRangeView$a p0){
       return false;
    }
}
