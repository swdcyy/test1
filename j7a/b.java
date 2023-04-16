package j7a.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import r3a.f;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import java.lang.IllegalStateException;
import java.lang.Boolean;
import android.widget.FrameLayout;
import com.kwai.robust.PatchProxyResult;
import uc6.c;
import uc6.r;
import im8.f;
import android.view.View;
import ekd.m1;
import android.view.ViewGroup;
import com.kwai.framework.player.ui.impl.KwaiContentFrame;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.util.List;
import px6.b;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule;
import com.kwai.library.kwaiplayerkit.framework.module.ui.UiModule;
import de5.a;

public class b extends PresenterV2	// class@002925
{
    public KwaiPlayerKitView p;
    public a q;
    public PhotoDetailParam r;
    public boolean s;
    public ViewGroup t;
    public KwaiContentFrame u;
    public f v;
    public static final boolean w;

    public void b(boolean p0){
       super();
       this.s = p0;
    }
    public void E8(){
       b tp;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       if (this.r.getDetailPlayConfig().usePlayerKitPlayer() && !PatchProxy.applyVoid(objArray, this, uob, "5")) {
          tp = this.p;
          if (tp != null) {
             this.q.Q(tp);
          }else {
             throw new IllegalStateException("should init before this");
          }
       }
       int i = 8;
       int i1 = 0x7f0a15e4;
       if (this.s != null) {
          tp = this.p;
          if (tp != null) {
             tp.setTag(i1, Boolean.TRUE);
             tp = this.p;
             int i2 = (this.r.getDetailPlayConfig().usePlayerKitPlayer())? 0: 8;
             tp.setVisibility(i2);
          }
       }
       tp = this.u;
       if (tp != null) {
          tp.setTag(i1, Boolean.TRUE);
          tp = this.u;
          if (!this.r.getDetailPlayConfig().usePlayerKitPlayer()) {
             i = 0;
          }
          tp.setVisibility(i);
       }
       tp = this.v;
       Object obj = PatchProxy.apply(objArray, this, uob, "7");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else if(this.r.getDetailPlayConfig().usePlayerKitPlayer()){
          objArray = new r(this.p);
       }
       tp.set(objArray);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b tp = this.p;
       if (tp != null) {
          tp.release();
       }
       return;
    }
    public void doBindView(View p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "3")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a3e7f);
       this.u = m1.f(p0, 0x7f0a39ad);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uob, "6")) {
          if (this.s != null) {
             uob = this.t;
             if (uob != null) {
                int i = 0x7f0a3a21;
                KwaiPlayerKitView kwaiPlayerKi = uob.findViewById(i);
                this.p = kwaiPlayerKi;
                if (kwaiPlayerKi == null) {
                   int i1 = 0;
                   while (i1 < this.t.getChildCount() && !this.t.getChildAt(i1) instanceof KwaiContentFrame) {
                      i1 = i1 + 1;
                   }
                   KwaiPlayerKitView kwaiPlayerKi1 = new KwaiPlayerKitView(this.t.getContext());
                   this.p = kwaiPlayerKi1;
                   kwaiPlayerKi1.setId(i);
                   this.t.addView(this.p, (i1 + 1), new FrameLayout$LayoutParams(-1, -1));
                }
             }
          }else {
             this.p = new KwaiPlayerKitView(this.getContext());
          }
          if (this.s != null) {
             this.p.h(objArray, objArray);
          }else {
             this.p.h(objArray, objArray);
             b tp = this.p;
             tp.d(tp.getPlayerKitContext().i(DefaultFrameUiModule.class));
          }
       }
    label_00a6 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.r = this.q8(PhotoDetailParam.class);
       this.q = this.q8(a.class);
       this.v = this.x8("DETAIL_CONTENT_FRAME_INTERFACE");
       return;
    }
}
