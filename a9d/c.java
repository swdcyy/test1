package a9d.c;
import android.view.View;
import android.app.Activity;
import java.lang.Object;
import com.yxcorp.plugin.search.entity.BubbleConfig;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.kwai.library.widget.popup.bubble.a$c;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import a9d.a;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import a9d.b;
import a9d.c$a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import a9d.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.a;
import a9d.f;
import f9d.a;

public abstract class c	// class@0000a6
{
    public final View a;
    public final Activity b;
    public a c;
    public a d;
    public f e;

    public void c(View p0,Activity p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public abstract boolean a(BubbleConfig p0);
    public final Animator b(View p0,float p1,float p2){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, c.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float[] uofloatArray = new float[]{p1,p2};
       return ObjectAnimator.ofFloat(p0, View.ALPHA, uofloatArray).setDuration(100);
    }
    public a$c c(BubbleConfig p0){
       a obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(this.b);
       obj.K0(KwaiBubbleOption.f);
       obj.D0(BubbleInterface$Position.BOTTOM);
       obj.o0(this.a);
       obj.F0(p0.mTitle);
       obj.T(((long)p0.mStaySeconds * 1000));
       obj.z(true);
       obj.A(true);
       obj.P(true);
       obj.E(false);
       obj.G(new a(this));
       obj.O(new b(this));
       int i = this.d();
       if (i) {
          obj.L(new c$a(this, i, p0));
       }
       obj.M(new c$b(this, p0));
       return obj;
    }
    public int d(){
       return 0;
    }
    public void e(View p0,BubbleConfig p1){
    }
    public void f(a p0,BubbleConfig p1){
    }
    public final void g(f p0){
       this.e = p0;
    }
    public final void h(a p0){
       this.d = p0;
    }
}
