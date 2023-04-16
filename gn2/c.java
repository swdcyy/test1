package gn2.c;
import c12.f;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import lnc.a1;
import gn2.i;
import androidx.lifecycle.MutableLiveData;
import gn2.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import x61.c;
import lp3.c;
import lp3.i;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dt5.c;
import jv1.b;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import p91.m;
import z61.b;
import crd.b;
import lnc.b9;
import ry1.b;
import brd.t;
import t45.d;
import brd.z;
import gn2.a;
import gn2.b;
import erd.g;

public class c extends f	// class@002b4f
{
    public b K;
    public i L;
    public c M;
    public b N;
    public LiveBizParam O;
    public m P;
    public WishLightGiftBoxComboTextAnimationView Q;
    public final i R;
    public final MutableLiveData S;
    public final a T;
    public static final List U;
    public static final int V;
    public static String sLivePresenterClassName;

    static {
       c.U = LiveLogTag.LIVE_WISH_LIGHT.appendTag("LiveWishLightGiftEntry");
       c.V = a1.e(28.00f);
    }
    public void c(){
       super();
       this.R = new i();
       this.S = new MutableLiveData();
       this.T = new c$a(this);
    }
    public void Q(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "5")) {
          return;
       }
       this.L.a(c.class).O0(1038);
       return;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, c.class, "3");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       super.j8();
       this.L = this.r8("LIVE_SERVICE_MANAGER");
       this.M = this.s8(c.class);
       this.N = this.s8(b.class);
       this.O = this.q8(LiveBizParam.class);
       this.P = this.r8("LIVE_BASIC_CONTEXT");
       return;
    }
    public void x(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "2")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          c tR = this.R;
          tR.mFeatureId = 1038;
          tR.mIsVisible = Boolean.FALSE;
          this.S.setValue(tR);
          this.L.a(c.class).v1(this.S);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "6")) {
          b9.a(this.K);
          this.K = this.L.a(b.class).W().observeOn(d.c).subscribe(new a(this), b.b);
       }
       return;
    }
}
