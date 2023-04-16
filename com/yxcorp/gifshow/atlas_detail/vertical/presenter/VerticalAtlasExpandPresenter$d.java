package com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$d;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$d;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import m9a.q;
import io.reactivex.subjects.PublishSubject;
import java.lang.Integer;
import com.kwai.component.photo.detail.slide.widget.SlideLongAtlasRecyclerView;

public final class VerticalAtlasExpandPresenter$d extends PhotosScaleHelpView$d	// class@001bd1
{
    public final VerticalAtlasExpandPresenter a;

    public void VerticalAtlasExpandPresenter$d(VerticalAtlasExpandPresenter p0){
       this.a = p0;
       super();
    }
    public void U(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalAtlasExpandPresenter$d.class, "5")) {
          return;
       }
       a.p(p0, "ev");
       int actionIndex = p0.getActionIndex();
       if (this.a.Z8()) {
          this.a.S8(p0.getX(actionIndex), p0.getY(actionIndex));
       }
       return;
    }
    public void onDoubleTap(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalAtlasExpandPresenter$d.class, "1")) {
          return;
       }
       a.p(p0, "e");
       this.a.C = SystemClock.elapsedRealtime();
       VerticalAtlasExpandPresenter$d ta = this.a;
       if (ta.D == null) {
          ta.V8(p0.getX(), p0.getY());
       }
       return;
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalAtlasExpandPresenter$d.class, "3")) {
          return;
       }
       a.p(p0, "e");
       this.a.X8().onNext(Integer.valueOf(q.a(this.a.H, p0.getX(), p0.getY())));
       return;
    }
    public void onSingleTapConfirmed(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalAtlasExpandPresenter$d.class, "2")) {
          return;
       }
       a.p(p0, "event");
       VerticalAtlasExpandPresenter h = this.a.H;
       if (h != null && h.B()) {
          h.stopScroll();
          return;
       }else if(!this.a.Z8()){
          this.a.R8("CLICK_LEAVE");
       }
       return;
    }
    public void onSingleTapUp(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalAtlasExpandPresenter$d.class, "4")) {
          return;
       }
       a.p(p0, "event");
       if (this.a.Z8()) {
          this.a.S8(p0.getX(), p0.getY());
          return;
       }else {
          p0.D = false;
          return;
       }
    }
}
