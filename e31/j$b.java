package e31.j$b;
import com.kuaishou.live.bottombar.component.widget.d;
import e31.j$a;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e31.l;
import msd.a;
import k51.b;
import ekd.m1;
import com.airbnb.lottie.LottieAnimationView;
import e31.k;
import android.view.View$OnClickListener;
import z61.b;
import e31.j;
import w4.e;
import java.lang.Integer;

public class j$b extends d	// class@00209b
{
    public LottieAnimationView k;

    public void j$b(){
       super();
    }
    public void j$b(j$a p0){
       super();
    }
    public View C(Context p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, j$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b("LiveAudienceTaskCenterBottomBarItem::createView", new l(p0, p1));
    }
    public void D(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$b.class, "2")) {
          return;
       }
       this.k = m1.f(p0, 0x7f0a1a8d);
       this.h.setOnClickListener(new k(this));
       this.h.setBackgroundResource(R.drawable.arg_RES_7f0810dd);
       return;
    }
    public void F(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$b.class, "4")) {
          return;
       }
       if (!p0 instanceof j) {
          return;
       }
       if (p0.b != null) {
          this.k.setRepeatCount(-1);
          this.k.setComposition(p0.b);
          this.k.s();
       }else {
          this.k.f();
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, j$b.class, "5")) {
          return;
       }
       super.a();
       this.k.f();
       return;
    }
    public void q(int p0){
       j$b uob = j$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       this.h.setBackgroundResource(p0);
       return;
    }
}
