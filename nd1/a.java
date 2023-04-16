package nd1.a;
import bq5.b;
import z51.c;
import com.kuaishou.live.basic.tk.LiveTkBridge;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import dp3.g;
import dp3.f;
import android.animation.Animator;
import bq5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import java.util.Objects;
import android.app.Activity;
import e3a.a;
import sx4.e;
import pp.c;
import z51.c$b;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;

public final class a implements b	// class@0032de
{
    public FrameLayout b;
    public final c c;
    public final LiveTkBridge d;

    public void a(c p0,LiveTkBridge p1){
       a.p(p0, "tkItem");
       a.p(p1, "tkBridge");
       super();
       this.c = p0;
       this.d = p1;
    }
    public void A(int p0){
       f.b(this, p0);
    }
    public Animator a(){
       return a.b(this);
    }
    public int b(){
       return a.f(this);
    }
    public void c(){
       f.c(this);
    }
    public Animator d(){
       return a.a(this);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       f.d(this);
       a tb = this.b;
       if (tb == null) {
          a.S("bubbleRootView");
       }
       tb.removeAllViews();
       return;
    }
    public View getView(){
       a obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("bubbleRootView");
       }
       return obj;
    }
    public int h(){
       return 2;
    }
    public void i(LayoutInflater p0,ViewGroup p1){
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "1")) {
          return;
       }
       a.p(p0, "inflater");
       a.p(p1, "container");
       View view = a.c(p0, R.layout.arg_RES_7f0d0a9c, p1, false);
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
       this.b = view;
       Activity uActivity = a.a(view);
       if (uActivity != null) {
          a.o(uActivity, "it");
          if (!PatchProxy.applyVoidOneRefs(uActivity, this, uoa, "4")) {
             e uoe = this.c.a(this.d, uActivity);
             if (uoe != null) {
                a tb = this.b;
                if (tb == null) {
                   a.S("bubbleRootView");
                }
                tb.addView(uoe.getView());
             }else {
                b.B(c.i.a(), "create TK view failed: "+this.c);
             }
          }
       }
       return;
    }
    public int r(){
       return a.d(this);
    }
    public int z(){
       return a.e(this);
    }
}
