package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineRecyclerView$a;
import androidx.recyclerview.widget.RecyclerView$j;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineRecyclerView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import usd.i;
import usd.q;
import java.util.Iterator;
import java.lang.Iterable;
import trd.l0;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.HandlerViewV2;

public final class TimelineRecyclerView$a implements RecyclerView$j	// class@000dd7
{
    public final TimelineRecyclerView a;

    public void TimelineRecyclerView$a(TimelineRecyclerView p0){
       this.a = p0;
       super();
    }
    public int a(int p0,int p1){
       View view;
       TimelineRecyclerView$a uoa = TimelineRecyclerView$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = p0 - 1;
       int i1 = i - p1;
       int i2 = -1;
       int i3 = 0;
       while (true) {
          if (i3 < p0) {
             View childAt = this.a.getChildAt(i3);
             Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
             view = null;
             int i4 = childAt.getChildCount() - 1;
             Iterator iterator = q.W(i4, 0).iterator();
             while (iterator.hasNext()) {
                int i5 = iterator.b();
                if (childAt.getChildAt(i5) instanceof HandlerViewV2) {
                   view = childAt.getChildAt(i5);
                }
             }
             if (view != null && !view.getVisibility()) {
                i2 = i3;
             label_006d :
                if (i2 < 0 || i1 > i2) {
                   return i1;
                }else if(p1 == i){
                   i2 = i1 - 1;
                }
             }else {
                i3 = i3 + 1;
             }
          }else {
             goto label_006d ;
          }
       }
       return i2;
    }
}
