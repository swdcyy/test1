package ab1.b;
import im8.g;
import k51.c;
import java.util.HashMap;
import ab1.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import android.view.View;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import i2b.a;
import android.view.ViewGroup;
import ekd.m1;
import android.widget.ViewFlipper;
import lnc.a1;
import android.view.animation.TranslateAnimation;
import android.view.animation.Animation;
import com.kwai.robust.PatchProxyResult;
import ab1.f;
import java.util.Map;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import p91.m;

public class b extends c implements g	// class@000056
{
    public b A;
    public g B;
    public m p;
    public LiveTopPendantTempPlayService q;
    public ViewGroup r;
    public ViewFlipper s;
    public final Map t;
    public long u;
    public int v;
    public boolean w;
    public boolean x;
    public m y;
    public g$a z;
    public static String sLivePresenterClassName = "LiveWishListAndRampagePendantPresenter";

    public void b(){
       super();
       this.t = new HashMap();
       this.v = 0;
       this.w = false;
       this.x = true;
       this.B = new b$a(this);
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b9.a(this.A);
       return;
    }
    public void doBindView(View p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "2")) {
          return;
       }
       ViewGroup viewGroup = a.a(this.getContext(), R.layout.arg_RES_7f0d0ce3);
       this.r = viewGroup;
       this.s = m1.f(viewGroup, 0x7f0a2838);
       if (!PatchProxy.applyVoid(null, this, uob, "7")) {
          int i = a1.d(R.dimen.arg_RES_7f07030d);
          TranslateAnimation translateAni = new TranslateAnimation(0, 0, (float)i, 0);
          translateAni.setDuration(500);
          this.s.setInAnimation(translateAni);
          translateAni = new TranslateAnimation(0, 0, 0, (float)(- i));
          translateAni.setDuration(500);
          this.s.setOutAnimation(translateAni);
          this.s.setFlipInterval(6000);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new f());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.s8(LiveTopPendantTempPlayService.class);
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       return;
    }
}
