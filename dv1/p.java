package dv1.p;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import dv1.n;
import java.util.List;
import ks5.m;
import dv1.l;
import dv1.m;
import java.util.Objects;
import fv1.b;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import ls5.a;
import pp.c;
import com.kuaishou.android.live.log.b;
import hv1.c;
import java.util.Set;
import mrd.a;
import dv1.j;
import ea1.a;
import android.widget.RelativeLayout;
import java.lang.Runnable;
import java.util.Iterator;
import android.animation.ObjectAnimator;
import java.util.Map;
import java.util.Map$Entry;
import android.view.View;
import android.view.View$OnLayoutChangeListener;

public class p implements LiveTopPendantTempPlayService	// class@00203c
{
    public LiveTopPendantLayout a;
    public j b;
    public boolean c;
    public boolean d;
    public boolean e;
    public b f;
    public final List g;
    public a h;
    public boolean i;

    public void p(){
       super();
       this.c = false;
       this.d = false;
       this.e = false;
       this.g = new ArrayList();
       this.i = true;
    }
    public void a(boolean p0){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, op, "8")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       if (this.d != null) {
          this.e(p0);
       }else {
          this.g.add(new n(this, p0));
       }
       return;
    }
    public void b(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "4")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       if (this.d != null) {
          this.d(p0);
       }else {
          this.g.add(new l(this, p0));
       }
       return;
    }
    public void c(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "6")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       if (this.d != null) {
          this.f(p0);
       }else {
          this.g.add(new m(this, p0));
       }
       return;
    }
    public final void d(m p0){
       b b;
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "5")) {
          return;
       }
       if (this.e != null && p0.m() == 2) {
          p tf = this.f;
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoidOneRefs(p0, tf, b.class, "2")) {
             a.p(p0, "pendantItem");
             b.c0(LiveLogTag.LIVE_TOP_PENDANT, "LiveTempPlayPendantController.addPendant", "bizType", p0.getId());
             b = tf.b;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoidOneRefs(p0, b, c.class, "2")) {
                a.p(p0, "item");
                b.d.add(p0);
                b.c.onNext(b.d);
             }
          }
       }else {
          this.b.b(p0);
       }
       return;
    }
    public final void e(boolean p0){
       int i;
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, op, "9")) {
          return;
       }
       op = this.h;
       if (op != null && !op.a()) {
          this.i = p0;
          return;
       }else if(p0){
          i = 0;
       }else {
          i = 8;
       }
       this.a.setVisibility(i);
       return;
    }
    public final void f(m p0){
       b b;
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "7")) {
          return;
       }
       if (this.e != null && p0.m() == 2) {
          p tf = this.f;
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoidOneRefs(p0, tf, b.class, "3")) {
             a.p(p0, "pendantItem");
             b.c0(LiveLogTag.LIVE_TOP_PENDANT, "LiveTempPlayPendantController.removePendant", "bizType", p0.getId());
             b = tf.b;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoidOneRefs(p0, b, c.class, "3")) {
                a.p(p0, "item");
                b.d.remove(p0);
                b.c.onNext(b.d);
             }
          }
       }else {
          this.b.j(p0);
       }
       return;
    }
    public void release(){
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, p.class, str)) {
          return;
       }
       p tb = this.b;
       if (tb != null) {
          Objects.requireNonNull(tb);
          j oj = j.class;
          if (!PatchProxy.applyVoid(objArray, tb, oj, "19")) {
             tb.i = true;
             tb.b.removeCallbacks(tb.g);
             if (!PatchProxy.applyVoid(objArray, tb, oj, "20")) {
                Iterator iterator1 = tb.h.clone().iterator();
                while (iterator1.hasNext()) {
                   iterator1.next().cancel();
                }
                tb.h.clear();
             }
             tb.d.clear();
             tb.e.clear();
             if (!PatchProxy.applyVoid(objArray, tb, oj, str)) {
                Iterator iterator = tb.f.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   View key = uEntry.getKey();
                   key.removeOnLayoutChangeListener(uEntry.getValue());
                }
                tb.f.clear();
             }
          }
       }
       this.c = true;
       this.d = false;
       this.g.clear();
       tb = this.h;
       if (tb != null) {
          tb.b();
       }
       return;
    }
}
