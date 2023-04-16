package com.kwai.component.photo.detail.slide.negative.operation.FeedbackSpeedPanelPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.component.photo.detail.slide.negative.operation.FeedbackSpeedPanelPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import ve5.e;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import java.util.List;
import com.kwai.component.photo.detail.slide.negative.operation.FeedbackSpeedPanelPresenter$c;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import android.animation.ValueAnimator;
import kf5.d;
import android.animation.Animator$AnimatorListener;
import java.util.ArrayList;
import kf5.e;
import kf5.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import bt7.c;
import android.animation.TimeInterpolator;

public final class FeedbackSpeedPanelPresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@000a73
{

    public void FeedbackSpeedPanelPresenter$onBind$1(FeedbackSpeedPanelPresenter p0){
       super(1, p0, FeedbackSpeedPanelPresenter.class, "showOrCloseSpeedPanel", "showOrCloseSpeedPanel\(Lcom/kwai/component/photo/detail/slide/event/SpeedSecondPanelShowEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(e p0){
       e a;
       ValueAnimator valueAnimato;
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedbackSpeedPanelPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, FeedbackSpeedPanelPresenter.class, "4")) {
          a = p0.a;
          if (a != null && !a.isEmpty()) {
             a = p0.a;
             a.o(a, "event.mSpeedList");
             treceiver.u = a;
             treceiver.x = p0.a.size();
             FeedbackSpeedPanelPresenter$c uoc = new FeedbackSpeedPanelPresenter$c(treceiver);
             treceiver.v = uoc;
             FeedbackSpeedPanelPresenter u = treceiver.u;
             if (u == null) {
                a.S("mSpeedList");
             }
             uoc.W0(u);
             FeedbackSpeedPanelPresenter t = treceiver.t;
             if (t == null) {
                a.S("mSpeedRecyclerView");
             }
             u = treceiver.v;
             if (u == null) {
                a.S("mSpeedAdapter");
             }
             t.setAdapter(u);
             int i = 2;
             if (p0.b != null) {
                valueAnimato = ValueAnimator.ofFloat(new float[i]{0,0x3f800000});
                a.o(valueAnimato, "ValueAnimator.ofFloat\(0f, 1f\)");
                valueAnimato.addListener(new d(treceiver));
             }else {
                treceiver.w.clear();
                valueAnimato = ValueAnimator.ofFloat(new float[i]{0x3f800000,0});
                a.o(valueAnimato, "ValueAnimator.ofFloat\(1f, 0f\)");
                valueAnimato.addListener(new e(treceiver));
             }
             valueAnimato.addUpdateListener(new f(treceiver));
             valueAnimato.setDuration(250);
             valueAnimato.setInterpolator(new c(0, 0x3f19999a, 0.30f, 0x3f800000));
             valueAnimato.start();
          }
       }
       return;
    }
}
