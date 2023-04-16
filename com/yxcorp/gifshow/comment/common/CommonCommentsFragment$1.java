package com.yxcorp.gifshow.comment.common.CommonCommentsFragment$1;
import androidx.recyclerview.widget.ObservableLinearLayoutManager;
import com.yxcorp.gifshow.comment.common.CommonCommentsFragment;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import java.lang.Math;
import y8c.t;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import com.yxcorp.gifshow.comment.common.b;
import java.util.Objects;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import hk9.n;
import java.lang.Runnable;
import nx9.c;
import com.yxcorp.gifshow.comment.common.c;
import com.yxcorp.gifshow.comment.common.c$a;

public class CommonCommentsFragment$1 extends ObservableLinearLayoutManager	// class@00109c
{
    public final CommonCommentsFragment s;

    public void CommonCommentsFragment$1(CommonCommentsFragment p0,Context p1){
       this.s = p0;
       super(p1);
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonCommentsFragment$1.class, str)) {
          return;
       }
       super.onLayoutCompleted(p0);
       if (this.i0()) {
          return;
       }
       int i = this.getHeight() - this.getPaddingBottom();
       int i1 = 0;
       int i2 = 0;
       int i3 = this.getChildCount() - 1;
       while (i2 < i3) {
          i = i - this.getChildAt(i2).getHeight();
          i2 = i2 + 1;
       }
       i = Math.max(i1, i);
       if (this.s.sh() instanceof b) {
          b uob = this.s.sh();
          Objects.requireNonNull(uob);
          if (!PatchProxy.isSupport(b.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i), uob, b.class, str) && uob.m.getLayoutParams() != null)) {
             if (i <= a1.e(240.00f)) {
                i = -2;
             }
             if (uob.m.getLayoutParams().height != i) {
                uob.m.getLayoutParams().height = i;
                uob.m.post(new n(uob));
             }
          }
       }else if(c.f()){
          c uoc = this.s.sh();
          Objects.requireNonNull(uoc);
          if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), uoc, c.class, str)) {
             if (i <= a1.e(240.00f)) {
                i = -2;
             }
             if (uoc.n != i) {
                uoc.n = i;
                uoc.m.d(i);
                uoc.l.d(uoc.n);
                i.height = uoc.n;
                if (uoc.k.getVisibility() != 8) {
                   uoc.k.requestLayout();
                }
             }
          }
       }
    label_00e9 :
       return;
    }
}
