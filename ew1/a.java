package ew1.a;
import yq5.c;
import android.content.Context;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import java.lang.Object;
import java.util.ArrayList;
import android.widget.ViewFlipper;
import ew1.a$a;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper$a;
import yq5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import ekd.q;
import java.util.Collections;
import java.util.Iterator;
import android.view.View;
import java.lang.Boolean;
import android.view.animation.Animation;

public class a implements c	// class@002204
{
    public final Context a;
    public final LiveViewFlipper b;
    public final List c;

    public void a(Context p0,LiveViewFlipper p1){
       super();
       this.c = new ArrayList();
       this.a = p0;
       this.b = p1;
       p1.setAnimateFirstView(false);
       p1.a(new a$a(this));
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       int i = this.c.indexOf(p0);
       if (i != -1 && this.b.getDisplayedChild() != i) {
          b.Z(LiveLogTag.LIVE_TOP_BAR, "inner scroll to pendant "+p0.getPriority());
          b uob = q.d(this.c, this.b.getDisplayedChild());
          if (uob != null) {
             uob.D();
          }
          this.b.setDisplayedChild(i);
          p0.onShow();
       }
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (p0 != null && !this.c.contains(p0)) {
          b.Z(LiveLogTag.LIVE_TOP_BAR, "inner add pendant "+p0.getPriority());
          this.c.add(p0);
          Collections.sort(this.c);
          this.b.stopFlipping();
          this.b.removeAllViews();
          Iterator iterator = this.c.iterator();
          while (iterator.hasNext()) {
             this.b.addView(iterator.next().getView());
          }
          p0.onAttach();
          if (this.c.size() > 1 && !this.b.isFlipping()) {
             this.e();
             int i = (int)this.c.get(0).c1();
             a tb = this.b;
             if (i <= 0) {
                i = 3000;
             }
             tb.setFlipInterval(i);
             this.b.startFlipping();
             this.f();
          }
       }
       return;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (p0 != null && this.c.contains(p0)) {
          b.Z(LiveLogTag.LIVE_TOP_BAR, "inner remove pendant "+p0.getPriority());
          if (this.c.get(this.b.getDisplayedChild()) == p0) {
             this.b.showNext();
          }
          this.c.remove(p0);
          this.b.removeView(p0.getView());
          p0.onDetach();
          if (this.c.size() <= 1 && this.b.isFlipping()) {
             this.b.stopFlipping();
          }
       }
    label_006a :
       return;
    }
    public void d(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       if (p0 && (!this.b.isFlipping() && this.c.size() > 1)) {
          this.e();
          this.b.startFlipping();
          this.f();
          this.b.showNext();
          b.Z(LiveLogTag.LIVE_TOP_BAR, "resume flipping");
       }else if(!p0 && this.b.isFlipping()){
          this.b.stopFlipping();
          b.Z(LiveLogTag.LIVE_TOP_BAR, "stop flipping");
       }
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.b.setInAnimation(null);
       this.b.setOutAnimation(null);
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.b.setInAnimation(this.a, R.anim.arg_RES_7f010105);
       this.b.setOutAnimation(this.a, R.anim.arg_RES_7f010115);
       return;
    }
}
