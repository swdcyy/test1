package i19.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import gr.c;
import java.util.Objects;
import android.content.Context;
import ekd.m1;

public class a extends PresenterV2	// class@002602
{
    public c p;
    public View q;
    public View r;
    public View s;
    public View t;
    public View u;
    public View v;
    public View w;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.p.a("bottom_container", this.q);
       this.p.a("bottom_action_bar_container", this.r);
       this.p.a("top_action_bar_container", this.s);
       this.p.a("msg_container", this.u);
       this.p.a("web_card_container", this.t);
       this.p.a("mix_bar_container", this.w);
       this.p.a("play_end_container", this.v);
       a tp = this.p;
       View view = this.m8();
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoidOneRefs(view, tp, c.class, "2")) {
          tp.c = view;
          if (tp.d == null && view != null) {
             tp.d = view.getContext();
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.p.b("bottom_container");
       this.p.b("bottom_action_bar_container");
       this.p.b("top_action_bar_container");
       this.p.b("msg_container");
       this.p.b("web_card_container");
       this.p.b("mix_bar_container");
       this.p.b("play_end_container");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3ea7);
       this.r = m1.f(p0, 0x7f0a00d7);
       this.s = m1.f(p0, 0x7f0a00d8);
       this.t = m1.f(p0, 0x7f0a0175);
       this.u = m1.f(p0, 0x7f0a3ea3);
       this.w = m1.f(p0, 0x7f0a016a);
       this.v = m1.f(p0, 0x7f0a0167);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(c.class);
       return;
    }
}
