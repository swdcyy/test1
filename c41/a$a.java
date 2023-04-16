package c41.a$a;
import gs4.b;
import c41.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import p51.c;
import android.app.Activity;
import android.view.View;
import ga1.b;
import va1.n0;
import com.yxcorp.utility.n;
import com.kuaishou.live.common.core.basic.player.AdaptPlayViewReason;
import ga1.a;
import lp3.e;
import lp3.c;
import lp3.b;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Number;
import android.view.ViewGroup;

public class a$a implements b	// class@000469
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void Gg(boolean p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       a o = uoa.O;
       a l = uoa.L;
       a m = uoa.M;
       Objects.requireNonNull(uoa);
       a uoa1 = PatchProxy.applyThreeRefs(o, l, m, uoa, a.class, "2");
       if (uoa1 != PatchProxyResult.class) {
       }else if(uoa.P == null){
          uoa.P = c.d(o, l, m, false);
       }
       uoa1 = uoa.P;
       uoa1.k(p0);
       b uob = new b(false, 0x3f100000, this.b.K.getBottom(), n0.f(), n.l(this.b.O), AdaptPlayViewReason.DEFAULT, null);
       uoa1.a(p0);
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public Context getContext(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getContext();
    }
    public View getPlayerView(){
       return this.b.M;
    }
    public int j4(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.K.getBottom();
    }
    public void kf(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       this.b.N.addView(p0);
       return;
    }
    public int mk(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n0.f();
    }
}
