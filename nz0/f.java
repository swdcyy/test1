package nz0.f;
import im8.g;
import k51.c;
import nz0.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView;
import mk1.a;
import java.util.ArrayList;
import nz0.f$b;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView$d;
import nz0.e;
import java.lang.Runnable;
import android.widget.RelativeLayout;
import nz0.c;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import nz0.a;
import ql1.d$b;
import ql1.c;
import nz0.b;
import nz0.d;
import nz0.f$c;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView$f;
import java.util.Objects;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import mk1.h;
import xk1.a;
import xk1.b;
import ekd.m1;
import android.widget.Space;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.widget.LiveAudienceGiftBoxView;
import com.kwai.robust.PatchProxyResult;
import nz0.i;
import java.util.Map;
import java.util.HashMap;
import t02.a0;
import mk1.b;
import lp3.i;
import om1.a;
import lp3.c;

public class f extends c implements g	// class@00343a
{
    public b A;
    public LiveGiftBoxPopupView B;
    public boolean C;
    public a D;
    public a E;
    public List F;
    public ImageView p;
    public Space q;
    public LiveAudienceGiftBoxView r;
    public View s;
    public View t;
    public a u;
    public a0 v;
    public h w;
    public d$b x;
    public i y;
    public a z;
    public static String sLivePresenterClassName = "LiveAudienceGiftBoxClosePresenter";

    public void f(){
       super();
       this.C = false;
       this.E = new f$a(this);
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "3")) {
          return;
       }
       this.B = this.m8();
       a b = this.u.b;
       if (b == null) {
          b = new ArrayList();
       }
       this.F = b;
       this.B.setOnDismissListener(new f$b(this));
       this.r.post(new e(this));
       if (!PatchProxy.applyVoid(objArray, this, uof, "8")) {
          this.p.setOnClickListener(new c(this));
          a uoa = new a(this.p, this.q, this.s, this.x);
          this.D = uoa;
          if (!PatchProxy.applyVoid(objArray, uoa, a.class, "1")) {
             uoa.i.K2(uoa.e);
          }
       }
       this.s.setOnClickListener(new b(this));
       this.t.setOnClickListener(new d(this));
       this.B.setOnShowListener(new f$c(this));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "4")) {
          return;
       }
       f tB = this.B;
       if (tB != null) {
          tB.setOnDismissListener(objArray);
          this.B.setOnShowListener(objArray);
          tB = this.B;
          Objects.requireNonNull(tB);
          if (!PatchProxy.applyVoid(objArray, tB, LiveGiftBoxPopupView.class, "20") && tB.getParent() != null) {
             tB.getParent().removeView(tB);
          }
       }
       tB = this.D;
       if (tB != null) {
          Objects.requireNonNull(tB);
          if (!PatchProxy.applyVoid(objArray, tB, a.class, "2")) {
             tB.d();
             tB.i.p3(tB.e);
          }
       }
       this.C = false;
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       f tw = this.w;
       if (tw.y != null) {
          tw.p.g(false);
          this.w.y.a();
       }
       tw = this.B;
       if (tw != null) {
          tw.i();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a10a4);
       this.q = m1.f(p0, 0x7f0a10a5);
       this.r = m1.f(p0, 0x7f0a10a2);
       this.s = m1.f(p0, 0x7f0a0791);
       this.t = m1.f(p0, 0x7f0a109a);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new i());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.u = this.q8(a.class);
       this.v = this.q8(a0.class);
       this.w = this.q8(h.class);
       this.x = this.r8("LIVE_GIFT_PANEL_EVENT_SERVICE");
       this.A = this.q8(b.class);
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.y = oi;
       this.z = oi.a(a.class);
       return;
    }
}
