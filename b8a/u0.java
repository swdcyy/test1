package b8a.u0;
import g9a.e;
import com.yxcorp.gifshow.detail.slidev2.presenter.m;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import w85.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Float;
import com.kwai.slide.play.detail.utils.ExperimentUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class u0 implements e	// class@0003fd
{
    public final m a;

    public void u0(m p0){
       this.a = p0;
    }
    public final void a(boolean p0,float p1,float p2){
       boolean b;
       float f1;
       String str;
       u0 ta = this.a;
       Objects.requireNonNull(ta);
       m om = m.class;
       m obj = PatchProxy.apply(null, ta, om, "13");
       ClientEvent$ElementPackage uElementPack = null;
       ClientContent$ContentPackage uContentPack = null;
       int i = 1;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(ta.D.g() && ta.C.b1() - uElementPack){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          ta.W8(p0);
          if (p0 && (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(p1), Float.valueOf(p2), ta, om, "10"))) {
             float f = 3.00f;
             obj = 0x40000000;
             if (ExperimentUtils.d() == i) {
                f1 = (float)n.k(ta.getActivity()) / f;
                if (p1 - uElementPack > 0 && p1 - f1 < 0) {
                   str = "底部左边";
                }else if(p1 - f1 >= 0 && p1 - (f1 * obj) <= 0){
                   str = "底部中间";
                }else {
                   str = "底部右边";
                }
             }else {
                f1 = (float)n.j(ta.getActivity()) / f;
                if (p1 - ((float)n.k(ta.getActivity()) / obj) < 0) {
                   uContentPack = 1;
                }
                if (p2 - uElementPack > 0 && p2 - f1 < 0) {
                   if (uContentPack != null) {
                      str = "左上";
                   }else {
                      str = "右上";
                   }
                }else if(p2 - f1 >= 0 && p2 - (f1 * obj) <= 0){
                   if (uContentPack != null) {
                      str = "左中";
                   }else {
                      str = "右中";
                   }
                }else if(uContentPack != null){
                   str = "左下";
                }else {
                   str = "右下";
                }
             }
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LONG_PRESS_MUTI_SPEED_ADJUST";
             i3 oi3 = i3.f();
             oi3.d("click_area", str);
             oi3.c("muti_speed_option", Float.valueOf(ExperimentUtils.e()));
             uElementPack.params = oi3.e();
             uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(ta.w.getEntity());
             u1.M("", ta.v, 1, uElementPack, uContentPack, null);
          }
       }
       return;
    }
}
