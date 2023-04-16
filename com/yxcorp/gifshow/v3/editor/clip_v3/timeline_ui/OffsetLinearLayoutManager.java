package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.OffsetLinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import java.util.List;
import fpc.a;
import faa.a;
import java.lang.StringBuilder;
import java.lang.Exception;
import w46.b;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.Rect;

public class OffsetLinearLayoutManager extends LinearLayoutManager	// class@000dc8
{
    public List r;
    public double s;

    public void OffsetLinearLayoutManager(Context p0,int p1,boolean p2){
       super(p0, p1, p2);
       this.s = 0;
    }
    public int computeHorizontalScrollOffset(RecyclerView$y p0){
       p0 = PatchProxy.applyOneRefs(p0, this, OffsetLinearLayoutManager.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.intValue();
       }
       if (!this.getChildCount()) {
          return 0;
       }
       try{
          int i = this.i0();
          int i1 = - (int)((double)this.findViewByPosition(i).getX() - this.s);
          for (int i2 = 0; i2 < i; i2 = i2 + 1) {
             i1 = i1 + this.r.get(i2).r();
          }
          return i1;
       }catch(java.lang.Exception e6){
          Object[] objArray = new Object[0];
          a.D().t("TimelineView", "computeHorizontalScrollOffset:: error message: "+e6.getMessage(), objArray);
          return 0;
       }
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OffsetLinearLayoutManager.class, "1")) {
          return;
       }
       super.onLayoutCompleted(p0);
       if (!this.s) {
          int i = 0;
          if (this.getChildAt(i) != null) {
             this.s = (double)this.getChildAt(i).getX();
          }
       }
       return;
    }
    public boolean requestChildRectangleOnScreen(RecyclerView p0,View p1,Rect p2,boolean p3){
       return false;
    }
}
