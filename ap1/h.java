package ap1.h;
import im8.g;
import k51.c;
import ap1.h$a;
import ap1.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ap1.e;
import vq5.b;
import vq5.d;
import tkd.b;
import tkd.d;
import ym5.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.b;
import ekd.k1;
import androidx.fragment.app.KwaiDialogFragment;
import va1.m;
import com.kwai.robust.PatchProxyResult;
import ap1.k;
import java.util.Map;
import java.util.HashMap;
import rg1.a;
import p91.m;
import lp3.e;

public abstract class h extends c implements g	// class@000275
{
    public KwaiDialogFragment p;
    public e q;
    public m r;
    public d s;
    public a t;
    public a u;
    public final b v;
    public static String sLivePresenterClassName = "LiveMagicBoxPanelBasePresenter";

    public void h(){
       super();
       this.u = new h$a(this);
       this.v = new f(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.s.t5("magicboxpanel", new e(this));
       if (d.a(0x4c5dd1b8).f2() && this.getActivity() instanceof GifshowActivity) {
          this.getActivity().i3(this.v);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       k1.n(this);
       this.s.Z4("magicboxpanel");
       if (d.a(0x4c5dd1b8).f2() && this.getActivity() instanceof GifshowActivity) {
          this.getActivity().s3(this.v);
       }
       return;
    }
    public abstract void P8();
    public void R8(){
       if (PatchProxy.applyVoid(null, this, h.class, "7")) {
          return;
       }
       m.b(this.p);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, h.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(h.class, new k());
       }else {
          obj.put(h.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.t = this.s8(a.class);
       this.r = this.r8("LIVE_BASIC_CONTEXT");
       this.s = this.r8("LIVE_ROUTER_SERVICE");
       this.q = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
}
