package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$e;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import java.util.Objects;
import lnc.a1;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import dpc.h;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;

public final class TimelineViewV2$e implements ViewTreeObserver$OnGlobalLayoutListener	// class@000de9
{
    public final TimelineViewV2 b;

    public void TimelineViewV2$e(TimelineViewV2 p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TimelineViewV2$e.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       TimelineViewV2$e tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, TimelineViewV2.class, "25")) {
          int i = (a1.h() - TimelineViewV2.O) / 2;
          TimelineViewV2 b = tb.B;
          String str = "cursorView";
          if (b == null) {
             a.S(str);
          }
          ViewGroup$LayoutParams layoutParams = b.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
          layoutParams.leftMargin = i - tb.getLeft();
          TimelineViewV2 b1 = tb.B;
          if (b1 == null) {
             a.S(str);
          }
          b1.setLayoutParams(layoutParams);
          if (!PostExperimentUtils.R0()) {
             b = tb.C;
             if (b == null) {
                a.S("segmentRecyclerView");
             }
             b.addItemDecoration(new h(tb, i));
          }
       }
       return;
    }
}
