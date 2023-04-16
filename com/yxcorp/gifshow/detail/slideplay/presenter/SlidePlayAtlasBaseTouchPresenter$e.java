package com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter$e;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$d;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.os.SystemClock;
import java.util.Objects;
import java.lang.Float;
import java.util.Collection;
import java.util.List;
import ze5.a;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Math;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewConfiguration;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.view.View;
import xx9.a;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class SlidePlayAtlasBaseTouchPresenter$e extends PhotosScaleHelpView$d	// class@001838
{
    public float a;
    public final SlidePlayAtlasBaseTouchPresenter b;

    public void SlidePlayAtlasBaseTouchPresenter$e(SlidePlayAtlasBaseTouchPresenter p0){
       this.b = p0;
       super();
    }
    public void U(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayAtlasBaseTouchPresenter$e.class, "6")) {
          return;
       }
       a.p(p0, "ev");
       int actionIndex = p0.getActionIndex();
       if (this.b.c9()) {
          this.b.P8(p0.getX(actionIndex), p0.getY(actionIndex));
       }
       return;
    }
    public void onDoubleTap(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayAtlasBaseTouchPresenter$e.class, "1")) {
          return;
       }
       a.p(p0, "e");
       this.b.C = SystemClock.elapsedRealtime();
       SlidePlayAtlasBaseTouchPresenter$e tb = this.b;
       if (tb.D == null) {
          float x = p0.getX();
          float y = p0.getY();
          Objects.requireNonNull(tb);
          SlidePlayAtlasBaseTouchPresenter slidePlayAtl = SlidePlayAtlasBaseTouchPresenter.class;
          if (!PatchProxy.isSupport(slidePlayAtl) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(x), Float.valueOf(y), tb, slidePlayAtl, "40")) {
             int i = 0;
             SlidePlayAtlasBaseTouchPresenter k = tb.K;
             if (k == null) {
                a.S("slideLikeEventListeners");
             }
             int i1 = k.size();
             for (; i < i1; i = i + 1) {
                SlidePlayAtlasBaseTouchPresenter k1 = tb.K;
                if (k1 == null) {
                   a.S("slideLikeEventListeners");
                }
                k1.get(i).o0(x, y);
             }
          }
       }
       return;
    }
    public void onDown(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayAtlasBaseTouchPresenter$e.class, "5")) {
          return;
       }
       a.p(p0, "event");
       return;
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayAtlasBaseTouchPresenter$e.class, "3")) {
          return;
       }
       a.p(p0, "e");
       if (!this.b.X8().getScrollState()) {
          this.b.h9(p0);
       }
       return;
    }
    public void onSingleTapConfirmed(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayAtlasBaseTouchPresenter$e.class, "2")) {
          return;
       }
       a.p(p0, "event");
       ViewConfiguration viewConfigur = ViewConfiguration.get(this.b.getContext());
       a.o(viewConfigur, "ViewConfiguration.get\(context\)");
       if (Math.abs((p0.getRawX() - this.a)) - (float)viewConfigur.getScaledTouchSlop() > 0) {
          return;
       }
       if (!this.b.c9()) {
          if (this.b.p0().C()) {
             SlidePlayAtlasBaseTouchPresenter s = this.b.S;
             if (s == null) {
                a.S("openAtlasView");
             }
             s.performClick();
          }else {
             this.b.a9().d(new ChangeScreenVisibleEvent(this.b.getPhoto()));
          }
       }
       return;
    }
    public void onSingleTapUp(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayAtlasBaseTouchPresenter$e.class, "4")) {
          return;
       }
       a.p(p0, "event");
       this.a = p0.getRawX();
       if (this.b.c9()) {
          this.b.P8(p0.getX(), p0.getY());
          return;
       }else {
          SlidePlayAtlasBaseTouchPresenter j = this.b.J;
          if (j != null) {
             j.onNext(Boolean.TRUE);
          }
          j.D = false;
          return;
       }
    }
}
