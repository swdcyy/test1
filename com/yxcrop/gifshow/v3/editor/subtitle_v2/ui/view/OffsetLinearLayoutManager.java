package com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.view.OffsetLinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;

public final class OffsetLinearLayoutManager extends LinearLayoutManager	// class@000b02
{
    public final SparseIntArray r;

    public void OffsetLinearLayoutManager(Context p0){
       super(p0);
       this.r = new SparseIntArray();
    }
    public final SparseIntArray W0(){
       return this.r;
    }
    public int computeVerticalScrollOffset(RecyclerView$y p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OffsetLinearLayoutManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "state");
       int i = 0;
       if (!this.getChildCount()) {
          return i;
       }
       try{
          int i1 = this.i0();
          int i3 = 0;
          for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
             i3 = i3 + this.r.get(i2);
          }
          View view = this.findViewByPosition(i1);
          if (view != null) {
             i = view.getTop();
          }
          i = i3 - i;
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OffsetLinearLayoutManager.class, "1")) {
          return;
       }
       super.onLayoutCompleted(p0);
       int i = 0;
       int childCount = this.getChildCount();
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          if (childAt != null) {
             a.o(childAt, "it");
             this.r.put(this.getPosition(childAt), childAt.getHeight());
          }
          i++;
       }
       return;
    }
}
