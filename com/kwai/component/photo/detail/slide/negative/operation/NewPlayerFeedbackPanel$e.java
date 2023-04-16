package com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel$e;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.widget.OperationRecyclerView;
import kf5.l;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import java.util.Objects;
import android.animation.ValueAnimator;

public final class NewPlayerFeedbackPanel$e implements ViewTreeObserver$OnGlobalLayoutListener	// class@000a7a
{
    public final NewPlayerFeedbackPanel b;

    public void NewPlayerFeedbackPanel$e(NewPlayerFeedbackPanel p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NewPlayerFeedbackPanel$e.class, "1")) {
          return;
       }
       this.b.s().getViewTreeObserver().removeOnGlobalLayoutListener(this);
       NewPlayerFeedbackPanel$e tb = this.b;
       tb.D = tb.s().getHeight();
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, NewPlayerFeedbackPanel.class, "9")) {
          tb.Z0.cancel();
          tb.Z0.start();
       }
       return;
    }
}
