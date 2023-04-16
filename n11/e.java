package n11.e;
import c12.f;
import n11.e$a;
import n11.e$b;
import n11.e$c;
import android.view.GestureDetector;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import n11.e$d;
import android.view.GestureDetector$OnGestureListener;
import n11.e$e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import androidx.fragment.app.c$b;
import kq5.b;
import t02.a0;
import a32.b;
import a32.j;
import l11.j$a;
import l11.j;
import n11.c;
import java.lang.Runnable;
import android.widget.LinearLayout;
import android.view.View;
import n11.a;
import android.view.View$OnTouchListener;
import n11.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.follow.cache.c;
import no1.j;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatReady;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import ekd.m1;
import pb1.a;

public class e extends f	// class@00327b
{
    public a0 K;
    public j L;
    public j M;
    public b N;
    public a O;
    public View P;
    public LinearLayout Q;
    public View R;
    public View S;
    public final c$b T;
    public final b U;
    public final j$a V;
    public final GestureDetector W;
    public final GestureDetector X;
    public static String sLivePresenterClassName = "LiveLineAudienceFloatContainerPresenter";

    public void e(){
       super();
       this.T = new e$a(this);
       this.U = new e$b(this);
       this.V = new e$c(this);
       this.W = new GestureDetector(this.getContext(), new e$d(this));
       this.X = new GestureDetector(this.getContext(), new e$e(this));
    }
    public void Q(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "4")) {
          return;
       }
       this.N.a(this.T);
       a0 uoa0 = this.K.f2;
       if (uoa0 != null) {
          uoa0.b(this.U);
       }
       this.M.b(this.V);
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       this.Q.postOnAnimationDelayed(new c(this), 100);
       this.S.setClickable(true);
       this.S.setOnTouchListener(new a(this));
       this.R.setClickable(true);
       this.R.setOnTouchListener(new b(this));
       return;
    }
    public boolean b9(){
       Object obj = PatchProxy.apply(null, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b().c(this.c9());
    }
    public String c9(){
       UserInfos$UserInfo userId;
       j obj = PatchProxy.apply(null, this, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.L.f;
       if (obj != null) {
          LiveLineChatMessages$SCLiveLineChatReady counterpartA = obj.counterpartAuthor;
          if (counterpartA != null) {
             userId = counterpartA.userId;
          label_001f :
             return String.valueOf(userId);
          }
       }
       userId = 0;
       goto label_001f ;
    }
    public void d9(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       this.Q.setVisibility(8);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.P = m1.f(p0, 0x7f0a30e6);
       this.Q = m1.f(p0, 0x7f0a209f);
       this.S = m1.f(p0, 0x7f0a20a9);
       this.R = m1.f(p0, 0x7f0a20a5);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.q8(a0.class);
       this.L = this.q8(j.class);
       this.M = this.q8(j.class);
       this.N = this.r8("FRAGMENT_LIFE_CYCLE_SERVICE");
       this.O = this.t8("AUDIENCE_LIVE_REDUCE");
       return;
    }
    public void x(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "3")) {
          return;
       }
       this.N.c(this.T);
       a0 uoa0 = this.K.f2;
       if (uoa0 != null) {
          uoa0.a(this.U);
       }
       this.M.c(this.V);
       this.d9();
       return;
    }
}
