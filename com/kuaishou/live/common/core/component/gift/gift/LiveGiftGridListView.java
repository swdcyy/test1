package com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridListView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import ik1.y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftGridListViewLayoutManager;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import zi1.f;
import androidx.recyclerview.widget.RecyclerView$n;
import zi1.g;
import ik1.z;
import androidx.recyclerview.widget.RecyclerView$r;
import android.view.ViewParent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridView$a;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridListView$a;
import vg1.e;
import ik1.x;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import rm1.k;
import java.util.List;
import java.util.Iterator;
import java.lang.Integer;
import java.util.Objects;

public class LiveGiftGridListView extends RecyclerView	// class@001285
{
    public LiveGiftGridListView$a b;
    public LiveGiftGridView$a c;
    public final Runnable d;

    public void LiveGiftGridListView(Context p0){
       super(p0, null);
    }
    public void LiveGiftGridListView(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f040752);
    }
    public void LiveGiftGridListView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new y(this);
       if (PatchProxy.applyVoid(null, this, LiveGiftGridListView.class, "1")) {
       }else {
          this.setLayoutManager(new LiveGiftGridListViewLayoutManager(this.getContext(), 4));
          this.addItemDecoration(new f());
          this.addItemDecoration(new g());
          this.addOnScrollListener(new z(this));
       }
       return;
    }
    public int getCurrentPosition(){
       return 0;
    }
    public ViewParent getViewParent(){
       Object obj = PatchProxy.apply(null, this, LiveGiftGridListView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getParent();
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveGiftGridListView.class, "8")) {
          return;
       }
       super.onDetachedFromWindow();
       this.removeCallbacks(this.d);
       return;
    }
    public void setGiftGridRecyclerViewCallback(LiveGiftGridView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftGridListView.class, "4")) {
          return;
       }
       this.c = p0;
       LiveGiftGridListView tb = this.b;
       if (tb != null) {
          tb.J0(p0);
       }
       return;
    }
    public void setGiftItemAdapter(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftGridListView.class, "3")) {
          return;
       }
       LiveGiftGridListView$a uoa = new LiveGiftGridListView$a(p0);
       this.b = uoa;
       p0.B = new x(this);
       uoa.J0(this.c);
       this.post(this.d);
       super.setAdapter(this.b);
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, LiveGiftGridListView.class, "5")) {
          return;
       }
       if (!this.getScrollState()) {
          LiveGiftGridListView tb = this.b;
          if (tb != null && tb.e != null) {
             Iterator iterator = k.b.a(this).iterator();
             while (iterator.hasNext()) {
                LiveGiftGridListView$a e = this.b.e;
                int i = iterator.next().intValue();
                Objects.requireNonNull(e);
                if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(i), e, e.class, "25")) {
                   continue ;
                }
                e.I(i);
             }
          }
       }
       return;
    }
}
