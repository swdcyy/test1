package dw1.b$c;
import pq5.c;
import dw1.b;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.i;
import java.util.List;
import java.util.Arrays;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.g;
import java.util.Collection;
import java.lang.Float;
import com.kwai.feature.api.live.base.service.pendant.LivePendantContainerHideFlags;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerPosition;
import rq5.a;
import java.lang.Boolean;
import android.widget.RelativeLayout;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.LiveRightPendantView;
import lp3.e;
import lp3.c;
import lp3.b;
import java.lang.Integer;
import java.util.Map;
import com.kuaishou.live.common.core.component.pendant.LivePendantLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import ekd.k1;
import dw1.c;
import java.lang.Runnable;
import dw1.a;
import ekd.q;

public class b$c implements c	// class@002042
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void Be(LivePendantContainerScene[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "9")) {
          return;
       }
       b b = this.b.B;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(p0, b, i.class, "31")) {
          i r = b.r;
          if (r != null) {
             List list = Arrays.asList(p0);
             if (!PatchProxy.applyVoidOneRefs(list, r, g.class, "7")) {
                r.a.removeAll(list);
             }
          }
       }
       return;
    }
    public void C2(float p0){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "13")) {
          return;
       }
       b b = this.b.B;
       Objects.requireNonNull(b);
       i oi = i.class;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), b, oi, "53")) {
          b.B = p0;
          b.Rk("updateScale");
       }
       return;
    }
    public void Gm(LivePendantContainerHideFlags p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "5")) {
          return;
       }
       this.b.B.c6(0, (LivePendantContainerPosition.TOP.flag | LivePendantContainerPosition.BOTTOM.flag), p0);
       return;
    }
    public void Jg(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "3")) {
          return;
       }
       this.b.B.N5(p0);
       return;
    }
    public void Jn(boolean p0){
       int i;
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "12")) {
          return;
       }
       b b = this.b.B;
       Objects.requireNonNull(b);
       i oi = i.class;
       if (!PatchProxy.isSupport(oi) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), b, oi, "54") && b.M1() != null)) {
          i = 8;
          if (p0 && b.f != b.h) {
             b.g.removeView(b.i);
             b.g.setVisibility(i);
             b.M1().setLayoutParams(b.f.getLayoutParams());
             b.M1().addView(b.i);
             b.M1().setVisibility(0);
             b.f = b.M1();
          }else if(!p0 && b.f != b.g){
             b.M1().removeView(b.i);
             b.M1().setVisibility(i);
             b.g.setLayoutParams(b.f.getLayoutParams());
             b.g.addView(b.i);
             b.g.setVisibility(0);
             b.f = b.g;
          }
       }
       return;
    }
    public View Pg(){
       Object obj = PatchProxy.apply(null, this, b$c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.B.f;
    }
    public View Th(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, b$c.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b.B;
       Objects.requireNonNull(obj);
       View view = PatchProxy.apply(objArray, obj, i.class, "24");
       if (view != patchProxyRe) {
       }else {
          view = obj.i.getBottomContainerView();
       }
       return view;
    }
    public void a8(LivePendantContainerHideFlags p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "6")) {
          return;
       }
       this.b.B.c6(8, (LivePendantContainerPosition.TOP.flag | LivePendantContainerPosition.BOTTOM.flag), p0);
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void eo(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "2")) {
          return;
       }
       Boolean uBoolean = this.b.D.get(Integer.valueOf(p0.e()));
       if (uBoolean != null && uBoolean.booleanValue() == true) {
          b.Z(LivePendantLogTag.LIVE_RIGHT_BOTTOM_PENDANT, p0.i()+"挂件已经被禁用, 挂件类型："+p0.e());
          return;
       }else {
          p0.u(LivePendantContainerPosition.BOTTOM);
          this.b.B.G(p0);
          k1.n(this.b.C);
          k1.s(new c(this, p0), this.b.C, 110);
          return;
       }
    }
    public void g9(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "4")) {
          return;
       }
       k1.n(this.b.C);
       this.b.B.N5(p0);
       if (p0 != null) {
          this.b.A.gb(p0.e());
       }
       return;
    }
    public void gj(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       p0.u(LivePendantContainerPosition.TOP);
       this.b.B.G(p0);
       return;
    }
    public void pm(LivePendantContainerScene[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "8")) {
          return;
       }
       b b = this.b.B;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(p0, b, i.class, "30")) {
          i r = b.r;
          if (r != null) {
             r.a(Arrays.asList(p0));
          }
       }
       return;
    }
    public void q8(LivePendantContainerHideFlags p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "7")) {
          return;
       }
       b b = this.b.B;
       LivePendantContainerPosition flag = (b.x4())? LivePendantContainerPosition.TOP.flag: 0;
       b.c6(8, (flag | LivePendantContainerPosition.BOTTOM.flag), p0);
       return;
    }
    public void qo(int p0,boolean p1){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoc, "14")) {
          return;
       }
       this.b.D.put(Integer.valueOf(p0), Boolean.valueOf(p1));
       i x = this.b.B.x;
       if (q.f(x)) {
          return;
       }
       int i = x.size() - 1;
       while (i >= 0) {
          if (x.get(i).e() == 1) {
             this.b.G.g9(x.get(i));
          }
          i--;
       }
       return;
    }
}
