package b82.d;
import android.widget.LinearLayout;
import java.lang.Object;
import b82.e;
import ea1.a;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import b82.b;
import java.lang.Runnable;
import tp5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b82.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import b82.d$a;
import java.lang.Boolean;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import b82.c;
import tp5.c$a;

public class d	// class@000368
{
    public LinearLayout a;
    public boolean b;
    public a c;
    public d$a d;
    public c e;
    public boolean f;
    public a g;

    public void d(LinearLayout p0,boolean p1){
       super();
       this.b = false;
       this.c = new e();
       this.a = p0;
       this.f = p1;
       if (p1) {
          p0.setVisibility(4);
          a uoa = new a(ViewElement.ENTER_ROOM_EFFECT, new b(this));
          this.g = uoa;
          uoa.c();
       }
       return;
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.c.a(p0);
       b.Z(LiveLogTag.LIVE_ENTER_ROOM_EFFECT, "enter room v2 add task ");
       this.e();
       return;
    }
    public void b(){
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "3")) {
          return;
       }
       this.c.b();
       if (!PatchProxy.applyVoid(null, this, uod, "8")) {
          uod = this.e;
          if (uod != null) {
             uod.clear();
             this.c(this.e).removeAllViews();
             this.e = null;
          }
          this.a.removeAllViews();
       }
       this.b = false;
       uod = this.g;
       if (uod != null) {
          uod.b();
       }
       return;
    }
    public final LinearLayout c(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.E1() != null) {
          return p0.E1();
       }
       return this.a;
    }
    public void d(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "7")) {
          return;
       }
       uod = this.d;
       if (uod != null) {
          uod.a(p0);
       }
       return;
    }
    public boolean e(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uod, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.b != null) {
          return b;
       }
       obj = PatchProxy.apply(objArray, this, uod, "4");
       boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): this.c.d();
       if (b1) {
          return b;
       }else if(this.f != null){
          d tg = this.g;
          if (tg != null && !tg.a()) {
             return b;
          }
       }
       c uoc = this.c.c();
       if (uoc == null) {
          return b;
       }else {
          this.b = true;
          if (!PatchProxy.applyVoidOneRefs(uoc, this, uod, "6")) {
             this.e = uoc;
             View view = uoc.U2();
             if (view == null) {
                this.b = b;
                this.e = objArray;
                if (!this.e()) {
                   this.d(b);
                }
             }else {
                LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
                layoutParams.gravity = 0x800005;
                LinearLayout linearLayout = this.c(uoc);
                linearLayout.removeAllViews();
                linearLayout.addView(view, b, layoutParams);
                view.setVisibility(4);
                this.e.Y0(view, new c(this, view, linearLayout));
             }
          }
          return true;
       }
    }
}
