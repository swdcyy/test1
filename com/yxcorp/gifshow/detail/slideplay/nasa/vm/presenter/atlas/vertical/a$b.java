package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.a$b;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$d;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.a;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import java.util.Objects;
import java.lang.Float;
import java.util.List;
import ze5.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import im8.f;
import java.lang.Boolean;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import x85.a;
import w85.a;
import io.reactivex.subjects.PublishSubject;
import androidx.recyclerview.widget.RecyclerView;
import m9a.q;
import d6a.e;
import android.widget.TextView;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.yxcorp.gifshow.entity.QPhoto;
import xx9.a;

public class a$b extends PhotosScaleHelpView$d	// class@00180e
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void U(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$b.class, "5")) {
          return;
       }
       int actionIndex = p0.getActionIndex();
       if (this.a.R8()) {
          this.a.P8(p0.getX(actionIndex), p0.getY(actionIndex));
       }
       PatchProxy.onMethodExit(a$b.class, "5");
       return;
    }
    public void onDoubleTap(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$b.class, "1")) {
          return;
       }
       this.a.E = SystemClock.elapsedRealtime();
       a$b ta = this.a;
       if (ta.F == null) {
          float x = p0.getX();
          float y = p0.getY();
          Objects.requireNonNull(ta);
          if (!PatchProxy.isSupport2(a.class, "3") || !PatchProxy.applyVoidTwoRefsWithListener(Float.valueOf(x), Float.valueOf(y), ta, a.class, "3")) {
             for (int i = 0; i < ta.z.size(); i = i + 1) {
                ta.z.get(i).o0(x, y);
             }
             PatchProxy.onMethodExit(a.class, "3");
          }
       }
       InvalidGestureChecker.a(this.a.getContext(), AnswerType.DEFAULT);
       PatchProxy.onMethodExit(a$b.class, "1");
       return;
    }
    public void onDown(MotionEvent p0){
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$b.class, "3")) {
          return;
       }
       if (this.a.s.get().booleanValue()) {
          PatchProxy.onMethodExit(a$b.class, "3");
          return;
       }else if(this.a.B.C() && (this.a.K.b().b() && (!this.a.G.get().booleanValue() && this.a.H.d()))){
          this.a.H.onNext(new e(true, q.a(this.a.w, p0.getX(), p0.getY())));
          PatchProxy.onMethodExit(a$b.class, "3");
          return;
       }else {
          InvalidGestureChecker.a(this.a.getContext(), AnswerType.DEFAULT);
          PatchProxy.onMethodExit(a$b.class, "3");
          return;
       }
    }
    public void onSingleTapConfirmed(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$b.class, "2")) {
          return;
       }
       if (!this.a.R8()) {
          if (this.a.B.C()) {
             this.a.v.performClick();
          }else {
             a$b ta = this.a;
             ta.y.d(new ChangeScreenVisibleEvent(ta.x));
          }
       }
       InvalidGestureChecker.a(this.a.getContext(), AnswerType.DEFAULT);
       PatchProxy.onMethodExit(a$b.class, "2");
       return;
    }
    public void onSingleTapUp(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$b.class, "4")) {
          return;
       }
       if (this.a.R8()) {
          this.a.P8(p0.getX(), p0.getY());
          PatchProxy.onMethodExit(a$b.class, "4");
          return;
       }else {
          this.a.A.onNext(Boolean.TRUE);
          a$b ta = this.a;
          ta.F = false;
          InvalidGestureChecker.a(ta.getContext(), AnswerType.DEFAULT);
          PatchProxy.onMethodExit(a$b.class, "4");
          return;
       }
    }
}
