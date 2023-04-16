package com.yxcorp.gifshow.v3.widget.EditorTimeLineView$d;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import com.yxcorp.gifshow.widget.adv.ITimelineView$e;

public class EditorTimeLineView$d extends GestureDetector$SimpleOnGestureListener	// class@001640
{
    public final EditorTimeLineView b;

    public void EditorTimeLineView$d(EditorTimeLineView p0){
       this.b = p0;
       super();
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, EditorTimeLineView$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.getLayerSortedRangeViewList().iterator();
       while (obj.hasNext()) {
          ITimelineView$IRangeView iRangeView = obj.next();
          if (iRangeView.getBindData() != null && (iRangeView.getBindData().q() && (iRangeView.getBindData().r() || (iRangeView.getBindData().o() && iRangeView.getTouchableRect().contains((int)p0.getRawX(), (int)p0.getRawY()))))) {
             boolean b = iRangeView.getBindData().s();
             ITimelineView$IRangeView$a bindData = iRangeView.getBindData();
             int i = iRangeView.getTouchableRect().right + iRangeView.getTouchableRect().left;
             i = i / 2;
             boolean b1 = (p0.getRawX() - (float)i < 0)? true: false;
             bindData.h = b1;
             if (iRangeView.a()) {
                if (!b && iRangeView.getBindData().s()) {
                   iRangeView.bringToFront();
                   iRangeView.getParent().requestLayout();
                   break ;
                }
             }
          }else {
             EditorTimeLineView p = this.b.p;
             if (p != null) {
                p.d();
             }
          }
       }
       return true;
    }
}
