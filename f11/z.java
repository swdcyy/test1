package f11.z;
import android.view.GestureDetector$SimpleOnGestureListener;
import f11.w;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.System;
import t02.a0;
import j47.a;
import jv1.b;
import gq5.f;
import com.kwai.video.waynelive.LivePlayerController;
import pu1.m;
import p91.m;
import qo1.a;
import ls1.g;
import e57.a;

public class z extends GestureDetector$SimpleOnGestureListener	// class@00228d
{
    public long b;
    public final w c;

    public void z(w p0){
       this.c = p0;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, z.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.b = System.currentTimeMillis();
       return false;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       a0 e1;
       p0 = PatchProxy.applyOneRefs(p0, this, z.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (this.c.r.E1.uk()) {
          e1 = this.c.r.E1;
          e1.fg((e1.A6() ^ 0x01));
       }else if((System.currentTimeMillis() - this.b) - 800 > 0){
          if (this.c.r.x.H2()) {
             if (this.c.r.g2.m()) {
                this.c.r.g2.p();
             }else {
                this.c.r.g2.q(false);
             }
          }else if(!this.c.r.E.isSideBySideStream() && (!m.a.q(this.c.r.Z2) && (!a.e(this.c.r.Z2) && !g.g(this.c.r.Z2)))){
             w r = this.c.r;
             if (r.F2 != null) {
                e1 = r.q1;
                if (e1 != null) {
                   e1.l();
                }
             }
          }
       }
       return false;
    }
    public boolean onSingleTapUp(MotionEvent p0){
       return false;
    }
}
