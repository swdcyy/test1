package o3a.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import o3a.b$a;
import nsd.u;
import o3a.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import px6.b;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import mx6.d;
import tx6.a;
import android.view.View;
import m3a.t;

public final class b extends PresenterV2	// class@003276
{
    public final d p;
    public t q;
    public KwaiPlayerKitView r;
    public static final b$a s;

    static {
       b.s = new b$a(null);
    }
    public void b(){
       super();
       this.p = new b$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b tr = this.r;
       if (tr == null) {
          a.S("mKwaiPlayerKitView");
       }
       a uoa = tr.getPlayerKitContext().d(d.class);
       if (uoa != null) {
          uoa.d(this.p);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b tr = this.r;
       if (tr == null) {
          a.S("mKwaiPlayerKitView");
       }
       a uoa = tr.getPlayerKitContext().d(d.class);
       if (uoa != null) {
          uoa.d(this.p);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = p0.findViewById(R.id.kwai_player_kit_view);
       a.o(p0, "rootView.findViewById\(R.id.kwai_player_kit_view\)");
       this.r = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       Object obj = this.r8("play_controller");
       a.o(obj, "inject\(SmallWindowAccessIds.PLAY_CONTROLLER\)");
       this.q = obj;
       return;
    }
}
