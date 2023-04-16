package com.kuaishou.live.common.core.component.gift.viewholder.a$a;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.gift.viewholder.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.external.invoke.deserializer.gift.GiftPanelItemViewData;
import java.util.List;
import tm1.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.ViewGroup;
import java.util.Objects;
import java.lang.Integer;
import android.view.View;

public class a$a implements Runnable	// class@001330
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       a$a tb = this.b;
       if (tb.v == null) {
          return;
       }
       tb.q.stopScroll();
       tb = this.b;
       tb.s.J0(tb.v.mPicUrls);
       int i = this.b.r.c();
       int i1 = 0;
       if (i < 0) {
          this.b.q.smoothScrollToPosition(i1);
       }else {
          a$a tb1 = this.b;
          if (tb1.y == null) {
             tb1.s.l0(i);
             tb = this.b;
             tb.q.post(tb.x);
          }else {
             Objects.requireNonNull(tb1);
             a uoa = a.class;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb1, uoa, "9")) {
                tb1.s.l0((i + 1));
                View childAt = tb1.q.getChildAt(i1);
                if (childAt != null) {
                   if (childAt.getX() < 0) {
                      tb1.q.smoothScrollBy(((int)childAt.getX() + (childAt.getWidth() * 2)), i1);
                   }else {
                      tb1.q.smoothScrollBy(((int)childAt.getX() + childAt.getWidth()), i1);
                   }
                }
             }
          }
       }
       return;
    }
}
