package com.kuaishou.live.common.core.component.comments.combo.b;
import im8.g;
import com.kuaishou.live.common.core.basic.livepresenter.LiveVCHostPresenter;
import oe1.f;
import oe1.e;
import com.kuaishou.live.common.core.component.comments.combo.b$a;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a51.c;
import com.kuaishou.live.service.ServiceProvider;
import com.kuaishou.live.lite.combocomment.LiveComboCommentAreaViewController;
import o93.d;
import p91.m;
import i81.g;
import uf1.a;
import android.view.ViewGroup;
import com.kuaishou.live.viewcontroller.ViewController;
import ip3.a;
import oe1.d;
import com.kuaishou.live.common.core.component.comments.combo.a;
import androidx.lifecycle.LifecycleOwner;
import z1.a;
import w51.a;
import android.widget.LinearLayout;
import et5.a;
import com.kuaishou.live.comments.view.a;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import rp5.a;
import lp3.c;
import lp3.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import gt5.a;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import ekd.m1;
import oe1.i;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g81.c;

public abstract class b extends LiveVCHostPresenter implements g	// class@001068
{
    public LinearLayout A;
    public a B;
    public b C;
    public final Runnable D;
    public final a E;
    public j F;
    public final PublishSubject G;
    public m w;
    public c x;
    public e y;
    public g z;
    public static String sLivePresenterClassName = "LiveComboCommentPresenter";

    public void b(){
       super();
       this.D = new f(this);
       this.E = new e(this);
       this.F = new b$a(this);
       this.G = PublishSubject.g();
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          ServiceProvider serviceProvi = new ServiceProvider();
          LiveComboCommentAreaViewController liveComboCom = new LiveComboCommentAreaViewController(this.W8(), 3000, this.w.getLiveStreamId(), this.G, this.B, serviceProvi, this.z.R6());
          this.E2(this.A, v10);
          serviceProvi.a().a(v10, new d(this), a.a);
       }
       if (a.C()) {
          this.A.setVisibility(8);
       }
       this.x.c4(this.E);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       super.J8();
       this.x.X1(this.E);
       this.A.removeCallbacks(this.D);
       this.A.removeAllViews();
       return;
    }
    public LifecycleOwner V8(){
       Object obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.y.a(a.class).t();
    }
    public abstract d W8();
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       int width = this.x.a2().getWidth();
       ViewGroup$LayoutParams layoutParams = this.A.getLayoutParams();
       if (layoutParams.width != width) {
          layoutParams.width = width;
          this.A.setLayoutParams(layoutParams);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a0841);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new i());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.w = this.t8("LIVE_BASIC_CONTEXT");
       this.x = this.q8(c.class);
       e uoe = this.r8("LIVE_SERVICE_MANAGER");
       this.y = uoe;
       this.z = uoe.a(g.class);
       this.B = this.t8("LIVE_LITE_BIDIRECTIONAL_DATA_TRANSFER_SERVICE");
       return;
    }
}
