package com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$d;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$d;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter;
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
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$a;
import androidx.recyclerview.widget.RecyclerView;
import m9a.q;
import io.reactivex.subjects.PublishSubject;
import java.lang.Integer;
import com.kwai.component.photo.detail.slide.widget.SlideLongAtlasRecyclerView;

public final class SlideVerticalAtlasExpandPresenter$d extends PhotosScaleHelpView$d	// class@00192d
{
    public final SlideVerticalAtlasExpandPresenter a;

    public void SlideVerticalAtlasExpandPresenter$d(SlideVerticalAtlasExpandPresenter p0){
       this.a = p0;
       super();
    }
    public void U(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVerticalAtlasExpandPresenter$d.class, "5")) {
          return;
       }
       a.p(p0, "ev");
       int actionIndex = p0.getActionIndex();
       if (this.a.c9()) {
          this.a.V8(p0.getX(actionIndex), p0.getY(actionIndex));
       }
       return;
    }
    public void onDoubleTap(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVerticalAtlasExpandPresenter$d.class, "1")) {
          return;
       }
       a.p(p0, "e");
       this.a.W = SystemClock.elapsedRealtime();
       SlideVerticalAtlasExpandPresenter$d ta = this.a;
       if (ta.X == null) {
          float x = p0.getX();
          float y = p0.getY();
          Objects.requireNonNull(ta);
          SlideVerticalAtlasExpandPresenter slideVertica = SlideVerticalAtlasExpandPresenter.class;
          if (!PatchProxy.isSupport(slideVertica) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(x), Float.valueOf(y), ta, slideVertica, "45")) {
             int i = 0;
             SlideVerticalAtlasExpandPresenter j = ta.J;
             if (j == null) {
                a.S("mSlideLikeEventListeners");
             }
             int i1 = j.size();
             for (; i < i1; i = i + 1) {
                SlideVerticalAtlasExpandPresenter j1 = ta.J;
                if (j1 == null) {
                   a.S("mSlideLikeEventListeners");
                }
                j1.get(i).o0(x, y);
             }
          }
       }
       InvalidGestureChecker.h.b(this.a.getContext(), AnswerType.DEFAULT);
       return;
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVerticalAtlasExpandPresenter$d.class, "3")) {
          return;
       }
       a.p(p0, "e");
       this.a.a9().onNext(Integer.valueOf(q.a(this.a.u, p0.getX(), p0.getY())));
       InvalidGestureChecker.h.b(this.a.getContext(), AnswerType.DEFAULT);
       return;
    }
    public void onSingleTapConfirmed(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVerticalAtlasExpandPresenter$d.class, "2")) {
          return;
       }
       a.p(p0, "event");
       SlideVerticalAtlasExpandPresenter u = this.a.u;
       if (u != null && u.B()) {
          u.stopScroll();
          return;
       }else if(!this.a.c9()){
          this.a.S8(true);
       }
       InvalidGestureChecker.h.b(this.a.getContext(), AnswerType.DEFAULT);
       return;
    }
    public void onSingleTapUp(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVerticalAtlasExpandPresenter$d.class, "4")) {
          return;
       }
       a.p(p0, "event");
       if (this.a.c9()) {
          this.a.V8(p0.getX(), p0.getY());
          return;
       }else {
          SlideVerticalAtlasExpandPresenter$d ta = this.a;
          ta.X = false;
          InvalidGestureChecker.h.b(ta.getContext(), AnswerType.DEFAULT);
          return;
       }
    }
}
