package g19.x;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.lang.Math;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus;
import java.lang.Integer;
import w85.a;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.CharSequence;
import android.widget.TextView;
import im8.f;
import com.yxcorp.gifshow.ad.detail.presenter.side.g;
import lnc.c3$a;
import lnc.c3;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.yxcorp.gifshow.ad.detail.presenter.side.h;
import java.lang.StringBuilder;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle$State;
import java.lang.Exception;
import ekd.y0;
import com.yxcorp.gifshow.ad.detail.presenter.side.i;

public final class x implements Runnable	// class@0023e1
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void x(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void run(){
       x b;
       SlidePlayAutoPlayNextPresenter slidePlayAut;
       SlidePlayAutoPlayNextPresenter obj;
       boolean b1;
       SlidePlayAutoPlayNextPresenter u0;
       try{
          b = this.b;
          slidePlayAut = SlidePlayAutoPlayNextPresenter.class;
          int i = b.S + 60;
          b.S = i;
          b.S = Math.min(i, 0x2af8);
          long l = b.W8();
          long l1 = b.Y8();
          if (!l1) {
          }else {
             float f = (float)(l1 - l) / 1000.00f;
             if (PatchProxy.isSupport(slidePlayAut)) {
                obj = PatchProxy.applyOneRefs(Float.valueOf(f), b, slidePlayAut, "16");
                if (obj != PatchProxyResult.class) {
                   b1 = obj.booleanValue();
                }else if(b.S8(f) <= 3){
                   b1 = true;
                }else {
                   b1 = false;
                }
             }else {
                goto label_0047 ;
             }
             long l2 = 300;
             if (b1) {
                if (!PatchProxy.applyVoid(null, b, slidePlayAut, "26") && b.O == null) {
                   obj = b.V0;
                   if (obj != null) {
                      b1 = (obj.f0(b.x) || b.V0.H(b.x))? true: false;
                      b.O = Boolean.valueOf(b1);
                   }
                }
                obj = b.O;
                if (obj != null && (obj.booleanValue() && (b.W == SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.ENABLE && !b.V8()))) {
                   b.a9();
                   i = b.S8(f);
                   if (!PatchProxy.isSupport(slidePlayAut) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), b, slidePlayAut, "15")) {
                      if (b.Z != null) {
                         if (!b.H.k() && (b.H.m() == null || b.H.m().intValue() > 1)) {
                            obj = b.v;
                            if (obj == null || obj.mPhotoCount > true) {
                            }
                         }
                      }else if(i > 0){
                         obj = b.s;
                         if (obj != null) {
                            View[] viewArray = new View[true];
                            viewArray[0] = obj;
                            n.Z(0, viewArray);
                            View[] viewArray1 = new View[true];
                            viewArray1[0] = b.t;
                            n.Z(0, viewArray1);
                            b.s.setText(String.valueOf(i));
                            b.R8(true);
                         }
                      }
                   }
                label_00ff :
                   u0 = b.J;
                   if (u0 != null) {
                      u0.set(Boolean.TRUE);
                   }
                   u0 = b.q;
                   if (u0 != null && u0.getVisibility()) {
                      c3.c(b.r, g.a);
                      n.W(b.q, 0, l2);
                      b.R8(true);
                      b.F.onNext(Boolean.TRUE);
                      u0 = b.s;
                      if (u0 != null && !PatchProxy.applyVoidOneRefs(u0.getText().toString(), b, slidePlayAut, "20")) {
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = "AUTO_PLAY_TOAST";
                         ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                         uContentPack.photoPackage = w1.f(b.x.getEntity());
                         u1.D0("", b.G, 0, uElementPack, uContentPack, null);
                      }
                      c3.c(b.u, h.a);
                   }
                }
             }else {
                u0 = b.q;
                if (u0 != null) {
                   int i1 = 8;
                   if (u0.getVisibility() != i1) {
                      n.W(b.q, i1, l2);
                      b.R8(0);
                      b.F.onNext(Boolean.FALSE);
                      c3.c(b.u, i.a);
                   }
                }
             }
          label_01ea :
             if (b.L != null) {
                if (b.W == SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.CURRENT_POSITION_DISABLE) {
                   if (b.R != null && b.P8()) {
                      b.W = SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.ENABLE;
                   }else if(b.R == null && b.h9(l, l1)){
                      b.W = SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.ENABLE;
                   }
                }else if(b.V8()){
                   if (b.R != null && b.P8()) {
                      b.Y = true;
                      b.e9();
                      b.c9();
                   }else if(b.R == null && b.h9(l, l1)){
                      b.Y = true;
                      b.e9();
                      b.c9();
                   }
                }
             }
             b.M = l;
          }
       }catch(java.lang.Exception e0){
          Object obj1 = e0;
          if (PatchProxy.applyVoidOneRefs(obj1, b, slidePlayAut, "18")) {
          }else {
             u1.R("AutoPlayNextCrash", b.c1+","+b.L+","+b.d1+","+b.G.getLifecycle().getCurrentState()+","+obj1.getMessage(), 14);
             b.e9();
             u0 = b.U0;
             if (u0 != null) {
                u0.e();
             }
          }
       }
       return;
    }
}
