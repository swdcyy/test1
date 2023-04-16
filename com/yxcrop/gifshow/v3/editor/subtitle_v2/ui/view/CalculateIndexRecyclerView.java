package com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.view.CalculateIndexRecyclerView;
import com.yxcorp.gifshow.widget.UserTouchRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.view.OffsetLinearLayoutManager;
import android.util.SparseIntArray;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class CalculateIndexRecyclerView extends UserTouchRecyclerView	// class@000b01
{
    public HashMap i;

    public void CalculateIndexRecyclerView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void CalculateIndexRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void CalculateIndexRecyclerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void CalculateIndexRecyclerView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final int B(int p0,boolean p1){
       RecyclerView$LayoutManager obj;
       if (PatchProxy.isSupport(CalculateIndexRecyclerView.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, CalculateIndexRecyclerView.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.getLayoutManager();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.view.OffsetLinearLayoutManager");
       SparseIntArray sparseIntArr = obj.W0();
       int i = 0;
       int i1 = 0;
       int i2 = p0 - 1;
       while (i <= i2) {
          i2 = sparseIntArr.get(i);
          if (!i2 && p1) {
             i2 = sparseIntArr.get(0);
          }
          i1 = i1 + i2;
          i = i + 1;
       }
       return i1;
    }
    public final void C(int p0){
       if (PatchProxy.isSupport(CalculateIndexRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CalculateIndexRecyclerView.class, "3")) {
          return;
       }
       int i = this.B(p0, true);
       Object[] objArray = new Object[0];
       a.D().s("CalculateIndexRecyclerView", "scrollToTargetIndex: "+i+" index: "+p0, objArray);
       this.scrollTo(0, i);
       return;
    }
}
