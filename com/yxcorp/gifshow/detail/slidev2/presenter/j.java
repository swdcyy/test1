package com.yxcorp.gifshow.detail.slidev2.presenter.j;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.k;
import java.lang.Object;
import d0a.n;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.e;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.lang.Float;
import com.kwai.slide.play.detail.utils.ExperimentUtils;
import b8a.n0;
import java.lang.Runnable;
import t45.c;
import sz9.w;
import androidx.fragment.app.FragmentActivity;
import sz9.w$b;
import p5a.e;
import de5.a;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.b;
import java.lang.Boolean;
import brd.y;
import xx9.a;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;

public final class j implements g	// class@0019bf
{
    public final k b;

    public void j(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       k ok = k.class;
       if (tb.F == null) {
       }else {
          n a = p0.a;
          boolean b = true;
          if (a != null) {
             if (a != b) {
                if (a != 2) {
                   if (a == 5) {
                      RxBus.f.b(new e(tb.getActivity(), false, b));
                      if (!PatchProxy.applyVoid(null, tb, ok, "9")) {
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = "SMALL_WINDOW_PLAY_FUNCTION_BUTTON";
                         p0 = i3.f();
                         p0.c("is_instation", Integer.valueOf(b));
                         p0.d("small_window_action", "ENTER");
                         uElementPack.params = p0.e();
                         ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                         uContentPack.photoPackage = w1.f(tb.r.getEntity());
                         u1.M("", tb.p, 1, uElementPack, uContentPack, null);
                      }
                   }
                }else if(tb.getActivity() == null){
                   a = p0.b;
                   if (a > 0) {
                      if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Float.valueOf(a), tb, ok, "7")) {
                         if (ExperimentUtils.a()) {
                            c.a(new n0(tb, a));
                         }else {
                            tb.R8(a);
                         }
                      }
                      w.i.a(tb.getActivity()).updateSpeed(p0.b);
                      if (tb.y.getPlayer() != null && (tb.y.getPlayer().getIKwaiMediaPlayer() != null && tb.y.getPlayer().getIKwaiMediaPlayer().getSpeed(0x3f800000) - p0.b)) {
                         tb.y.getPlayer().setSpeed(p0.b);
                      }
                   }
                }
             }else {
                tb.x.onNext(Boolean.TRUE);
             }
          }else if(tb.s.c()){
             tb.s.d(new ChangeScreenVisibleEvent(tb.r, ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN));
             tb.V8(b);
          }
       }
       return;
    }
}
